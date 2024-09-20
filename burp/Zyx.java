package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zyx extends Zni implements Ztrj {
  private final Zbq_[] Zh;
  
  Zyx(int paramInt) {
    this.Zh = new Zbq_[paramInt];
  }
  
  public void ZM(Ztrj paramZtrj) {
    try {
      if (paramZtrj.Zpu() < this.Zh.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZtrj instanceof Zyx)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyx zyx = (Zyx)paramZtrj;
    System.arraycopy(this.Zh, 0, zyx.Zh, 0, this.Zh.length);
  }
  
  public Zbq_ ZF(int paramInt) {
    Zbq_ zbq_ = this.Zh[paramInt];
    if (zbq_ == null) {
      zbq_ = new Zbq_(0, 0L);
      this.Zh[paramInt] = zbq_;
    } 
    return zbq_;
  }
  
  public void ZV(int paramInt, Zbq_ paramZbq_) {
    this.Zh[paramInt] = paramZbq_;
  }
  
  public int Zpu() {
    return this.Zh.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zq(this);
  }
  
  public Zllg<Ztrj> ZF() {
    return ZS;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */