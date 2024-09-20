package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Ztz {
  private final List<Zu3> ZE = new ArrayList<>();
  
  private final List<Zv7> Zu = new ArrayList<>();
  
  public Ztz Zw(Zv7 paramZv7) {
    this.Zu.add(paramZv7);
    return this;
  }
  
  public Ztz ZK(String paramString, Zms paramZms) {
    Zw((new Zok()).Zo(new Zrm7(paramString)).Ze(paramZms).Zv());
    return this;
  }
  
  public Ztz Za(List<Zu3> paramList) {
    this.ZE.addAll(paramList);
    return this;
  }
  
  public Zu3 ZX() {
    return new Zu3(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */