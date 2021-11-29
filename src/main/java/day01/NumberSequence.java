package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int size, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(rnd.nextInt(min, max));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            if (Math.abs(getAverage() - i) <= value) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private double getAverage() {
        double sum = 0.0;
        for (int i : numbers) {
            sum += i;
        }
        return sum / numbers.size();
    }
}
