package java練習6;

public class lesson8 {
  /*
   * 引数でint配列一つを受け取りバブルソートにて昇順に並び替えるメソッドを作成せよ。（クラス名はSortAppとすること）
   */

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
