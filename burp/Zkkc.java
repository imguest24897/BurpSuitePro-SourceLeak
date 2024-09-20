package burp;

class Zkkc implements Zrub {
  private final Zmln Z_;
  
  private final Zrsm Zd;
  
  private final boolean ZX;
  
  private Zkkc(Zmln paramZmln, Zrsm paramZrsm, boolean paramBoolean) {
    this.Z_ = paramZmln;
    this.Zd = paramZrsm;
    this.ZX = paramBoolean;
  }
  
  public boolean ZW(String paramString, Zmf_ paramZmf_) {
    Zb8b zb8b = this.ZX ? new Zb8a(paramString, paramZmf_, new Zmln[] { this.Z_ }) : new Zb8b(paramString, false, paramZmf_, new Zmln[] { this.Z_ });
    this.Zd.Zx(zb8b);
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */