package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zdx {
  private final List<Zms> Zm = new ArrayList<>();
  
  private String ZK = "";
  
  public Zdx Zn(Zms paramZms) {
    this.Zm.add(paramZms);
    return this;
  }
  
  public Zh2 ZO() {
    return new Zh2(this.Zm, this.ZK);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zdx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */