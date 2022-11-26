package java練習2;

public class lesson3_3 {
  /*
   * 日本の信号で渡っていい色を出題し、漢字一文字で入力させる。
   * 入力された文字が「青」または「緑」なら、「OK!」、それ以外なら「NG」と出力する。
   * （switch文を使用すること）
   */
  public static void main(String[] ages) {
    System.out.print("日本の信号で渡っていい色は(漢字一文字)>");
    String ans = new java.util.Scanner(System.in).nextLine();
    switch (ans) {
      case "緑":
      case "青":
        System.out.println("OK!");
        break;
      default:
        System.out.println("NG");

    }
  }
}
