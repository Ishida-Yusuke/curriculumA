package zoo;

import java.util.Scanner;

import zoo.model.Animal;
import zoo.util.ScientificNameResolver;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();  // 入力例：ライオン:2.1:80,ゾウ:3.2:40,...

        String[] animalDataArray = input.split(",");

        for (String data : animalDataArray) {
            String[] parts = data.split(":");
            String name = parts[0];
            double length = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            Animal animal = new Animal(name, length, speed);
            String scientificName = ScientificNameResolver.getScientificName(animal.getName());

            System.out.println("動物名：" + animal.getName());
            System.out.println("体長：" + animal.getLength() + "m");
            System.out.println("速度：" + animal.getSpeed() + "km/h");
            System.out.println("学名：" + scientificName);
            System.out.println();
        }

        scanner.close();
    }
}
