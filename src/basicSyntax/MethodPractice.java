package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 44;
		int b = 4;

		edd(a, b);

	}

	public static int add(int a, int b) {
		int sum = a + b;

		return sum;
	}

	public static int sub(int a, int b) {
		int difference = a - b;

		return difference;
	}

	public static int mult(int a, int b) {
		int product = a * b;

		return product;
	}

	public static int div(int a, int b) {
		int quotient = a / b;

		return quotient;
	}

	public static void edd(int a, int b) {
		String answer = "計算結果は";

		int sum = MethodPractice.add(a, b);
		System.out.println(answer + sum + "です。");

		int difference = MethodPractice.sub(a, b);
		System.out.println(answer + difference + "です。");

		int product = MethodPractice.mult(a, b);
		System.out.println(answer + product + "です。");

		int quotient = MethodPractice.div(a, b);
		System.out.println(answer + quotient + "です。");

	}

}
