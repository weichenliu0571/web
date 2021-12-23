public class Driver implements InterTrash{
  public void sleep(int b ) {
    System.out.println(b);
  }

  public static void main(String[] args) {
    Driver jeff = new Driver();
    jeff.sleep(5);
  }

}
