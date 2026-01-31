public class LoudSpreaker extends Sound {
    private int batteryPower;

    public LoudSpreaker() {}

    public LoudSpreaker(String brand, String typeElectronics, String size, int batteryPower) {
        super(brand, typeElectronics, size);
        this.batteryPower = batteryPower;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Battery power: " + batteryPower + " amper");
    }
}
