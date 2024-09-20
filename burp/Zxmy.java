package burp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxmy extends Zxsr implements Zrp9 {
  Zxmy(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.Za.<Zll9>ZJ(this, (Zekb)Zksk.ZV));
    paramZz_r.Zg(Zeew.SCANNER, this.Za.<Zll9>ZJ(this, (Zekb)Zksk.ZY));
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.Za.<Zll9>ZJ(this, (Zekb)Zksk.ZY));
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.Za.<Zzi8>ZJ(this, Zksk.ZV));
    paramZb03.ZC(this.Za.<Zzi8>ZJ(this, Zksk.ZY));
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.Za.<Zll7>ZJ(this, Zksk.Zn));
  }
  
  public int Zuj() {
    return 1;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zshz.Zd(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)Zrp9.Zu;
  }
  
  public Zzi8 Zvh() {
    return this.Za.<Zzi8>ZJ(this, Zksk.ZV);
  }
  
  public Zzi8 ZvU() {
    return this.Za.<Zzi8>ZJ(this, Zksk.ZY);
  }
  
  public byte[] Zvs() {
    return ZfV().ZiD();
  }
  
  Zstu ZfV() {
    return this.Za.<Zstu>ZJ(this, Zksk.ZZ);
  }
  
  public byte[] ZvM() {
    return ZfA().ZiD();
  }
  
  Zstu ZfA() {
    return this.Za.<Zstu>ZJ(this, Zksk.ZK);
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.Zz(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zrp9) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
  
  public Zr1s Zd(Consumer<Zrp9> paramConsumer) {
    paramConsumer.accept(this);
    return Zr1s.Zf;
  }
  
  public Zzi8 Zuz() {
    return Zvh();
  }
  
  public void ZT(Zrde paramZrde) {
    if (!(paramZrde instanceof Zrp9)) {
      Zuh.ZT(false, Zqf.Zr, paramZrde.getClass().getName());
      return;
    } 
    Zrp9 zrp9 = (Zrp9)paramZrde;
    this.Za.Zq(this, Zksk.ZV, zrp9.Zvh());
    this.Za.Zq(this, Zksk.ZY, zrp9.ZvU());
  }
  
  private Zrp9 lambda$ifExists$0(Function<Zxmy, Zrp9> paramFunction, Supplier paramSupplier) {
    return paramFunction.apply(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */