package java練習4;

public class lesson3 {
  /*
   * 次の手順で配列を生成し、出力せよ。
   * 
   * int型の配列を宣言する。
   * 配列の要素数を3にする。
   * 最初の要素に30を代入
   * 次の要素に70を代入
   * 最後の要素に10を代入
   * 出力
   */

  public static void main(String[] ages) {

    int[] num = new int[3];
    num[0] = 30;
    num[1] = 70;
    num[2] = 10;
    System.out.println("nums[0]:" + num[0] + " nums[1]:" + num[1] + " nums[2]:" + num[2]);
  }
}
