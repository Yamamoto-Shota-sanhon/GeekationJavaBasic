package objectExercise;

public class Apartment extends Property {
    private String line;
    private String room;

    //継承出力
    Apartment(String property, String owner, String kinds, int price, String room) {

        super(property, owner, kinds, price);
        this.room = room;
    }

    //ゲッター
    public String getLine() {
        return this.line;
    }

    public String getRoom() {
        return this.room;
    }

    //セッター
    public void setLine(String line) {
        this.line = line;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    //間取り出力
    public void property() {
        super.property();

        System.out.println("間取り：" + room + "\n");
        System.out.println(line + "\n");
    }

}
