package java復習2;

public class lesson9 {
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(6) + 1;
    int num2 = new java.util.Random().nextInt(6) + 1;
    int totale = num + num2;
    if (num == num2) {
      int total2 = num * num2;
      System.out.println("dice1:" + num + "dice2:" + num2 + "score:" + total2);
    } else {
      System.out.println("dice1:" + num + "dice2:" + num2 + "score:" + totale);
    }
  }
}
