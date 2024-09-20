package org.openapi4j;

import burp.Zbqc;

public class Zpa extends Zp0 {
  private static Zbqc[] Zs;
  
  public Zpa(String paramString) {
    super(paramString);
  }
  
  public Zpa(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void Zw(Zbqc[] paramArrayOfZbqc) {
    Zs = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return Zs;
  }
  
  static {
    if (Za() == null)
      Zw(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */