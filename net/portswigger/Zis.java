package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zis {
  private boolean ZV = true;
  
  private final List<Boolean> ZM = new ArrayList<>();
  
  private String Zx = "";
  
  public Zis ZX(boolean paramBoolean) {
    this.ZV = paramBoolean;
    return this;
  }
  
  public Zis Zi(Boolean paramBoolean) {
    this.ZM.add(paramBoolean);
    return this;
  }
  
  public Zis Zi(String paramString) {
    this.Zx = paramString;
    return this;
  }
  
  public Zt0 ZL() {
    return (this.ZM.isEmpty() && Zlz.ZC(this.Zx)) ? Zt0.Zb(this.ZV) : new Zt0(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */