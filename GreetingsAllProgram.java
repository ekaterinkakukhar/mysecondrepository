public class GreetingsAllProgram {
  public static void main(String...args){
    for (String arg: args) {
    String name = arg;
    String greeting = "Hello, ";
    String greetByName = greeting + name;
    System.out.println(greetByName);
    }
  }
}