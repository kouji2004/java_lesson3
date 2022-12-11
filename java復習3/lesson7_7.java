package java復習3;

public class lesson7_7 {
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(20);
    int num2 = new java.util.Random().nextInt(20);
    if (num > num2) {
      System.out.println("num:" + num + "num2:" + num2 + "の差は" + (num - num2));
    } else {
      System.out.println("num2:" + num2 + "num:" + num + "の差は" + (num2 - num));
    }
  }
}
