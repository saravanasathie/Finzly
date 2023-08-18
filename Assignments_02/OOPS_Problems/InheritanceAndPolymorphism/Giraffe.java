
public class Giraffe extends Animal{
    public Giraffe(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println("Giraffe Sounds");
    }
}