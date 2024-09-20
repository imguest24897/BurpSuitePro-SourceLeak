package burp;

import java.util.List;
import java.util.Objects;

public class Zs32 {
  private final Zlaa Zs;
  
  private final Zgb6 ZO;
  
  private final Zgzy Zi;
  
  private final Zbnt Zp;
  
  private final Zey9 ZV;
  
  private final Zrgd ZT;
  
  private final Zskh ZR;
  
  private final Zr69 Zk;
  
  private final Zgg0 ZL;
  
  private final Ztos<Zt16> ZH;
  
  private final Zz3j ZJ;
  
  public Zs32(Zlaa paramZlaa, Zgb6 paramZgb6, Zgzy paramZgzy, Zbnt paramZbnt, Zey9 paramZey9, Zrgd paramZrgd, Zskh paramZskh, Zr69 paramZr69, Zgg0 paramZgg0, Ztos<Zt16> paramZtos, Zz3j paramZz3j) {
    this.Zs = paramZlaa;
    this.ZO = paramZgb6;
    this.Zi = paramZgzy;
    this.Zp = paramZbnt;
    this.ZV = paramZey9;
    this.ZT = paramZrgd;
    this.ZR = paramZskh;
    this.Zk = paramZr69;
    this.ZL = paramZgg0;
    this.ZH = Objects.<Ztos<Zt16>>requireNonNull(paramZtos);
    this.ZJ = paramZz3j;
  }
  
  public Zxpl ZY() {
    Zxpl zxpl = new Zxpl(this.Zp, this.ZT, this.ZV);
    if (this.Zk.Zt()) {
      List<Ztbr> list = this.Zi.Zh().Zd();
      zxpl.Zc(list);
    } 
    return zxpl;
  }
  
  public Zzzx ZO(Zxpl paramZxpl) {
    Zl11 zl11 = this.Zs.ZB(this.ZR, this.ZL, this.Zk, paramZxpl);
    return new Zzzx(zl11, this.ZR, this.ZO, this.Zk, this.ZH, this.ZJ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs32.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */