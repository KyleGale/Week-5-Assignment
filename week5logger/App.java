package week5logger;

public class App {

  public static void main(String[] args) {
     Logger logger = new AsteriskLogger();
     logger.log("Great");
     System.out.println();
     logger.error("Happy");
     
     Logger spacedLogger = new SpacedLogger();
     spacedLogger.log("Today");
     System.out.println();
     spacedLogger.error("Zero");
     System.out.println();
  }
}
