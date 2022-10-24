package se.lexicon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationTest {

  private int[] numbers;
  private int[] numbers2;

  // before annotation specifies that the method will be invoked before each test
  @Before
  public void setup() {
    numbers = new int[]{1, 2, 6, 2, 7, 8};
    numbers2 = new int[]{-12,-1,-3,-4,-2};
  }

  // test annotation specifies that the method is the test method
  @Test
  public void test_findMax_return_8() {
    int expectedNumber = 8;
    int actualNumber = Calculation.findMax(numbers);
    Assert.assertEquals(expectedNumber, actualNumber);
  }

  @Test
  public void test_findMax_mines1() {
    int expected = -1;
    int actual = Calculation.findMax(numbers2); // -1
    Assert.assertEquals(expected, actual);
  }


}
