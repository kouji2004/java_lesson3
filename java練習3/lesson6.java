package java練習3;

public class lesson6 {
  /*
   * 0~20の乱数を３個生成し、それを小さい順に出力する。
   */
  public static void main(String[] ages) {
    int num1 = new java.util.Random().nextInt(21);
    int num2 = new java.util.Random().nextInt(21);
    int num3 = new java.util.Random().nextInt(21);
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = num1;
      if (num1 > num3) {
        temp = num1;
        num1 = num3;
        num3 = num1;
      }
      if (num2 > num3) {
        temp = num2;
        num2 = num3;
        num3 = num2;
      }
      System.out.println("３つの乱数を小さい順に並べました。" + num1 + "," + num2 + "," + num3);
    }
  }
}
