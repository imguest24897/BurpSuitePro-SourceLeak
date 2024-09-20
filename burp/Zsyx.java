package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsyx {
  private final int ZL;
  
  public Zsyx(int paramInt) {
    if (paramInt < 0) {
      Zuh.Zv(false, Zqf.Zk, paramInt);
      paramInt = 0;
    } 
    if (paramInt > 10000) {
      Zuh.Zv(false, Zqf.Zk, paramInt);
      paramInt = 10000;
    } 
    this.ZL = paramInt;
  }
  
  public int Zm() {
    return this.ZL;
  }
  
  public String toString() {
    return Zlb0.ZY.format((this.ZL / 100.0F));
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Zsyx && this.ZL == ((Zsyx)paramObject).Zm());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */