package net.portswigger.devtools.client.impl.connection;

import java.io.IOException;

public class Zi extends IOException {
  private static String[] Zj;
  
  public Zi() {}
  
  public Zi(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void ZF(String[] paramArrayOfString) {
    Zj = paramArrayOfString;
  }
  
  public static String[] Zq() {
    return Zj;
  }
  
  static {
    if (Zq() == null)
      ZF(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Zi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */