package logger;

public class AsteriskLogger implements Logger {
  @Override
  public void log(String str) {
   System.out.println("***" + str + "***");
  }
  @Override
  public void  error(String str) {
    System.out.println("****************");
    System.out.println("***Error: " + str + " ***");
    System.out.println("****************");
  }
  
}
