package burp;

import java.util.List;

public class Ztvi {
  private int Zf;
  
  private int Zn;
  
  private List<Integer> ZS;
  
  private List<String> Z_;
  
  private String ZL;
  
  private Zlit Zq;
  
  private boolean Zs;
  
  private String ZZ;
  
  private Zsba ZM;
  
  private List<Zt8g> Zv;
  
  private Ztvi() {}
  
  private Ztvi(Zz1p paramZz1p) {
    this.Z_ = paramZz1p.ZG();
    this.Zf = paramZz1p.ZP;
    this.Zn = paramZz1p.ZO();
    this.ZS = paramZz1p.ZF;
    this.ZL = paramZz1p.Zb;
    this.Zq = paramZz1p.Zo;
    this.Zs = paramZz1p.ZJ;
    this.ZZ = paramZz1p.Zh;
    this.ZM = paramZz1p.ZY;
    this.Zv = paramZz1p.ZV;
  }
  
  public Ztvi ZX(String paramString) {
    this.ZL = paramString;
    return this;
  }
  
  public Ztvi ZO(Zlit paramZlit) {
    this.Zq = paramZlit;
    return this;
  }
  
  public Ztvi ZW(Zk9o paramZk9o) {
    this.ZL = paramZk9o.ZJ;
    this.ZZ = paramZk9o.ZE;
    this.Zq = paramZk9o.Zf;
    this.Zs = paramZk9o.Ze;
    return this;
  }
  
  public Ztvi Za(int paramInt) {
    this.Zf = paramInt;
    return this;
  }
  
  public Ztvi ZZ(int paramInt) {
    this.Zn = paramInt;
    return this;
  }
  
  public Ztvi ZQ(Zsba paramZsba) {
    this.ZM = paramZsba;
    return this;
  }
  
  public Ztvi ZB(List<Zt8g> paramList) {
    this.Zv = paramList;
    return this;
  }
  
  public Ztvi ZK(List<Integer> paramList) {
    this.ZS = paramList;
    return this;
  }
  
  public Ztvi ZA(List<String> paramList) {
    this.Z_ = paramList;
    return this;
  }
  
  public Zz1p Zi() {
    return new Zz1p(this.ZL, this.Zq, this.Zs, this.ZZ, this.ZS, this.Z_, this.Zf, this.Zn, this.ZM, this.Zv);
  }
  
  public static Ztvi ZA(Zz1p paramZz1p) {
    return new Ztvi(paramZz1p);
  }
  
  public static Ztvi Zn() {
    return new Ztvi();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */