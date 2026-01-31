public class Main {
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg(2,"Xolida");
        Lor lor =  new Lor(5,"Tursun");
        PC pc = new PC("No Brand", "computer","PC", "Windows", "SECC Board", "Nvidia 5090 TI");
        Laptop macBook = new Laptop("Macbook","Computer", "Laptop", "macOS 26.2","Programming","White");
        Subwoofer subwoofer = new Subwoofer("Music Public Kingdom", "Sound", "Medium", 25000, 0.8);
        LoudSpreaker loudSpreaker = new LoudSpreaker("DL AUDIO Phoenix Black Bass 69", "Sound","Small", 6000);

        lor.showInfo();
        System.out.println();
        xirurg.showInfo();
        System.out.println();

        subwoofer.showInfo();
        System.out.println();
        loudSpreaker.showInfo();
        System.out.println();

        pc.showInfo();
        System.out.println();
        macBook.showInfo();
    }
}