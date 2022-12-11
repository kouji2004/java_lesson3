package java復習3;

public class lesson5 {
  public static void main(String[] ages) {
    System.out.println("いくつ★を出力しますか？");
    int num = new java.util.Scanner(System.in).nextInt();
    for (int i = 0; i <= num; i++) {
      System.out.println("★");
    }
  }
}
