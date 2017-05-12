package demo;

public class Calculator {

    enum Operation {
        Addition, Subtraction
    }

    public int calculate(Operation operation, int a, int b) {
        switch (operation) {
            case Addition:
                return addition(a, b);
            case Subtraction:
                return subtraction(a, b);
        }

        throw new RuntimeException("Unsupported exception");
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

}
