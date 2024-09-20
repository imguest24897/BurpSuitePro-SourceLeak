package burp;

import java.util.Optional;

public class Zxb0 extends Zxsr implements Zzd6 {
  private static Zbqc[] ZB;
  
  protected Zxb0(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZRB() {
    return this.Za.Zi(this, Zk36.Zb);
  }
  
  public void Zv(Zmyb paramZmyb) {
    Zu(paramZmyb.ZJ());
  }
  
  public void ZRI() {
    Zu(0);
  }
  
  private void Zu(int paramInt) {
    this.Za.ZH(this, Zk36.Zb, true);
    this.Za.ZM(this, Zk36.Z_, paramInt);
  }
  
  public Optional<Zmyb> ZRD() {
    Zbqc[] arrayOfZbqc = ZQb();
    int i = this.Za.Zx(this, Zk36.Z_);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
    return (i == 0) ? Optional.<Zmyb>empty() : Optional.<Zmyb>of(Zmyb.Zp(this.Za.Zx(this, Zk36.Z_)));
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZQb() {
    return ZB;
  }
  
  static {
    if (ZQb() != null)
      Z_(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxb0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */