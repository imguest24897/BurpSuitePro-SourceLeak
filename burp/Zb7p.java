package burp;

import java.util.function.Supplier;

public class Zb7p extends Zb7n {
  private final Zb7h Zq;
  
  private final Zb7k ZG;
  
  private final Zb7g ZO;
  
  private final Zb7d ZP;
  
  private static int Zy;
  
  public Zb7p(Ztj1 paramZtj1, Zlfb paramZlfb, Zt0s paramZt0s, Supplier<Zbs1> paramSupplier, Ztwv paramZtwv, Zs0g paramZs0g, Zgso paramZgso, Zg0s paramZg0s, Zs2g paramZs2g, Zz6v paramZz6v, Zzvb paramZzvb, Zrny paramZrny) {
    this.ZO = new Zb7g(paramZtj1.Zh(), paramZtwv, paramZs0g, paramZgso, paramZg0s, paramZs2g, paramZz6v, paramZzvb, paramZrny);
    this.Zq = new Zb7h(paramZtj1, paramZlfb, paramZt0s);
    int i = ZS();
    this.ZG = new Zb7k(paramZtj1, paramSupplier);
    this.ZP = new Zb7d();
    Zn(this.ZO, new Zb7v(this.Zq, this.ZG), this.ZP);
    if (Zbqc.Zwu() == null)
      Ze(++i); 
  }
  
  public void Zc(String paramString) {
    this.Zq.ZU(paramString);
  }
  
  public void ZC(String paramString) {
    this.Zq.ZR(paramString);
  }
  
  public void Zj(boolean paramBoolean) {
    this.Zq.ZD(paramBoolean);
  }
  
  public void ZX() {
    this.ZO.Zr();
    this.ZG.ZR();
    this.ZP.ZT();
  }
  
  public void ZJ() {
    this.ZO.ZN();
    this.ZG.Zw();
    this.ZP.Zb();
  }
  
  public void Zb(String paramString) {
    this.ZP.ZF(paramString);
  }
  
  public static void Ze(int paramInt) {
    Zy = paramInt;
  }
  
  public static int ZS() {
    return Zy;
  }
  
  public static int Zs() {
    int i = ZS();
    return (i == 0) ? 35 : 0;
  }
  
  static {
    if (ZS() == 0)
      Ze(97); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */