package net.portswigger.devtools.client;

import burp.Zbqc;
import java.io.IOException;

public abstract class Zi extends IOException {
  private static Zbqc[] ZK;
  
  protected Zi() {}
  
  protected Zi(String paramString) {
    super(paramString);
  }
  
  protected Zi(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  protected Zi(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void ZC(Zbqc[] paramArrayOfZbqc) {
    ZK = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZX() {
    return ZK;
  }
  
  static {
    if (ZX() != null)
      ZC(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\Zi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */