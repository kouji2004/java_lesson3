package java練習2;

public class lesson {
  // 英語の１０月を入力させ、正しければ「OK!」間違っていれば「NG」と出力する。
  public static void main(String[] ages) {
    boolean a = true;

    System.out.println("英語の１０月を入力");

    String b = new java.util.Scanner(System.in).nextLine();

    if (b.equals("October")) {
      System.out.println("ok");
    } else {
      System.out.println("no");
    }
  }
}
