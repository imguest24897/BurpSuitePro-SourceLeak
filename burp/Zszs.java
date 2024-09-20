package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public abstract class Zszs implements Zbx0 {
  private final Zez3[] ZS;
  
  private final Zl4p ZB;
  
  private final Zerg Zu;
  
  private final Zskh Zo;
  
  private boolean Zz;
  
  Zszs(Zez3[] paramArrayOfZez3, Zl4p paramZl4p, Zerg paramZerg, Zskh paramZskh) {
    this.ZS = paramArrayOfZez3;
    this.ZB = paramZl4p;
    this.Zu = paramZerg;
    this.Zo = paramZskh;
  }
  
  public void Zx() {
    try {
      this.Zu.ZA().Zo(this, this.ZS);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    try {
      this.Zu.ZJ().Zu(this);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    try {
      this.Zu.Zm().ZR(this);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void ZP() {
    this.Zz = true;
  }
  
  protected abstract Zmj3 Zt(Zll9 paramZll9);
  
  public boolean Zi(Zeew paramZeew, Zll9 paramZll9) {
    return Zp(paramZll9);
  }
  
  public boolean Zp(Zll9 paramZll9) {
    try {
      if (this.Zz)
        return true; 
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (paramZll9.ZoO() == null)
        return false; 
      try {
        if (this.ZS != null && !ZT(paramZll9.ZlL()))
          return false; 
      } catch (Exception exception) {
        throw b(null);
      } 
      Zmj3 zmj3 = Zt(paramZll9);
      try {
        if (zmj3 != null)
          this.ZB.Za(this, zmj3); 
      } catch (Exception exception) {
        throw b(null);
      } 
      Ztyh.Zc();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.Zo);
    } 
    return this.Zz;
  }
  
  private boolean ZT(Zlit paramZlit) {
    Zez3[] arrayOfZez3 = this.ZS;
    int i = arrayOfZez3.length;
    String str = Zl41.ZU();
    byte b = 0;
    while (b < i) {
      Zez3 zez3 = arrayOfZez3[b];
      if (zez3.ZR(paramZlit))
        return true; 
      b++;
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */