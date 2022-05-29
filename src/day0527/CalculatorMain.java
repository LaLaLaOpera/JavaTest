package day0527;

class Calculator{
	static final double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}	
	static int multiply(int x, int y) {
		return x*y;
	}	
	static double divide(double x, int y) {
		return x/y;
	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		double result1 = 10*10*Calculator.pi;
		
		System.out.println(result1);
		
		int result2 = Calculator.plus(3, 4);
		System.out.println(result2);
		int result3 = Calculator.minus(3, 4);
		System.out.println(result3);
		

	}

}
