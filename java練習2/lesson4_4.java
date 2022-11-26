package java練習2;

public class lesson4_4 {
  /*
   * サイコロを２個ふって、２個の合計を点数とする。ただし、ゾロ目の場合は点数は２倍となる。
   * サイコロの目と点数を表示せよ。
   */

  public static void main(String[] ages) {

    int dice = new java.util.Random().nextInt(6) + 1;
    int dice2 = new java.util.Random().nextInt(6) + 1;
    int score = dice + dice2;
    if (dice == dice2) {
      score *= 2;
    }
    System.out.println("dice:" + dice);
    System.out.println("dice2:" + dice2);
    System.out.println("score:" + score);

  }
}