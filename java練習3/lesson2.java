package java練習3;

public class lesson2 {
  /*
   * 0~999の乱数を繰り返し生成し、777が出るまでの回数を求める。
   * (while(true)を使うこと ）
   */
  public static void main(String[] ages) {
    int num = 777;
    int count = 0;
    while (true) {
      count++;
      int num2 = new java.util.Random().nextInt(1000);
      if (num == num2) {
        break;
      }
    }
    System.out.println(num + "は" + count + "回目に出ました");
  }
}
