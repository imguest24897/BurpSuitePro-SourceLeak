package burp;

import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlaa {
  private final Zz0n Zd;
  
  private final Zgb6 ZO;
  
  private final Zgzy ZZ;
  
  private final Zkl6 Zt;
  
  private final Zz28 Zw;
  
  private final Ztwv Z_;
  
  private final Zkc6 ZL;
  
  private final Zlg9 Zx;
  
  private final Zxy1 Zs;
  
  private final Zlfd ZQ;
  
  private static int ZB;
  
  public Zlaa(Zz0n paramZz0n, Zgb6 paramZgb6, Zgzy paramZgzy, Zkl6 paramZkl6, Zz28 paramZz28, Ztwv paramZtwv, Zkc6 paramZkc6, Zlg9 paramZlg9, Zxy1 paramZxy1) {
    this.Zd = paramZz0n;
    this.ZO = paramZgb6;
    int i = ZO();
    this.ZZ = paramZgzy;
    this.Zt = paramZkl6;
    this.Zw = paramZz28;
    this.Z_ = paramZtwv;
    this.ZL = paramZkc6;
    this.Zx = paramZlg9;
    this.Zs = paramZxy1;
    this.ZQ = new Zr_2();
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zl11 Zk(Zeew paramZeew, Zskh paramZskh, Zgg0 paramZgg0) {
    return Zc(paramZeew, paramZskh, paramZgg0, this.Zw, this.ZZ.Zh());
  }
  
  public Zl11 Ze(Zskh paramZskh, Zgg0 paramZgg0, Zz28 paramZz28) {
    return Zc(Zeew.SCANNER, paramZskh, paramZgg0, paramZz28, this.ZZ.Zh());
  }
  
  public Zl11 ZB(Zskh paramZskh, Zgg0 paramZgg0, Zz28 paramZz28, Zsw paramZsw) {
    return Zc(Zeew.SCANNER, paramZskh, paramZgg0, paramZz28, paramZsw);
  }
  
  private Zl11 Zc(Zeew paramZeew, Zskh paramZskh, Zgg0 paramZgg0, Zz28 paramZz28, Zsw paramZsw) {
    Zuh.Zb((paramZz28 != null), Zqf.Zv);
    paramZz28 = (paramZz28 == null) ? this.Zw : paramZz28;
    Objects.requireNonNull(this.Zd);
    Zef8 zef8 = new Zef8(this.Zd.ZP(), this.Zd.ZU(), this.Zd::ZZ, this.ZO, this.ZZ, paramZsw, paramZz28, this.Zt, paramZeew, this.Z_, this.ZL, paramZgg0, this.Zs, this.Zx, Zk86.Zi, Zkoq.Zq, Zg6h.Zc, new Zsxe(paramZskh), this.ZQ);
    Zmz8 zmz8 = new Zmz8(this.Z_, this.Zd.ZU(), zef8, this.ZQ);
    return new Zr08(zef8, zmz8, this.Zt.ZM(), this.ZZ.Z_(), this.ZO);
  }
  
  public static void ZI(int paramInt) {
    ZB = paramInt;
  }
  
  public static int Zh() {
    return ZB;
  }
  
  public static int ZO() {
    int i = Zh();
    return (i == 0) ? 118 : 0;
  }
  
  static {
    if (ZO() != 0)
      ZI(107); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlaa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */