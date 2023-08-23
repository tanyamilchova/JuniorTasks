package FactoryCalkEnum;

public class OperatFact {



    public enum Operator {
        ADD {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        },
        MULTIPLY {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        },
        SUBTRACT {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        },
        DIVIDE {
            @Override
            public int apply(int a, int b) {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            }

        };

        public abstract int apply(int a, int b);


    }

    public static void main(String[] args) {
        int a=5;
        int b=4;
        Operator operator=Operator.ADD;
        int result= operator.apply(a,b);
        System.out.println(result);
    }


}
