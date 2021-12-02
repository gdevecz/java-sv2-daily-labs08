package day04;

public class FileReaderMain {

    public static void main(String[] args) {
        FileReader fr = new FileReader();
        int diff = fr.findSmallestTemperatureSpread("weather.dat");
        System.out.println(diff);
        System.out.println(fr.findSmallestDifference("football.dat"));
    }
}
