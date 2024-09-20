package org.openapi4j;

import burp.Zbqc;

public abstract class Za1<O extends Zpq> {
  private static Zbqc[] Zc;
  
  public static void Zi(Zbqc[] paramArrayOfZbqc) {
    Zc = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZH() {
    return Zc;
  }
  
  static {
    if (ZH() == null)
      Zi(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Za1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */