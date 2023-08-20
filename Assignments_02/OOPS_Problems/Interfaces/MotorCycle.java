public class MotorCycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("MotorCycle Engine Starts");
    }

    @Override
    public void accelerate() {
        System.out.println("MotorCycle accelerate");
    }

    @Override
    public void brake() {
        System.out.println("MotorCycle is braking");
    }
}