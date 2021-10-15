public class BigSib {
  private String helloMsg;
  
  public BigSib() {
    helloMsg = "Sheesh";
  }
  
  public String greet(String name) {
    return helloMsg + " " + name;
  }
}
