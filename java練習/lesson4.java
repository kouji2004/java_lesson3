package java練習;

public class lesson4 {
  /*
   * データ型と参照型の違い
   * データ型：データの種類を指す。入れ物の形を指定する。
   * データ型の種類：基本データ型（整数、小数、文字、真偽値）と参照型（文字列、配列）
   * 基本データ型はデータそのもを扱える
   * 参照型は参照値が変数の中に入る
   */
  public static void main(String[] ages) {
    int month = 11;
    int day = 22;
    float weight = 63.0f;
    double height = 168.5;
    char bloodtype = 'A';
    String name = "mmiura";

    System.out.println("こんにちは、" + name + "さん");
    System.out.println("今日は" + month + day + "です");
    System.out.println(weight + "と" + height);
    System.out.println(bloodtype);
  }
}
