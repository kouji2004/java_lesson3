package java復習3;

/*
 * finalクラス
クラスにfinalを付ける宣言することができる。そうすると、クラスを継承することができなくなる。

final class FinalClass { }

extendsに続く部分にfinalクラスが書いてあると、コンパイルエラーになる。

class SubclassOfFinalClass extends FinalClass { }

コンパイル結果：final FinalClassからは継承できません
*/

import java.util.*;

public class lesson8_8 {
  public static void main(String[] ages) {
    final int luky = 777;
    int count = 0;
    Random rond = new java.util.Random();
    while (true) {
      count++;
      int num = rond.nextInt(1000);
      if (luky == num) {
        break;
      }
    }
    System.out.println(count + "回目に777がでました");
  }
}
