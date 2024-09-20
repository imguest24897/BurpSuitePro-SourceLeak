package org.openapi4j;

public class Zp0 extends Exception {
  private static String[] ZN;
  
  public Zp0(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public Zp0(String paramString) {
    super(paramString);
  }
  
  public Zp0(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void ZC(String[] paramArrayOfString) {
    ZN = paramArrayOfString;
  }
  
  public static String[] ZF() {
    return ZN;
  }
  
  static {
    if (ZF() == null)
      ZC(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zp0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */