package java練習3;

public class lesson5 {
  /*
   * 二つの数値を入力させ、その2値の入れ替えを行え。
   * 
   * [実行例]
   * xに代入する数値をいれてください。>5[enter]
   * yに代入する数値をいれてください。>3[enter]
   * ２つの数値を入れ替えました。x:3,y:5
   */

  public static void main(String[] ages) {
    System.out.println("xに代入する数値をいれてください。");
    System.out.println("yに代入する数値をいれてください。");

    int x = new java.util.Scanner(System.in).nextInt();
    int y = new java.util.Scanner(System.in).nextInt();

    int temp = x;
    x = y;
    y = temp;
    System.out.println("２つの数値を入れ替えました。x:" + x + ",y:" + y);

  }
}
