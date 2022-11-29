package java練習4;

public class lesson5 {
  /*
   * 次の手順で配列を生成し、出力せよ
   * double型の配列を宣言すると同時に22.3,33.1,11.5の３つの値で初期化する。
   * 最初の要素を22.5で上書きする
   * 出力
   * [実行例]
   * 最初の要素を22.5に変更しました。
   */

  public static void main(String[] ages) {
    double[] nums = { 22.3, 33.1, 11.5 };

    nums[0] = 22.5;
    System.out.println("最初の要素を" + nums[0] + "に変更しました。");

  }
}
