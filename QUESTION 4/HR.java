// Question 4 part 2

public class HR extends Employee {
    private int eid;
    private double salary;

    // Constructor: HR(string, int, int, double)
    public HR(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method: DisplayDetails()
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("EID: " + eid);
        System.out.println("Salary: " + salary);
    }

    private String getAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAge'");
    }

    private String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}