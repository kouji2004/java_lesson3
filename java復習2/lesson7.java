package java復習2;

public class lesson7 {
  public static void main(String[] ages) {
    System.out.println("スペイン語で日曜日は何?1:Lunes,2:Jueves,3:Domingo");
    int num = new java.util.Scanner(System.in).nextInt();

    switch(num){
      case 3:
      System.out.println("正解");
      break;

      default:
      System.out.println("NG");
    }
  }
}
