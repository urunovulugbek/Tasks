public class MathFunctions {
    public int add(int a, int b) {
        return a+b;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public double sub(double a, double b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }

    public double div(double a, double b) {
        return a/b;
    }

    public int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public double abs(double a) {
        return (a < 0) ? -a : a;
    }

    public int pow(int a) {
        return a*a;
    }

    public double pow(double a) {
        return a*a;
    }

    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();

        System.out.println("Butun sonlar yig'indisi: " + math.add(10, 5));
        System.out.println("O'nlik sonlar yig'indisi: " + math.add(10.5, 4.5));
        System.out.println("-20 ning absolyut qiymati: " + math.abs(-20));
        System.out.println("8 ning kvadrati: " + math.pow(8));
    }

}
