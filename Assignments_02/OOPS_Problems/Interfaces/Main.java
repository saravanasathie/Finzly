public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Cars();
        vehicles[1] = new MotorCycle();

        for(Vehicle vehicle : vehicles){
            System.out.println("Vehicle Name : "+ vehicle.getClass().getSimpleName());
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
            System.out.println();
        }
    }
}
