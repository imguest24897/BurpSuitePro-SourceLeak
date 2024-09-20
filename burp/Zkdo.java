package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkdo<T extends Zgpi> implements Zeu4<Zefg<T>> {
  public final Zekv Zg;
  
  public final Zekv Zp;
  
  public final Zekk<Zrte<T>> Zn;
  
  public final Zekv Za;
  
  private final Zm31[] ZG;
  
  private final Zllo<Zefg<T>> ZR;
  
  public final Zguz<T> ZC;
  
  private final Zsqx<Zefg<T>> ZQ;
  
  public Zkdo(Zeu4<T> paramZeu4) {
    this.ZC = new Zguz<>(paramZeu4);
    this.Zg = new Zekv(0);
    this.Zp = new Zekv(1);
    this.Zn = new Zekk<>(2, this.ZC);
    this.Za = new Zekv(3);
    this.ZG = new Zm31[] { this.Zg, this.Zp, this.Zn, this.Za };
    this.ZR = new Zthh<>(this, paramZeu4);
    this.ZQ = new Zr5p<>(this, paramZeu4, 10);
  }
  
  public Zm31[] Zc() {
    return this.ZG;
  }
  
  public Zllo<Zefg<T>> ZI() {
    return this.ZR;
  }
  
  public Zeu4<? extends Zefg<T>> Z_(byte paramByte) {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */