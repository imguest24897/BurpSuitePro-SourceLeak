package burp;

import java.util.Objects;

public class Zsg_ implements Zmd5 {
  private final Zxco ZA;
  
  private final Zlw2<Zsnv> Zq;
  
  private final Zlw2<Zzj5> Zn;
  
  private final Zlw2<Zb0p> ZY;
  
  private Zr86 ZG;
  
  private static String ZS;
  
  public Zsg_(Zxco paramZxco) {
    this.ZA = paramZxco;
    Objects.requireNonNull(this.ZA);
    this.Zq = new Zlw2<>(this.ZA::ZS);
    Objects.requireNonNull(this.ZA);
    this.Zn = new Zlw2<>(this.ZA::ZJ);
    Objects.requireNonNull(this.ZA);
    this.ZY = new Zlw2<>(this.ZA::Zc);
  }
  
  public Zxer ZW(Zsnv paramZsnv) {
    return this.Zq.ZF(paramZsnv);
  }
  
  public Zxer Zj(Zzj5 paramZzj5) {
    return this.Zn.ZF(paramZzj5);
  }
  
  public Zxer Z_(Zb0p paramZb0p) {
    return this.ZY.ZF(paramZb0p);
  }
  
  public Zxer ZX(Zglw paramZglw) {
    if (this.ZG == null)
      this.ZG = new Zr86(this.ZA); 
    return this.ZG.Zm(paramZglw);
  }
  
  public void Zh() {
    this.Zq.Zg();
    this.Zn.Zg();
    this.ZY.Zg();
  }
  
  public void ZN() {
    this.Zq.Zz();
    this.Zn.Zz();
    this.ZY.Zz();
  }
  
  public static void ZZ(String paramString) {
    ZS = paramString;
  }
  
  public static String ZM() {
    return ZS;
  }
  
  static {
    if (ZM() == null)
      ZZ("xlchK"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */