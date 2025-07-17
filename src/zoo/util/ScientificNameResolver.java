package zoo.util;

public class ScientificNameResolver {
	public static String getScientificName(String name) {
		switch (name) {
		case "ライオン":
			return "パンテラ　レオ";
		case "ゾウ":
			return "ロキソドンタ";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":	
			return "パン・トゥログロディテス";
		case "シマウマ":	
			return "チャップマンシマウマ";
		case "インコ":	
			default:
				return "不明";
		}
	}

}
