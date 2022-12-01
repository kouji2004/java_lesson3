package java練習5;

public class lesson5_5 {
  public static void main(String[] args) {
    System.out.print("整数を入れてください。>");
    int num = new java.util.Scanner(System.in).nextInt();
    System.out.println(num + "を３乗すると" + cubeOf(num) + "です。");
  }

  public static int cubeOf(int num) {
    int cubed = num * num * num;
    return cubed;
  }

}
