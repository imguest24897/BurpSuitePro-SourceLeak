package burp;

import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zt1g {
  private final AtomicReference<Zg1d> Zj = new AtomicReference<>(Zg1d.INITIAL);
  
  private Zbuz ZD;
  
  private static Zbqc[] Ze;
  
  boolean ZP() {
    return ZZ(Zg1d.INITIAL, Zg1d.STARTED);
  }
  
  boolean ZW() {
    return (this.Zj.get() != Zg1d.INITIAL);
  }
  
  public void ZS() {
    ZZ(Zg1d.STARTED, Zg1d.STOPPING);
  }
  
  boolean ZH() {
    return (this.Zj.get() == Zg1d.STOPPING);
  }
  
  public void ZW(Zbuz paramZbuz) {
    this.ZD = paramZbuz;
  }
  
  public void ZZ(Zb6l paramZb6l) {
    Zbqc[] arrayOfZbqc = ZY();
    if (this.ZD != null) {
      this.ZD.ZD(paramZb6l);
      if (arrayOfZbqc != null) {
        Zuh.Zb(false, Zqf.Zs);
        return;
      } 
      return;
    } 
    Zuh.Zb(false, Zqf.Zs);
  }
  
  boolean ZT() {
    return (this.ZD != null && this.ZD.Ze());
  }
  
  void Zf() {
    ZZ(Zg1d.INITIAL, Zg1d.FINISHED);
  }
  
  public boolean ZM() {
    return ZZ(Zg1d.STOPPING, Zg1d.FINISHED);
  }
  
  boolean Zt() {
    return (this.Zj.get() == Zg1d.FINISHED);
  }
  
  private boolean ZZ(Zg1d paramZg1d1, Zg1d paramZg1d2) {
    boolean bool = this.Zj.compareAndSet(paramZg1d1, paramZg1d2);
    Zuh.ZT(bool, Zqf.Zr, ((Zg1d)this.Zj.get()).toString());
    return bool;
  }
  
  public static void Zo(Zbqc[] paramArrayOfZbqc) {
    Ze = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZY() {
    return Ze;
  }
  
  static {
    if (ZY() != null)
      Zo(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */