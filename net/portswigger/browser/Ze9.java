package net.portswigger.browser;

import burp.Zbqc;

public class Ze9 implements Zs {
  private final String Zo;
  
  private static int[] ZB;
  
  public Ze9(String paramString) {
    this.Zo = paramString;
    int[] arrayOfInt = Ze();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public String ZU() {
    return this.Zo;
  }
  
  public static void ZR(int[] paramArrayOfint) {
    ZB = paramArrayOfint;
  }
  
  public static int[] Ze() {
    return ZB;
  }
  
  static {
    if (Ze() == null)
      ZR(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ze9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */