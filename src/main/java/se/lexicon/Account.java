package se.lexicon;

public class Account {
  private double balance;

  public double withdraw(double amount) {
    if (amount > 0 && this.balance - amount >= 0) {
      //this.balance = this.balance - amount;
      this.balance -= amount;
      return amount;
    }
    return -1;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      //this.balance = this.balance + amount;
      this.balance += amount;
    }
  }


  public double getBalance(){
    return this.balance;
  }

}
