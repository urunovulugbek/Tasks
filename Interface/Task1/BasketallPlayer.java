public class BasketallPlayer extends Player{
    private int numberOfGoals;

    public BasketallPlayer(String nameOfPlayer, int numberPosition, String sportType, String teamName, int numberOfGoals) {
        super(nameOfPlayer, numberPosition, sportType, teamName);
        this.numberOfGoals = numberPosition;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
}
