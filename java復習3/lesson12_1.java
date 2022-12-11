package java復習3;

import java.util.Random;

public class lesson12_1 {
  public static void main(String[] ages) {
    Random rand = new Random();
    int num1 = rand.nextInt(21);
    int num2 = rand.nextInt(21);
    int num3 = rand.nextInt(21);
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num1 > num3) {
      int temp = num1;
      num1 = num3;
      num3 = temp;
    }
    if (num2 > num3) {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
    System.out.println("３つの乱数を小さい順に並べました。" + num1 + "," + num2 + "," + num3);

  }
}
