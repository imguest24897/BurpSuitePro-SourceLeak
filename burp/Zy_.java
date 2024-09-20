package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy_ extends Zni implements Zmn2 {
  private final Zgl_[] ZT;
  
  Zy_(int paramInt) {
    this.ZT = new Zgl_[paramInt];
  }
  
  public void Z_(Zmn2 paramZmn2) {
    try {
      if (paramZmn2.Zpu() < this.ZT.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZmn2 instanceof Zy_)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy_ zy_ = (Zy_)paramZmn2;
    System.arraycopy(this.ZT, 0, zy_.ZT, 0, this.ZT.length);
  }
  
  public Zgl_ ZbN(int paramInt) {
    Zgl_ zgl_ = this.ZT[paramInt];
    if (zgl_ == null) {
      zgl_ = new Zgl_(0, 0L, 0L);
      this.ZT[paramInt] = zgl_;
    } 
    return zgl_;
  }
  
  public void ZN(int paramInt, Zgl_ paramZgl_) {
    this.ZT[paramInt] = paramZgl_;
  }
  
  public int Zpu() {
    return this.ZT.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zv(this);
  }
  
  public Zllg<Zmn2> Ziv() {
    return ZD;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */