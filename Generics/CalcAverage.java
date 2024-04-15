package Generics;

import java.util.List;

public class CalcAverage {

    public static <T extends Number> double calculateAverage(List<T> numbers) {
        double result = 0.0;

        for(T number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }
}
