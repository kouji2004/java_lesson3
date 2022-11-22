package java練習;

public class lesson5 {
  /*
   * 配列はデータのロッカーみたいなもの
   * データ型の変数を複数まとめて管理するもの
   * 配列の生成にはnewを使う。生成時にデフォルト初期値が設定される。
   */

  public static void main(String[] ages) {
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 81;
    score[2] = 82;
    String[] name = { "miura", "urara", "irara" };
    System.out.println("miura" + score[0] + "点");
    System.out.println(name[1] + score[1] + "点");
    System.out.println(name[2] + score[2] + "点");
  }
}
