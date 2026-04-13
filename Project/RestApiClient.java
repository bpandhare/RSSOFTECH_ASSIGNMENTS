import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestApiClient {
    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY"; // Replace with your API key
        String city = "Mumbai"; // Change to your preferred city
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=${search}&appid=${API_key}&units=metric}" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                System.out.println("Failed: HTTP error code : " + conn.getResponseCode());
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            StringBuilder response = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                response.append(output);
            }

            conn.disconnect();

            // Parse JSON response
            JSONObject jsonObj = new JSONObject();
            JSONObject main = jsonObj.getJSONObject("main");
            double temperature = main.getDouble("temp");
            double humidity = main.getDouble("humidity");

            System.out.println("Weather in " + city + ":");
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity: " + humidity + "%");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}