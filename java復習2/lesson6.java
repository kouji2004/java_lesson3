package java復習2;

public class lesson6 {
  public static void main(String[] ages) {
    System.out.println("10月を英語で何?");
    String ans = new java.util.Scanner(System.in).nextLine();
    if (ans.equals("october")) {
      System.out.println("正解");
    } else {
      System.out.println("不正解！正解はoctober");
    }
  }
}
