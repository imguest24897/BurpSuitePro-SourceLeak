package net.portswigger.swagger.v3.parser.exception;

public class ReadContentException extends RuntimeException {
  private static final long serialVersionUID = 4720926576862628428L;
  
  private static String Zg;
  
  public ReadContentException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void Zm(String paramString) {
    Zg = paramString;
  }
  
  public static String ZF() {
    return Zg;
  }
  
  static {
    if (ZF() == null)
      Zm("D2Fpsc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\exception\ReadContentException.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */