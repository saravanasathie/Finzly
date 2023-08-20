public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(5, 6 ,7);

        for(Shape shape : shapes){
            System.out.println("Class Name : "+ shape.getClass().getSimpleName());
            System.out.println("Area : "+ shape.calculateArea());
            System.out.println("Perimeter : "+ shape.calculatePerimeter());
            System.out.println();
        }
    }
}