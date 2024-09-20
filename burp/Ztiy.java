package burp;

import java.util.Set;

public class Ztiy {
  private short ZZ;
  
  private short ZX;
  
  private Set<String> Zc;
  
  private boolean ZA;
  
  private boolean Zt;
  
  private Set<String> Zi;
  
  private Set<String> ZH;
  
  public Ztiy ZQ(short paramShort) {
    this.ZZ = paramShort;
    return this;
  }
  
  public Ztiy Zg(short paramShort) {
    this.ZX = paramShort;
    return this;
  }
  
  public Ztiy ZR(Set<String> paramSet) {
    this.Zc = paramSet;
    return this;
  }
  
  public Ztiy ZE(boolean paramBoolean) {
    this.ZA = paramBoolean;
    return this;
  }
  
  public Ztiy ZB(boolean paramBoolean) {
    this.Zt = paramBoolean;
    return this;
  }
  
  public Ztiy Ze(Set<String> paramSet) {
    this.Zi = paramSet;
    return this;
  }
  
  public Ztiy Zg(Set<String> paramSet) {
    this.ZH = paramSet;
    return this;
  }
  
  public Zk8m ZI() {
    return new Zk8m(this.ZZ, this.ZX, this.Zc, this.ZA, this.Zt, this.Zi, this.ZH);
  }
  
  public static Ztiy ZU() {
    return new Ztiy();
  }
  
  public static Ztiy ZQ(Zk8m paramZk8m) {
    Ztiy ztiy = new Ztiy();
    ztiy.ZZ = paramZk8m.ZJ;
    ztiy.ZX = paramZk8m.Zj;
    ztiy.Zc = paramZk8m.Zs;
    ztiy.ZA = paramZk8m.ZD;
    ztiy.Zt = paramZk8m.Zl;
    ztiy.Zi = paramZk8m.Zb;
    return ztiy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztiy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */