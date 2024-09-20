package burp;

public class Zxsh implements Zmxz {
  private final Zmxz Zs;
  
  public Zxsh(Zmxz paramZmxz) {
    this.Zs = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    Ztlj ztlj1 = paramZrdb1.ZaT();
    Ztlj ztlj2 = paramZrdb2.ZaT();
    return (ztlj1.ZJ(Ztz3.ACTION_URL) == null || ztlj2.ZJ(Ztz3.ACTION_URL) == null || !ztlj1.ZJ(Ztz3.ACTION_URL_PATH).equals(ztlj2.ZJ(Ztz3.ACTION_URL_PATH))) ? Zl4m.ZX : this.Zs.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */