package java練習8;

import java.util.Scanner;

public class lesson2_2 {
  public static void main(String[] ages) {
    final int SEC_OF_HOUR = 3600; // １時間当たりの秒
    final int SEC_OF_MIN = 60; // 1分当たりの秒
    Scanner s = new Scanner(System.in); // スキャナーを使えるようにする。
    int n; // ユーザーからの入力値を受け取る変数
    do {
      System.out.print("秒を入力＞");
      n = s.nextInt();
    } while (n < 0);// 負の値が入っていたら繰り返し
    // nを1時間当たりの秒で割った商が求めるhour
    int hour = n / SEC_OF_HOUR;
    // nを1時間当たりの秒で割った余りを1分あたりの秒で割った商が求めるmin
    int min = (n % SEC_OF_HOUR) / SEC_OF_MIN;
    // nを1分あたりの秒で割った余りがsec
    int sec = n % SEC_OF_MIN;
    // %02dで2桁分の幅を確保し空いたスペースを０で埋める
    System.out.printf("%d時間%02d分%02d秒です。", hour, min, sec);
  }
}
