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

    /*
     * ３桁ごとに,を埋め込みたい場合
     * 例えば以下のような金額を表す数値があったとする
     * int money =10000000;
     * 
     * これに３桁ごとに,（カンマ)を加えたければ
     */
    int money = 10000000;
    System.out.printf("所持金は%,d円です", money);

    /*
     * ２つの具体例をみてもわかるが、System.out.printf()は文字列の中に%~という書式文字列を埋め込んで使う。
     * System.out.printf(“BMIは%.2fです。”,bmi);
     * System.out.printf(“所持金は%,d円です。”,money);
     */

    String name = "みうら";
    int age = 20;
    System.out.printf("%s(%d)", name, age);

    /*
     * %s 文字列(string) “%sさん”,”山田” 山田さん
     * %d 数値(decimal) “x=%d”, 5 x=5
     * %5d 少なくとも５桁
     * 足りない桁は空白 “x=%5d”, 5 x= 5
     * %05d 少なくとも５桁
     * 足りない桁は0埋め “x=%05d”, 5 x=00005
     * %,d 3桁毎に,を挿入 “x=%,d”, 5000 x=5,000
     * %f 小数(floating-point) “x=%f”, 10.123 x=10.123
     * %.2f 小数点以下2桁 “x=%.2f”, 10.123 x=10.12
     * %7.1f 少なくとも7桁、うち小数点以下1桁 “x=%7.1f”, 10.123 x= 10.1
     */

  }
}
