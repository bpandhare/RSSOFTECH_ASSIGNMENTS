public class College {

    private int collegeId;
    private String name;
    private String location;
    private int numberOfDepartments;
    private String affiliation;

    public College() {
    }

    public College(int collegeId, String name, String location, int numberOfDepartments, String affiliation) {
        this.collegeId = collegeId;
        this.name = name;
        this.location = location;
        this.numberOfDepartments = numberOfDepartments;
        this.affiliation = affiliation;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public String toString() {
        return "College [collegeId=" + collegeId + ", name=" + name + ", location=" + location +
                ", numberOfDepartments=" + numberOfDepartments + ", affiliation=" + affiliation + "]";
    }
}