package logger;

public class App {
  public static void main(String args[]) {
    AsteriskLogger asteriskLogger = new AsteriskLogger();
    SpacedLogger spacedLogger = new SpacedLogger();
    System.out.println("AsteriskLogger");
    asteriskLogger.log("Hello");
    asteriskLogger.error("Hello");
    System.out.println("SpacedLogger");
    spacedLogger.log("Hello");
    spacedLogger.error("Hello");
  }
}
