public class GoalKeeper extends FootballPlayer{
    private int countSavas;

    public GoalKeeper(String nameOfPlayer, int numberPosition, String sportType, String teamName, int countOfGoals, int countOfRedCard, int countOfYellowCard, int countSaves) {
        super(nameOfPlayer, numberPosition, sportType, teamName, countOfGoals, countOfYellowCard,countOfRedCard);
        this.countSavas = countSaves;
    }

    public int getCountSavas() {
        return countSavas;
    }

    public void setCountSavas(int countSavas) {
        this.countSavas = countSavas;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(countSavas);
    }
}
