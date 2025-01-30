package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;
		boolean isResultA = (a > b);
		System.out.println(isResultA);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean weather = (isSunny && isWarm);
		System.out.println(weather);
		
		int x = 1;
		int y = 4;
		boolean isResultB = (0 < x );
		boolean isResultC = (y % 2 == 0);
		boolean isResultD = (isResultB && isResultC);
		System.out.println(isResultD);
		
		boolean hasPermission = !false;
		System.out.println(hasPermission);
	}

}
