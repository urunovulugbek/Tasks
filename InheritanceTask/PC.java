public class PC extends Computers {
    private String videoCardType;
    private String caseModel;

    public PC() {}

    public PC(String brand, String typeElectronics, String typeComputer, String typeOs, String caseModel, String videoCardType) {
        super(brand, typeElectronics, typeComputer, typeOs);
        this.caseModel = caseModel;
        this.videoCardType = videoCardType;
    }

    public void setVideoCardType(String videoCardType) {
        this.videoCardType = videoCardType;
    }

    public String getVideoCardType() {
        return videoCardType;
    }

    public void setCaseModel(String caseModel) {
        this.caseModel = caseModel;
    }

    public String getCaseModel() {
        return caseModel;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Name of video card: " + videoCardType);
        System.out.println("Model of case: " + caseModel);
    }
}
