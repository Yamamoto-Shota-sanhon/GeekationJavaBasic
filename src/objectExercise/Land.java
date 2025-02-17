package objectExercise;

public class Land extends Property {
    private String line;
    private double space;

    //継承出力
    Land(String property, String owner, String kinds, int price, double space) {

        super(property, owner, kinds, price);
        this.space = space;
    }

    //ゲッター
    public String getLine() {
        return this.line;
    }

    public double getSpace() {
        return this.space;
    }

    //セッター
    public void setLine(String line) {
        this.line = line;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    //土地広さ出力
    public void property() {
        super.property();

        System.out.println("広さ：" + space + "㎡" + "\n");
        System.out.println(line + "\n");
    }
}
