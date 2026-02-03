public class Triangle extends GeometricFigure{
    public double area(int a, int b, int c) {
        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public double perimeter(int a, int b, int c) {
        return a+b+c;
    }
}
