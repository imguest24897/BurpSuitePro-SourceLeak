package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zrn9 {
  private List<Zb3t> ZO;
  
  private Zkal ZH;
  
  private Map<Zb3t, Zgbi> Zl;
  
  private static boolean ZL;
  
  public Zrn9(Zkal paramZkal) {
    this.ZH = paramZkal;
    this.ZO = new ArrayList<>();
  }
  
  public List<Zb3t> Zp() {
    return this.ZO;
  }
  
  public int ZP() {
    return this.ZO.size();
  }
  
  public void Zv(Zb3t paramZb3t) {
    this.ZO.add(paramZb3t);
  }
  
  public Map<Zb3t, Zgbi> Zx() {
    if (this.Zl == null)
      this.Zl = new HashMap<>(); 
    return this.Zl;
  }
  
  public Zkal Zz() {
    return this.ZH;
  }
  
  public static void Z_(boolean paramBoolean) {
    ZL = paramBoolean;
  }
  
  public static boolean Zn() {
    return ZL;
  }
  
  public static boolean Za() {
    boolean bool = Zn();
    return !bool;
  }
  
  static {
    if (Zn())
      Z_(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrn9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */