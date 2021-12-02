package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public String findSmallestDifference(String fileName) {
        Path path = Paths.get("src/main/resources/day04/" + fileName);
        try {
            List<Team> teams = getTeams(Files.readAllLines(path));
            return getSmallestDifferent(teams).getName();
        } catch (IOException ioe) {
            throw new IllegalArgumentException("File can not read: " + path, ioe);
        }
    }

    private Team getSmallestDifferent(List<Team> teams) {
        Team result = teams.get(0);
        for (Team actualTeam : teams) {
            if (result.getGoalDifference() > actualTeam.getGoalDifference()) {
                result = actualTeam;
            }
        }
        return result;
    }

    private List<Team> getTeams(List<String> rows) {
        List<Team> teams = new ArrayList<>();
        for (int i = 1; i < rows.size(); i++) {
            if (rows.get(i).contains(".")) {
                teams.add(new Team(rows.get(i)));
            }
        }
        return teams;
    }

    public int findSmallestTemperatureSpread(String fileName) {
        Path path = Paths.get("src/main/resources/day04/" + fileName);
        try {
            List<Temperature> temperatures = getDays(Files.readAllLines(path));
            return minSpread(temperatures).getDay();
        } catch (IOException ioe) {
            throw new IllegalArgumentException("File can not read: " + path, ioe);
        }

    }

    private List<Temperature> getDays(List<String> rows) {
        List<Temperature> result = new ArrayList<>();
        for (int i = 2; i < rows.size() - 1; i++) {
            result.add(new Temperature(rows.get(i)));
        }
        return result;
    }

    private Temperature minSpread(List<Temperature> days) {
        Temperature result = days.get(0);
        for (Temperature actualDay : days) {
            if (result.getTempSpread() > actualDay.getTempSpread()) {
                result = actualDay;
            }
        }
        return result;
    }
}
