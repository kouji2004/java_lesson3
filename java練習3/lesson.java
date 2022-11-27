package java練習3;

public class lesson {
  /*
   * 0~20の乱数を２個生成し、大きい方の数値から小さい方の数値を引いた差を求める。
   */

  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(21);
    int num2 = new java.util.Random().nextInt(21);
    if (num > num2) {
      System.out.println("num:" + num + "とnum2:" + num2 + "の差は" + (num - num2) + "です");
    } else {
      System.out.println("num2:" + num2 + "とnum:" + num + "の差は" + (num2 - num) + "です");
    }
  }
}
