package java復習2;

/*
 * Java の equals () メソッドは 2つの値を比較し、
 * true または false のブール値を返します。
 * このメソッドを使用して、列挙値を比較できます。
 * ここでは、 Color 列挙型を使用してその値を比較しました。
 *  最初の値は false を返しますが、2 番目の値は true を返します
*/
public class lesson6 {
  public static void main(String[] ages) {
    System.out.println("10月を英語で何?");
    String ans = new java.util.Scanner(System.in).nextLine();
    if (ans.equals("october")) {
      System.out.println("正解");
    } else {
      System.out.println("不正解！正解はoctober");
    }
  }
}
