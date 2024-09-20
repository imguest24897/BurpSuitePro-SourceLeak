package burp;

import net.portswigger.Zrze;

public class Zrh3 {
  private final String Za;
  
  public Zrh3(String paramString) {
    this.Za = paramString;
  }
  
  public Ztt6 Zd() {
    Zek0 zek0 = ZJ();
    return (zek0 == Zek0.Zl) ? null : zek0.Zy;
  }
  
  private Zek0 ZJ() {
    int i = this.Za.length() - this.Za.replace(String.valueOf('y'), "").length();
    int j = 0;
    int k = 0;
    if (i > 3) {
      Zek0 zek0 = ZB(0, this.Za);
      if (zek0 == Zek0.Zl)
        return zek0; 
      j = zek0.Zg;
      k = zek0.Zi.intValue();
    } 
    Zek0 zek01 = ZB(j, this.Za);
    if (zek01 == Zek0.Zl)
      return zek01; 
    Zek0 zek02 = ZB(zek01.Zg, this.Za);
    if (zek02 == Zek0.Zl)
      return zek02; 
    Zlp9 zlp9 = Zlp9.Zx(zek02.Zi.intValue());
    if (zlp9 == null)
      return Zek0.Zl; 
    Zek0 zek03 = ZP(zek02.Zg, this.Za);
    if (zek03 == Zek0.Zl)
      return zek03; 
    Ztt6 ztt6 = new Ztt6(k, zek01.Zi.intValue(), zlp9, Zro0.Zgd(zek03.ZK));
    return new Zek0(zek03.Zg, ztt6);
  }
  
  public Zxov ZS(Zer0 paramZer0) {
    Zek0 zek0 = ZJ();
    if (zek0 == Zek0.Zl)
      return null; 
    Ztt6 ztt6 = zek0.Zy;
    int i = zek0.Zg;
    if (i + 2 >= this.Za.length())
      return null; 
    Zrze zrze = Zrze.Zi(this.Za.substring(i + 1));
    if (zrze == null || paramZer0.ZO() != 2)
      return null; 
    Ztxo ztxo = Zsxf.Zb.get(Ztxo.ZK(zrze));
    return (ztxo == null) ? null : new Zxov(new Zmaj(paramZer0, ztt6), ztxo, zrze);
  }
  
  private static Zek0 ZP(int paramInt, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    int j = paramInt;
    int i = Zlp9.Zr();
    while (j < paramString.length()) {
      paramInt++;
      char c = paramString.charAt(j);
      if (c == 'y')
        return new Zek0(paramInt, stringBuilder.toString()); 
      stringBuilder.append(c);
      j++;
      if (i != 0)
        break; 
    } 
    return Zek0.Zl;
  }
  
  private static Zek0 ZB(int paramInt, String paramString) {
    int j = 0;
    byte b = 0;
    int k = paramInt;
    int i = Zlp9.Zr();
    while (k < paramString.length() && b <= 8) {
      paramInt++;
      char c = paramString.charAt(k);
      int m = Character.digit(c, 16);
      if (m == -1)
        return (b > 0 && c == 'y') ? new Zek0(paramInt, j) : Zek0.Zl; 
      b++;
      j = j * 16 + m;
      k++;
      if (i != 0)
        break; 
    } 
    return Zek0.Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrh3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */