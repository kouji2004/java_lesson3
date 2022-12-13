package java復習4;

import java.util.Random;

public class lesson7 {
  public static void main(String[] ages) {
    Random rand = new java.util.Random();
    int[] nums = new int[5];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = rand.nextInt(100);
      System.out.println("nums[" + i + "]:" + nums[i]);
    }
  }
}
