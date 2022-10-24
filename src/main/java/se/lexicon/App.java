package se.lexicon;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    System.out.println(OverloadingDemo.add(10,20,30));


    Person person1 = new Person();
    person1.name = "Test";
    person1.id = 1;
    person1.displayPersonInformation();

  }


}
