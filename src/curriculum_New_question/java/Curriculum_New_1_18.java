package curriculum_New_question.java;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：文字列型と整数型をいれて「Hello JavaSE 11」と出力
	public static void greet(String str, int num) {
		System.out.println("Hello " + str + " " + num);
	}

	// Q2：整数の掛け算
	public static void multiply(int a, int b) {
		System.out.println("掛け算結果: " + (a * b));
	}

	// Q4：Q2のオーバーロード：小数の加算
	public static void multiply(double a, double b) {
		System.out.println("加算結果: " + (a + b));
	}

	// Q3：整数配列を順に出力
	public static void printArray(int[] arr) {
		System.out.println("配列の中身：");
		for (int num : arr) {
			System.out.println(num);
		}
	}

	// Q5：ランダムな1～100の数をn個生成（0は除く）
	public static int[] generateRandomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];
		System.out.println("ランダムな数値：");
		for (int i = 0; i < count; i++) {
			int randomNum;
			do {
				randomNum = rand.nextInt(100) + 1; // 1〜100
			} while (randomNum == 0);
			numbers[i] = randomNum;
			System.out.println(randomNum);
		}
		return numbers;
	}

	// Q6：配列の平均値（小数点あり）を出力＆返す
	public static double calculateAverage(int[] numbers) {
		double sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		double average = sum / numbers.length;
		System.out.println("平均値: " + average);
		return average;
	}

	// Q7：値が50以上か判定
	public static boolean isAboveFifty(double value) {
		boolean result = value >= 50;
		System.out.println("50以上か？: " + result);
		return result;
	}

	// 実行メソッド
	public static void main(String[] args) {
		// Q1
		greet("JavaSE", 11);

		// Q2
		multiply(5, 4); // 整数の掛け算

		// Q3
		int[] sampleArray = { 10, 20, 30, 40 };
		printArray(sampleArray);

		// Q4：オーバーロード（小数の加算）
		multiply(3.5, 2.3);

		// Q5
		int[] randomNumbers = generateRandomNumbers(5);

		// Q6
		double average = calculateAverage(randomNumbers);

		// Q7
		isAboveFifty(average);
	}
}
