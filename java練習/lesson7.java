package java練習;

public class lesson7 {
  public static void main(String[] args) {
    System.out.println("args[0];" + args[0]);
    System.out.println("args[1];" + args[1]);
    System.out.println("args[2];" + args[2]);
    System.out.println("args.length;" + args.length);
  }
  /*
   * 処理実行⓵ java lesson7.java hello java
   * 結果
   * args[0];hello
   * args[0];java
   * args.length;2
   */

  /*
   * 処理実行⓶ java lesson7.java hello java lesson
   * 結果
   * args[0];hello
   * args[0];java
   * args.length;3 ←ここに追加される
   */

}
