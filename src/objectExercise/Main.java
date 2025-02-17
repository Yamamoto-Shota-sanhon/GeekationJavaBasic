package objectExercise;

public class Main {

    public static void main(String[] args) {
        //アパートの情報
        Apartment apart = new Apartment("いい感じアパートメント", "山田　マンション太郎", "マンション", 50000000, "3LDK");
        //土地の情報
        Land land = new Land("いい感じの土地", "山田　土地太郎", "土地 ", 8000000, 105.2);

        apart.setLine("=====================================");
        land.setLine("=====================================");
        //アパート出力
        apart.property();
        //土地出力
        land.property();

    }

}
