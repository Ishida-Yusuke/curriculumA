package curriculumB;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// コンソールに入力出来るようにする
        String userName;//宣言

        System.out.print("名前を入力してください: ");
        
        //繰り返し処理
        while(true) {
        	userName = scanner.nextLine();// 文字列の入力を受け取る
        	//ユーザー名が１０文字以内かどうかを判断する
        	if (userName.length() >= 10 ) {
        		System.out.print("名前を10文字以内にしてください：");
        	} 
        	//ユーザー名が０文字かnullの場合
        	else if (userName == null || userName.isEmpty()){
        		System.out.print("名前を入力してください：");
	        }
        	//半角英数字以外の場合
        	else if (!userName.matches("[A-Za-z0-9]+")) {
	            System.out.print("半角英数字のみで名前を入力してください：");
	        }
        	//正常な値の場合の処理
        	else {
	        	System.out.println("ユーザー名「" + userName + "」を登録しました");
	        	break;
	        }
        }
       //Qes1_3
        Random random = new Random();
        int count = 0;
        //繰り返し処理
        while(true) {
	        String[] hands = { "グー", "チョキ", "パー"};
	        int userHand = random.nextInt(3);
	        int cpuHand = random.nextInt(3);
	        System.out.println(userName + "の手は「" + hands[userHand]+ "」");
	        System.out.println("相手の手は「" + hands[cpuHand] + "」");
	        //じゃんけんに勝つまでにかかった回数
	        count++;
	        //条件分岐
	        //ユーザーがじゃんけんに勝った場合
	        if ((userHand == 0 && cpuHand == 1)||
	            (userHand == 1 && cpuHand == 2)||
	            (userHand == 2 && cpuHand == 0)) {
	        	System.out.println("やるやん。\n次は俺にリベンジさせて");
	        //じゃんけんに勝った場合ループを抜ける
	        	break;
	        //ユーザーがじゃんけんに負けた場合
	        } else if ((userHand == 1 && cpuHand == 0)||
	                   (userHand == 2 && cpuHand == 1)||
	                   (userHand == 0 && cpuHand == 2)) {
	        	System.out.println("俺の勝ち！");
	        	if (userHand == 1) {
		        	System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
		        } else if (userHand == 2) {
		        	System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
		        } else {
		        	System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです"); 
		       	}
	        //あいこの場合
		 	} else {
		 		System.out.println("DRAW あいこ もう一回しましょう！"); 
	        }
        } System.out.println("勝つまでにかかった合計回数は" + count + "です"); 
 
        scanner.close();  // 最後にスキャナーを閉じる
	}
}
