package java練習7;

public class lesson3 {
  /*
   * クラス数、クラスの人数、それぞれの点数を入力させ、表を出力する。
   */

  public static void main(String[] ages) {
    System.out.println("クラスの数");
    int cNum = new java.util.Scanner(System.in).nextInt();
    int[][] data = new int[cNum][];
    for (int i = 0; i < data.length; i++) {
      System.out.printf("%d組のクラスの人数", i + 1);
      int sNum = new java.util.Scanner(System.in).nextInt();

      data[i] = new int[sNum];
      for(int j=0; j<sNum; j++){
      data[i][j] = new java.util.Scanner(System.in).nextInt();
    }
  }
    System.out.println("表出力");
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        System.out.printf("%3d", data[i][j]);
      }
      System.out.println();
    }
  }

}
