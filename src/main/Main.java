package main;

import java.util.Scanner;

import status.Player;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //名前入力
        System.out.print("名前を入力してください");
        String inputName = scanner.nextLine();
        //プレイヤー作成
        Player player = new Player(inputName);
        //表示
        System.out.println("こんにちは「"+ player.getName() + "」さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAttack());
        System.out.println("素早さ：" + player.getSpeed());
        System.out.println("防御力：" + player.getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");
    }
}
