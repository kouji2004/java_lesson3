package java練習4;

public class lesson {
  /*
   * 0~20の乱数を２個生成し、大きい方の数値から小さい方の数値を引いた差を求める。
   */

  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(20);
    int num2 = new java.util.Random().nextInt(20);
    int score = num - num2;
    int score2 = num2 - num;

    if (num > num2) {
      System.out.println("numと" + num + "num2の" + num2 + "差は" + score);
    } else {
      System.out.println("num2と:" + num2 + "numの" + num + "差は" + score2);
    }
  }
}
