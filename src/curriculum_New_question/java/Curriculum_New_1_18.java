package curriculum_New_question.java;
import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1
	public static void greet(String text, int number) {
		System.out.println("Hello " + text + " " + number);
	}
	
	// Q2
	public static void multiply(int a, int b) {
		System.out.println("乗算結果: " + (a * b));
	}
	
	// Q3
	public static void printArray(int[] arr) {
		System.out.print("配列の要素: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	// Q4
	public static void add(double a, double b) {
		System.out.println("加算結果: " + (a + b));
	}
	
	// Q5
	public static int[] generateRandomNumbers(int count) {
		Random rand = new Random();
		int[] result = new int[count];
		System.out.print("ランダム生成値: ");
		for (int i = 0; i < count; i++) {
			int num;
			do {
				num = rand.nextInt(100) + 1; // 1～100（0は除外）
			} while (num == 0);
			result[i] = num;
			System.out.print(num + " ");
		}
		System.out.println();
		return result;
	}
	
	// Q6
	public static double calculateAverage(int[] arr) {
		double sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double avg = sum / arr.length;
		System.out.println("平均値: " + avg);
		return avg;
	}
	
	// Q7
	public static boolean isAboveFifty(double value) {
		boolean result = value >= 50;
		System.out.println("50以上か？: " + result);
		return result;
	}
	
	public static void main(String[] args) {
		// Q1
		greet("JavaSE", 11);
		
		// Q2
		multiply(5, 4);
		
		// Q3
		int[] sampleArray = {10, 20, 30, 40};
		printArray(sampleArray);
		
		// Q4
		add(3.5, 2.3);
		
		// Q5
		int[] randomNumbers = generateRandomNumbers(5);
		
		// Q6
		double average = calculateAverage(randomNumbers);
		
		// Q7
		isAboveFifty(average);
	}
}

