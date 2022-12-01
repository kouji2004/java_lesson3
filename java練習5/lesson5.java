package java練習5;

public class lesson5 {
  /*
   * 引数でintの値を受け取るとそれを３乗した値を返すメソッドを作成する。
   * mainメソッドで数値を一つ入力させ、実行例のようになるようにせよ。
   * 
   * [実行例]
   * 整数を入れてください。>17
   * 17を３乗すると4913です。
   */
  public static void main(String[] ages) {
    System.out.println("整数を入れてください");
    int num = new java.util.Scanner(System.in).nextInt();
    sun(num);
  }

  public static void sun(int num) {
    System.out.println(num*num*num);
  }
}
