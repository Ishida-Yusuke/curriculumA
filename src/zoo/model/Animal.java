package zoo.model;

public class Animal {
    private String name;
    private double length;
    private int speed;
    // コンストラクタ（thisでフィールドに代入）
    public Animal(String name, double length, int speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }
    // getter
    public String getName() {
        return name;
    }
    public double getLength() {
        return length;
    }
    public int getSpeed() {
        return speed;
    }
}
