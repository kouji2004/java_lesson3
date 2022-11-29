package java練習4;

public class lesson4 {
  /*
   * 次の手順で配列を生成し、出力せよ。
   * 
   * String型の配列を宣言する。
   * 配列の要素数を3にする。
   * 最初の要素にBananaを代入
   * 次の要素にAppleを代入
   * 最後の要素にOrangeを代入
   * 出力
   */

  public static void main(String[] ages) {
    String[] fruits;
    fruits = new String[3];

    fruits[0] = "banana";
    fruits[0] = "apple";
    fruits[0] = "orange";

    System.out.println("fruits[0]:" + fruits[0] + " fruits[1]:" + fruits[1] + " fruits[2]:" + fruits[2]);

  }
}
