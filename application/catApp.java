package application;

import java.util.*;

public class catApp {
  public static void main(String[] args) {
    // 役者を揃える
    // Randomインスタンス、ユーザーからの入力を受け取るのでScannerインスタンスが必要となる
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    // 定数を定義
    final String[] TYPES = { "黒", "白", "茶トラ" };
    // Catインスタンスを格納するArrayList
    ArrayList<Cat> list = new ArrayList<>();

    // 何度繰り返されるかわからない、なのでwhile文
    while (true) {
      System.out.print("1.集める 2.遊ぶ 3.終了>>");
      int select = sc.nextInt();
      if (select == 3) {
        System.out.println("***結果***");
        for (Cat c : list) {
          System.out.println(c.showStatus());
        }
        System.out.println("また遊んでね。おしまい");
        return;
      }
      if (select == 1) {
        String type = TYPES[rand.nextInt(TYPES.length)];
        System.out.printf("%s猫を見つけた!%n", type);
        System.out.print("この猫に名前をつけてください>>");
        String name = sc.next();
        Cat cat = new Cat(name, type);
        list.add(cat);
        System.out.println(cat.name + "が仲間に加わった");
      } else if (select == 2) {
        if (list.size() == 0) {
          System.out.println("まだ遊ぶ猫がいません。。。");
          continue;
        }
        for (int i = 0; i < list.size(); i++) {
          System.out.printf("%d・・・%s%n", i, list.get(i).showStatus());
        }
        System.out.print("どの猫と遊びますか?>>");
        int no = sc.nextInt();
        list.get(no).play();
        sortCat(list);
      }
    }
  }

  static void sortCat(ArrayList<Cat> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).intimacy < list.get(j).intimacy) {
          Cat temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
  }
}

class Cat {
  String name; // 猫の名前
  String type; // 猫の種類
  int intimacy = 0; // 親密度 親密度に関しては最初は0なので、ここで明示しておく

  // コンストラクタを考える
  // コンストラクタとは、クラスのインスタンス生成時に実行される処理のこと
  Cat(String name, String type) {
    this.name = name;
    this.type = type;
  }

  // 自分自身の情報を文字列情報として表せるメソッドを作成
  String showStatus() {
    return String.format("%s[%s](%d)", this.name, this.type, this.intimacy);
  }

  /*
   * 予備知識
   * %s,%d,%f【フォーマット指定子]
   * %s string 文字列を出力
   * %d int 整数を10進法で出力
   * %f float 実数を出力
   */

  // ンスタンスメソッドの作成
  void play() {
    System.out.println(this.name + "と遊んだ");
    System.out.println("...");
    System.out.println(this.name + "の親密度がアップした!");
    this.intimacy++;
  }

}
