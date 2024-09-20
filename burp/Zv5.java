package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.browser.Zel;

public class Zv5 extends Zvy<Zv5> {
  private Zl2w Zr;
  
  private String Zn;
  
  private boolean ZI;
  
  private boolean Zm;
  
  private boolean ZO;
  
  private boolean Zl;
  
  private final Map<String, String> ZL = new HashMap<>();
  
  private Zel Zk;
  
  private final Map<String, Zel> ZD = new HashMap<>();
  
  public Zv5 ZE(Zl2w paramZl2w) {
    this.Zr = paramZl2w;
    return this;
  }
  
  public Zv5 Zw(String paramString) {
    this.Zn = paramString;
    return this;
  }
  
  public Zv5 ZG(Map<String, String> paramMap) {
    this.ZL.putAll(paramMap);
    return this;
  }
  
  public Zv5 Zn(boolean paramBoolean) {
    this.ZI = paramBoolean;
    return this;
  }
  
  public Zv5 ZS(boolean paramBoolean) {
    this.Zm = paramBoolean;
    return this;
  }
  
  public Zv5 ZG(boolean paramBoolean) {
    this.ZO = paramBoolean;
    return this;
  }
  
  public Zv5 Zl(boolean paramBoolean) {
    this.Zl = paramBoolean;
    return this;
  }
  
  public Zv5 ZY(Zel paramZel) {
    this.Zk = paramZel;
    return this;
  }
  
  public Zv5 ZP(Map<String, Zel> paramMap) {
    this.ZD.putAll(paramMap);
    return this;
  }
  
  public Zrtj Zd() {
    return new Zrtj(this.Zp, this.Zr, this.Zn, this.Zz, this.Zc, this.Zu, this.ZI, this.Zm, this.ZO, this.Zl, this.ZL, this.Zv, this.Zk, this.ZD);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */