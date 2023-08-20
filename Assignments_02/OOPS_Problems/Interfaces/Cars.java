public class Cars implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car Engine Starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
}