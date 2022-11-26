package java練習2;

public class lesson2 {
  /*
   * スペイン語で日曜は何と言うかという３択問題を出題し、答えを番号で入力させる。
   * 正解だったら。「OK!」不正解だったら「NG」と出力する。
   * （switch文を使用すること）
   */
  public static void main(String[] ages) {
    System.out.println("スペイン語で日曜は何?1:Lunes,2:Jueves,3:Domingo　>");
    int num = new java.util.Scanner(System.in).nextInt();

    switch(num){
      case 3:
      System.out.println("ok");
      break;

      default:
      System.out.println("no");
    }

  }
}
