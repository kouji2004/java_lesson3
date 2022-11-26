package java練習2;

public class lesson8 {
  /*
   * forループを用いて実行例のような出力を得よ。
   * [実行例]
   * 1
   * 4
   * 9
   * 16
   * 25
   * 36
   * 49
   * 64
   * 81
   */

  public static void main(String[] ages) {
    for (int i = 1; i <= 9; i++) {
      System.out.println(i * i);
    }
  }
}
