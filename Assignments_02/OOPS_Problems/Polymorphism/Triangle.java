public class Triangle implements Shape{
    private double sideA, sideB, sideC;
    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double sp = calculatePerimeter()/2;
        return (sp * (sp - this.sideA) * (sp - this.sideB) * (sp - this.sideC));
    }

    @Override
    public double calculatePerimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }
}