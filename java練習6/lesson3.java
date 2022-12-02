package java練習6;

import java.util.Scanner;

public class lesson3 {
  /*
   * 引数で文字列と整数を受け取り、その文字を整数個並べた文字列を返却するメソッドを作成する。
   * またそれを利用して以下の処理を実現せよ。
   * 
   * [実行結果]
   * 繰り返す文字>Hello
   * 繰り返す回数>5
   * HelloHelloHelloHelloHello
   */

  public static void main(String[] ages) {
    Scanner scan = new Scanner(System.in);
    System.out.print("繰り返し文字");
    String letter = scan.next();
    System.out.println("繰り返し回数");
    int num = scan.nextInt();
    System.out.println(getStr(letter, num));

  }

  public static String getStr(String letter, int num) {
    String str = "";
    for (int i = 0; i < num; i++) {
      str += letter;
    }
    return str;
  }
}
