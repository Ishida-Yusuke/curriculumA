package profile3;

import profile.Person;

public class Main {
	public static void main(String[] args) {
		// Personインスタンスを作成（姓、名、年齢、身長、体重）
		Person person1 = new Person("鈴木", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", 22, 1.5, 40);
		person2.print();

		// 現在までに作られたPersonインスタンスの数を出力
		Person.printCount();
	}
}
