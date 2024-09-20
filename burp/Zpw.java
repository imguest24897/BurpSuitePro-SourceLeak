package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zpw extends Zni implements Zg3y {
  @Zzvo(32)
  private final Zrde ZR;
  
  @Zzvo(33)
  private final Zrde Zi;
  
  Zpw(Zrde paramZrde1, Zrde paramZrde2) {
    Zuh.Zv((paramZrde1 != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZrde2 != null), Zqf.Zv, 2L);
    this.ZR = paramZrde1;
    this.Zi = paramZrde2;
  }
  
  protected Zpw() {
    this.ZR = null;
    this.Zi = null;
  }
  
  public Zehu Zu2() {
    return new Zs24(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    this.ZR.Zi(paramZz_r);
    this.Zi.Zi(paramZz_r);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return (this.ZR.ZR(paramZbx0) || this.Zi.ZR(paramZbx0));
  }
  
  public Zzi8 ZXJ() {
    return this.ZR.Zuz();
  }
  
  public Zzi8 ZXB() {
    return this.Zi.Zuz();
  }
  
  public Zrde ZX2() {
    return this.ZR;
  }
  
  public Zrde ZXG() {
    return this.Zi;
  }
  
  public void Zg(Zb03 paramZb03) {
    this.ZR.Zg(paramZb03);
    this.Zi.Zg(paramZb03);
  }
  
  public Zll7 Zub() {
    return this.ZR.Zub();
  }
  
  public Zll7 ZXh() {
    return this.Zi.Zub();
  }
  
  public int Zuj() {
    return this.ZR.Zuj() | this.Zi.Zuj();
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zz74.Zy(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)Zg3y.Z_;
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.ZS(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    Zte7 zte71 = paramZr9a.ZS(this);
    if (zte71 != Zte7.CONTINUE)
      return zte71; 
    Zte7 zte72 = ZX2().Zq(paramZr9a);
    return (zte72 != Zte7.CONTINUE) ? zte72 : ZXG().Zq(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zg3y) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */