package java練習2;

public class lesson4 {
  /*
   * サイコロを２個ふって、２個の合計を点数とする。ただし、ゾロ目の場合は点数は２倍となる。
   * サイコロの目と点数を表示せよ。
   */
  public static void main(String[] ages) {
    int num = new java.util.Random().nextInt(6) + 1;
    int num2 = new java.util.Random().nextInt(6) + 1;
    int total = num + num2;
    System.out.println("1回目:" + num);
    System.out.println("２回目:" + num2);
    System.out.println("合計は" + total);
  }
}
