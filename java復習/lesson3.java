package java復習;

import java.util.Scanner;

public class lesson3 {
  public static void main(String[] ages) {
    Scanner scan = new Scanner(System.in);
    System.out.println("繰り返す文字");
    String letter = scan.next();
    System.out.println("繰り返す回数");
    int num = scan.nextInt();
    System.out.println(getStr(letter, num));
  }

  public static String getStr(String letter, int num) {
    String str = "";
    for (int i = 0; i < num; i++) {
      str += letter;
    }
    return str;
  }
}
