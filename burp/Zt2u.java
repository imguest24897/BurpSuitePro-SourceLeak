package burp;

import net.portswigger.Zvh;

public class Zt2u {
  public static final Zt2u ZX = new Zt2u();
  
  public final boolean Zb;
  
  public final boolean Zp;
  
  public final boolean Zh;
  
  public final boolean ZP;
  
  private Zt2u() {
    boolean bool1 = Zkb5.Zo();
    boolean bool2 = Zvh.ZU.ZN();
    boolean bool3 = Zvh.ZU.ZG();
    this.Zb = (bool2 && bool1);
    this.Zp = (bool3 && bool1);
    this.ZP = (bool2 || bool3);
    this.Zh = (this.Zb || this.Zp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */