package logger;

public class SpacedLogger implements Logger{
  @Override
  public void log(String str) {
    String newStr = str.replace(""," ").trim();
   System.out.println(newStr);
  }
  @Override
  public void  error(String str) {
    String newStr = str.replace(""," ").trim();
    System.out.println("Error: " + newStr);
  }
  
}
