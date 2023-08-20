public class Employee{
    private int id;

    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
	
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}
