public class Sound extends Electronics {
    private String size;

    public Sound() {}

    public Sound(String brand, String typeElectronics, String size) {
        super(brand, typeElectronics);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Size: " + size);
    }
}
