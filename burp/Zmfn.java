package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmfn<K extends Zgpi> implements Zeu4<Zmwp<K>> {
  private final Zllo<Zmwp<K>> Za;
  
  final Zek7 ZB;
  
  final Zekv Zj;
  
  final Zekv Z_;
  
  public final Zeke<Ztrr> ZT;
  
  final Zekg Zt;
  
  private final Zm31[] ZN;
  
  Zmfn(Zeu4<K> paramZeu4, Ztdo paramZtdo) {
    this.Za = new Zmg1<>(this, paramZeu4, paramZtdo);
    this.ZB = new Zek7(0);
    this.Zj = new Zekv(1);
    this.Z_ = new Zekv(2);
    this.ZT = new Zeke<>(3, Ztrr.ZP);
    this.Zt = new Zekg(4);
    this.ZN = new Zm31[] { this.ZB, this.Z_, this.Zj, this.ZT, this.Zt };
  }
  
  public Zm31[] Zc() {
    return this.ZN;
  }
  
  public Zllo<Zmwp<K>> ZI() {
    return this.Za;
  }
  
  public Zeu4<? extends Zmwp<K>> Z_(byte paramByte) {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */