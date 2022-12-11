package java復習3;

public class lesson9 {
  public static void main(String[] ages) {
    for (int i = 2; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        if (i * j > 50) {
          break;
        }
        System.out.print(i * j + "");
      }
      System.out.println();
    }
  }
}
