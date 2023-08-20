public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
	
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + this.programmingLanguage);
    }
}