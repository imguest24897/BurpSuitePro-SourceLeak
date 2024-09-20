package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zldq<V extends Zgpi> implements Zeu4<Ze93<V>> {
  private final Zllo<Ze93<V>> ZL;
  
  final Zek7 Z_;
  
  final Zekv ZI;
  
  final Zekv Zn;
  
  public final Zeke<Zmkl> ZT;
  
  private final Zm31[] Zs;
  
  Zldq(Zeu4<V> paramZeu4) {
    this.ZL = new Zxda<>(this, paramZeu4);
    this.Z_ = new Zek7(0);
    this.ZI = new Zekv(1);
    this.Zn = new Zekv(2);
    this.ZT = new Zeke<>(3, Zmkl.ZR);
    this.Zs = new Zm31[] { this.Z_, this.Zn, this.ZI, this.ZT };
  }
  
  public Zm31[] Zc() {
    return this.Zs;
  }
  
  public Zllo<Ze93<V>> ZI() {
    return this.ZL;
  }
  
  public Zeu4<? extends Ze93<V>> Z_(byte paramByte) {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */