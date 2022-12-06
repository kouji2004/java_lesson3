package java練習6;

public class lesson7 {
  /*
   * ２つのint型配列を受け取り、その配列の要素を足した新たな配列を返却するメソッドを作成する。(２つの配列の要素数は同じとしてよい)
   * そのメソッド利用し以下の処理を実現する。(出力部分では上の問題で作成したメソッドを利用すること)
   * [実行例]
   * ２つの配列{3,4,5}と{4,5,6}を足した新たな配列を作成します。
   * {7,9,11}
   */

  public static void main(String[] ages) {
    int[] ar1 = { 3, 4, 5 };
    int[] ar2 = { 4, 5, 6 };
    int[] result = createSumArray(ar1, ar2);
    System.out.printf("2つの配列%sと%sを足した新たな配列を作成します%n",
        PrintApp.printArr(ar1),
        PrintApp.printArr(ar2));
    System.out.println(PrintApp.printArr(result));
  }

  public static int[] createSumArray(int[] arr1, int[] arr2) {
    int[] newArray = new int[arr1.length];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = arr1[i] + arr2[i];
    }
    return newArray;

  }
}
