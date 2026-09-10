abstract class Shape{
    abstract double area();
    void displayArea(){
        System.out.println("Area =" + area());
    }

}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length * breadth;
    }
}
public class Usecase2 {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
