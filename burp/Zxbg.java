package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zxbg extends Zxsr implements Zez3 {
  private static String ZU;
  
  protected Zxbg(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return new Zkb9(this, paramZkl6, paramZm6x);
  }
  
  public String Zkb() {
    return this.Za.Zf(this, Zk3e.ZW);
  }
  
  public Zez3 ZkJ() {
    return this.Za.<Zez3>ZJ(this, Zk3e.ZD);
  }
  
  public void Zp(Zez3 paramZez3, Ztdi paramZtdi) {
    Zuh.Zb((paramZez3 != null), Zqf.Zv);
    Zefg<Zez3> zefg = (Zefg)this.Za.ZJ(this, Zk3e.ZX);
    if (zefg == null) {
      zefg = Zkk.ZV(this.Za, Zez3.ZZ);
      this.Za.Zq(this, Zk3e.ZX, zefg);
    } 
    paramZtdi.ZI(zefg, paramZez3);
  }
  
  public void Zu(Zez3 paramZez3, Ztdi paramZtdi) {
    String str = ZFI();
    Zuh.Zb((paramZez3 != null), Zqf.Zv);
    Zefg<Zez3> zefg = (Zefg)this.Za.ZJ(this, Zk3e.ZX);
    Zuh.Zb((zefg != null), Zqf.Zr);
    paramZtdi.Zb(zefg, paramZez3);
    if (Zbqc.Zwu() == null)
      ZfK("IYYRab"); 
  }
  
  public boolean ZO(Zez3 paramZez3) {
    return Zerz.Zc(this, paramZez3);
  }
  
  public boolean Zl(Zez3 paramZez3) {
    return (paramZez3 == null) ? false : paramZez3.ZO(this);
  }
  
  public int ZkP() {
    Zefg zefg = (Zefg)this.Za.ZJ(this, Zk3e.ZX);
    return (zefg == null) ? 0 : zefg.size();
  }
  
  public boolean Zkw() {
    Zefg zefg = (Zefg)this.Za.ZJ(this, Zk3e.ZX);
    return (zefg == null);
  }
  
  public boolean ZK(Zl9l paramZl9l) {
    Zefg<Zez3> zefg = (Zefg)this.Za.ZJ(this, Zk3e.ZX);
    return Zerz.Zv(zefg, paramZl9l);
  }
  
  public Zlit ZlL() {
    return this.Za.<Zlit>ZJ(this, Zk3e.Zl);
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
    Zlit zlit = this.Za.<Zlit>ZJ(this, Zk3e.Zl);
    return zlit.Zdz();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public String Zk2() {
    return null;
  }
  
  public boolean Zky() {
    return false;
  }
  
  public int hashCode() {
    Zlit zlit = this.Za.<Zlit>ZJ(this, Zk3e.Zl);
    return zlit.hashCode();
  }
  
  public static void ZfK(String paramString) {
    ZU = paramString;
  }
  
  public static String ZFI() {
    return ZU;
  }
  
  static {
    if (ZFI() != null)
      ZfK("d7QpDb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */