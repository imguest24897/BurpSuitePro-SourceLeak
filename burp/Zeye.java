package burp;

public class Zeye {
  public final Zs31 Zx;
  
  private final Zs31 ZT;
  
  final Zsja ZO;
  
  static final Zeye ZK = new Zeya(Zs31.Zn, Zs31.Zn, null);
  
  Zeye(Zs31 paramZs311, Zs31 paramZs312, Zsja paramZsja) {
    this.Zx = paramZs311;
    this.ZT = paramZs312;
    this.ZO = paramZsja;
  }
  
  public boolean ZX() {
    return this.ZT.ZU(this.Zx);
  }
  
  public boolean ZW(Zeye paramZeye) {
    return (paramZeye.ZX() && ZS(this) && (!paramZeye.ZX() || !ZS(paramZeye)));
  }
  
  public boolean Zt() {
    return (this.ZT == Zs31.ZF);
  }
  
  private static boolean ZS(Zeye paramZeye) {
    return (paramZeye.ZO.ZN && paramZeye.ZT != Zs31.ZF);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeye.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */