package java練習2;

public class lesson10 {
  /*
   * 1から20までカウントアップしていく、ただし、３の倍数の時は「Fizz」,5の倍数の時は「Bazz」,3と5の公倍数のときは「FizzBazz」
   * と表示する。
   */

  public static void main(String[] ages) {
    for (int i = 1; i <= 50; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBazz");
      } else if (i % 5 == 0) {
        System.out.println("Bazz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }
}
