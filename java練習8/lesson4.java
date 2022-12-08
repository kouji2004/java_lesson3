package java練習8;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
  /*
   * 受験人数(1～9人)を入力させる。
   * 各受験生の点数をランダム（０〜５０）に発生させ、採点結果を一覧表示する。
   */
  public static void main(String[] ages) {

    System.out.print("■ 受験人数（1～9人）を入力してください:");
    int num = new Scanner(System.in).nextInt();
    int[] scores = new int[num];
    Random rand = new Random();

    for (int i = 0; i < scores.length; i++) {
      scores[i] = rand.nextInt(51);
    }
    printScore(scores);
  }

  public static void printScore(int[] arr) {
    System.out.println("------------------------------------------------------------");
    System.out.println("    ■ 採点結果 一覧表");
    System.out.println("------------------------------------------------------------");
    for (int i = 0; i < arr[i]; i++) {
      System.out.printf("受験者%d |", i + 1);
      for (int j = 1; j <= arr[i]; j++) {
        System.out.print(j % 10 == 0 ? '+' : '*');
      }
      System.out.printf(" %d点\n", arr[i]);
    }
    System.out.println("--------|---------+---------+---------+---------+---------+");
    System.out.println("        0        10        20        30        40        50");
  }
}