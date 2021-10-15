public class Greet {
  public static void main(String[] args) {
    private String greeting;
    
    BigSib george = new BigSib();
    BigSib emily = new BigSib("Shsheesh");
    
    greeting = george.greet("Jeff");
    System.out.println(greeting);
    greeting = emily.greet("Faley");
    System.out.println(greeting);
  }
}
