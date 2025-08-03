import person.Person;
import vehicle.Bicycle;
import vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // 問題4・5（コメントアウトしておくと実行結果がわかりやすい）
        // car.setOwner(person1.fullName());
        // bicycle.setOwner(person2.fullName());
        // System.out.println(car.getOwner());
        // System.out.println(bicycle.getOwner());

        // 問題10：buyメソッドで購入処理
        person1.buy(car);
        person2.buy(bicycle);
    }
}

