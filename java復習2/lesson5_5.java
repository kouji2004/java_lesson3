package java復習2;

public class lesson5_5 {
  public static void main(String[] ages) {
    System.out.println("結婚していますか? 1:はい 2:いいえ");
    int isMarried = new java.util.Scanner(System.in).nextInt();

    switch (isMarried) {
      case 1:
        System.out.println("結婚しています");
        break;

      case 2:
        System.out.println("結婚していません");
        break;
    }
  }
}
