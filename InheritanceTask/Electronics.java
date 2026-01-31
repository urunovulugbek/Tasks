public class Electronics {
    private String typeElectronics;
    private String brand;

    public Electronics() {}

    public Electronics(String brand, String typeElectronics) {
        this.brand = brand;
        this.typeElectronics = typeElectronics;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeElectronics() {
        return typeElectronics;
    }

    public void setTypeElectronics(String typeElectronics) {
        this.typeElectronics = typeElectronics;
    }

    public void showInfo() {
        System.out.println("Type of electronic: " + typeElectronics);
        System.out.println("Brand: " + brand);
    }
}
