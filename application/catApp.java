package application;

import java.util.*;

public class catApp {
  public static void main(String[] args) {
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
}
