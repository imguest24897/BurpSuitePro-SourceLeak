package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zyw extends Zni implements Zzxh {
  private final Ztp0[] ZQ;
  
  Zyw(int paramInt) {
    this.ZQ = new Ztp0[paramInt];
  }
  
  public void Zh(Zzxh paramZzxh) {
    try {
      if (paramZzxh.Zpu() < this.ZQ.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZzxh instanceof Zyw)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyw zyw = (Zyw)paramZzxh;
    System.arraycopy(this.ZQ, 0, zyw.ZQ, 0, this.ZQ.length);
  }
  
  public Ztp0 ZlT(int paramInt) {
    Ztp0 ztp0 = this.ZQ[paramInt];
    if (ztp0 == null) {
      ztp0 = new Ztp0(0, 0L, (byte)0);
      this.ZQ[paramInt] = ztp0;
    } 
    return ztp0;
  }
  
  public void Zh(int paramInt, Ztp0 paramZtp0) {
    this.ZQ[paramInt] = paramZtp0;
  }
  
  public int Zpu() {
    return this.ZQ.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZK(this);
  }
  
  public Zllg<Zzxh> ZF() {
    return ZA;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */