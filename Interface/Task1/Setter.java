public class Setter extends VolleyballPlayer{
    private int countOfSets;

    public Setter(String nameOfPlayer, int numberPosition, String sportType, String teamName, int numberOfPoints) {
        super(nameOfPlayer, numberPosition, sportType, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public int getCountOfSets() {
        return countOfSets;
    }

    public void setCountOfSets(int countOfSets) {
        this.countOfSets = countOfSets;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(countOfSets);
    }
}
