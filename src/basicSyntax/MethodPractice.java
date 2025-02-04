package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 44;
		int b = 4;

		output(a, b);

	}
//足し算
	public static int add(int a, int b) {
		int sum = a + b;

		return sum;
	}
//引き算
	public static int sub(int a, int b) {
		int difference = a - b;

		return difference;
	}
//掛け算
	public static int mult(int a, int b) {
		int product = a * b;

		return product;
	}
//割り算
	public static int div(int a, int b) {
		int quotient = a / b;

		return quotient;
	}
//出力
	public static void output(int a, int b) {
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
