package burp;

public class Zswm {
  private final Zgxf ZW;
  
  private final Zeu0 Zs;
  
  public Zswm(Zgxf paramZgxf, Zeu0 paramZeu0) {
    this.ZW = paramZgxf;
    this.Zs = paramZeu0;
  }
  
  public boolean ZU(Ze3h paramZe3h) {
    if (paramZe3h.ZF())
      return true; 
    Ztei.Zj(Zeew.TARGET, Zeew.ORGANISER);
    Zz_1 zz_1 = paramZe3h.ZJ();
    Zxya zxya = (Zxya)zz_1.Z_();
    this.Zs.ZN(zxya.ZX.Ze2(), zxya.Zy(), this.ZW.ZU(zz_1), zxya.Zm(), zxya.ZM, zxya.ZAs());
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */