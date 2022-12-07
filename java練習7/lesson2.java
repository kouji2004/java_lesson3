package java練習7;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class lesson2 {
  /*
   * 行数と列数を入力させ、その表を０〜９９の乱数で埋め尽くす二次元配列を作成せよ。
   * 出力の際はSystem.out.printf()を使ってフォーマットすること。
   */
  public static void main(String[] ages) {
    System.out.println("何行?");
    int rows = new java.util.Scanner(System.in).nextInt();
    System.out.println("何列?");
    int cols = new java.util.Scanner(System.in).nextInt();
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = new java.util.Random().nextInt(100);
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.printf("%3d", matrix[i][j]);
      }
      System.out.println();
    }
  }
}
