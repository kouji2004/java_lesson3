package java復習3;

import java.util.*;

public class lesson8 {
  public static void main(String[] args) {
    final int lucky = 777;
    int count = 0;
    Random rond = new java.util.Random();
    while (true) {
      count++;
      int num = rond.nextInt(1000);
      if (num == lucky) {
        break;
      }
    }
    System.out.println("777は" + count + "回目にでました");
  }
}
