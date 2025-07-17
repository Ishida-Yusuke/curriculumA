package curriculumB;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//変数を宣言して初期化
		double numStudent = 0;
		double studentAverage = 0;
		double totalEnglishScore = 0;
		double totalMathScore = 0;
		double totalScienseScore = 0;
		double totalSocialScore = 0;

		//繰り返し処理
		while (true) {
			System.out.print("生徒の人数を入力してください(２以上)");
			numStudent = scanner.nextInt();
			//条件分岐（２未満）
			if (numStudent < 2) {
				System.out.print("生徒の人数は２人以上で入力してください");
			} else {
				break;
			}
		}
		//点数入力の繰り返し
		for (int i = 1; i <= numStudent; i++) {
			System.out.print(i + "人目の『英語』の点数を入力してください：");//printlnなら得点が改行して表示される
			double englishScore = scanner.nextInt();
			System.out.print(i + "人目の『数学』の点数を入力してください：");
			double mathScore = scanner.nextInt();
			System.out.print(i + "人目の『理科』の点数を入力してください：");
			double scienseScore = scanner.nextInt();
			System.out.print(i + "人目の『社会』の点数を入力してください：");
			double socialScore = scanner.nextInt();
			System.out.println();
			//生徒一人当たりの平均得点を配列に保存
			studentAverage = (englishScore + mathScore + scienseScore + socialScore) / 4;
			//各教科の合計
			totalEnglishScore += englishScore;//A+=B(+=C):自己代入（A=A+B(+C))
			totalMathScore += mathScore;
			totalScienseScore += scienseScore;
			totalSocialScore += socialScore;
		}
		for (int i = 1; i <= numStudent; i++) {
			System.out.printf("%d人目の平均点は%.2fです\n", i, studentAverage);//printfのときの改行＼n
			//%d=整数、%.2f=小数第2位まで表示
		}
		System.out.println();
		System.out.printf("英語の平均点は%.2fです\n", totalEnglishScore / numStudent);
		System.out.printf("数学の平均点は%.2fです\n", totalMathScore / numStudent);
		System.out.printf("理科の平均点は%.2fです\n", totalScienseScore / numStudent);
		System.out.printf("社会の平均点は%.2fです\n", totalSocialScore / numStudent);
		System.out.printf("全体の平均点は%.2fです",
				(totalEnglishScore + totalMathScore + totalScienseScore + totalSocialScore) / (numStudent * 4));
	}
}
