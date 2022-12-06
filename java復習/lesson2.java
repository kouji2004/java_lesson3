package java復習;

import java.util.Scanner;

public class lesson2 {
  public static void main(String[] ages) {
    Scanner scan = new Scanner(System.in);
    System.out.println("整数");
    int num = scan.nextInt();
    String str;
    if (isEven(num)) {
      str = "整数";
    } else {
      str = "奇数";
    }
    System.out.printf("%dは%sです", num, str);
  }

  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
}
