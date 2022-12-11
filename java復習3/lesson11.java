package java復習3;

public class lesson11 {
  public static void main(String[] ages) {
    System.out.println("xに代入する数値をいれてください。");
    int x = new java.util.Scanner(System.in).nextInt();
    System.out.println("yに代入する数値をいれてください。");
    int y = new java.util.Scanner(System.in).nextInt();

    int num1 = x; // num3にはxが代入されている
    x = y;
    y = num1;
    System.out.println("x:" + x + "y:" + y);
  }
}
