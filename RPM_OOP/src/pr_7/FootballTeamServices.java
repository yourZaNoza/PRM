package pr_7;

import java.util.Arrays;
import java.util.Comparator;

public class FootballTeamServices {

    public FootballTeam getTeamWithMostWins(FootballTeam[] teams) {
        FootballTeam topTeam = teams[0];
        for (FootballTeam team : teams) {
            if (team.getWins() > topTeam.getWins()) {
                topTeam = team;
            }
        }
        return topTeam;
    }

    public FootballTeam[] getTeamsAboveAverageWins(FootballTeam[] teams) {
        int totalWins = 0;
        for (FootballTeam team : teams) {
            totalWins += team.getWins();
        }
        double averageWins = (double) totalWins / teams.length;

        return Arrays.stream(teams)
                .filter(team -> team.getWins() > averageWins)
                .toArray(FootballTeam[]::new);
    }

    public void sortTeamsByLeaguePositionDescending(FootballTeam[] teams) {
        Arrays.sort(teams, Comparator.comparingInt(FootballTeam::getLeaguePosition).reversed());
    }

    public FootballTeam findTeamByName(FootballTeam[] teams, String name) {
        for (FootballTeam team : teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                return team;
            }
        }
        return null;
    }

    public void editTeamCity(FootballTeam team, String newCity) {
        team.setCity(newCity);
    }
}

