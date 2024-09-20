package burp;

import java.time.Duration;
import java.util.function.Consumer;
import net.portswigger.Zl0;
import net.portswigger.Zml;
import net.portswigger.Zrzg;

public class Ze78 {
  private final Zkrl Zf;
  
  private final Zzw2 ZF;
  
  private final Zt8u Zo;
  
  private final Zl9 ZU;
  
  private final Zml ZI;
  
  private final Zkl6 Zi;
  
  private final Zbnt Zl;
  
  private final Zl0 Zg;
  
  private final Zrzg ZE;
  
  private final Consumer<Duration> ZK;
  
  private final Ztwv ZC;
  
  private final Zskh Zp;
  
  public Ze78(Zkrl paramZkrl, Zzw2 paramZzw2, Zt8u paramZt8u, Zl9 paramZl9, Zml paramZml, Zkl6 paramZkl6, Zbnt paramZbnt, Zl0 paramZl0, Zrzg paramZrzg, Consumer<Duration> paramConsumer, Ztwv paramZtwv) {
    this.Zf = paramZkrl;
    this.ZF = paramZzw2;
    this.Zo = paramZt8u;
    this.ZU = paramZl9;
    this.ZI = paramZml;
    this.Zi = paramZkl6;
    this.Zl = paramZbnt;
    this.Zg = paramZl0;
    this.ZE = paramZrzg;
    this.ZK = paramConsumer;
    this.ZC = paramZtwv;
    this.Zp = paramZkrl.ZY4();
  }
  
  public Zbfw ZG() {
    return new Zbfw(this.ZF, this.Zi, this.ZK);
  }
  
  public Zee5 ZY() {
    return new Zee5(this.Zg, this.ZE);
  }
  
  public Zg9h Zf() {
    return new Zg9h(this, this.Zl);
  }
  
  public Zgu1 ZZ() {
    return new Zgu1(this.Zl, this);
  }
  
  public Zeyr Zo() {
    return new Zeyr();
  }
  
  public Zta5 Zs() {
    return new Zta5(this.Zf, this.Zg, this);
  }
  
  public Zzl_ Ze() {
    return new Zzl_(this.ZU, this.Zg, this);
  }
  
  public Zx0d Zx() {
    return new Zx0d(this.ZU, this, this.Zp);
  }
  
  public Zz26 ZK() {
    return new Zz26(this.Zo, this.ZI);
  }
  
  public Zs0i Zl() {
    return new Zs0i(this.ZU, this.ZC, this);
  }
  
  public Zrbr Za() {
    return new Zrbr();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze78.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */