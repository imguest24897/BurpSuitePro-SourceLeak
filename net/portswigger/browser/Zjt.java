package net.portswigger.browser;

import burp.Zbqc;
import java.util.List;
import java.util.Objects;

public class Zjt {
  private final Zz8 Zi;
  
  private final Zev Zh;
  
  private final Ztw Zj;
  
  private final Zd2 ZP;
  
  private final Zec ZN;
  
  private final Zdn ZZ;
  
  public Zjt(Zz8 paramZz8, Zev paramZev, Ztw paramZtw, Zd2 paramZd2, Zec paramZec, Zdn paramZdn) {
    this.Zi = paramZz8;
    this.Zh = paramZev;
    this.Zj = paramZtw;
    this.ZP = paramZd2;
    String str = Zec.ZB();
    this.ZN = paramZec;
    this.ZZ = paramZdn;
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public boolean ZR() {
    return this.Zh.ZB().equals(this.Zj);
  }
  
  public boolean Zc() {
    return (ZR() && ZD() == Zec.DOCUMENT);
  }
  
  public boolean ZJ(Zev paramZev) {
    return Objects.equals(paramZev, this.Zh);
  }
  
  public Zz8 ZU() {
    return this.Zi;
  }
  
  public Zev Zm() {
    return this.Zh;
  }
  
  public Ztw Zj() {
    return this.Zj;
  }
  
  public Zd2 ZT() {
    return this.ZP;
  }
  
  public Zec ZD() {
    return this.ZN;
  }
  
  public String Ze() {
    return this.ZZ.Zp();
  }
  
  public String ZV() {
    return this.ZZ.ZD();
  }
  
  public String ZJ() {
    return this.ZZ.ZR();
  }
  
  public List<Zc7> ZX() {
    return this.ZZ.ZL();
  }
  
  public String ZC() {
    return this.ZZ.Zb();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zjt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */