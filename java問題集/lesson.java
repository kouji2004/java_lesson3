package java問題集;

class lesson2 {
  // xに10を代入し、それに５を３回足し結果を出力せよ。(whileと+=を使うこと)
  public static void main(String[] ages) {
    int x = 10;
    int count = 3;
    while (count > 0) {
      x += 5;
      count--;
    }
    System.out.println("Ans:" + x);
  }
}

class lesson1 {
  /*
   * xに23,yに6を代入して以下の結果を求め出力せよ。
   * [実行例]
   * x+y=29
   * x-y=17
   * x*y=138
   * x/y=3
   * x%y=5
   */
  public static void main(String[] ages) {
    int x;
    int y;

    x = 23;
    y = 6;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);
  }
}

public class lesson {

}
