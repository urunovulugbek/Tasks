public class RightTriangle {
    private double a, b;

    public RightTriangle() {};

    public int area(int a, int b) {
        return (a * b) / 2;
    }

    public float area(float a, float b) {
        return (a * b) / 2;
    }

    public double area(double a, double b) {
        return (a * b) / 2;
    }

    public long area(long a, long b) {
        return (a * b) / 2;
    }

    public int perimeter(int a, int b, int c) {
        return a + b + c;
    }

    public float perimeter(float a, float b, float c) {
        return a + b + c;
    }

    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public long perimeter(long a, long b, long c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle();
        System.out.println(triangle.area(5,8));
    }
}
