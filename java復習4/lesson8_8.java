package java復習4;

import java.util.Scanner;

public class lesson8_8 {
  public static void main(String[] ages) {
    Scanner scan = new java.util.Scanner(System.in);
    System.out.println("人数を入力");
    int num = scan.nextInt();
    int[] score = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print((i + 1) + "人目の点数を入力:");
      score[i] = scan.nextInt();
    }
    for(int i=0; i<num; i++){
      System.out.print((i+1)+"人目");
      for(int j=0; j<score[i]; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
