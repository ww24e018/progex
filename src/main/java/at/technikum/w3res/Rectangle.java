package at.technikum.w3res;

public class Rectangle extends Shape {
    private Double l,h;
    public Rectangle(double l,double h) {
        this.l = l;
        this.h = h;
    }
    public double area() {
        return l*h;
    }
    public double perimeter() {
        return (l+h)*2.;
    }
    public String toString() {
        return String.format("<Shape of Rectangle: %.4g x %.4g >", this.l, this.h);
    }
}
