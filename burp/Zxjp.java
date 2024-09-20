package burp;

import java.util.Set;

class Zxjp {
  private String ZX;
  
  private String ZS;
  
  private Set<String> Zy;
  
  private Set<String> Zc;
  
  Zxjp Zb(String paramString) {
    this.ZX = paramString;
    return this;
  }
  
  Zxjp Zg(String paramString) {
    this.ZS = paramString;
    return this;
  }
  
  Zxjp Zt(Set<String> paramSet) {
    this.Zy = paramSet;
    return this;
  }
  
  Zxjp ZN(Set<String> paramSet) {
    this.Zc = paramSet;
    return this;
  }
  
  Ze58 ZA() {
    String str = Zl2a.Ze();
    if (Zbqc.Zwu() == null)
      Zl2a.Zw("yOhhd"); 
    return new Ze58(this.ZX, this.ZS, this.Zy, this.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */