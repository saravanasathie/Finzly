public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student();
        students[1] = new Student("sahid", 12);
        students[2] = new Student("sasi", 15, 1056);
        students[3] = new Student("sateesh", 11);
        students[4] = new Student("Mithul", 14);

        for (Student student:students) {
            System.out.println("\nStudent Details:");
            System.out.println("Name : " + student.getName() + ", Age: " + student.getAge() + ", ID: " + student.getStudentId());
        }
    }
}