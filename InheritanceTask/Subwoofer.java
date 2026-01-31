public class Subwoofer extends Sound {
    private int frequency;
    private double power;

    public Subwoofer(){}

    public Subwoofer(String brand, String typeElectronics, String size, int frequency, double power) {
        super(brand, typeElectronics, size);
        this.frequency = frequency;
        this.power = power;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Frequency: " + frequency + " hz");
        System.out.println("Power: " + power + " kWt");
    }
}
