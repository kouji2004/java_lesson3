package java練習3;

public class lesson8 {
  /*
   * 実行例のような描画をせよ。
   * [実行例]
   * ★
   * ★★
   * ★★★
   */

  public static void main(String[] ages) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("★");
      }
      System.out.println();
    }
  }
}
