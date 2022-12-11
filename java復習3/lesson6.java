package java復習3;

public class lesson6 {
  public static void main(String[] ages) {
    for (int i = 0; i <= 20; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizBazz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Bazz");
      } else {
        System.out.println(i);
      }
    }
  }
}
