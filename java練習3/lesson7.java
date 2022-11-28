package java練習3;

public class lesson7 {
  /*
   * 実行例のような３行３列の描画をせよ。
   * [実行例]
   * ★★★
   * ★★★
   * ★★★
   */
  public static void main(String[] ages) {
    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 3; j++) {
        System.out.print("★");
      }
      System.out.println();
    }
  }
}
