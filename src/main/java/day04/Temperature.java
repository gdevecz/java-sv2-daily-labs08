package day04;

public class Temperature {

    private int day;

    private int min;

    private int max;

    public Temperature(String row) {
        this.day = Integer.parseInt(row.substring(2, 4).trim());
        this.max = Integer.parseInt(row.substring(6, 8).trim());
        this.min = Integer.parseInt(row.substring(12, 14).trim());
    }

    public int getDay() {
        return day;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getTempSpread() {
        return max - min;
    }

    @Override
    public String toString() {
        return day + ", min: " + min + ", max: " + max + ", spread:" + getTempSpread();
    }
}
