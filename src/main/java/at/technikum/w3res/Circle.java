package at.technikum.w3res;

import java.lang.Math;

public class Circle extends Shape {
    private Double r;
    public Circle(double r) {
        this.r = r;
    }
    public double area() {
        return Math.PI * this.r * this.r;
    }
    public double perimeter() {
        return Math.PI * this.r * 2.;
    }
    public String toString() {
        return String.format("<Shape of Circle: r = %.4g >", this.r);
    }
}
