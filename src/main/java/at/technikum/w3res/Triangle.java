package at.technikum.w3res;

public class Triangle extends Shape {
    private Double a,b,c;
    public Triangle(double a,double b,double c) {
        this.a = a; this.b = b; this.c = c;
    }
    public double perimeter() {
        return this.a + this.b + this.c;
    }
    public double area() {
        // allegedly - calculatorsoup.com
        double s = 0.5 * (this.a + this.b + this.c);
        double K = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
        return K;
    }
    public String toString() {
        return String.format("<Shape of Triangle: Sides = (%.4g/%.4g/%.4g)>", this.a, this.b, this.c);
    }

}
