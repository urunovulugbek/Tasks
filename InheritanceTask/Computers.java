public class Computers extends Electronics {
    private String typeComputer;
    private String typeOs;

    public Computers() {}

    public Computers(String brand, String typeElectronics, String typeComputer, String typeOs) {
        super(brand, typeElectronics);
        this.typeComputer = typeComputer;
        this.typeOs = typeOs;
    }

    public String getTypeComputer() {
        return typeComputer;
    }

    public void setTypeComputer(String typeComputer) {
        this.typeComputer = typeComputer;
    }

    public String getTypeOs() {
        return typeOs;
    }

    public void setTypeOs(String typeOs) {
        this.typeOs = typeOs;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Computer type: " + typeComputer);
        System.out.println("Computer OS: " + typeOs);
    }
}
