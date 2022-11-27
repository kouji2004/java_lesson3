package java練習3;

public class lesson3 {
  /*
   * 九九の出力をせよ。ただし、５０より大きい値は出力しない。
   * (breakを用いる)
   */
  public static void main(String[] ages) {
    for (int i = 1; i <= 9; i++) {
      for (int n = 1; n <= 9; n++) {
        if (i * n > 50) {
          break;
        }
        System.out.println(i * n + "");
      }
    }
  }
}
