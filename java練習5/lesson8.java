package java練習5;

public class lesson8 {
  /*
   * mainメソッドからgetBMIメソッドを呼び出す以下のアプリを作成する。詳しくは実行例を参照のこと
   * [実行例]
   * 身長を入力してください(cm)>175
   * 体重を入力してください(kg)>70
   * あなたのBMIは22.86です。
   */
  public static void main(String[] ages) {
    System.out.println("身長を入力してください");
    double height = new java.util.Scanner(System.in).nextDouble();
    System.out.println("体重を入力してください");
    double weight = new java.util.Scanner(System.in).nextDouble();
    System.out.printf("あなたのBMIは%.2fです。\n", getBMI(height, weight));
  }

  public static double getBMI(double heightCm, double weightKG) {
    double heighttM = heightCm / 100;
    return weightKG / (heighttM * heighttM);
  }
}
