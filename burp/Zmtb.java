package burp;

import java.util.Collection;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zmtb {
  private final Zzwo<Zmzk, Zzhb> ZK;
  
  private final Zzwo<Zlit, Zrtx> Z_;
  
  private final Zzwo<Zlit, Zmxt> Zw;
  
  Zmtb(Zskz paramZskz) {
    this.ZK = paramZskz.Zwx();
    this.Z_ = paramZskz.ZwG();
    this.Zw = paramZskz.Zws();
  }
  
  boolean Za() {
    return (this.ZK.Zl6() && this.Z_.Zl6() && this.Zw.Zl6());
  }
  
  void Zy(Zmzk paramZmzk, Zzhb paramZzhb) {
    this.ZK.Zu(paramZmzk, paramZzhb);
  }
  
  void ZH(Zlit paramZlit, Zrtx paramZrtx) {
    this.Z_.Zu(paramZlit, paramZrtx);
  }
  
  void ZV(Zlit paramZlit, Zmxt paramZmxt) {
    this.Zw.Zu(paramZlit, paramZmxt);
  }
  
  Zzhb Zy(Zmzk paramZmzk) {
    return this.ZK.Zd(paramZmzk);
  }
  
  Zrtx ZZ(Zlit paramZlit) {
    return this.Z_.Zd(paramZlit);
  }
  
  Zmxt ZY(Zlit paramZlit) {
    return this.Zw.Zd(paramZlit);
  }
  
  boolean ZV(Zzhb paramZzhb) {
    Object object = this.ZK.ZM(paramZzhb.Zod());
    if (object == null)
      return false; 
    Zuh.Zb(object.equals(paramZzhb), Zqf.Zk);
    return true;
  }
  
  boolean Zu(Zrtx paramZrtx) {
    Object object = this.Z_.ZM(paramZrtx.ZlL());
    if (object == null)
      return false; 
    Zuh.Zb(object.equals(paramZrtx), Zqf.Zk);
    return true;
  }
  
  boolean Zo(Zmxt paramZmxt) {
    Object object = this.Zw.ZM(paramZmxt.ZlL());
    if (object == null)
      return false; 
    Zuh.Zb(object.equals(paramZmxt), Zqf.Zk);
    paramZmxt.ZHG();
    return true;
  }
  
  private boolean ZP(Zg6u paramZg6u) {
    paramZg6u.ZHG();
    return true;
  }
  
  public Collection<Zzhb> Z_() {
    return this.ZK.ZlZ();
  }
  
  public boolean Zi(Zez3 paramZez3) {
    boolean bool = false;
    try {
      paramZez3.ZK(new Zl97(this));
      Zl9h zl9h = new Zl9h(this);
      bool = paramZez3.ZN(zl9h);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */