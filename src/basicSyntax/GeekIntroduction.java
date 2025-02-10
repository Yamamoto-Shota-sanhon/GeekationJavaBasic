package basicSyntax;

public class GeekIntroduction {

    public static void greeting(int age, double height) {
        String hello = "こんにちは！私はGeek君でごわす。";
        String gowasu = "でごわす。";

        System.out.println(hello);
        System.out.println("年は" + age + gowasu);
        System.out.println("身長は" + height + gowasu);
    }

    public static void specoalSkill(int num1, int num2) {

        for (int num = 1; num <= num2; num++) {
            if (num1 <= 0 || num2 <= 0) {
                System.out.println("num1とnum2は0より大きい値にしてください。");
                break;
            } else if (num1 > num2) {
                System.out.println("num2はnum1より大きい値にしてください。");
                break;
            } else if (num1 > 300 || num2 > 300) {
                System.out.println("num1とnum2は300以下にしてください");
                break;
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + "は3の倍数かつ5の倍数です。");
                continue;
            } else if (num % 3 == 0) {
                System.out.println(num + "は3の倍数です。");
                continue;
            } else if (num % 5 == 0) {
                System.out.println(num + "は5の倍数です。");
                continue;
            } else if (num <= num2) {
                System.out.println(num);
            } else {
                break;
            }

        }

    }
}
