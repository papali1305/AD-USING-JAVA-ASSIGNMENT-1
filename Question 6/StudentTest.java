// PART 3


public class StudentTest {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student1 = new Student();
        student1.setter("John Doe");
        student1.display();

        // Create another instance of Student
        Student student2 = new Student();
        student2.setter("Jane Doe");
        student2.display();

        // Print the maximum character count
        System.out.println("Maximum Character Count: " + Student.getMaxCount());
    }
}