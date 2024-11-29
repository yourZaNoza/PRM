package pr_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FootballTeam[] teams = {
                new FootballTeam("Команда А", "Город А", 1, 15),
                new FootballTeam("Команда Б", "Город Б", 3, 10),
                new FootballTeam("Команда В", "Город В", 4, 12),
                new FootballTeam("Команда Д", "Город Д", 2, 8)
        };
        FootballTeamServices services = new FootballTeamServices();

        FootballTeam topTeam = services.getTeamWithMostWins(teams);
        System.out.println("Команда с наибольшим количеством побед: " + topTeam);
        System.out.println();

        FootballTeam[] aboveAverageTeams = services.getTeamsAboveAverageWins(teams);
        System.out.println("Команды с победами выше среднего: ");
        for (FootballTeam team : aboveAverageTeams) {
            System.out.println(team);
        }
        System.out.println();

        services.sortTeamsByLeaguePositionDescending(teams);
        System.out.println("Сортировка по убыванию места в лиге:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Поиск по названию команды: ");
        String teamName = scanner.nextLine();

        FootballTeam teamToEdit = services.findTeamByName(teams, teamName);
        if (teamToEdit != null) {
            System.out.print("Введите город команды: ");
            String newCity = scanner.nextLine();
            services.editTeamCity(teamToEdit, newCity);
            System.out.println("Информация обновлена: " + teamToEdit);
        } else {
            System.out.println("Команда не найдена.");
        }
    }
}

