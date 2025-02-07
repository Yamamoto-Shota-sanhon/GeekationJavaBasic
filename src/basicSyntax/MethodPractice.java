package basicSyntax;

public class MethodPractice {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int a = 44;
        int b = 4;
        int addResult = add(a, b);
        int subResult = sub(a, b);
        int multResult = mult(a, b);
        int divResult = div(a, b);

        output(addResult);
        output(subResult);
        output(multResult);
        output(divResult);
    }

    //足し算
    public static int add(int a, int b) {
        return a + b;
    }

    //引き算
    public static int sub(int a, int b) {
        return a - b;
    }

    //掛け算
    public static int mult(int a, int b) {
        return a * b;
    }

    //割り算
    public static int div(int a, int b) {
        return a / b;
    }

    //出力
    public static void output(int number) {
        String answer = "計算結果は";
        System.out.println(answer + number + "です。");
    }

}
