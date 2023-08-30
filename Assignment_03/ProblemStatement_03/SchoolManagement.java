import java.util.*;
public class SchoolManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    students.add(new Student(studentName, studentAge, studentId));
                    System.out.println("Student added!");
                    break;
                    
                case 2:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter teacher age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter teacher subject: ");
                    String teacherSubject = scanner.nextLine();
                    teachers.add(new Teacher(teacherName, teacherAge, teacherSubject));
                    System.out.println("Teacher added!");
                    break;
                    
                case 3:
                    System.out.println("Students:");
                    for (Student student : students) {
                        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Student ID: " + student.getStudentId());
                    }
                    break;
                case 4:
                    System.out.println("Teachers:");
                    for (Teacher teacher : teachers) {
                        System.out.println("Name: " + teacher.getName() + ", Age: " + teacher.getAge() + ", Subject: " + teacher.getSubject());
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Try again");
                    }
            }
        }
}