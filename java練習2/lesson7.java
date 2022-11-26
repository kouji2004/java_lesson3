package java練習2;

public class lesson7 {
  /*
   * 10からカウントダウンし、０になったらStart!!と表示する。
   */
  public static void main(String[] ages) {
    for (int i = 10; i >= 0; i--) {
      if (i == 0) {
        System.out.println("スタート");
      } else {
        System.out.println(i);
      }
    }
  }
}
