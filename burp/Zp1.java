package burp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zp1 extends Zni implements Zrp9 {
  @Zzvo(32)
  private final Zll7 ZG;
  
  @Zzvo(33)
  private Zzi8 Zf;
  
  @Zzvo(34)
  private Zzi8 ZR;
  
  @Zzvo(35)
  private final Zstu Zx;
  
  @Zzvo(36)
  private final Zstu ZT;
  
  Zp1(Zll7 paramZll7, Zzi8 paramZzi81, Zzi8 paramZzi82, Zstu paramZstu1, Zstu paramZstu2) {
    this.ZG = paramZll7;
    this.Zf = paramZzi81;
    this.ZR = paramZzi82;
    this.Zx = paramZstu1;
    this.ZT = paramZstu2;
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.Zf);
    paramZz_r.Zg(Zeew.SCANNER, this.ZR);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.ZR);
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.Zf);
    paramZb03.ZC(this.ZR);
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.ZG);
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
    return this.Zf;
  }
  
  public Zzi8 ZvU() {
    return this.ZR;
  }
  
  public byte[] Zvs() {
    return this.Zx.ZiD();
  }
  
  public byte[] ZvM() {
    return this.ZT.ZiD();
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
    this.Zf = zrp9.Zvh();
    this.ZR = zrp9.ZvU();
  }
  
  private Zrp9 lambda$ifExists$0(Function<Zp1, Zrp9> paramFunction, Supplier paramSupplier) {
    return paramFunction.apply(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zp1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */