package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int num = 1; num <=100; num++) {
			if (num % 3 == 0 && num % 5 ==0) {
				System.out.println("FizzBuzz");
			}else if (num % 3 ==0) {
				System.out.println("Fizz");
			}else if (num % 5 ==0) {
			    System.out.println("Buzz");
		    }else {
		    	
		    }
	    }
		
		String[] languages = {"Ruby","Golang","Java","Python","Typescript","HTML","Javascript"};
		
		for (String language: languages) {
            if (language.equals("Java")) {
            	System.out.println("現在学習中の言語はJavaです");
            	continue;
            }else if (language.equals("HTML")){
            	System.out.println("HTMLはプログラミング言語ではありません。");
            	break;
            }else {
            	System.out.println(language);
            }
        }
	}

}
