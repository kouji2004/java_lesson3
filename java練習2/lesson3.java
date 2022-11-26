package java練習2;

public class lesson3 {
  /*
   * 日本の信号で渡っていい色を出題し、漢字一文字で入力させる。
   * 入力された文字が「青」または「緑」なら、「OK!」、それ以外なら「NG」と出力する。
   */
  public static void main(String[] ages) {
    System.out.println("日本の信号で渡っていい色は？1:青 2:赤 3:緑");
    int num = new java.util.Scanner(System.in).nextInt();

    switch (num) {
      case 1:
        System.out.println("ok");
        break;
      case 2:
        System.out.println("no");
        break;
      case 3:
        System.out.println("ok");
        break;

    }
  }
}
