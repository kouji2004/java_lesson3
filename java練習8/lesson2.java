package java練習8;

import java.util.Scanner;

public class lesson2 {
  /*
   * 実行結果のように、秒（整数)を入力すると、何時間・何分・何秒かを表示する。
   * 分・秒の値は、１０以下であっても、０を補って２桁で表示する。
   */

  public static void main(String[] ages) {
    final int SEC_OF_HOUR = 3600;
    final int SEC_OF_MIN = 60;
    Scanner s = new Scanner(System.in);

    int n;
    do {
      System.out.print("秒を入力");
      n = s.nextInt();
    } while (n < 0);
    int hour = n / SEC_OF_HOUR;
    int min = (n / SEC_OF_HOUR) / SEC_OF_MIN;
    int sec = n % SEC_OF_MIN;
    System.out.printf("%d時間%02d分%02d秒です。", hour, min, sec);
  }
}
