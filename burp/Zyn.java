package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zyn extends Zni implements Zs62 {
  private final Zs3e[] Zw;
  
  Zyn(int paramInt) {
    this.Zw = new Zs3e[paramInt];
  }
  
  public void ZA(Zs62 paramZs62) {
    try {
      if (paramZs62.Zpu() < this.Zw.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZs62 instanceof Zyn)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyn zyn = (Zyn)paramZs62;
    System.arraycopy(this.Zw, 0, zyn.Zw, 0, this.Zw.length);
  }
  
  public Zs3e ZbE(int paramInt) {
    Zs3e zs3e = this.Zw[paramInt];
    if (zs3e == null) {
      zs3e = new Zs3e(0, 0L, 0);
      this.Zw[paramInt] = zs3e;
    } 
    return zs3e;
  }
  
  public void Zm(int paramInt, Zs3e paramZs3e) {
    this.Zw[paramInt] = paramZs3e;
  }
  
  public int Zpu() {
    return this.Zw.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZD(this);
  }
  
  public Zllg<Zs62> ZpR() {
    return Zh;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */