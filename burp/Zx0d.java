package burp;

public class Zx0d {
  private final Zl9 Zz;
  
  private final Zs0i Zb;
  
  private final Zskh ZW;
  
  Zx0d(Zl9 paramZl9, Ze78 paramZe78, Zskh paramZskh) {
    this.Zz = paramZl9;
    this.ZW = paramZskh;
    this.Zb = paramZe78.Zl();
  }
  
  public void Za(String paramString) {
    Zeu1 zeu1 = this.Zz.ZS(paramString);
    this.Zb.ZV(paramString);
    if (zeu1 != null)
      Zmgc.REVOKED_BAPP.ZK(this.ZW.Zz(), new Object[] { zeu1.ZN() }); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */