public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(23,59,59);
        System.out.println(time.toString());
        time.nextSecond();

        System.out.println(time.toString());
    }
}
