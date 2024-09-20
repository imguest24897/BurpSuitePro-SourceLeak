package burp;

import java.time.Duration;
import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zxvy extends Zxvk implements Zz2s {
  protected Zxvy(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZPp() {
    return this.Za.Zi(this, Zkpe.ZV);
  }
  
  public Zlae ZPT() {
    Zrpj zrpj = this.Za.<Zrpj>ZJ(this, Zkpe.ZZ);
    return new Zlae(zrpj);
  }
  
  public void ZKt(boolean paramBoolean) {
    this.Za.ZH(this, Zkpe.ZV, paramBoolean);
  }
  
  public EnumSet<Zmup> ZPW() {
    int[] arrayOfInt = Zmup.ZN();
    if (Zbqc.Zwu() == null)
      Zmup.ZE(new int[1]); 
    return Zb__.Zm(this.Za.Zi(this, Zkpe.ZD), this.Za.Zi(this, Zkpe.Zd), this.Za.Zi(this, Zkpe.ZY));
  }
  
  public void ZKn(boolean paramBoolean) {
    this.Za.ZH(this, Zkpe.ZD, paramBoolean);
  }
  
  public void ZKH(boolean paramBoolean) {
    this.Za.ZH(this, Zkpe.Zd, paramBoolean);
  }
  
  public void ZKG(boolean paramBoolean) {
    this.Za.ZH(this, Zkpe.ZY, paramBoolean);
  }
  
  public Zmet ZGk() {
    return Zmet.Zu(this.Za.ZL(this, Zkpe.ZP));
  }
  
  public void ZF(Zmet paramZmet) {
    this.Za.Zc(this, Zkpe.ZP, paramZmet.id);
  }
  
  public Zl34 ZGY() {
    return this.Za.<Zl34>ZJ(this, Zkpe.Z_);
  }
  
  public Zl34 ZGp() {
    return this.Za.<Zl34>ZJ(this, Zkpe.Zk);
  }
  
  public boolean ZPG() {
    return this.Za.Zi(this, Zkpe.Zl);
  }
  
  public void ZK8(boolean paramBoolean) {
    this.Za.ZH(this, Zkpe.Zl, paramBoolean);
  }
  
  public void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */