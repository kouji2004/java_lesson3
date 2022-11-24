package java練習;
// 苦手な範囲を復習する(配列)

// 苦手な範囲を復習する(多次元配列)




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
