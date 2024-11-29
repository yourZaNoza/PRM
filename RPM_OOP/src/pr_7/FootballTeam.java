package pr_7;

public class FootballTeam {
    private String name;
    private String city;
    private int leaguePosition;
    private int wins;

    public FootballTeam(String name, String city, int leaguePosition, int wins) {
        this.name = name;
        this.city = city;
        this.leaguePosition = leaguePosition;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public int getWins() {
        return wins;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "Футбольная_команда{" +
                "Имя: '" + name + '\'' +
                ", город: '" + city + '\'' +
                ", позиция_в_лиге: " + leaguePosition +
                ", побед: " + wins +
                '}';
    }
}

