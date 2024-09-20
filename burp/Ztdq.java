package burp;

import java.awt.Window;
import java.util.function.Supplier;

public class Ztdq {
  private final Zerg Zd;
  
  private final Zgb6 ZU;
  
  private final Zskh Z_;
  
  private final Zbnt ZB;
  
  private final Ztwv Zw;
  
  private final Zgq7 ZG;
  
  private final Supplier<Ztyg> ZE;
  
  private final Zs6i ZA;
  
  private final Zm6x ZP;
  
  private final Zkl6 ZT;
  
  private Zz1z Zk;
  
  public Ztdq(Zerg paramZerg, Zgb6 paramZgb6, Zskh paramZskh, Zbnt paramZbnt, Ztwv paramZtwv, Zkl6 paramZkl6, Zgq7 paramZgq7, Supplier<Ztyg> paramSupplier, Zs6i paramZs6i, Zm6x paramZm6x) {
    this.Zd = paramZerg;
    this.ZU = paramZgb6;
    this.Z_ = paramZskh;
    this.ZB = paramZbnt;
    this.Zw = paramZtwv;
    this.ZT = paramZkl6;
    this.ZG = paramZgq7;
    this.ZE = paramSupplier;
    this.ZA = paramZs6i;
    this.ZP = paramZm6x;
  }
  
  public void Zc(Zz1z paramZz1z) {
    this.Zk = paramZz1z;
  }
  
  public Zl44 Za(Window paramWindow, Zlit paramZlit) {
    return new Zl44(paramWindow, this.Zd, this.ZU, this.Z_, this.ZB, this.Zw, this.ZE.get(), this.ZG, this.Zk, paramZlit, this.ZT, this.ZA, this.ZP);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */