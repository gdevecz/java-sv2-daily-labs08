package day04;

public class Team {

    private String name;

    private int goalF;

    private int goalA;

    public Team(String name, int goalF, int goalA) {
        this.name = name;
        this.goalF = goalF;
        this.goalA = goalA;
    }

    public Team(String row) {
        this.name = row.substring(7, 23).trim();
        this.goalF = Integer.parseInt(row.substring(43, 45).trim());
        this.goalA = Integer.parseInt(row.substring(50, 52).trim());
    }

    public String getName() {
        return name;
    }

    public int getGoalF() {
        return goalF;
    }

    public int getGoalA() {
        return goalA;
    }

    public int getGoalDifference() {
        return Math.abs(goalF-goalA);
    }

    @Override
    public String toString() {
        return name + ", "+getGoalDifference();
    }
}
