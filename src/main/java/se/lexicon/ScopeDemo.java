package se.lexicon;

public class ScopeDemo {

  public static int number = 0;
  public int test = 0;


  public static void main(String[] args) {
    int result = 0;

    for (int i = 0; i < 5; i++) {
      result = result + i;
    }

    System.out.println(result);
    // System.out.println(i);
    staticPrint();
    //int result = 20;
    System.out.println(number);
  }

  public static void staticPrint(){
    //int number = 10;
    System.out.println(number);
    System.out.println(ScopeDemo.number);
  }

  public void print(){
    int test = 10;
    System.out.println(test);
    System.out.println(this.test);

  }




}
