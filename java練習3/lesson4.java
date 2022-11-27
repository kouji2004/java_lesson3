package java練習3;

public class lesson4 {
  /*
   * 1~20を順番に出力する。ただし、３の倍数は出力しない。
   * (continueを用いる)
   */
  public static void main(String[] ages) {
    for (int i = 1; i <= 20; i++) {
      if (i % 3 == 0) {
        continue;

      }
      System.out.println(i);
    }
  }
}
