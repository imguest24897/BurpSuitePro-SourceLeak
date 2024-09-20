package burp;

import java.util.Optional;
import net.portswigger.browser.Zd_;
import net.portswigger.browser.Zj3;
import net.portswigger.browser.Zjh;

public final class Ztiz implements Zsd0<Zj3> {
  private boolean ZT;
  
  private boolean Ze;
  
  private boolean ZQ;
  
  private Integer Za;
  
  private Integer ZJ;
  
  private final Zttx ZL;
  
  public Ztiz() {
    this.ZL = new Zttx();
  }
  
  public Ztiz(Zj3 paramZj3) {
    this.ZT = paramZj3.ZT();
    this.Ze = paramZj3.ZE();
    this.ZQ = paramZj3.ZL();
    this.Za = paramZj3.ZN();
    this.ZJ = paramZj3.ZJ();
    this.ZL = Zttx.Zf(paramZj3.Zq());
  }
  
  public Ztiz ZV(Integer paramInteger) {
    this.Za = paramInteger;
    return this;
  }
  
  public boolean ZJ() {
    return this.Ze;
  }
  
  public Ztiz Zk(boolean paramBoolean) {
    this.Ze = paramBoolean;
    return this;
  }
  
  public boolean ZB() {
    return this.ZQ;
  }
  
  public Ztiz ZL(boolean paramBoolean) {
    this.ZQ = paramBoolean;
    return this;
  }
  
  public boolean Zs() {
    return this.ZT;
  }
  
  public Ztiz Zf(boolean paramBoolean) {
    this.ZT = paramBoolean;
    return this;
  }
  
  public Ztiz Zv(Integer paramInteger) {
    this.ZJ = paramInteger;
    return this;
  }
  
  public Zj3 Z_() {
    return (new Zjh()).Zg(this.ZT).ZX(this.Ze).ZH(this.ZQ).Zw(this.Za.intValue()).Zo(this.ZJ.intValue()).Zu(this.ZL.ZM()).ZM();
  }
  
  public Optional<String> Zx() {
    return this.ZL.Zk();
  }
  
  public Zttx ZO() {
    return this.ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztiz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */