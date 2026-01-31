public class Laptop extends Computers {
    private String useFor;
    private String color;

    public Laptop() {}

    public Laptop(String brand, String typeElectronics, String typeComputer, String typeOs, String useFor, String color) {
        super(brand, typeElectronics, typeComputer, typeOs);
        this.useFor = useFor;
        this.color = color;
    }

    public void setUseFor(String useFor) {
        this.useFor = useFor;
    }

    public String getUseFor() {
        return useFor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Laptop for: " + useFor);
        System.out.println("Laptop color: " + color);
    }
}
