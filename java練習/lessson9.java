package java練習;
// 苦手な範囲を復習する(配列)

// 苦手な範囲を復習する(多次元配列)

class lesson5 {
  public static void main(String[] ages) {

    String[][] name = new String[2][2];

    name[0][0] = "ミウラ";

    System.out.println(name[0][0]);
  }
}

class lesson4 {
  public static void main(String[] ages) {
    int[][] name = new int[2][2]; // 行列
    int[][] num = { { 2 }, { 2 } }; // エラーが出現した

    name[0][1] = 3;
    num[0][0] = 5;
    // num[0][1] = 3; エラー出現

    System.out.println(name[0][1]);
    System.out.println(num[0][0]);
    // System.out.println(num[0][1]); エラー出現
    /*
     * エラー内容
     * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1
     * out of bounds for length 1
     * at java練習.lesson4.main
     */
  }
}

class lesson3 {
  public static void main(String[] ages) {
    int[][] name = { { 1 }, { 1 } };

    name[0][0] = 1;

    System.out.println(name[0][0]);
  }
}

class lesson2 {
  // 苦手な範囲を復習する(多次元配列)
  public static void main(String[] ages) {
    int[][] name = new int[2][2]; // 行列

    name[0][0] = 11;
    name[0][1] = 12;
    name[1][0] = 13;
    name[1][1] = 14;

    System.out.println(name[0][0]);
    System.out.println(name[0][1]);
    System.out.println(name[1][0]);
    System.out.println(name[1][1]);
  }
}

class lesson1 {
  // 苦手な範囲を復習する(配列)
  public static void main(String[] ages) {

    // 配列の生成
    int[] name = new int[4];

    name[0] = 1;
    name[1] = 2;

    System.out.println(name[0]);
    System.out.println(name[1]);
  }
}

public class lessson9 {
}
