package java練習5;

public class lesson8_1 {
  public static void main(String[] ages) {
    System.out.print("身長を入力してください(cm)>");
    double height = new java.util.Scanner(System.in).nextDouble();
    System.out.print("体重を入力してください(kg)>");
    double weight = new java.util.Scanner(System.in).nextDouble();
    System.out.printf("あなたのBMIは%.2fです。\n", getBMI(height, weight));
  }

  public static double getBMI(double heightCm, double weightKG) {
    double heighttM = heightCm / 100;
    return weightKG / (heighttM * heighttM);

  }

}
