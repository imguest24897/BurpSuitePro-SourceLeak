package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zpu extends Zni implements Zze_ {
  @Zzvo(32)
  private final Zrde ZK;
  
  @Zzvo(34)
  private final long ZM;
  
  @Zzvo(35)
  private final long ZC;
  
  Zpu(Zrde paramZrde, long paramLong1, long paramLong2) {
    this.ZK = paramZrde;
    Zuh.Zb((paramZrde != null), Zqf.Zv);
    this.ZM = paramLong1;
    this.ZC = paramLong2;
  }
  
  protected Zpu() {
    this.ZK = null;
    this.ZM = 0L;
    this.ZC = 0L;
  }
  
  public Zehu Zu2() {
    return this.ZK.Zu2();
  }
  
  public void Zi(Zz_r paramZz_r) {
    this.ZK.Zi(paramZz_r);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return this.ZK.ZR(paramZbx0);
  }
  
  public Zzi8 ZK_() {
    return this.ZK.Zuz();
  }
  
  public void Zg(Zb03 paramZb03) {
    this.ZK.Zg(paramZb03);
  }
  
  public Zll7 Zub() {
    return this.ZK.Zub();
  }
  
  public int Zuj() {
    return this.ZK.Zuj();
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zz8c.Zz(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)Zze_.Zw;
  }
  
  public long ZKo() {
    return this.ZM;
  }
  
  public long ZKk() {
    return this.ZC;
  }
  
  public Zrde ZKp() {
    return this.ZK;
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.Zc(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    Zte7 zte7 = paramZr9a.Zc(this);
    return (zte7 != Zte7.CONTINUE) ? zte7 : ZKp().Zq(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zze_) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */