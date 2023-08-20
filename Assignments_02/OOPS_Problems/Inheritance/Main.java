public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Hierarchy System");
        System.out.println("-------------------------");

        Manager m = new Manager(1,"sahid","Design");
        Developer e = new Developer(2,"sasi","Front-end");

        System.out.println("\nEmployee Details:");
        System.out.println("Manager: " + m.getName() + ", ID: " + m.getId() + ", Department: " + m.getDepartment());
        System.out.println("Developer: " + e.getName() + ", ID: " + e.getId() + ", Programming Language: " + e.getProgrammingLanguage());

        System.out.println();
        m.displayInfo();
        System.out.println();
        e.displayInfo();
    }
}