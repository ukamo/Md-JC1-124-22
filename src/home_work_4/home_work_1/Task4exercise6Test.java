package home_work_4.home_work_1;

import home_work_1.Task4exercise1;
import home_work_1.Task4exercise6;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Task4exercise6Test {
  private Task4exercise6 testSix = new Task4exercise6();

  @Test
  @Order(1)
  @DisplayName("Тестирование Невисокосного года")
      public void test1() {
      String str1 = testSix.retYear(2022);
    System.out.println(str1);
  };
  @Test
  @Order(2)
  @DisplayName("Тестирование високосного года")
  public void test2() {
    String str2 = testSix.retYear(2000);
    System.out.println(str2);
  };

}

