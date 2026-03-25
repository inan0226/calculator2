package STEP_1;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> results = new ArrayList<>();

    public double calculate(T first, T second, OperatorType operator) {
        double num1 = first.doubleValue();
        double num2 = second.doubleValue();
        double result = 0;

        switch (operator) {
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
            {
                result = num1 / num2;
                break;


            }
        }
        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void removeResult() {
        if (!results.isEmpty()) {}
        results.remove(0);
    }

    public void printGreaterThan(double limit) {
        results.stream().filter(result -> result > limit).forEach(result -> System.out.println(result));
    }
}
