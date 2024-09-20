package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Ztk {
  private final List<Zms> ZS = new ArrayList<>();
  
  private final List<Zms> Zy = new ArrayList<>();
  
  public Ztk Zt(Zms paramZms) {
    this.ZS.add(paramZms);
    return this;
  }
  
  public Ztk ZD(List<Zms> paramList) {
    this.Zy.addAll(paramList);
    return this;
  }
  
  public Zt2 Zk() {
    return new Zt2(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */