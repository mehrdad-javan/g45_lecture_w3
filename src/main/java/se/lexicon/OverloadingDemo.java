package se.lexicon;

public class OverloadingDemo {


  public static int add(int number1, int number2) {
    return number1 + number2;
  }

  public static double add(double number1, double number2) {
    return number1 + number2;
  }

  public static int add(int... numbers) {
    int result = 0;
    for (int i = 0; i < numbers.length; i++) {
      //result = result + numbers[i];
      result += numbers[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 10;
    System.out.println(add(n1, n2));
    System.out.println(add(10.5, 10.5));
    System.out.println(add(1, 5, 8, 9, 4));
    System.out.println(add());
  }


}
