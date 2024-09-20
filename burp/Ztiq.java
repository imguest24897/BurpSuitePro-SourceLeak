package burp;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ztiq {
  private final Ztsv Zd;
  
  private final Set<Zrp0> Zr;
  
  private Zsw9 Zi = Zsw9.Zi;
  
  private Ztiq(Ztsv paramZtsv) {
    this.Zd = paramZtsv;
    this.Zr = new HashSet<>();
  }
  
  public static Ztiq ZX(Zeu9 paramZeu9, Zszw paramZszw, Zrp0 paramZrp0) {
    return new Ztiq(Ztsv.Zi(paramZeu9, paramZszw, paramZrp0));
  }
  
  public static Ztiq Zk() {
    return new Ztiq(Ztsv.ZM8());
  }
  
  public Ztiq ZV(Collection<Zrp0> paramCollection) {
    this.Zr.addAll(paramCollection);
    return this;
  }
  
  public Ztiq ZO(Zsw9 paramZsw9) {
    this.Zi = paramZsw9;
    return this;
  }
  
  public Zx51 ZD(Zrp0 paramZrp0, Zlru paramZlru, Zszw paramZszw) {
    return new Zx51(this.Zd, new Zghx(paramZrp0, paramZszw), Zlqx.Zl(paramZlru), this.Zr, this.Zi);
  }
  
  public Zx51 ZO(List<? extends Zrp0> paramList) {
    return new Zx51(this.Zd, new Zxrq(paramList), null, this.Zr, this.Zi);
  }
  
  public Zx51 ZY(Zm8l paramZm8l) {
    return new Zx51(this.Zd, paramZm8l, null, this.Zr, this.Zi);
  }
  
  public String toString() {
    return this.Zd.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztiq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */