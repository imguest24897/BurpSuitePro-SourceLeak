package burp;

import java.util.List;

public class Zso1 implements Zmsx {
  private final List<String> Zh;
  
  private final List<String> ZL;
  
  private int Zu = 0;
  
  private int Zr = 0;
  
  public Zso1(List<String> paramList1, List<String> paramList2) {
    this.Zh = paramList1;
    this.ZL = paramList2;
  }
  
  public String ZO() {
    return this.Zh.get(this.Zu++ % this.Zh.size());
  }
  
  public String ZS() {
    return this.ZL.get(this.Zr++ % this.ZL.size());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zso1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */