package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Zxli {
  private final Zeh6 ZX;
  
  private final Zln_ ZH;
  
  private final Zku ZT;
  
  public Zxli(Zeh6 paramZeh6, Zln_ paramZln_, Zku paramZku) {
    this.ZX = paramZeh6;
    this.ZH = paramZln_;
    this.ZT = paramZku;
  }
  
  public Zzyu ZX(Zlx1 paramZlx1) {
    AtomicReference<Zzyu> atomicReference = new AtomicReference();
    paramZlx1.Zn(new Zejd(this, atomicReference));
    return atomicReference.get();
  }
  
  Ztpl ZO(Ztpl paramZtpl, String paramString) {
    return this.ZH.ZP(paramZtpl, paramString);
  }
  
  Ztpl Zn() {
    return Zo((this.ZX.ZEH()).Ze);
  }
  
  Ztpl Zo(String paramString) {
    return this.ZH.Zx(paramString);
  }
  
  Zzyu ZX(String paramString) {
    return this.ZT.ZS(paramString);
  }
  
  Zzyu Zi(Zkmj paramZkmj) {
    return this.ZT.ZN((this.ZX.ZEH()).Ze, paramZkmj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxli.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */