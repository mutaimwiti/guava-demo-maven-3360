package demo;

import static org.junit.jupiter.api.Assertions.*;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void greetsWithGuava() {
    assertEquals("guava, demo", App.greet());
    assertEquals(2, ImmutableList.of(1, 2).size());
  }
}
