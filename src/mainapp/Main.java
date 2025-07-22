package mainapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import prefmodel.Prefecture;

public class Main {
    public static void main(String[] args) {
        String[] data = {
            "北海道:札幌市:83424",
            "青森県:青森市:9646",
            "岩手県:盛岡市:15275",
            "宮城県:仙台市:7282",
            "秋田県:秋田市:11638",
            "山形県:山形市:9323",
            "福島県:福島市:13784",
            "茨城県:水戸市:6097",
            "栃木県:宇都宮市:6408",
            "群馬県:前橋市:6362",
            "埼玉県:さいたま市:3798"
        };

        Scanner scanner = new Scanner(System.in);

        // 入力例: 8,5,9
        System.out.println("都道府県の番号をカンマ区切りで入力してください（例：8,5,9）:");
        String input = scanner.nextLine();

        // 昇順か降順か
        System.out.println("昇順 or 降順（asc / desc）を入力してください:");
        String order = scanner.nextLine().trim().toLowerCase();

        String[] indices = input.split(",");
        List<Prefecture> selectedPrefectures = new ArrayList<>();

        for (String indexStr : indices) {
            try {
                int idx = Integer.parseInt(indexStr.trim());
                if (idx >= 0 && idx < data.length) {
                    String[] parts = data[idx].split(":");
                    String name = parts[0];
                    String capital = parts[1];
                    double area = Double.parseDouble(parts[2]);

                    selectedPrefectures.add(new Prefecture(name, capital, area));
                } else {
                    System.out.println("インデックスが範囲外です: " + idx);
                }
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です: " + indexStr);
            }
        }

        // ソート
        if (order.equals("asc")) {
            selectedPrefectures.sort(Comparator.comparingDouble(Prefecture::getArea));
        } else if (order.equals("desc")) {
            selectedPrefectures.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
        } else {
            System.out.println("並び順の入力が無効です。asc または desc を指定してください。");
        }

        // 出力
        System.out.println("\n--- 結果 ---");
        for (Prefecture p : selectedPrefectures) {
            p.display();
        }

        scanner.close();
    }
}