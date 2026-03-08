public class MathFunctions {

    // 1. Static o'zgaruvchilar
    public static double PI;
    public static double E;

    // 2. Static blok (Klass birinchi marta yuklanganda ishga tushadi)
    static {
        PI = 3.14159265359;
        E = 2.71828182846;
        System.out.println("Statik o'zgaruvchilar qiymati yuklandi.");
    }

    // 3. Doira yuzini hisoblovchi statik metod: S = PI * r^2
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    // 4. E ni berilgan darajaga ko'taruvchi statik metod: E^a
    public static double powerOfE(double exponent) {
        return Math.pow(E, exponent);
    }

    // 5. Uchburchak yuzini Geron formulasi bilan hisoblovchi statik metod
    public static double calculateTriangleArea(double a, double b, double c) {
        // Yarim perimetr: p = (a + b + c) / 2
        double p = (a + b + c) / 2;
        // Geron formulasi: S = sqrt(p * (p-a) * (p-b) * (p-c))
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
