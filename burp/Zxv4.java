package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxv4 extends Zxsr implements Zlod {
  Zxv4(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zeo2> ZGl() {
    return (Zefg<Zeo2>)this.Za.ZJ(this, Zkpl.Za);
  }
  
  public Zefg<Zeo2> ZG2() {
    return (Zefg<Zeo2>)this.Za.ZJ(this, Zkpl.ZK);
  }
  
  public Zefg<Zzh2> ZGW() {
    return (Zefg<Zzh2>)this.Za.ZJ(this, Zkpl.Zu);
  }
  
  public Zefg<Zzh2> ZGi() {
    return (Zefg<Zzh2>)this.Za.ZJ(this, Zkpl.Zf);
  }
  
  public int ZGu() {
    int i = this.Za.Zx(this, Zkpl.ZO);
    if (i == 0)
      try {
        Zefg<Zeo2> zefg = ZGl();
        try {
          if (zefg != null && !zefg.isEmpty()) {
            i = ((Zeo2)zefg.get(zefg.size() - 1)).ZEK();
            ZGX(i);
          } 
        } catch (Throwable throwable) {
          throw a(null);
        } 
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      }  
    return i;
  }
  
  public void ZGX(int paramInt) {
    this.Za.ZM(this, Zkpl.ZO, paramInt);
  }
  
  public int ZGK() {
    int i = this.Za.Zx(this, Zkpl.Zq);
    if (i == 0)
      try {
        Zefg<Zzh2> zefg = ZGW();
        try {
          if (zefg != null && !zefg.isEmpty()) {
            i = ((Zzh2)zefg.get(zefg.size() - 1)).ZEK();
            ZG6(i);
          } 
        } catch (Throwable throwable) {
          throw a(null);
        } 
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      }  
    return i;
  }
  
  public void ZG6(int paramInt) {
    this.Za.ZM(this, Zkpl.Zq, paramInt);
  }
  
  public Zeu4<Zlod> ZF() {
    return ZG;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxv4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */