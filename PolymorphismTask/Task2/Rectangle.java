public class Rectangle extends GeometricFigure{
    public double area(double a, double b) {
        return a*b;
    }

    public int area(int a, int b) {
        return a*b;
    }

    public double perimeter(double a, double b) {
        return 2*(a+b);
    }

    public int perimeter(int a, int b) {
        return 2*(a+b);
    }

}
