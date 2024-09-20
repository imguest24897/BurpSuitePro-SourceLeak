package burp;

public class Zmer {
  private final Zgb6 Zf;
  
  public Zmer(Zgb6 paramZgb6) {
    this.Zf = paramZgb6;
  }
  
  public Zbwx ZM(boolean paramBoolean1, boolean paramBoolean2, Zrtw paramZrtw, String paramString) {
    return paramBoolean2 ? new Zgdw(this.Zf, paramZrtw, paramString, paramBoolean1) : ZW(paramZrtw);
  }
  
  public Zbwx ZW(Zrtw paramZrtw) {
    return new Ztjc(this.Zf, paramZrtw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */