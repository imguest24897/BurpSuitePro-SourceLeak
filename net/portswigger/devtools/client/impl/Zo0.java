package net.portswigger.devtools.client.impl;

import burp.Zbqc;

public class Zo0 extends IllegalArgumentException {
  private static Zbqc[] ZM;
  
  public Zo0(String paramString) {
    super(paramString);
  }
  
  public static void ZO(Zbqc[] paramArrayOfZbqc) {
    ZM = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zi() {
    return ZM;
  }
  
  static {
    if (Zi() == null)
      ZO(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zo0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */