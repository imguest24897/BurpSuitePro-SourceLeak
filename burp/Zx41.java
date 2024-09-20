package burp;

import java.util.function.Supplier;

public class Zx41 implements Supplier<Zbs1>, Zr4u {
  private final Zs79 Zy;
  
  private final Ztos<Zt1x> Zq;
  
  public Zx41(Zs79 paramZs79) {
    this.Zy = paramZs79;
    this.Zq = new Ztos<>(Zt1x.Zf());
  }
  
  public Zlli<Zt1x> Zf() {
    return this.Zq;
  }
  
  public Zbs1 Zt() {
    return ZZ(this.Zy);
  }
  
  public void ZJ(Zz7y paramZz7y) {
    String str = Zb_x.ZE();
    this.Zy.ZT();
    if (paramZz7y == Zz7y.FAILURE)
      this.Zy.Z_(); 
    this.Zq.ZD(new Zxr8(Zt1x.Zl, Zt()));
    if (Zbqc.Zwu() == null)
      Zb_x.ZW("OktyKb"); 
  }
  
  private static Zbs1 ZZ(Zbs1 paramZbs1) {
    int i = paramZbs1.ZO();
    int j = paramZbs1.Zc();
    return new Zbiu(i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx41.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */