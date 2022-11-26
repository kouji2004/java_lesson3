package java練習2;

public class lesson6 {
  /*
   * 0~100の乱数を繰り返し発生させ、100が出るまでの回数を数える。
   * (do~whileを使うこと)
   */
  public static void main(String[] ages) {
    int count = 0;
    int num;
    do {
      num = new java.util.Random().nextInt(100) + 1;
      count++;
    } while (num != 100);
    {
      System.out.println(count + "回目に100が出ました");
    }
  }
}