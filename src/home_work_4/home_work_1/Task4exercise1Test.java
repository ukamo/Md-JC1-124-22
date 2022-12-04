package home_work_4.home_work_1;

import home_work_1.Task4exercise1;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Task4exercise1Test {
  private Task4exercise1 testOne = new Task4exercise1();

  @Test
  @Order(1)
  @DisplayName("Тестирование положительного числа")
      public void evenNumb() {
      double evenNumb = testOne.even(22_134_567_22866.0);
  };
  @Order(2)
  @Test
  @DisplayName("Тестирование на 0")
      public void evenZero() {
      double evenZero = testOne.even((double) 0);
    };
  @Order(3)
  @Test
  @DisplayName("Тестирование на -1")
    public void evenNegative() {
    double evenNegative = testOne.even( -1d);
  };
  @Order(4)
  @Test

  @DisplayName("Тестирование дробного числа (10.5) с точкой")
    public void evenDivisionWithDot() {
    double evenDivisionWithDot = testOne.even( 10.5);
  }
  @Order(5)
  @Test

  @DisplayName("Тестирование большого числа (2228242228888200000000000000000000000080060422d)")
    public void evenDivisionWithBigNumb() {
    double evenDivisionWithBigNumb = testOne.even(2228242228888200000000000000000000000080060422d);

  }
}
