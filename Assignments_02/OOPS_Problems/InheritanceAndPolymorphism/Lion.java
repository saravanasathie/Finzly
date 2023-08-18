
public class Lion extends Animal{
	public Lion(String name, int age){
        super(name, age);
    }
	
    @Override
    void makeSound(){
        System.out.println("Lion Sounds roar");
    }
}
