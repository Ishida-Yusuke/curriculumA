package カプセル化とゲッターとセッター;

public class Animal {
    // フィールド（変数）
    private String name;
    private double length;
    private int speed;
    // setterメソッド（値をセットする）
    public void setName(String name) {
        this.name = name;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // getterメソッド（値を取り出す）
    public String getName() {
        return this.name;
    }
    public double getLength() {
        return this.length;
    }
    public int getSpeed() {
        return this.speed;
    }
    // mainメソッド（実行部分）
    public static void main(String[] args) {
        Animal lion = new Animal();

        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}

