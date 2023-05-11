import java.util.Scanner;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CalculatorModule extends AbstractModule {
	static String operation;

	@Override
	protected void configure() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the operation (+, -, %, or *): ");
		operation = scanner.next();

		if (operation.equals("+")) {
			bind(CalculatorUtil.class).to(Addition.class);
		} else if (operation.equals("-")) {
			bind(CalculatorUtil.class).to(Subtraction.class);
		} else if (operation.equals("*")) {
			bind(CalculatorUtil.class).to(Multiplication.class);
		} else if (operation.equals("%")) {
			bind(CalculatorUtil.class).to(Modulo.class);
		} else {
			System.err.println("Invalid Operation.");
		}
	}
}
