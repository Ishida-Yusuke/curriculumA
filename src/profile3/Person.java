package profile3;

public class Person {
    private static int count = 0;
    private String lastName;  // 姓
    private String firstName; // 名
    private int age;
    private double height, weight;

    public Person(String lastName, String firstName, int age, double height, double weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++;
    }

    // 姓＋名でフルネームを返す
    public String fullName() {
        return this.lastName + this.firstName;
    }

    // BMIを計算
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    // 情報を表示
    public void print() {
        double bmiTruncated = Math.floor(this.bmi()); // 小数第一位以下切り捨て
        System.out.println("名前は" + fullName() + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.println("BMIは" + bmiTruncated + "です");
    }

    // 人数を表示
    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}