package burp;

import java.awt.Component;

public class Zxpo {
  private final Zzzt ZZ;
  
  private final Zefr Zl;
  
  private final Zg3s ZU;
  
  private final Zr2 ZG;
  
  private static String Zb;
  
  public Zxpo(Zzzt paramZzzt, Zg3s paramZg3s, Zr2 paramZr2, Ztyg paramZtyg, Zgq7 paramZgq7, Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZZ = paramZzzt;
    this.ZU = paramZg3s;
    this.ZG = paramZr2;
    this.Zl = new Zefr(paramZtyg, paramZgq7, paramZbnt, paramZey9);
  }
  
  public void Zl(Component paramComponent, int paramInt) {
    new Zb04(paramComponent, this.ZZ.ZJ(), this.ZG, this.ZU, this.Zl, paramInt);
  }
  
  public void Zn(Component paramComponent, Zk75 paramZk75, int paramInt) {
    new Zb04(paramComponent, this.ZZ.ZJ(), this.ZG, this.ZU, this.Zl, paramZk75, paramInt);
  }
  
  public static void ZX(String paramString) {
    Zb = paramString;
  }
  
  public static String Zv() {
    return Zb;
  }
  
  static {
    if (Zv() == null)
      ZX("xkPwCc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */