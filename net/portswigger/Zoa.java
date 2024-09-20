package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zoa {
  private final List<Zms> ZW = new ArrayList<>();
  
  public Zoa ZX(Zms paramZms) {
    this.ZW.add(paramZms);
    return this;
  }
  
  public Zsj ZS() {
    return this.ZW.isEmpty() ? Zsj.Zd : new Zsj(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zoa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */