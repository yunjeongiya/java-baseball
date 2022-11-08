package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {
    List<Integer> numbers = new ArrayList<>();

    public void validate(String input) throws IllegalArgumentException {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < 3; i++) {
            int number = input.charAt(i) - '0';
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException();
            }
            if (numbers.contains(number)) {
                throw new IllegalArgumentException();
            }
            numbers.add(number);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}