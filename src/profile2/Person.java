package profile2;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	static int count = 0; //クラスフィールド count を定義（問題１）

	Person(String name, int age, double height, double weight) { //コンストラクタ（問題２）
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //インスタンスが生成されるたびに+1
	}

	public double bmi() {
		return this.weight / (this.height / this.height);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

	// クラスメソッド（問題4〜5）
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
