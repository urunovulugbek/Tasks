public class Doctor {
    private String name;
    private int experienceYear;

    public Doctor() {}

    public Doctor(int experienceYear, String name) {
        this.experienceYear = experienceYear;
        this.name = name;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Shifokor: " + name + " Tajribasi: " + experienceYear + " yil");
    }
}
