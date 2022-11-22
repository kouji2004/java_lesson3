package java練習;

public class lesson6 {
  /*
   * 多次元配列
   * 配列の配列を作れる
   */
  public static void main(String[] ages) {
    int[][] allScore = new int[2][3];
    allScore[0][0] = 80;
    allScore[0][1] = 80;
    allScore[0][2] = 80;
    allScore[1][0] = 80;
    allScore[1][1] = 80;
    allScore[1][2] = 80;

    // int[][] allScore1 = { { 10, 20, 30 }, { 40, 50, 60 } };

    System.out.println("allScore.length" + allScore.length);
    System.out.println("allScore[0].length" + allScore[0].length);
  }
}
