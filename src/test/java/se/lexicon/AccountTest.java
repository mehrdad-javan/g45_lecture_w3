package se.lexicon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

  private Account testObject;

  @Before
  public void setup() {
    testObject = new Account();
  }


  @Test
  public void testDeposit() {
    //Account account= new Account();
    testObject.deposit(500);
    double expectedBalance = 500;
    double actualBalance = testObject.getBalance();
    Assert.assertEquals(expectedBalance, actualBalance, 0);
  }

  @Test
  public void testDeposit_negativeAmount() {
    //Account account= new Account();
    testObject.deposit(-500);
    double expectedBalance = 0;
    double actualBalance = testObject.getBalance();

    Assert.assertEquals(expectedBalance, actualBalance, 0);

  }

}
