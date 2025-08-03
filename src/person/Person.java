package person;

import vehicle.Bicycle;
import vehicle.Car;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	public Person(String lastName, String firstName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return lastName + firstName;
	}

	// 問題6〜9：buyメソッドを定義
	public void buy(Car car) { // 問題6〜8
		car.setOwner(this.fullName()); // 問題7
		System.out.println(car.getOwner() + "が購入しました"); // 問題8
	}

	public void buy(Bicycle bicycle) { // 問題9
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
