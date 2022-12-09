package java復習2;

public class lesson2 {
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(10) + 1;
    if (num % 2 == 0) {
      System.out.println("偶数");
    } else {
      System.out.println("奇数");
    }

    int num2 = new java.util.Random().nextInt(10) + 1;
    if (num2 % 2 == 0) {
      System.out.println("偶");
    } else {
      System.out.println("奇");
    }
  }
}