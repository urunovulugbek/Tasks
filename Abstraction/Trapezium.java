public class Trapezium extends GeometricFigure{
    private double a;
    private double b;
    private double c;
    private double d;
    private double height;

    public Trapezium(double a, double b, double c, double d, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }

    @Override
    public double area() {
        double s = ((a+b)/2)*height;
        return s;
    }

    @Override
    public double perimeter() {
        return a+b+c+d;
    }


}