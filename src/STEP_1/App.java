package STEP_1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                Double first = sc.nextDouble();

                System.out.print("두 번째 숫자를 입력하세요: ");
                Double second = sc.nextDouble();

                System.out.print("사칙 연산 기호를 입력하세요 (+, -, *, /): ");
                char operatorChar = sc.next().charAt(0);


                OperatorType operator = OperatorType.fromChar(operatorChar);

                double result = calculator.calculate(first, second, operator);
                System.out.println("결과: " + result);

            } catch (Exception e) {

                System.out.println("에러 발생: " + e.getMessage());
                continue;
            }

            System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            if (sc.next().equals("remove")) {
                calculator.removeResult();
                System.out.println("삭제 완료!");
            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회): ");
            if (sc.next().equals("inquiry")) {
                System.out.println("현재 저장된 결과: " + calculator.getResults());
            }

            System.out.print("특정 값보다 큰 결과값만 조회하시겠습니까? (yes 입력 시 진행): ");
            if (sc.next().equals("yes")) {
                System.out.print("기준값을 입력하세요: ");
                double limit = sc.nextDouble();
                System.out.println("--- " + limit + " 보다 큰 결과 ---");
                calculator.printGreaterThan(limit);
                System.out.println("-------------------");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력시 종료): ");
            if (sc.next().equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        sc.close();
    }
}