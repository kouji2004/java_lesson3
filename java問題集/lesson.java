package java問題集;

import java.util.Random;

class lesson4 {
  /*
   * bottomに4.3を代入、heightに5.4を代入して、三角形の面積を求めよ。
   * [実行例]
   * 底辺:4.3,高さ:5.4の三角形の面積は:11.61
   */
  public static void main(String[] ages) {
    double bottom = 4.3;
    double height = 5.4;
    System.out.println(bottom * height / 2);
  }
}

class lesson3 {
  // 1~10の乱数を生成して、それが偶数か奇数かを判定
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(10) + 1;
    if (num % 2 == 0) {
      System.out.println("偶数" + num);
    } else {
      System.out.println("奇数" + num);
    }
  }
}

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
