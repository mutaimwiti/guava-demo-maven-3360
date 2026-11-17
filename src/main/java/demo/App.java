package demo;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

public final class App {
  public static String greet() {
    return Joiner.on(", ").join(ImmutableList.of("guava", "demo"));
  }

  public static void main(String[] args) {
    System.out.println(greet());
  }
}
