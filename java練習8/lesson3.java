package java練習8;

import java.util.Scanner;

public class lesson3 {
  /*
   * 下の図のように、2つの整数と偶数・奇数の選択を入力すると、その間の偶数か奇数の合計を表示する。
   * 大小の逆入力や、負の数にも対応するようにする。
   */
  public static void main(String[] ages) {
    Scanner scan = new java.util.Scanner(System.in);
    System.out.print("整数1を入力");
    int min = scan.nextInt();
    System.out.print("整数２を入力");
    int max = scan.nextInt(min);
    System.out.print("偶数(1),奇数(2)を選択");
    int select = scan.nextInt();
    boolean isEven = select == 1;

    if (min > max) {
      int temp = min;
      min = max;
      max = temp;
    }
    int sum = 0;
    for (int i = min; i <= max; i++) {
      if((isEven && i%2==0) ||(!isEven && i%2 !=0)){

        sum += i;
      }
      System.out.printf("%dから%dまでの%sの合計は%dです。", min, max, isEven ? "偶数" : "奇数", sum);
      scan.close();

    }
  }
}
