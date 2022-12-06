package java復習;

public class lesson {
  public static void main(String[] ages) {
    System.out.println("月を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    System.out.println(num+"月の日数は"+getNum(num)+"です");
  }
  public static int getNum(int month) {
    switch(month){
      case 2:
      return 28;
      case 4:
      case 6:
      case 9:
      case 11:
      return 30;
      default:
      return 31;
    }
  }
}
