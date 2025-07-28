package profile;

public class Main {
	public static void main(String[] args) {
		//Personクラスのインスタンスを作成（名前、年齢、身長、体重）
		Person person1 = new Person("鈴木太郎", 20 , 1.7 , 60);
		//インスタンスのフィールドをそのまま出力
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		//自己紹介を出力
		person1.print();
		//合計人数を出力
		Person.printCount();
	}

}
