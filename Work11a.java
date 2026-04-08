class Course {

    String name;
    int duration;
    int students;

    // Final variable (same for all)
    final String creator = "CodeMentor Academy";

    // Static variable to track total students
    static int totalStudents = 0;

    // Parameterized constructor
    Course(String name, int duration, int students) {
        this.name = name;
        this.duration = duration;
        this.students = students;

        // Add to total students
        totalStudents += students;
    }

    // Method to display course details
    void display() {
        System.out.println("Course Name: " + name);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Students Enrolled: " + students);
        System.out.println("Creator: " + creator);
        System.out.println("----------------------");
    }

    // Static Nested Class
    static class Platform {
        static void showPlatform() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}


// Test Class
public class Work11a {

    public static void main(String[] args) {

        // Create objects
        Course c1 = new Course("Java Programming", 8, 50);
        Course c2 = new Course("Python Basics", 6, 40);

        // Display details
        c1.display();
        c2.display();

        // Show total students
        System.out.println("Total Students Across All Courses: " + Course.totalStudents);

        // Call static nested class method
        Course.Platform.showPlatform();
    }
}