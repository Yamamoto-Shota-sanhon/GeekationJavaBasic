package objectExercise;

public class Property {
    private String property;
    private String owner;
    private String kinds;
    private int price;

    Property(String property, String owner, String kinds, int price) {
        this.property = property;
        this.owner = owner;
        this.kinds = kinds;
        this.price = price;
    }
//ゲッター
    public String getProperty() {
        return this.property;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getKinds() {
        return this.kinds;
    }

    public int getPrice() {
        return this.price;
    }
//セッター
    public void setProperty(String property) {
        this.property = property;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//共通出力
    public void property() {
        String line = "=====================================";

        System.out.println(line + "\n");
        System.out.println("物件名：" + property + "\n");
        System.out.println("物件所有者名：" + owner + "\n");
        System.out.println("物件種別：" + kinds + "\n");
        System.out.println("物件価格：" + price + "円" + "\n");

    }
}
