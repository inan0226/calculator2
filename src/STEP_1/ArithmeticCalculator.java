package STEP_1;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> results = new ArrayList<>();

    public double calculate(T first, T second, OperatorType operator) {
        double result = 0;

        switch (operator) {
            case ADD:
                break;
            case SUBTRACT:
                break;
            case MULTIPLY:
                break;
            case DIVIDE:
                }
                break;


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
        results.remove(0);
    }

    public void printGreaterThan(double limit) {
        results.stream().filter(result -> result > limit).forEach(result -> System.out.println(result));
    }
}
