package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zsk {
  private final List<Zms> ZG = new ArrayList<>();
  
  private Zfe Zr;
  
  private String ZI;
  
  private String Zf;
  
  private String Zs;
  
  private String ZW;
  
  public Zsk ZU(Zfe paramZfe) {
    this.Zr = paramZfe;
    return this;
  }
  
  public Zsk Zo(String paramString) {
    this.ZI = paramString;
    return this;
  }
  
  public Zsk ZN(Zms paramZms) {
    this.ZG.add(paramZms);
    return this;
  }
  
  public Zsk Zk(String paramString) {
    this.Zf = paramString;
    return this;
  }
  
  public Zsk Zi(String paramString) {
    this.Zs = paramString;
    return this;
  }
  
  public Zsk ZO(String paramString) {
    this.ZW = paramString;
    return this;
  }
  
  public Zrzk Zn() {
    return new Zrzk(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */