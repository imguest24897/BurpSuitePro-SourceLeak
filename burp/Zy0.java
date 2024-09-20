package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy0 extends Zni implements Zmxo {
  private final Zgn1[] ZF;
  
  Zy0(int paramInt) {
    this.ZF = new Zgn1[paramInt];
  }
  
  public void Zr(Zmxo paramZmxo) {
    try {
      if (paramZmxo.Zpu() < this.ZF.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZmxo instanceof Zy0)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy0 zy0 = (Zy0)paramZmxo;
    System.arraycopy(this.ZF, 0, zy0.ZF, 0, this.ZF.length);
  }
  
  public Zgn1 ZsV(int paramInt) {
    Zgn1 zgn1 = this.ZF[paramInt];
    if (zgn1 == null) {
      zgn1 = new Zgn1(0, 0L, (short)0);
      this.ZF[paramInt] = zgn1;
    } 
    return zgn1;
  }
  
  public void ZN(int paramInt, Zgn1 paramZgn1) {
    this.ZF[paramInt] = paramZgn1;
  }
  
  public int Zpu() {
    return this.ZF.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZO(this);
  }
  
  public Zllg<Zmxo> Zp4() {
    return ZK;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */