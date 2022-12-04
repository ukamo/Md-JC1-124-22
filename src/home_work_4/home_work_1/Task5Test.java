package home_work_4.home_work_1;

import home_work_1.Task4exercise6;
import home_work_1.Task5;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Task5Test {
  private Task5 testDayOfWeek = new Task5();

  @Test
  @Order(1)
  @DisplayName("Тестирование 1 дня недели года +true")
      public void test1() {
      String str1 = testDayOfWeek.sleepIn(1,true);
    System.out.println(str1);
  };
  @Test
  @Order(2)
  @DisplayName("Тестирование 7 дня недели года +false")
  public void test2() {
    String str1 = testDayOfWeek.sleepIn(7,false);
    System.out.println(str1);
  };
  @Test
  @Order(3)
  @DisplayName("Тестирование 8 дня недели года +true")
  public void test3() {
    String str1 = testDayOfWeek.sleepIn(8,true);
    System.out.println(str1);
  };
  @Test
  @Order(4)
  @DisplayName("Тестирование 5 дня недели года +false")
  public void testTrue() {
    String str1 = testDayOfWeek.sleepIn(5,false);
    System.out.println(str1);
  };
  @Test
  @Order(4)
  @DisplayName("Тестирование 6 дня недели года +true")
  public void testSixTrue() {
    String str1 = testDayOfWeek.sleepIn(6,true);
    System.out.println(str1);
  };
  @Test
  @Order(4)
  @DisplayName("Тестирование 0 дня недели года +false")
  public void test4() {
    String str1 = testDayOfWeek.sleepIn(0,false);
    System.out.println(str1);
  };
}

