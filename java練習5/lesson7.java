package java練習5;

public class lesson7 {
  /*
   * 引数でintの値を1つ受け取ると、１からその値までの和を求め返却するメソッドを作成する。
   * mainメソッドにて整数を1つ受け取り、和を求める処理を作成せよ。
   * 
   * [実行例]
   * 1からいくつまで足しますか>10
   * 1から10までの和は55です。
   */
  public static void main(String[] ages) {
    System.out.println("1からいくまで足しますか？");
    int num = new java.util.Scanner(System.in).nextInt();

    System.out.println(num + "の和は" + max(num));
  }

  public static int max(int a) {
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      sum += i;
    }
    return sum;
  }
}
