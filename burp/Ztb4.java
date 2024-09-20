package burp;

public class Ztb4 {
  private final Zt0e ZJ;
  
  public Ztb4(Zt0e paramZt0e) {
    this.ZJ = paramZt0e;
  }
  
  public Zeeq ZV(Ze4y paramZe4y) throws Zsx4 {
    Zeto zeto = new Zeto(paramZe4y);
    Zen9 zen9 = (new Zlek(this.ZJ)).Zp(zeto);
    Zb0n zb0n = (new Zb69(zeto, this.ZJ)).ZD(zen9);
    boolean bool = Zeto.Zj();
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (Zsx4 zsx4) {
          throw a(null);
        } 
        Zeto.Zd(!bool);
      } 
    } catch (Zsx4 zsx4) {
      throw a(null);
    } 
    return zb0n.ZH();
  }
  
  private static Zsx4 a(Zsx4 paramZsx4) {
    return paramZsx4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztb4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */