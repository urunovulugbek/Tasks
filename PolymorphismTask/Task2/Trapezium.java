public class Trapezium extends GeometricFigure{
    public double area(int a, int b, int c) {
        double s = 0.5*(a+b)*c;
        return s;
    }

    public double area(double a, double b, double c) {
        double s = 0.5*(a+b)*c;
        return s;
    }

    public double perimeter(double a, double b, double c, double d) {
        return a+b+c+d;
    }

    public int perimeter(int a, int b, int c, int d) {
        return a+b+c+d;
    }

}
