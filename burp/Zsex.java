package burp;

import java.util.Collections;
import java.util.List;

public class Zsex implements Zzud {
  private final Zsxd ZB;
  
  private final Zg3d Zo;
  
  public Zsex(Zsxd paramZsxd) {
    this.ZB = paramZsxd;
    this.Zo = paramZsxd.ZG();
  }
  
  public Zsex(Zlyj paramZlyj) {
    this(paramZlyj.ZBB());
  }
  
  public Zefx ZL() {
    return this.Zo.ZL();
  }
  
  public Zefx Z_() {
    return ((Zg3d)this.ZB.ZX().get(0)).ZR();
  }
  
  public List<Zefx> ZO() {
    return this.ZB.ZX().stream().map(Zg3d::ZL).toList();
  }
  
  public Zb6q ZT() {
    return this.Zo.Ze();
  }
  
  public List<Zb6q> ZV() {
    return this.ZB.ZX().stream().map(Zg3d::Ze).toList();
  }
  
  public Zstu Zl() {
    return (this.Zo.Ze() == null) ? null : this.Zo.Ze().Za();
  }
  
  public boolean ZU() {
    return (Zp() == Zvom.TIMED_OUT);
  }
  
  public boolean Zr() {
    return (Zp() == Zvom.UNKNOWN_HOST || Zp() == Zvom.CONNECTION_FAILED);
  }
  
  public Zvom Zp() {
    return this.Zo.Zb();
  }
  
  public long Ze() {
    return this.ZB.ZE().toMillis();
  }
  
  public List<String> ZR() {
    return (this.Zo.Ze() == null) ? Collections.<String>emptyList() : this.Zo.Ze().Zm();
  }
  
  public long Zx() {
    return this.ZB.ZL().toMillis();
  }
  
  public int Zq() {
    return this.ZB.Zg().size();
  }
  
  private static long lambda$getResponseCompletedTimers$0(Zg3d paramZg3d) {
    return paramZg3d.ZS().toMillis();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsex.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */