package burp;

import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zss4 {
  private final Ztos<Zt18> ZC;
  
  private final Zbql Zh;
  
  private final Zr69 ZS;
  
  private final Zeb5 Zr;
  
  private final Zlog Zy;
  
  private final Zl7h ZV;
  
  private final Zr_4 Zp;
  
  private final Zskh ZL;
  
  private final Zt1g ZD;
  
  private final Zzs_ Zo;
  
  private final Zlas Ze;
  
  Zss4(Ztos<Zt18> paramZtos, Zbql paramZbql, Zr69 paramZr69, Zeb5 paramZeb5, Supplier<Zka2> paramSupplier, Zlli<Zt13> paramZlli, Zlog paramZlog, Zr_4 paramZr_4, Zskh paramZskh, Zt1g paramZt1g, Zzs_ paramZzs_) {
    this.ZC = paramZtos;
    this.Zh = paramZbql;
    this.ZS = paramZr69;
    this.Zr = paramZeb5;
    this.Zy = paramZlog;
    this.ZV = paramZlog.ZnH();
    this.Zp = paramZr_4;
    this.ZL = paramZskh;
    this.ZD = paramZt1g;
    this.Zo = paramZzs_;
    this.Ze = new Zlas(paramSupplier, paramZlli, paramZtos, paramZr69);
  }
  
  public void Zd() {
    Zuh.Zb(!this.ZV.ZVG(), Zqf.Zr);
    this.ZV.ZV5();
  }
  
  public void ZB() {
    this.Zh.Zx();
    this.ZC.ZD(new Zxr8(Zt18.Zc, this.Zh));
  }
  
  public Zm47 ZM(Zez7 paramZez7) {
    Zg0y zg0y = Zg0y.ZF(this.ZV, this.ZS, Zrp6.INFO);
    Zg77 zg77 = new Zg77(this.ZS, this.Zy, this.ZC);
    Zxni zxni = new Zxni(zg0y, this.ZC, this.ZS, this.ZV);
    Zzr_ zzr_ = new Zzr_(this.ZS.ZX());
    Zed9 zed9 = new Zed9(this.ZV.ZV8(), this.Zr, zzr_, this.ZS.ZD());
    Zz6b zz6b = new Zz6b(this.ZS, this.ZV, this.Zh.ZH(), this.Zp);
    int[] arrayOfInt = Zzcs.ZE();
    Zxf2 zxf2 = new Zxf2(this.ZV, this.ZS, this.Zh.ZH(), zed9, this.Zp, zz6b, this.Zr);
    if (Zbqc.Zwu() == null)
      Zzcs.Zh(new int[4]); 
    return new Zm47(this.Zy, zxni, this.ZC, zzr_, this.Ze, this.ZS, this.ZD, zg77, this.ZL, this.Zh.ZH(), paramZez7, this.Zo, zxf2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zss4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */