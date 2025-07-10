package messageLogic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sushi {
	private String greeting;
	private String tasting;
	private String culture;
	private String dateTime;
	
	public void in1() {
		this.greeting = "こんにちは！ここは日本です！";
	}
	public void in2() {
		this.tasting = "この寿司は美味い";
	}
	public void in3() {
		this.culture = "寿司は和食です";
	}
	//現在の日時を取得
	LocalDateTime now = LocalDateTime.now();
	//指定（2023/03/09 10:23:39）のフォーマットに変形
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
	public void in4() {
		this.dateTime = "今の現在日時は" + now.format(formatter) + "です";
	}	
	//メッセージを表示するメソッド
    public void out() {
	System.out.println(this.greeting);
	System.out.println(this.tasting);
	System.out.println(this.culture);
	System.out.println(this.dateTime);
	}
}
