public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"sahid");
        Student student2 = new Student(2,"sasi");
        System.out.println("Total Students : "+Student.getTotalStudents());
        Student.enrollStudent();

        Student student3 = new Student(3, "sateesh");

        System.out.println("Total Students : "+Student.getTotalStudents());

        Student.dropStudent();

        System.out.println("Total Students : "+Student.getTotalStudents());
    }
}
