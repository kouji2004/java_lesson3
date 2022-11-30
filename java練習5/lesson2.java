package java練習5;

import java.util.Random;
import java.util.Scanner;

public class lesson2 {
  public static void main(String[] ages) {
    Scanner num = new Scanner(System.in);
    int count = 0;

    int num2 = new Random().nextInt(100) + 1;

    while (true) {
      try {
        count++;
        System.out.println(count + "回目：予想値(１～１００）の入力");
        int userGuess = num.nextInt();

        if (num2 < userGuess) {
          System.out.println("もっと小さな値です");
        } else if (num2 > userGuess) {
          System.out.println("もっと大きな値です");
        } else {
          System.out.println("\n正解です!!");
          break; // 無限ルールの終了
        }
      } catch (Exception e) {
        // 整数以外のデータが入力された場合
        System.out.println("【エラー】予想値は数値を入力してください");
        // 入力されたデータの除去
        num.next();
      }
    }
  }
}