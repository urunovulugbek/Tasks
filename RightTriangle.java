public class RightTriangle {
    int a, b, c;
    public RightTriangle(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void showSides() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }

    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle(10,15,22);
        triangle.showSides();
    }
}
