public class Product{
	  private int productid;
          private String name;
          private String category;
          private double price;
          private int quantity;
	}

    public Product(){
       }


    public Product(int productid, String name,String category, double price, int quantity){
       
        this.productid =productid;
        this.name = name;
        this.category =category;
        this.price = price;
        this.quantity = quantity;
        }
 
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
  
    public int getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
     public int getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
  
      public int get Price() {
        return  price;
    }

    public void setPrice(String Price) {
        this. price =  price;
    }
  
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

