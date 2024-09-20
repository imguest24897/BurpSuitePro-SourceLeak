package burp;

import java.awt.Component;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public abstract class Zbxx implements Zgib {
  private final Zbdf ZV;
  
  private final Supplier<? extends Zzxp> Zq;
  
  private final Zgty ZH;
  
  private final Zlhp Ze;
  
  private final Zten Zx;
  
  private String ZK;
  
  private Zz3e Zz;
  
  private Zxko Zg;
  
  protected Zbxx(String paramString, Zbdf paramZbdf, Supplier<? extends Zzxp> paramSupplier) {
    this.ZK = paramString;
    this.ZV = paramZbdf;
    this.Zq = paramSupplier;
    this.ZH = new Zgty();
    this.Ze = new Zlhp();
    this.Zx = new Zten();
  }
  
  protected Zbxx(String paramString, Zbdf paramZbdf, Zzxp paramZzxp) {
    this(paramString, paramZbdf, paramZzxp::lambda$new$0);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZV.ZI(paramInt, paramObject);
  }
  
  public String Zb() {
    return this.ZK;
  }
  
  public Component ZB() {
    return this.ZV;
  }
  
  public Zzxp ZK() {
    return this.Zq.get();
  }
  
  public void Zz(Zt7b paramZt7b) {
    this.ZH.Zk(paramZt7b);
  }
  
  public void ZH(Zktb paramZktb) {
    this.Ze.Zs(paramZktb);
  }
  
  public void Zh(Zgtp paramZgtp) {
    this.Zx.Zu(paramZgtp);
  }
  
  public void ZW(Zz3e paramZz3e) {
    this.Zz = paramZz3e;
  }
  
  public void Zq(Zbdx paramZbdx, Zgu3 paramZgu3) {
    this.ZV.Zn(this.ZH);
    this.ZV.ZY(this.Ze);
    this.ZV.ZH(this.Zx);
    List<Zt37> list = paramZbdx.ZF(paramZgu3);
    this.ZV.ZU(list);
    Objects.requireNonNull(this.ZV);
    this.Zg = this.ZV::Zc;
    paramZbdx.ZQ(this.Zg);
  }
  
  public void Zp(Zbdx paramZbdx) {
    paramZbdx.Zu(this.Zg);
    this.ZV.Zo(this.ZH);
    this.ZV.Zo(this.Ze);
    this.ZV.ZT(this.Zx);
    this.ZH.ZO();
    this.Ze.ZI();
    this.Zx.ZH();
    this.Zz = null;
    this.ZV.Zt();
  }
  
  public void ZK(boolean paramBoolean) {
    this.ZV.Zn(paramBoolean);
  }
  
  public void ZQ(String paramString) {
    this.ZK = paramString;
    if (this.Zz != null)
      this.Zz.Zl(); 
  }
  
  private static Zzxp lambda$new$0(Zzxp paramZzxp) {
    return paramZzxp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */