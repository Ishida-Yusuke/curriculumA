package profile;

public class Person { 
	  // インスタンスフィールド（個々の人が持つ情報）
	  public String name;     // 名前
	  public int age;         // 年齢
	  public double height;   // 身長（メートル）
	  public double weight;   // 体重（キログラム）
	  
	  // 人数をカウントするクラス変数（全体で共有される）
	  private static int count = 0;

	  // コンストラクタ（newで呼ばれたときに実行される特別なメソッド）
	  public Person(String name, int age, double height, double weight) {
	    this.name = name;       // フィールドに引数の値を代入
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    count++;                // インスタンスが生成されるたびにカウントを増やす
	  }

	  // BMIを計算して返すメソッド（戻り値はdouble型）
	  public double bmi() {
	    return this.weight / (this.height * this.height);
	  }

	  // 自己紹介を表示するメソッド（戻り値なし＝void）
	  public void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です"); // 小数1桁で出力
	  }

	  // 合計人数を表示するクラスメソッド（static）
	  public static void printCount() {
	    System.out.println("合計" + count + "人です");
	  }
	}


