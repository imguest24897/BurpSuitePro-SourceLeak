package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zmld {
  private final List<Zmon> ZK;
  
  private final Ztos<Zt1j> ZU;
  
  private Zgb6 Zn;
  
  private Supplier<Zl4w> Zs;
  
  private boolean ZV = false;
  
  private Zs_i ZZ = null;
  
  private boolean ZW = true;
  
  private int Zu = 0;
  
  private Zmld(List<Zmon> paramList, Ztos<Zt1j> paramZtos) {
    this.ZK = paramList;
    this.ZU = paramZtos;
  }
  
  public Zmld Zq(Zgb6 paramZgb6) {
    this.Zn = paramZgb6;
    return this;
  }
  
  public Zmld Zk(Supplier<Zl4w> paramSupplier) {
    this.Zs = paramSupplier;
    return this;
  }
  
  public Zmld ZT(boolean paramBoolean) {
    this.ZV = paramBoolean;
    return this;
  }
  
  public Zmld ZS(Zs_i paramZs_i) {
    this.ZZ = paramZs_i;
    return this;
  }
  
  public Zmld ZR(boolean paramBoolean) {
    this.ZW = paramBoolean;
    return this;
  }
  
  public Zmld ZL(int paramInt) {
    this.Zu = paramInt;
    return this;
  }
  
  public Zbdt Zu() {
    return new Zbdt(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmld.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */