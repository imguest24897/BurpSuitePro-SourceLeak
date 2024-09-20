package burp;

import java.util.EnumSet;

class Zty1 implements Zlei {
  private final String Zp;
  
  private final boolean Zg;
  
  private final boolean Zi;
  
  Zty1(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zp = paramString;
    this.Zg = paramBoolean1;
    this.Zi = paramBoolean2;
  }
  
  public EnumSet<Zklf> Zb() {
    return ZZ(this.Zp) ? Zz8g.Zt.Zo(this.Zg, this.Zi) : (new Zbu9(this.Zp, this.Zg, this.Zi)).Zb();
  }
  
  private boolean ZZ(String paramString) {
    return !paramString.contains("/");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zty1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */