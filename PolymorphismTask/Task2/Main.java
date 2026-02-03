public class Main {
    public static void main(String[] args) {
        Triangle figure = new Triangle();
        Trapezium figureTrapezium = new Trapezium();
        Rectangle figureRectangle = new Rectangle();
        System.out.println(figure.area(15,2,9));
        System.out.println(figure.perimeter(15,2,9));
        System.out.println(figureTrapezium.area(5,9,6));
        System.out.println(figureTrapezium.perimeter(8,8,4,5));
        System.out.println(figureRectangle.area(5,7));
        System.out.println(figureRectangle.perimeter(5,7));
    }
}
