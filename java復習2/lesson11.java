package java復習2;

public class lesson11 {
  /*
   * do-while文をうまく扱うために押さえておくポイントは1つです。
   * ・do-while文は先に繰り返し処理を実行し、処理が終わった後で条件式を評価するので、
   * 初めから条件式を満たさない場合でも必ず1回は繰り返し処理を行うことが出来る。
   * do-while文は、while文と同じように条件式に直接boolean型の値を書き込むことが出来ます。
   * その場合、条件式が「true」で固定されますので、どんな場合でも繰り返し処理を行うということになります。 すなわち、意図的に 無限ループ
   * をさせることが出来ます。 ※↓のコードは無限ループになりますので、実行する場合は注意してください。 （コマンドプロンプトの場合は [Ctrl] +
   * [C]キー、Eclipseの場合は停止ボタンで停止できます。 ） 1 2
   */
  public static void main(String[] ages) {
    int num2;
    int count2 = 0;

    do {
      num2 = new java.util.Random().nextInt(101);
      count2++;
    } while (num2 != 100);
    System.out.println(count2 + "回目に100がでました");
  }
}
