
public class Main {
public static void main(String[] args) {
	Zoo zoo = new Zoo();

    Lion lion = new Lion("Simba", 5);
    Elephant elephant = new Elephant("Dumbo", 10);
    Giraffe giraffe = new Giraffe("Melman", 7);

    zoo.addAnimal(lion);
    zoo.addAnimal(elephant);
    zoo.addAnimal(giraffe);

    zoo.makeAllSounds();
}

}
