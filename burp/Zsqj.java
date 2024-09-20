package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsqj {
  private final String ZY;
  
  private final String ZH;
  
  private String Zr;
  
  private final Map<String, String> ZA = new HashMap<>();
  
  private final List<Zlou> Zj = new ArrayList<>();
  
  private Zxs7 ZS = null;
  
  private Integer Zu = null;
  
  public Zsqj(Zmzk paramZmzk, Zbnt paramZbnt, String paramString1, String paramString2) {
    Zuh.Zb((paramZmzk != null), Zqf.Zv);
    Zuh.Zb((paramZbnt != null), Zqf.Zv);
    Zuh.Zb((paramString1 != null), Zqf.Zv);
    Zuh.Zb((paramString2 != null), Zqf.Zv);
    this.ZY = paramString1;
    this.ZH = paramString2;
  }
  
  public Zsqj ZF(String paramString) {
    this.Zr = paramString;
    return this;
  }
  
  public Zsqj Zg(Map<String, String> paramMap) {
    this.ZA.putAll(paramMap);
    return this;
  }
  
  public Zsqj Zj(List<Zlou> paramList) {
    this.Zj.addAll(paramList);
    return this;
  }
  
  public Zsqj Zf(Zxs7 paramZxs7) {
    this.ZS = paramZxs7;
    return this;
  }
  
  public Zsqj ZD(int paramInt) {
    this.Zu = Integer.valueOf(paramInt);
    return this;
  }
  
  public Zt9 ZX() {
    return new Zt9(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsqj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */