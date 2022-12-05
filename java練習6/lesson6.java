package java練習6;

import java.util.*;

public class lesson6 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] arr = new int[3];
    System.out.println("0~100の乱数を３つ生成します");
    for (int i = 0; i < 3; i++) {
      arr[i] = rand.nextInt(101);
    }
    System.out.println(printArr(arr));
  }

  public static String printArr(int[] arr) {
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      str += arr[i];
      if (i != arr.length - 1) {
        str += ",";
      }
    }
    str += "}";
    return str;
  }
}
