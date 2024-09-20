package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzog {
  private final int ZN;
  
  public Zzog(int paramInt) {
    if (paramInt < 0) {
      Zuh.Zv(false, Zqf.Zk, paramInt);
      paramInt = 0;
    } 
    if (paramInt > 500) {
      Zuh.Zv(false, Zqf.Zk, paramInt);
      paramInt = 500;
    } 
    this.ZN = paramInt;
  }
  
  public int Zk() {
    return this.ZN;
  }
  
  public String toString() {
    return Zlb0.ZY.format((this.ZN / 100.0F));
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Zzog && this.ZN == ((Zzog)paramObject).Zk());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzog.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */