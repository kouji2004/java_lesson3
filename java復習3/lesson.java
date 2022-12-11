package java復習3;

public class lesson {
  public static void main(String[] ages) {
 
    int num;
    int count = 0;
    do{
      num = new java.util.Random().nextInt(101)+1;
      count++;
    }while(num != 100);
    System.out.println(count+"回目に100がでました");
  }
}
