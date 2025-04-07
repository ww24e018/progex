package at.technikum.w3res;

public class ShapeTester {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(1.1, 1.2);
        System.out.format("Shape1: %s has area of %.3g and perimeter of %.3g \n", s1, s1.area(), s1.perimeter());
        Shape s2 = new Circle(10.);
        System.out.format("Shape2: %s has area of %.5g and perimeter of %.5g \n", s2, s2.area(), s2.perimeter());
        Shape s3 = new Triangle(3.,4.,5.);
        System.out.format("Shape3: %s has area of %.5g and perimeter of %.5g \n", s3, s3.area(), s3.perimeter());
        Shape s4 = new Triangle(1.,1.,1.);
        System.out.format("Shape4: %s has area of %.5g and perimeter of %.5g \n", s4, s4.area(), s4.perimeter());
    }
}
