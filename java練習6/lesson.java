package java練習6;

public class lesson {
  /*
   * 月を引数で受け取るとその月の日数を返すメソッドを作成せよ。（２月は28日としてよい）
   * mainメソッドで月を入力させ、その月の日数を表示する。
   * 
   * [実行結果]
   * 月を入力してください>11
   * 11月の日数は30日です。
   */

  public static void main(String[] ages) {
    System.out.println("月を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    System.out.println(num + "月の日数は" + Days(num) + "日です");
  }

  public static int Days(int month) {
    switch (month) {
      case 2:
        return 28;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        return 31;
    }
  }
}
