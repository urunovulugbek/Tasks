public class FootballPlayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(String nameOfPlayer, int numberPosition, String sportType, String teamName, int countOfGoals, int countOfRedCard, int countOfYellowCard) {
        super(nameOfPlayer, numberPosition, sportType, teamName);
        this.countOfGoals = countOfGoals;
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(countOfRedCard);
        System.out.println(countOfYellowCard);
        System.out.println(countOfGoals);
    }
}
