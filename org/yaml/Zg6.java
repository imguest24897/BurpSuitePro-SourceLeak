package org.yaml;

import burp.Zbqc;
import java.util.Objects;

public final class Zg6 extends Z_8 {
  private final Zto ZX;
  
  private final String ZH;
  
  public Zg6(Zto paramZto, String paramString, Zt1 paramZt11, Zt1 paramZt12) {
    super(paramZt11, paramZt12);
    Objects.requireNonNull(paramZto);
    this.ZX = paramZto;
    Objects.requireNonNull(paramString);
    this.ZH = paramString;
    String[] arrayOfString = Z_8.ZM();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zto Zp() {
    return this.ZX;
  }
  
  public String ZB() {
    return this.ZH;
  }
  
  public Ztt ZI() {
    return Ztt.Comment;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zg6.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */