package burp;

import java.util.Objects;

public class Zehb {
  private final Zz0n ZE;
  
  private final Zg94 ZO;
  
  private final Zgb6 Zc;
  
  private final Ztyg Zb;
  
  private final Zgq7 ZN;
  
  private final Zxrg ZM;
  
  private final Zr_4 Zx;
  
  private final Zb2v ZW;
  
  private final Zl4y ZI;
  
  private final Zey9 ZT;
  
  private final Zbq6 ZZ;
  
  public Zehb(Zz0n paramZz0n, Zg94 paramZg94, Zb2v paramZb2v, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zxrg paramZxrg, Zr_4 paramZr_4, Zl4y paramZl4y, Zey9 paramZey9, Zbq6 paramZbq6) {
    this.ZE = paramZz0n;
    this.ZO = paramZg94;
    this.Zc = paramZgb6;
    this.Zb = paramZtyg;
    this.ZN = paramZgq7;
    int i = Zbq5.ZD();
    this.ZM = paramZxrg;
    this.Zx = paramZr_4;
    this.ZW = paramZb2v;
    this.ZI = paramZl4y;
    this.ZT = paramZey9;
    this.ZZ = paramZbq6;
    if (Zbqc.Zwu() == null)
      Zbq5.Zn(++i); 
  }
  
  public Zbq5 Zz(Zmx paramZmx) {
    return ZN(paramZmx);
  }
  
  public Zbq5 ZS(Zv6 paramZv6) {
    Zmx zmx = this.Zx.<Zmx>ZH(new Ztbj(paramZv6.Zj, paramZv6.Ze));
    this.ZO.ZI().add(zmx);
    return ZN(zmx);
  }
  
  private Zbq5 ZN(Zmx paramZmx) {
    Objects.requireNonNull(paramZmx);
    Zgnu zgnu = this.ZW.Zv(paramZmx.Z_(), paramZmx::ZZ);
    Zsv9 zsv9 = new Zsv9(this.ZE.ZD(), zgnu, this.ZM);
    Zbq5 zbq5 = new Zbq5(this.ZE, this.Zc, this.Zb, this.ZN, new Ztoz(paramZmx), zsv9, this.ZO.Zn(), this.ZT, this.ZZ);
    Ze05 ze05 = this.ZI.Zc(paramZmx.Z_(), zbq5);
    this.Zc.Z_(ze05);
    return zbq5;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zehb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */