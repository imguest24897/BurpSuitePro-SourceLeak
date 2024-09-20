package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zcx extends Zni implements Zez3 {
  @Zzvo(0)
  protected final Zlit ZC;
  
  @Zzvo(1)
  private final String Z_;
  
  @Zzvo(2)
  protected final Zez3 Zb;
  
  @Zzvo(3)
  private Zefg<Zez3> Zw;
  
  private final Zr_4 ZS;
  
  protected Zcx(Zlit paramZlit, Zez3 paramZez3, String paramString, Zr_4 paramZr_4) {
    this.ZC = paramZlit;
    this.Zb = paramZez3;
    this.Z_ = paramString;
    this.ZS = paramZr_4;
  }
  
  protected Zcx(Zlit paramZlit, Zez3 paramZez3, String paramString, List<Zez3> paramList, Zr_4 paramZr_4) {
    this.ZC = paramZlit;
    this.Zb = paramZez3;
    this.Z_ = paramString;
    this.ZS = paramZr_4;
    if (paramList != null) {
      this.Zw = Zkk.ZV(paramZr_4, Zez3.ZZ);
      this.Zw.addAll(paramList);
    } 
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return new Zkb9(this, paramZkl6, paramZm6x);
  }
  
  public abstract boolean ZR(Zlit paramZlit);
  
  public String Zkb() {
    return this.Z_;
  }
  
  public Zez3 ZkJ() {
    return this.Zb;
  }
  
  public void Zp(Zez3 paramZez3, Ztdi paramZtdi) {
    Zuh.Zb((paramZez3 != null), Zqf.Zv);
    if (this.Zw == null)
      this.Zw = Zkk.ZV(this.ZS, Zez3.ZZ); 
    paramZtdi.ZI(this.Zw, paramZez3);
  }
  
  public void Zu(Zez3 paramZez3, Ztdi paramZtdi) {
    Zuh.Zb((paramZez3 != null), Zqf.Zv);
    Zuh.Zb((this.Zw != null), Zqf.Zr);
    paramZtdi.Zb(this.Zw, paramZez3);
  }
  
  public boolean ZO(Zez3 paramZez3) {
    return Zerz.Zc(this, paramZez3);
  }
  
  public boolean Zl(Zez3 paramZez3) {
    return (paramZez3 == null) ? false : paramZez3.ZO(this);
  }
  
  public int ZkP() {
    return (this.Zw == null) ? 0 : this.Zw.size();
  }
  
  public boolean Zkw() {
    return (this.Zw == null);
  }
  
  public boolean ZK(Zl9l paramZl9l) {
    return Zerz.Zv(this.Zw, paramZl9l);
  }
  
  public Zlit ZlL() {
    return this.ZC;
  }
  
  public Zstu Zos() {
    return null;
  }
  
  public Zstu ZoO() {
    return null;
  }
  
  public long ZoB() {
    return 0L;
  }
  
  public String ZIx() {
    return null;
  }
  
  public short Zl7() {
    return 0;
  }
  
  public int Zlq() {
    return 0;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public Zeew Ze2() {
    return Zeew.TARGET;
  }
  
  public Zmzk Zod() {
    return this.ZC.Zdz();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public int hashCode() {
    return this.ZC.hashCode();
  }
  
  public String Zk2() {
    return null;
  }
  
  public boolean Zky() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zcx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */