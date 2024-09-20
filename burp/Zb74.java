package burp;

import java.util.function.Supplier;

public class Zb74 extends Zb7n {
  private final Zb7q Zx;
  
  private final Zb7a ZF;
  
  private final Zb7g Zm;
  
  private final Zb7d Zy;
  
  private static String ZA;
  
  public Zb74(Ztj1 paramZtj1, Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Ztwv paramZtwv, Zs0g paramZs0g, Zgso paramZgso, Zg0s paramZg0s, Zs2g paramZs2g, Zz6v paramZz6v, Zzvb paramZzvb, Zrny paramZrny) {
    this.Zm = new Zb7g(paramZtj1.Zh(), paramZtwv, paramZs0g, paramZgso, paramZg0s, paramZs2g, paramZz6v, paramZzvb, paramZrny);
    this.Zx = new Zb7q(paramZtj1, paramZlfb);
    String str = ZY();
    this.ZF = new Zb7a(paramZtj1, paramSupplier);
    this.Zy = new Zb7d();
    Zn(this.Zm, new Zb7v(this.Zx, this.ZF), this.Zy);
    if (Zbqc.Zwu() == null)
      ZK("GZZ3U"); 
  }
  
  public void Zs(String paramString) {
    this.Zx.ZU(paramString);
  }
  
  public void Zj(String paramString) {
    this.Zx.ZR(paramString);
  }
  
  public void Zc(int paramInt) {
    this.ZF.Zu(paramInt);
  }
  
  public void ZB(int paramInt) {
    this.ZF.ZS(paramInt);
  }
  
  public void ZX(int paramInt) {
    this.ZF.Zm(paramInt);
  }
  
  public void Zw(boolean paramBoolean) {
    this.Zm.Za(paramBoolean);
  }
  
  public void ZX() {
    this.Zm.Zr();
    this.ZF.Zl();
    this.Zy.ZT();
  }
  
  public void ZJ() {
    this.Zm.ZN();
    this.ZF.Zc();
    this.Zy.Zb();
  }
  
  public void Z_(String paramString) {
    this.Zy.ZF(paramString);
  }
  
  public static void ZK(String paramString) {
    ZA = paramString;
  }
  
  public static String ZY() {
    return ZA;
  }
  
  static {
    if (ZY() == null)
      ZK("bOcemc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb74.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */