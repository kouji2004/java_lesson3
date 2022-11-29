package java練習4;

public class lesson7 {
  /*
   * 次の手順で配列を生成し、出力せよ。
   * 
   * boolean型の配列を宣言すると同時にtrue,false,false,true,trueの値で初期化する。
   * 「第何戦の結果を調べますか(1~5)>」ときく
   * trueならば勝ち,そうでなければ負けと出力する。
   * [実行例]
   * 第何戦の結果を調べますか(1~5)>5
   * 第5戦は[勝ち]です。
   */

  public static void main(String[] ages) {

    boolean[] num = { true, false, false, true, true };
    System.out.println("第何戦の結果を調べますか");
    int num2=new java.util.Scanner(System.in).nextInt();
    if(num[num2-1]){
      System.out.print("第"+num2+"戦は[勝ち]です。");
    }else{
      System.out.print("第"+num+"戦は[負け]です。");

    }
    
  }
}
