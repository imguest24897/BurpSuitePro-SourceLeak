package burp;

import java.util.EnumSet;

class Zkra implements Zlei {
  private final String ZC;
  
  private final boolean ZB;
  
  private final boolean ZA;
  
  Zkra(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZC = paramString;
    this.ZB = paramBoolean1;
    this.ZA = paramBoolean2;
  }
  
  public EnumSet<Zklf> Zb() {
    Zg8e zg8e = Zz8g.Zy.get(this.ZC);
    return (zg8e != null) ? zg8e.Zo(this.ZB, this.ZA) : (new Zty1(this.ZC, this.ZB, this.ZA)).Zb();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkra.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */