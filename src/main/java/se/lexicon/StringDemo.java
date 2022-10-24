package se.lexicon;

public class StringDemo {

  public static void main(String[] args) {
    ex6();
  }


  public static void ex1(){
    String test = "Hello Java";
    System.out.println(test.length());
    System.out.println(test.charAt(0));
    System.out.println("----------------");
    for (int i= 0; i<test.length() ; i++){
      System.out.print(test.charAt(i) + "-");
    }
    System.out.println("\n----------------");
    for (int i = test.length() - 1 ;i>=0 ; i--){
      System.out.println(test.charAt(i));
    }
    System.out.println("----------------");
  }

  public static void ex2(){
    String string = "Hello Java";
    int index1 = string.indexOf("llo"); // 2
    System.out.println(index1);
    int index2 = string.indexOf('H');
    System.out.println(index2);
    int index3 = string.indexOf('l', 3);
    System.out.println(index3); // 3
    System.out.println(string.indexOf("Hell", 1)); // -1
  }

  public static void ex3(){
    String greeting = "Welcome";
   String result = greeting.substring(3); // come
    System.out.println(result);
    System.out.println(greeting.substring(1, 5)); // elco
    //System.out.println(greeting.substring(3, 20)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
  }

  public static void ex4(){
    String test = "Hello Java";
    System.out.println(test.toUpperCase());
    System.out.println(test.toLowerCase());
  }

  public static void ex5(){

    String name = "Erik Svensson";

    System.out.println(name.startsWith("Erik"));

  }
  public static void ex6(){
    String test = " a   b c  d ";
    System.out.println(test.trim());
    System.out.println(test.replaceAll(" ", ""));
  }
}
