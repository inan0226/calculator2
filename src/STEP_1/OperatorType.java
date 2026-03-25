package STEP_1;

public enum OperatorType {

        ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private final char symbol;

        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        public static OperatorType fromchar(char operator) {
            for(OperatorType type : values()) {
                if (type.symbol == operator) {
                    return type;
                }
            }
            throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }

