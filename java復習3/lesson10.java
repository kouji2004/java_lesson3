package java復習3;

public class lesson10 {
  public static void main(String[] ages) {
    for (int i = 0; i < 20; i++) {
      if (i % 3 == 0) {
        continue;
      } else {
        System.out.println(i);
      }
    }
  }
}
