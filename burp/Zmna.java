package burp;

public abstract class Zmna extends Exception {
  private static boolean Zn;
  
  protected Zmna(String paramString) {
    super(paramString);
  }
  
  protected Zmna(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  protected Zmna(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public abstract Zsc2 Zg();
  
  public static void ZQ(boolean paramBoolean) {
    Zn = paramBoolean;
  }
  
  public static boolean ZV() {
    return Zn;
  }
  
  public static boolean ZB() {
    boolean bool = ZV();
    return !bool;
  }
  
  static {
    if (!ZB())
      ZQ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmna.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */