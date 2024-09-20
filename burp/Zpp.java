package burp;

public class Zpp extends Zni implements Zt38 {
  @Zzvo(32)
  private final Zefg<Zsdr> ZB;
  
  @Zzvo(33)
  private final Zzi8 ZG;
  
  Zpp(Zefg<Zsdr> paramZefg, Zzi8 paramZzi8) {
    this.ZB = paramZefg;
    this.ZG = paramZzi8;
  }
  
  public Zehu Zu2() {
    return new Zxde(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.ZG);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.ZG);
  }
  
  public Zzi8 ZCM() {
    return this.ZG;
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.ZG);
  }
  
  public Zefg<Zsdr> ZCr() {
    return this.ZB;
  }
  
  public Zll7 Zub() {
    return Zgid.ZO;
  }
  
  public int Zuj() {
    return 1;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zzcm.Zh(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)ZL;
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.Zz(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zt38) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */