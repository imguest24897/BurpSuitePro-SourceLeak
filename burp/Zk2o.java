package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk2o<T extends Zgpi> implements Zeu4<Zrfx<T>> {
  static final Zek7 ZL = new Zek7(0);
  
  static final Zekv ZP = new Zekv(1);
  
  static final Zekv Zp = new Zekv(2);
  
  public final Zeke<Zrvk> Zd;
  
  static final Zekg Zr = new Zekg(4);
  
  private final Zllo<Zrfx<T>> Zo;
  
  private final Zm31[] Zk;
  
  public Zk2o(Zeu4<T> paramZeu4) {
    this.Zo = new Zral<>(this, paramZeu4);
    this.Zd = new Zeke<>(3, Zrvk.Zb);
    this.Zk = new Zm31[] { ZL, ZP, Zp, this.Zd, Zr };
  }
  
  public Zm31[] Zc() {
    return this.Zk;
  }
  
  public Zllo<Zrfx<T>> ZI() {
    return this.Zo;
  }
  
  public Zeu4<Zrfx<T>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */