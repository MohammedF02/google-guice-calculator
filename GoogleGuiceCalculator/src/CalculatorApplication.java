import java.util.Scanner;

import com.google.inject.*;

public class CalculatorApplication {
	
	private final CalculatorUtil calculatorUtil;
	
	@Inject
	CalculatorApplication(CalculatorUtil calculatorUtil) {
		this.calculatorUtil = calculatorUtil;
	}
	
	public double calculate(double num1,  double num2) {
		return calculatorUtil.calculate(num1, num2);
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        if (CalculatorModule.operation.equals("+")) {
			result = calculate(num1, num2);
		} else if (CalculatorModule.operation.equals("-")) {
			result = calculate(num1, num2);
		} else if (CalculatorModule.operation.equals("*")) {
			result = calculate(num1, num2);
		} else if (CalculatorModule.operation.equals("%")) {
			result = calculate(num1, num2);
		} else {
			System.err.println("Indavlid Operator.");
		}

		System.out.println("Result: " + result);
	}
}
