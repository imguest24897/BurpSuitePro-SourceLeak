package burp;

public final class Zmjp {
  public final Zl1k ZF;
  
  public final Zsju ZW;
  
  private Zmjp(Zl1k paramZl1k, Zsju paramZsju) {
    this.ZF = paramZl1k;
    this.ZW = paramZsju;
  }
  
  public static Zmjp ZT(Zgzp paramZgzp, Ztwv paramZtwv, Zbnt paramZbnt, Zskh paramZskh, Zvo0 paramZvo0, Zz28 paramZz28, Zg4h paramZg4h) {
    Zg6e zg6e = new Zg6e(paramZgzp.Z_G());
    Zbpt zbpt = new Zbpt(paramZtwv, paramZbnt, paramZskh, paramZvo0, zg6e);
    Zryc zryc = new Zryc(paramZgzp, paramZz28, paramZg4h);
    return new Zmjp(zbpt, new Zsju(paramZgzp, zg6e, zryc));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */