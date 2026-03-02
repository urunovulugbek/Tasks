public class Player implements Information{
    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String TeamName;

    public Player(String nameOfPlayer, int numberPosition, String sportType, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.numberPosition = numberPosition;
        this.sportType = sportType;
        TeamName = teamName;
    }

    @Override
    public void getInfo() {
        System.out.println(nameOfPlayer);
        System.out.println(numberPosition);
        System.out.println(sportType);
        System.out.println(TeamName);
    }

    @Override
    public void getTeamName() {
        System.out.println(TeamName);
    }
}
