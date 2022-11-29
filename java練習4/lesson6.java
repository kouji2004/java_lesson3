package java練習4;

public class lesson6 {
  /*
   * 次の手順で配列を生成し、出力せよ。
   * char型の配列を宣言すると同時に’H’,’E’,’L’,’L’,’O’,’!’の値で初期化する。
   * for文で回しながら出力する
   */

  public static void main(String[] ages) {
    char[] nums = { 'H', 'E', 'L', 'L', 'O', '!' };

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);

    }
  }
}
