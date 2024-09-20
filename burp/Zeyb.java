package burp;

import java.beans.PropertyChangeListener;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zeyb extends Zeym {
  private final String ZW;
  
  private Integer ZC;
  
  private boolean Zi;
  
  Zeyb(String paramString, boolean paramBoolean) {
    this(paramString, paramBoolean, null);
  }
  
  Zeyb(String paramString, boolean paramBoolean, Integer paramInteger) {
    this.ZW = paramString;
    this.Zi = paramBoolean;
    this.ZC = paramInteger;
  }
  
  public String Zs() {
    return this.ZW;
  }
  
  public void ZJ(String paramString, PropertyChangeListener paramPropertyChangeListener) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zi(String paramString, PropertyChangeListener paramPropertyChangeListener) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public Integer Zb() {
    return this.ZC;
  }
  
  public void Zk(Integer paramInteger) {
    this.ZC = paramInteger;
  }
  
  public void ZT(boolean paramBoolean) {
    this.Zi = paramBoolean;
  }
  
  public boolean Zl() {
    return this.Zi;
  }
  
  public boolean Zv() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeyb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */