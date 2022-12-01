package java練習5;

public class lesson6 {
  /*
   * 引数でintの値を3つ受け取ると、その中の最大値を返却するメソッドを作成する。
   * mainメソッドにて整数を３つ受け取り、最大値を求める処理を作成せよ。
   * 
   * [実行例]
   * 整数1を入れてください。>3
   * 整数2を入れてください。>10
   * 整数3を入れてください。>4
   * 3つの整数値の最大は10です。
   */

  public static void main(String[] ages) {
    System.out.println(" 整数1を入れてください。");
    int num = new java.util.Scanner(System.in).nextInt();
    System.out.println(" 整数2を入れてください。");
    int num2 = new java.util.Scanner(System.in).nextInt();
    System.out.println(" 整数3を入れてください。");
    int num3 = new java.util.Scanner(System.in).nextInt();

    System.out.println("3つの整数値の最大は" + max(num, num2, num3) + "です");

  }

  public static int max(int a, int b, int c) {
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    return max;
  }
}