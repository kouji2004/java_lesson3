package java復習4;

import java.util.Scanner;

import java.util.*;

public class lesson5 {
  public static void main(String[] ages) {
    boolean[] num = { true, false, false, true, true };
    System.out.println("第何戦の結果を調べますか(1~5)");
    int num2 = new java.util.Scanner(System.in).nextInt();
    if (num[num2 - 1]) {
      System.out.println("勝ち");
    } else {
      System.out.println("負け");
    }
  }
}
