package burp;

public class Zmmm extends Zmvg {
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    if (paramZrdb1.Za6() != paramZrdb2.Za6())
      return Zl4m.ZX; 
    Ztlj ztlj1 = paramZrdb1.ZaT();
    Ztlj ztlj2 = paramZrdb2.ZaT();
    String str1 = ztlj1.ZJ(Ztz3.CHECK_IDENTIFIER);
    int i = ztlj1.ZY(Ztz3.CHECK_INDEX);
    String str2 = ztlj1.ZJ(Ztz3.EXTENSION_NAME);
    String str3 = ztlj2.ZJ(Ztz3.CHECK_IDENTIFIER);
    int j = ztlj2.ZY(Ztz3.CHECK_INDEX);
    String str4 = ztlj2.ZJ(Ztz3.EXTENSION_NAME);
    if (str1 == null || str3 == null)
      return Zl4m.ZX; 
    if (i != j)
      return Zl4m.ZX; 
    if (!str1.equals(str3))
      return Zl4m.ZX; 
    if (str2 == null) {
      if (str4 != null)
        return Zl4m.ZX; 
    } else if (!str2.equals(str4)) {
      return Zl4m.ZX;
    } 
    Zlzj zlzj = paramZgvn.Zi(str3, j);
    return (zlzj == null) ? Zl4m.ZX : zlzj.ZL(paramZrdb1, paramZrdb2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */