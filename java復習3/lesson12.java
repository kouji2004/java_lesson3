package java復習3;

public class lesson12 {
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(20);
    int num2 = new java.util.Random().nextInt(20);
    int num3 = new java.util.Random().nextInt(20);
    if (num < num2) {
      if (num2 < num3) {
        System.out.println("num3:" + num3 + "num2:" + num2 + "num:" + num);
      } else if (num3 < num) {
        if (num < num2) {
          System.out.println("num2:" + num2 + "num:" + num + "num3:" + num3);
        } else if (num3 < num2) {
          if (num2 < num) {
            System.out.println("num:" + num + "num2:" + num2 + "num3:" + num3);
          }
        }
      }
    }
  }
}
