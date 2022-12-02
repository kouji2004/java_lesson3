package java練習6;

import java.util.Scanner;

public class lesson4 {
  /*
   * 引数でint型の配列を受け取り、その配列の要素を２倍にするメソッドを作成せよ。
   * そのメソッド使用し以下の処理を実現せよ。
   * [実行結果]
   * 要素数>3
   * 要素0>3
   * 要素1>5
   * 要素2>10
   * 要素を２倍にしました。
   * {6,10,20,}
   */

  public static void main(String[] ages) {
    Scanner scan = new Scanner(System.in);
    System.out.print("要素数");
    int num = scan.nextInt();
    int[] arr = new int[num];
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("要素数", i);
      arr[i] = scan.nextInt();
    }
  }
}