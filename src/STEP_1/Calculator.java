package STEP_1;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public int calculate(int first, int second, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second == 0) {
                    System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
                } else {
                    result = first / second;
                }
                break;

            default:
                System.out.println("잘못된 연산 기호입니다.");

        }
        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult(){
        results.remove(0);
    }
}
