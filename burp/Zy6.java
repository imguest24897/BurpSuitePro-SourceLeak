package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy6 extends Zni implements Zg60 {
  private final Zrh9[] Zn;
  
  Zy6(int paramInt) {
    this.Zn = new Zrh9[paramInt];
  }
  
  public void ZG(Zg60 paramZg60) {
    try {
      if (paramZg60.Zpu() < this.Zn.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZg60 instanceof Zy6)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy6 zy6 = (Zy6)paramZg60;
    System.arraycopy(this.Zn, 0, zy6.Zn, 0, this.Zn.length);
  }
  
  public Zrh9 ZW(int paramInt) {
    Zrh9 zrh9 = this.Zn[paramInt];
    if (zrh9 == null) {
      zrh9 = new Zrh9(0L, 0L);
      this.Zn[paramInt] = zrh9;
    } 
    return zrh9;
  }
  
  public void ZE(int paramInt, Zrh9 paramZrh9) {
    this.Zn[paramInt] = paramZrh9;
  }
  
  public int Zpu() {
    return this.Zn.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zi(this);
  }
  
  public Zllg<Zg60> ZsB() {
    return ZT;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */