package java復習4;

import java.util.*;

public class lesson8 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("人数を入力 : ");
    int n = stdIn.nextInt();
    int[] score = new int[n];
    
    for (int i = 0; i < n; i++) {
    System.out.print((i + 1) + "人目の点数を入力(0-10) : ");
    score[i] = stdIn.nextInt();
    }
    
    for (int i = 0; i < n; i++) {
    System.out.print((i + 1) + "人目 : ");
    for (int j = 0; j < score[i]; j++) {
    System.out.print('*');
    }
    System.out.println();
    }
    }
  }