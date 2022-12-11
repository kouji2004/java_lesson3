package java復習3;

public class lesson7 {
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(20);
    int num2 = new java.util.Random().nextInt(20);
    int total = num - num2;
    int total2 = num2 - num;
    if (num > num2) {

      System.out.println("num:" + num + "num2:" + num2 + "の差は" + total);
    } else {
      System.out.println("num2:" + num2 + "num:" + num + "の差は" + total2);
    }
  }
}
