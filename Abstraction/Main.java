public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(10,14,8);
        GeometricFigure trapezium = new Trapezium(5,14,8,2,11);
        GeometricFigure rectangle = new Rectangle(5,14);

        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        System.out.println(trapezium.area());
        System.out.println(trapezium.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
