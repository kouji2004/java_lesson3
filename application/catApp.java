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
  Cat(String name, String type) {
    this.name = name;
    this.type = type;
  }

}
