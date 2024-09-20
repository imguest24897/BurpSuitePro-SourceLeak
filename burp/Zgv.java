package burp;

class Zgv implements Zzwx {
  private final Ztjd ZQ;
  
  private final Zbip ZP;
  
  private final Zk98 Zx;
  
  private final Zl8p Zr;
  
  private final Zxoq Zq;
  
  private final Zsoa Zo;
  
  public Zgv(Ztjd paramZtjd, Zbip paramZbip, Zk98 paramZk98, Zl8p paramZl8p, Zxoq paramZxoq, Zsoa paramZsoa) {
    this.ZQ = paramZtjd;
    this.ZP = paramZbip;
    this.Zx = paramZk98;
    this.Zr = paramZl8p;
    this.Zq = paramZxoq;
    this.Zo = paramZsoa;
  }
  
  public void ZN(Zs1 paramZs1) {
    String[] arrayOfString = Zt17.ZL();
    if (paramZs1.ZO() || !this.Zo.ZR()) {
      this.Zx.ZY();
      this.Zq.ZY();
      if (arrayOfString != null) {
        this.Zx.Zx();
        return;
      } 
      return;
    } 
    this.Zx.Zx();
  }
  
  public void ZI(Zsi paramZsi) {
    if (!paramZsi.Zb())
      this.ZQ.ZE(new Zsi(paramZsi.ZM(), Zz0x.Zx(new byte[] { 1 }))); 
  }
  
  public void ZE(Zsh paramZsh) {
    if (!paramZsh.ZF()) {
      this.ZP.ZE(paramZsh);
      this.ZQ.ZE(Zsh.ZP());
    } 
  }
  
  public void Zt(Zs7 paramZs7) {
    this.Zr.Zz(paramZs7.Ze);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */