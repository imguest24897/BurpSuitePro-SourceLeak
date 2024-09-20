package burp;

final class Zltw {
  private final Zrtw Zt;
  
  private final Zey9 Zf;
  
  Zltw(Zrtw paramZrtw, Zey9 paramZey9) {
    this.Zt = paramZrtw;
    this.Zf = paramZey9;
  }
  
  public Zex_ ZW(Zex_ paramZex_) {
    Zefx zefx = paramZex_.ZS();
    if (this.Zt.Zsw())
      zefx = ZZ(zefx); 
    if (this.Zt.Zsl())
      zefx = Zgyj.Zp(zefx); 
    if (this.Zt.Zs2())
      zefx = Zs(zefx); 
    return paramZex_.ZY().Zp(zefx).Zl();
  }
  
  private Zefx ZZ(Zefx paramZefx) {
    return Zgyj.Zi(paramZefx, this.Zf);
  }
  
  private static Zefx Zs(Zefx paramZefx) {
    Zeue zeue = new Zeue(paramZefx);
    paramZefx.Zi(zeue);
    return zeue.ZS;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zltw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */