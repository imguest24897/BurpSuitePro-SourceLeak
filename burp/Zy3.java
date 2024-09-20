package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy3 extends Zni implements Zm5a {
  private final Zzwr[] Zj;
  
  Zy3(int paramInt) {
    this.Zj = new Zzwr[paramInt];
  }
  
  public void ZJ(Zm5a paramZm5a) {
    try {
      if (paramZm5a.Zpu() < this.Zj.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZm5a instanceof Zy3)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy3 zy3 = (Zy3)paramZm5a;
    System.arraycopy(this.Zj, 0, zy3.Zj, 0, this.Zj.length);
  }
  
  public Zzwr Zgd(int paramInt) {
    Zzwr zzwr = this.Zj[paramInt];
    if (zzwr == null) {
      zzwr = new Zzwr((short)0, 0L);
      this.Zj[paramInt] = zzwr;
    } 
    return zzwr;
  }
  
  public void ZP(int paramInt, Zzwr paramZzwr) {
    this.Zj[paramInt] = paramZzwr;
  }
  
  public int Zpu() {
    return this.Zj.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZX(this);
  }
  
  public Zllg<Zm5a> ZZo() {
    return ZC;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */