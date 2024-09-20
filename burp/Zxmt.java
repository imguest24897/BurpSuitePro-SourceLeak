package burp;

public class Zxmt extends Zxsr implements Zebf {
  private static int[] Zl;
  
  Zxmt(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zehu Zu2() {
    return new Zgp0(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.Za.<Zll9>ZJ(this, (Zekb)Zksa.ZC));
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.Za.<Zll9>ZJ(this, (Zekb)Zksa.ZC));
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.Za.<Zzi8>ZJ(this, Zksa.ZC));
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.Za.<Zll7>ZJ(this, Zksa.Zn));
  }
  
  public int Zuj() {
    return 1;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zg3r.ZQ(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)ZX;
  }
  
  public Zefg<Zzi8> ZMI() {
    return (Zefg<Zzi8>)this.Za.ZJ(this, Zksa.Zo);
  }
  
  public String ZMB() {
    return this.Za.Zf(this, Zksa.ZN);
  }
  
  public String ZMs() {
    return this.Za.Zf(this, Zksa.Zf);
  }
  
  public Zefg<Zgnx> ZMt() {
    return (Zefg<Zgnx>)this.Za.ZJ(this, Zksa.Zu);
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zebf) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
  
  public boolean equals(Object paramObject) {
    return Zg3r.ZM(this, paramObject);
  }
  
  static Zkit ZS(Zxmt paramZxmt) {
    return paramZxmt.Za;
  }
  
  static Zkit Zd(Zxmt paramZxmt) {
    return paramZxmt.Za;
  }
  
  public static void ZC(int[] paramArrayOfint) {
    Zl = paramArrayOfint;
  }
  
  public static int[] ZjH() {
    return Zl;
  }
  
  static {
    if (ZjH() == null)
      ZC(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */