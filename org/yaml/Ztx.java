package org.yaml;

import java.util.logging.Logger;

public class Ztx {
  private final Logger ZL;
  
  private Ztx(String paramString) {
    this.ZL = Logger.getLogger(paramString);
  }
  
  public static Ztx Zi(String paramString) {
    return new Ztx(paramString);
  }
  
  public boolean Zn(Z_t paramZ_t) {
    return this.ZL.isLoggable(Z_t.Zs(paramZ_t));
  }
  
  public void Zg(String paramString) {
    this.ZL.log(Z_t.Zs(Z_t.WARNING), paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Ztx.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */