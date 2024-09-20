package burp;

import java.util.function.Supplier;

public class Zb7_ extends Zb7n {
  private final Zb79 Zg;
  
  private final Zb7b ZI;
  
  private final Zb7g Zr;
  
  private final Zb7d ZA;
  
  private static int ZR;
  
  public Zb7_(Ztj1 paramZtj1, Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Ztwv paramZtwv, Zs0g paramZs0g, Zgso paramZgso, Zg0s paramZg0s, Zs2g paramZs2g, Zz6v paramZz6v, Zzvb paramZzvb, Zrny paramZrny) {
    this.Zr = new Zb7g(paramZtj1.Zh(), paramZtwv, paramZs0g, paramZgso, paramZg0s, paramZs2g, paramZz6v, paramZzvb, paramZrny);
    this.Zg = new Zb79(paramZtj1, paramZlfb);
    int i = Zj();
    this.ZI = new Zb7b(paramZtj1, paramSupplier);
    this.ZA = new Zb7d();
    Zn(this.Zr, new Zb7v(this.Zg, this.ZI), this.ZA);
    if (Zbqc.Zwu() == null)
      Ze(++i); 
  }
  
  public void ZF(String paramString) {
    this.Zg.ZU(paramString);
  }
  
  public void Zw(String paramString) {
    this.Zg.ZR(paramString);
  }
  
  public void ZX() {
    this.Zr.Zr();
    this.ZI.ZD();
    this.ZA.ZT();
  }
  
  public void ZJ() {
    this.Zr.ZN();
    this.ZI.Za();
    this.ZA.Zb();
  }
  
  public void ZD(String paramString) {
    this.ZA.ZF(paramString);
  }
  
  public static void Ze(int paramInt) {
    ZR = paramInt;
  }
  
  public static int Zg() {
    return ZR;
  }
  
  public static int Zj() {
    int i = Zg();
    return (i == 0) ? 34 : 0;
  }
  
  static {
    if (Zj() != 0)
      Ze(61); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */