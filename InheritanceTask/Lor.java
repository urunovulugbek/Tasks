public class Lor extends Doctor {
    private final String position = "Lor";

    public Lor() {}

    public Lor(int experienceYear, String name) {
        super(experienceYear, name);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Soha: " + position);
    }
}
