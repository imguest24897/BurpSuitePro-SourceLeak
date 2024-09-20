package burp;

public class Zxmm extends Zxsr implements Zg3y {
  public Zxmm(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zehu Zu2() {
    return new Zl10(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zo)).Zi(paramZz_r);
    ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zn)).Zi(paramZz_r);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return (((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zo)).ZR(paramZbx0) || ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zn)).ZR(paramZbx0));
  }
  
  public Zzi8 ZXJ() {
    return ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zo)).Zuz();
  }
  
  public Zzi8 ZXB() {
    return ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zn)).Zuz();
  }
  
  public Zrde ZX2() {
    return this.Za.<Zrde>ZJ(this, Zks9.Zo);
  }
  
  public Zrde ZXG() {
    return this.Za.<Zrde>ZJ(this, Zks9.Zn);
  }
  
  public void Zg(Zb03 paramZb03) {
    ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zo)).Zg(paramZb03);
    ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zn)).Zg(paramZb03);
  }
  
  public Zll7 Zub() {
    return ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zo)).Zub();
  }
  
  public Zll7 ZXh() {
    return ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zn)).Zub();
  }
  
  public int Zuj() {
    return ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zo)).Zuj() | ((Zrde)this.Za.<Zrde>ZJ(this, Zks9.Zn)).Zuj();
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
  
  static Zkit ZW(Zxmm paramZxmm) {
    return paramZxmm.Za;
  }
  
  static Zkit ZK(Zxmm paramZxmm) {
    return paramZxmm.Za;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */