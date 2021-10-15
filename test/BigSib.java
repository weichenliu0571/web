public class BigSib {
  private String helloMsg;
  
  public BigSib() {
    helloMsg = "Sheesh";
  }
  
  public BigSib(String msg) {
    helloMsg = msg;
  }
  
  public String greet(String name) {
    return helloMsg + " " + name;
  }
}
