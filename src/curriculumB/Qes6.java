package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//配列
		String[] allItem = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ", "その他商品" };
		//ユーザーから受け取った情報を”、”で区切る
		System.out.println("商品を入力してください");
		String items = scanner.nextLine();
		String[] itemList = items.split("、");
		//在庫のランダムクラスを表示
		Random random = new Random();
		int randomItem = random.nextInt(11);
		//テレビとディスプレイ用のランダムクラスを表示
		int tvStock = random.nextInt(11);
		//配列を繰り返す（拡張for文）
		for (String item : itemList) {
			switch (item) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + randomItem + "です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + randomItem + "です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + randomItem + "です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + randomItem + "です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + randomItem + "です");
				break;
			//条件演算子
			case "テレビ":
			case "ディスプレイ":
				int stock = item.equals("テレビ")
						? tvStock
						: (11 - tvStock);
				System.out.println(item + "の残り台数は" + stock + "です");
				break;
			default:
				System.out.println("『 " + item + "』は指定の商品ではありません");
				break;
			}
		}
		scanner.close();

	}
}
