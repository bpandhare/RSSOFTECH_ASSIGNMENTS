public class Employee {

    // Data members
    private int id;
    private String name;
    private String mob;
    private String email;
    private String department;
    private float salary;

    // Default Constructor
    public Employee() {
    }

 
    public Employee(int id, String name, String mob, String email, String department, float salary) {
        this.id = id;
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

       public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // toString method from object class
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", mob=" + mob +
                ", email=" + email + ", department=" + department +
                ", salary=" + salary + "]";
    }
}