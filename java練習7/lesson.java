package java練習7;

public class lesson {
  /*
   * 2次元配列を作成し、九九の表を出力せよ。
   * System.out.printf()と書式文字列%3dを使ってフォーマットすること
   */

  public static void main(String[] ages) {
    int[][] nums = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        nums[i][j] = (i + 1) * (j + 1);
      }
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        System.out.printf("%3d", nums[i][j]);
      }
      System.out.println();
    }
  }
}
