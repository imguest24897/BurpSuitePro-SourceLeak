package burp;

public class Zuf extends Zni implements Zlod {
  @Zzvo(0)
  private final Zefg<Zeo2> Zt;
  
  @Zzvo(1)
  private final Zefg<Zeo2> Zp;
  
  @Zzvo(2)
  private final Zefg<Zzh2> ZB;
  
  @Zzvo(3)
  private final Zefg<Zzh2> Ze;
  
  @Zzvo(4)
  private int ZK;
  
  @Zzvo(5)
  private int ZV;
  
  Zuf(Zefg<Zeo2> paramZefg1, Zefg<Zeo2> paramZefg2, Zefg<Zzh2> paramZefg3, Zefg<Zzh2> paramZefg4) {
    this.Zt = paramZefg1;
    this.Zp = paramZefg2;
    int i = Zbsx.Zd();
    this.ZB = paramZefg3;
    this.Ze = paramZefg4;
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zefg<Zeo2> ZGl() {
    return this.Zt;
  }
  
  public Zefg<Zeo2> ZG2() {
    return this.Zp;
  }
  
  public Zefg<Zzh2> ZGW() {
    return this.ZB;
  }
  
  public Zefg<Zzh2> ZGi() {
    return this.Ze;
  }
  
  public int ZGu() {
    return this.ZK;
  }
  
  public void ZGX(int paramInt) {
    this.ZK = paramInt;
  }
  
  public int ZGK() {
    return this.ZV;
  }
  
  public void ZG6(int paramInt) {
    this.ZV = paramInt;
  }
  
  public Zeu4<Zlod> ZF() {
    return ZG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */