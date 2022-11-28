package java練習4;

public class lesson2 {
  /*
   * 0~999の乱数を繰り返し生成し、777が出るまでの回数を求める。
   * (while(true)を使うこと ）
   */

  public static void main(String[] ages) {
    int count = 0;
    int LUCKY = 777;

    while (true) {
      count++;
      int num = new java.util.Random().nextInt(999);
      if (LUCKY == num) {
        break;
      }
    }
    System.out.println(LUCKY + "は" + count + "回目に出ました。");

  }
}
