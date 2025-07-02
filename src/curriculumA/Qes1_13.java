package curriculumA;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//バイト型
		byte var ;
		//短整数型
		short s_var ;
		//整数型
		int i_var ;
		//長整数型
		long l_var ;
		//単精度浮動小数点数型
		float f_var ;
		//倍精度浮動小数点数型
		double d_var ;
		//文字型
		char c_var ;
		//文字列型
		String S_var ;
		//ブーリアン型
		boolean b_var ;

		//バイト型
		var = 0;
		//短整数型
		s_var = 0;
		//整数型
		i_var = 0;
		//長整数型
		l_var = 0L;
		//単精度浮動小数点数型
		f_var = 0.0f;
		//倍精度浮動小数点数型
		d_var = 0.0d;
		//文字型
		c_var = '\u0000';
		//文字列型
		S_var = null;
		//ブーリアン型
		b_var = false;
		
		//バイト型
		var = 10;
		//短整数型
		s_var = 100;
		//整数型
		i_var = 1000;
		//長整数型
		l_var = 10000L;
		//単精度浮動小数点数型
		f_var = 9.5f;
		//倍精度浮動小数点数型
		d_var = 10.5d;
		//文字型
		c_var = 'a';
		//文字列型
		S_var = "ハロー";
		//ブーリアン型
		b_var = true;
		
		//Qes1_4
		System.out.println(var + s_var + i_var + l_var);
		System.out.println(var + var);
		System.out.println(c_var + " " + S_var + " " + b_var);
		System.out.printf("%.0f" , var + f_var + d_var + s_var + i_var + l_var);
		System.out.println();
		System.out.println(l_var * i_var * s_var * var);
		System.out.println(d_var / s_var);
		System.out.println(var - s_var);
		System.out.println();
	 
		//Qes1_5
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		System.out.println();
		
		//Qes1_6
		S_var = "山田太郎";
		var = 18;
		f_var = 170.5f;
		float f_var2 = 62.2f;
		String S_var2 = "寿司";
		
		System.out.println("初めまして" + S_var + "です");
		System.out.println("年齢は" + var + "歳です");
		System.out.println("身長は" + f_var + "cmです");
		System.out.println("体重は" + f_var2 + "kgです");
		System.out.println("好きな食べ物は" + S_var2 + "です");
		System.out.println();
		
		//Qes1_7
		System.out.println("BMIは" + (f_var2 / ((f_var / s_var) * (f_var / s_var))) + "です"); 
		System.out.println();
		
		//Qes1_8
		S_var = "鈴木一郎";
		var = 24;
		f_var = 168.5f;
		f_var2 = 64.2f;
		S_var2 = "オムライス";
		
		System.out.println("初めまして" + S_var + "です");
		System.out.println("年齢は" + var + "歳です");
		System.out.println("身長は" + f_var + "cmです");
		System.out.println("体重は" + f_var2 + "kgです");
		System.out.println("好きな食べ物は" + S_var2 + "です");
		System.out.printf("BMIは %.1f です \n" , (f_var2 / ((f_var / s_var) * (f_var / s_var))));
		System.out.println();
		
		//Qes1_9
		var += var;
		f_var += f_var;
		f_var2 += f_var2;
		System.out.println("初めまして" + S_var + "です");
		System.out.println("年齢は" + var + "歳です");
		System.out.println("身長は" + f_var + "cmです");
		System.out.println("体重は" + f_var2 + "kgです");
		System.out.println("好きな食べ物は" + S_var2 + "です");
		System.out.printf("BMIは %.2f です \n" , (f_var2 / ((f_var / s_var) * (f_var / s_var))));
		System.out.println();
		
		//Qes1_10
		b_var = var < 24;
		System.out.println(b_var);
		System.out.println();
		
		//Qes1_11
		var = 24;
		f_var = 168.5f;
		f_var2 = 64.2f;
		String age = String.valueOf(var); //ここでString型に変換
		String height = String.valueOf(f_var);
		String weight = String.valueOf(f_var2);
		
		System.out.println(age + "歳" + " " + height + "cm" +" " + weight + "kg" );
		System.out.println();
		
		//Qes1_12
		int age2 = Integer.parseInt(age);
		float height2 = Float.parseFloat(height);
		System.out.println(age2 + "歳 " + height2 + "cm "); 
		System.out.println();
		
		//Qes1_13
		b_var = age2 == 25 || height2 >= 160;
		System.out.println(b_var);
		
		//別解答　System.out.println(age2 == 25 || height2 >= 160);

	}
}



