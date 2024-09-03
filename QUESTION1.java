import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int age;

    public Employee(String name2, int age2) {
        //TODO Auto-generated constructor stub
    }

    public Employee() {
        //TODO Auto-generated constructor stub
    }

    void setData(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}

public class QUESTION1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Joseph";
        emp1.salary = 65784.50;
        emp1.age = 25;

        Employee emp2 = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        emp2.setData(name, 0.0, age);

        System.out.println("Employee 1 details:");
        emp1.displayData();
        System.out.println("Employee 2 details:");
        emp2.displayData();

        if (emp1.age > emp2.age) {
            System.out.println("Employee 1 is older.");
        } else if (emp2.age > emp1.age) {
            System.out.println("Employee 2 is older.");
        } else {
            System.out.println("Both employees are of the same age.");
        }
    }
}