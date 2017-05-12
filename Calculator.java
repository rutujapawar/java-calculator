package demo;

public class Calculator 
{

    enum Operation {
        Addition, Subtraction, Multiplication, Division
    }

    public int calculate(Operation operation, int a, int b) {
        switch (operation) {
            case Addition:
                return addition(a, b);
            case Subtraction:
                return subtraction(a, b);
			case Multiplication:
				return multiplication(a, b);
			case Division:
				return division(a, b);
			
        }

        throw new RuntimeException("Unsupported exception");
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

	private int multiplication (int a, int b)
	{
		return a * b;
	}

	private int division( int a, int b)
	{
		return a / b;
	}

}
