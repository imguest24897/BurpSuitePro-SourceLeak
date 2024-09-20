package burp;

import java.util.concurrent.atomic.AtomicBoolean;

public class Zkf1 {
  private static final AtomicBoolean Zi = new AtomicBoolean();
  
  private static final AtomicBoolean Zk = new AtomicBoolean();
  
  private final Ztwv ZS;
  
  private final Zsau ZB;
  
  private final Zx5y ZO;
  
  private static Zbqc[] Ze;
  
  public Zkf1(Ztwv paramZtwv, Zsau paramZsau, Zx5y paramZx5y) {
    this.ZS = paramZtwv;
    this.ZB = paramZsau;
    this.ZO = paramZx5y;
  }
  
  public void ZS() {
    if (this.ZB.ZB() && !Zi.getAndSet(true))
      this.ZS.Zx(this::lambda$checkForUpdates$0); 
  }
  
  public static boolean Zg() {
    return Zk.get();
  }
  
  private void lambda$checkForUpdates$0() {
    this.ZO.Zf();
    Zi.set(false);
    Zk.set(true);
  }
  
  static {
    Zv(null);
  }
  
  public static void Zv(Zbqc[] paramArrayOfZbqc) {
    Ze = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZA() {
    return Ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */