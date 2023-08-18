public class Student{
    private int studentID;
    private String name;
    private static int totalStudents = 0;

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
        totalStudents++;
    }
    public int getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public static int getTotalStudents(){
        return totalStudents;
    }
    public static void enrollStudent(){
        totalStudents++;
    }
    public static void dropStudent(){
        if(totalStudents > 0){
            totalStudents--;
        }
    }
}
