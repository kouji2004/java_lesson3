package java復習;

public class lesson5 {
  /*
   * System.out.printf()とは
   * Javaで文字列を表示するときに、小数点２桁で表示したい時や、３桁ごとに「,」を挿入したい場合などがある。
   * そんなときに便利なのがSystem.out.printf()だ。
   * これを使うと、
   * name + “(” + age + “)さん、こんにちは！”
   * といった、面倒かつコーディングミスの温床ともなる+による文字列連結からも解放される。
   */

  /*
   * 小数点を２桁で表示したい場合
   * 例えば以下のようなdoubleの数値があったとする
   * double bmi=21.79930795847751;
   * これを小数点２桁で表示したい。
   * その場合は
   */
  public static void main(String[] ages) {
    double bmi = 21.799654353;
    System.out.println(bmi);
  }
}
