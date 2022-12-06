package java復習;

import java.util.Scanner;

public class lesson4 {
  public static void main(String[] ages) {
    Scanner scan = new java.util.Scanner(System.in);
    System.out.print("要素数>");
    int num = scan.nextInt();
    int[] arr = new int[num];
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("要素%d>", i);
      arr[i] = scan.nextInt();
    }
    twiceArray(arr);
    System.out.println("要素を2倍にしました");
    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println("}");
  }

  public static void twiceArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;

    }
  }
}
