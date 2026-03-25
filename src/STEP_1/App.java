package STEP_1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator  = new ArithmeticCalculator();
        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            Double first = sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            Double second = sc.nextDouble();

            System.out.print("사칙 연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

          OperatorType operator1 = null;
          switch (operator) {
              case '+': operator1 = OperatorType.ADD;
                break;

              case '-': operator1 = OperatorType.SUBTRACT;
                break;

              case '*': operator1 = OperatorType.MULTIPLY;
                break;

              case '/': operator1 = OperatorType.DIVIDE;
                break;

              default:
                  System.out.println("잘못된 연산자입니다.");
                  continue;
          }

          double result = calculator.calculate(first, second, operator1);

            System.out.println("결과: " + result);

            System.out.println("가장 먼저 저장된 데이터 삭제하시겠습니까?");
            String removeText = sc.next();

            if (removeText.equals("remove")){
                calculator.removeResult();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");

            String inquiryText = sc.next();

            if (inquiryText.equals("inquiry")){

                System.out.println("현재 저장된 결과: " + calculator.getResults());
            }
            System.out.println("특정 값보다 큰 결과값만 조회하시겠습니까? (yes 입력 시 진행");
            String yesText = sc.next();
            if (yesText.equals("yes")){
                System.out.println("기준값을 입력하세요: ");
                double limit = sc.nextDouble();
                System.out.println("--- " + limit + " 보다 큰 결과 ---");
                calculator.printGreaterThan(limit);
                System.out.println("-------------------");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)" );
            String text = sc.next();
            if (text.equals("exit")) {
                break;
            }

        }
    }
}