public class PointGuard extends BasketallPlayer{
    private int poinOfGuard;

    public PointGuard(String nameOfPlayer, int numberPosition, String sportType, String teamName, int numberOfGoals, int poinOfGuard) {
        super(nameOfPlayer, numberPosition, sportType, teamName, numberOfGoals);
        this.poinOfGuard = poinOfGuard;
    }

    public int getPoinOfGuard() {
        return poinOfGuard;
    }

    public void setPoinOfGuard(int poinOfGuard) {
        this.poinOfGuard = poinOfGuard;
    }
}
