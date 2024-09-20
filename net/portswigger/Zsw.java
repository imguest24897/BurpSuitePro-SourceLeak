package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zsw {
  private final List<Zms> Zo = new ArrayList<>();
  
  private final List<Zkm> ZZ = new ArrayList<>();
  
  public Zsw Z_(Zms paramZms) {
    this.Zo.add(paramZms);
    return this;
  }
  
  public Zsw ZX(List<Zkm> paramList) {
    this.ZZ.addAll(paramList);
    return this;
  }
  
  public Zkm Zp() {
    return (this.Zo.isEmpty() && this.ZZ.isEmpty()) ? Zkm.Ze : new Zkm(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */