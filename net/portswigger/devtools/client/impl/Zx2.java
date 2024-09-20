package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.Objects;
import net.portswigger.browser.Zdx;
import net.portswigger.browser.Zo;

public class Zx2 implements Zo, Zm7 {
  private final Zxi Zt;
  
  private static boolean Zz;
  
  public Zx2(Zxi paramZxi) {
    this.Zt = Objects.<Zxi>requireNonNull(paramZxi);
    boolean bool = ZG();
    if (Zbqc.Zwu() == null)
      Zx(!bool); 
  }
  
  public void ZW() {}
  
  public void Zg(Zdx paramZdx) {
    this.Zt.Zp(paramZdx);
  }
  
  public void Zp() {
    this.Zt.ZP();
  }
  
  public static void Zx(boolean paramBoolean) {
    Zz = paramBoolean;
  }
  
  public static boolean ZA() {
    return Zz;
  }
  
  public static boolean ZG() {
    boolean bool = ZA();
    return !bool;
  }
  
  static {
    if (ZA())
      Zx(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */