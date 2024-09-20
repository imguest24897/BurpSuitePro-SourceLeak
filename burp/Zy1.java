package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy1 extends Zni implements Zb0w {
  private final Zlva[] Zf;
  
  Zy1(int paramInt) {
    this.Zf = new Zlva[paramInt];
  }
  
  public void ZB(Zb0w paramZb0w) {
    try {
      if (paramZb0w.Zpu() < this.Zf.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZb0w instanceof Zy1)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy1 zy1 = (Zy1)paramZb0w;
    System.arraycopy(this.Zf, 0, zy1.Zf, 0, this.Zf.length);
  }
  
  public Zlva Zuk(int paramInt) {
    Zlva zlva = this.Zf[paramInt];
    if (zlva == null) {
      zlva = new Zlva(0L, 0L, 0L);
      this.Zf[paramInt] = zlva;
    } 
    return zlva;
  }
  
  public void ZD(int paramInt, Zlva paramZlva) {
    this.Zf[paramInt] = paramZlva;
  }
  
  public int Zpu() {
    return this.Zf.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZT(this);
  }
  
  public Zllg<Zb0w> ZnH() {
    return Ze;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */