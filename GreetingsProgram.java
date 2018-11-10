public class GreetingsProgram {
  public static void main(String...args){
    String name = args[0];
    String greeting = "Hello, ";
    String GreetByName = greeting + name;
    System.out.println(GreetByName);
  }
}