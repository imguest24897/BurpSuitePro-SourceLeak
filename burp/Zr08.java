package burp;

public class Zr08 implements Zl11 {
  private final Zef8 ZY;
  
  private final Zmz8 ZB;
  
  private final Ztl3 Zp;
  
  public Zr08(Zef8 paramZef8, Zmz8 paramZmz8, Ztbb paramZtbb, Ztbq paramZtbq, Zgb6 paramZgb6) {
    this.ZY = paramZef8;
    this.ZB = paramZmz8;
    this.Zp = new Ztl3(paramZtbq, paramZgb6, paramZtbb);
  }
  
  public Zsxd ZG(Zefx paramZefx, Zts5 paramZts5, Zzen paramZzen) {
    return ZE(paramZefx, paramZts5, Zxfj.ZI, paramZzen);
  }
  
  public Zsxd ZE(Zefx paramZefx, Zts5 paramZts5, Zsil paramZsil, Zzen paramZzen) {
    Zxtv zxtv = paramZts5.Zg();
    Zxtb zxtb = Zxtb.ZV(zxtv);
    Zk7l zk7l = this.ZY.Zm(new Zsms(paramZts5), paramZts5.Zz(), zxtb, this.Zp.ZT(paramZsil, paramZts5.Zn().ZL(), zxtb), paramZzen);
    int i = Zlaa.ZO();
    if (Zbqc.Zwu() == null)
      Zlaa.ZI(++i); 
    return zk7l.Zd(paramZefx);
  }
  
  public Zx4j Zf(Zlx4 paramZlx4, Zts5 paramZts5, Zsil paramZsil, Zzen paramZzen) {
    Zmun zmun = this.ZB.ZY(this.Zp);
    return new Zk7q(this, zmun, paramZlx4, paramZts5, paramZsil, paramZzen);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr08.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */