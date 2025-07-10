package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	private int count;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.name = "犬";  // 「犬」という文字列を代入
		this.count = 0;    // 初期値は0でもOK
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int count) {
		this.name = "犬";       // 名前は「犬」のままにする
		this.count = count;     // 引数の数を代入する
	}
	// 💡 nameとcountにアクセスできるようにgetterもつけておくと便利！
	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}
}
