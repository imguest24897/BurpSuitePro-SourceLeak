package net.portswigger.devtools.client.impl;

import net.portswigger.browser.Zc6;

public class Zxv {
  private final String ZA;
  
  private final Zc6 ZD;
  
  private Zxv(Zc6 paramZc6, String paramString) {
    this.ZA = paramString;
    this.ZD = paramZc6;
  }
  
  public static Zxv ZY() {
    return new Zxv(Zc6.OK, "");
  }
  
  public static Zxv Zg(String paramString, Object... paramVarArgs) {
    return new Zxv(Zc6.WARNING, String.format(paramString, paramVarArgs));
  }
  
  public static Zxv Zj(String paramString, Object... paramVarArgs) {
    return new Zxv(Zc6.ERROR, String.format(paramString, paramVarArgs));
  }
  
  public Zc6 ZX() {
    return this.ZD;
  }
  
  public String ZT() {
    return this.ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */