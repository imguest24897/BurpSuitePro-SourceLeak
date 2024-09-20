package burp;

import java.util.function.Supplier;

public class Zrf8 implements Zrbu {
  private final Ze3n ZS;
  
  private final Zbjl ZA;
  
  private final Supplier<Zt8g> Zh;
  
  private final int ZM;
  
  Zrf8(Ze3n paramZe3n, Zbjl paramZbjl, Supplier<Zt8g> paramSupplier, int paramInt) {
    this.ZA = paramZbjl;
    this.ZS = paramZe3n;
    this.Zh = paramSupplier;
    this.ZM = paramInt;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    return new Zbod(this.ZS, this.ZA, this.Zh.get(), this.ZM);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */