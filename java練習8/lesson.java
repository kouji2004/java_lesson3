package java練習8;

import java.util.Scanner;

public class lesson {
  /*
   * 二つの整数を入力し、商を求める。もし、あまりがある場合は…の後にあまりを出力すること。
   */

  public static void main(String[] ages) {
    Scanner scan = new Scanner(System.in);
    System.out.println("x:>");
    int x = scan.nextInt();
    System.out.print("y:>");
    int y = scan.nextInt();
    System.out.printf("%d÷%d=%d", x, y, x / y);
    if (x % y != 0) {
      System.out.printf("...%d", x % y);
    }
    System.out.println();
    scan.close();
  }
}
