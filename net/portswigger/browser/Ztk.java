package net.portswigger.browser;

public abstract class Ztk extends Ztz {
  private static int[] ZV;
  
  protected Ztk() {}
  
  protected Ztk(String paramString) {
    super(paramString);
  }
  
  protected Ztk(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  protected Ztk(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void Zf(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] Zn() {
    return ZV;
  }
  
  static {
    if (Zn() == null)
      Zf(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ztk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */