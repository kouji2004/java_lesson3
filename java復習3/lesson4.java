package java復習3;

public class lesson4 {
  public static void main(String[] ages) {
    System.out.println("いくつ★を出力しますか？");
    int num = new java.util.Scanner(System.in).nextInt();
    switch (num) {
      case 1:
        System.out.println("★");
        break;
      case 2:
        System.out.println("★★");
        break;
      case 3:
        System.out.println("★★★");
        break;
      case 4:
        System.out.println("★★★★");
        break;
      case 5:
        System.out.println("★★★★★");
        break;
    }
  }
}