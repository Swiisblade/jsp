// JavaBean class
class Student {

    // Private properties
    private int rollNo;
    private String name;
    private double marks;

    // No-argument constructor
    public Student() {
    }

    // Getter and Setter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for marks
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}


// Main class
public class JavaBeanDemo {

    public static void main(String[] args) {

        // Create JavaBean object
        Student student = new Student();

        // Set values using setter methods
        student.setRollNo(101);
        student.setName("Rahul");
        student.setMarks(85.5);

        // Get values using getter methods
        System.out.println("Student Details");
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
    }
}
