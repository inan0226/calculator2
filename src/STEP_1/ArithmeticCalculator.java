package STEP_1;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> results = new ArrayList<>();

    public double calculate(T first, T second, OperatorType operator) {
        double result = 0;

        switch (operator) {
            case ADD:
                result = first.doubleValue() + second.doubleValue();
                break;
            case SUBTRACT:
                result = first.doubleValue() - second.doubleValue();
                break;
            case MULTIPLY:
                result = first.doubleValue() * second.doubleValue();
                break;
            case DIVIDE:
                if (second.doubleValue() == 0) {
                    System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
                } else {
                    result = first.doubleValue() / second.doubleValue();
                }
                break;

            default:
                System.out.println("잘못된 연산 기호입니다.");

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

    public void removeResult(){
        results.remove(0);
    }

    public void printGreaterThan(double limit){
        results.stream().filter(result -> result > limit).forEach(result -> System.out.println(result));
    }
}
