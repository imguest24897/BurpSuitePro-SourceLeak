package org.yaml;

import java.util.Map;

public final class Zl8 extends Zlv {
  private final boolean Zv;
  
  private final Zjv ZT;
  
  private final Map<String, String> ZV;
  
  public Zl8(Zt1 paramZt11, Zt1 paramZt12, boolean paramBoolean, Zjv paramZjv, Map<String, String> paramMap) {
    super(paramZt11, paramZt12);
    this.Zv = paramBoolean;
    this.ZT = paramZjv;
    this.ZV = paramMap;
  }
  
  public boolean ZZ() {
    return this.Zv;
  }
  
  public Zjv Zj() {
    return this.ZT;
  }
  
  public Map<String, String> ZC() {
    return this.ZV;
  }
  
  public Zj7 Zt() {
    return Zj7.DocumentStart;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zl8.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */