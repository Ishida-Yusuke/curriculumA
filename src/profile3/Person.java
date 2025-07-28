package profile3;

public class Person {
	// インスタンスの合計数をカウントするstaticフィールド（全体で共通）
	private static int count = 0;
	// 以下はインスタンスごとに固有のフィールド
	private String firstName; //名前（名）
	private String lastName; //苗字（姓）←問題１の追加フィールド
	private int age; //年齢
	private double height, weight; //身長（メートル）、体重（キログラム）

	//コンストラクタ（問題2,3：lastNameをfirstNameの次に受け取る）
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName; //名をセット
		this.lastName = lastName; //姓をセット←問題３
		this.age = age; //年齢をセット
		this.height = height; //身長をセット
		this.weight = weight; //体重をセット
		Person.count++; // インスタンス数をカウント ← 問題3
	}

	// フルネーム（姓＋名）を返すメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// インスタンスの情報を出力するメソッド
	public void print() {
		System.out.println("名前は" + fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// BMIを計算して返すメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 現在のインスタンス数を表示するメソッド（static）
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
