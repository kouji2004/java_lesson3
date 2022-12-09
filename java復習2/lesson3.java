package java復習2;

public class lesson3 {
  public static void main(String[] ages) {
    System.out.println("スカイツリーの高さは?");
    int num = new java.util.Scanner(System.in).nextInt();
    if (num == 634) {
      System.out.println("正解");
    } else if (num > 634) {
      System.out.println("もう少し低い(600~650の間)");
    } else if (num < 634) {
      System.out.println("もう少し高い(600~650の間)");
    }
  }
}
