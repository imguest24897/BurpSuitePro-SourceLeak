package burp;

import java.util.Optional;

public class Zmfu implements Zkrr {
  private final Ze3n Z_;
  
  public Zmfu(Ze3n paramZe3n) {
    this.Z_ = paramZe3n;
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_GraphQlIntrospectionEnabled;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (Zkh8.ZG(this.Z_).isEmpty())
      return; 
    Zefx zefx = this.Z_.ZA();
    if (Zkh8.Zk(this.Z_.ZL())) {
      paramZz4_.Zz(ZN(zefx, this.Z_.ZL()));
      return;
    } 
    Zrdu zrdu = Zkh8.ZT(zefx.Zc()).or(zefx::lambda$doCheck$0).orElse(null);
    if (zrdu == null)
      return; 
    Zsqx<Zrdb> zsqx = ZH(zrdu);
    if (zsqx != null)
      paramZz4_.Zz(zsqx); 
  }
  
  private Zsqx<Zrdb> ZH(Zrdu paramZrdu) {
    Zg3d zg3d = Zkh8.Z_(this.Z_, new Zrtz(Zem7.ZM(false), this.Z_.ZA().Zr(), paramZrdu));
    return Zkh8.Zk(zg3d.Ze()) ? ZN(zg3d.ZL(), zg3d.Ze()) : null;
  }
  
  private Zsqx<Zrdb> ZN(Zefx paramZefx, Zb6q paramZb6q) {
    Zvow zvow = this.Z_.ZI().ZC(paramZefx).Zo(paramZb6q).ZK(Zkh8.ZG(paramZefx));
    return Ztkx.Zn(this.Z_.Za(), (byte)3, this.Z_.ZA().ZF().Zd4(), zvow);
  }
  
  public String toString() {
    return Zp().name();
  }
  
  private static Optional lambda$doCheck$0(Zefx paramZefx) {
    return Zkh8.ZF(paramZefx.Zv(), paramZefx.Zr());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */