public class VolleyballPlayer extends Player{
    private int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, int numberPosition, String sportType, String teamName, int numberOfPoints) {
        super(nameOfPlayer, numberPosition, sportType, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(numberOfPoints);
    }
}
