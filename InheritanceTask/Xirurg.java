public class Xirurg extends Doctor {
    private final String position = "Xirurg";

    public Xirurg() {}

    public Xirurg(int experienceYear, String name) {
        super(experienceYear, name);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Soha: Xirurg");
    }
}