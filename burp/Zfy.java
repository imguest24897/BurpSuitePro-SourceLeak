package burp;

class Zfy extends Zni implements Zz4b {
  @Zzvo(1)
  private final Zefg<Zgna> ZI;
  
  @Zzvo(2)
  private final Zefg<Ztic> Zh;
  
  @Zzvo(3)
  private final Zefg<Zb2e> ZC;
  
  @Zzvo(4)
  private final Zmju Zv;
  
  @Zzvo(5)
  private volatile boolean ZF;
  
  @Zzvo(6)
  private int Zk = -1;
  
  @Zzvo(7)
  private int ZU = -1;
  
  @Zzvo(8)
  private int Ze = 0;
  
  @Zzvo(9)
  private int Zc = 0;
  
  Zfy(Zefg<Zgna> paramZefg, Zefg<Ztic> paramZefg1, Zefg<Zb2e> paramZefg2, Zmju paramZmju) {
    this.ZI = paramZefg;
    this.Zh = paramZefg1;
    this.ZC = paramZefg2;
    Zbqc[] arrayOfZbqc = Zmff.Za();
    this.Zv = paramZmju;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zefg<Zgna> ZV_() {
    return (this.ZI == null) ? null : Zecy.<Zgna>ZT(this.ZI);
  }
  
  public Zefg<Ztic> ZVq() {
    return this.Zh;
  }
  
  public Zefg<Zb2e> ZVQ() {
    return this.ZC;
  }
  
  public Zmju ZVR() {
    return this.Zv;
  }
  
  public boolean ZV3() {
    return this.ZF;
  }
  
  public void ZK(boolean paramBoolean) {
    Zz2_.ZR();
    this.ZF = paramBoolean;
  }
  
  public int ZVO() {
    return this.Zk;
  }
  
  public void Zt(int paramInt) {
    this.Zk = paramInt;
  }
  
  public int ZV7() {
    return this.ZU;
  }
  
  public void Zy(int paramInt) {
    this.ZU = paramInt;
  }
  
  public int ZVw() {
    return this.Ze;
  }
  
  public void Zk(int paramInt) {
    this.Ze = paramInt;
  }
  
  public int ZST() {
    return this.Zc;
  }
  
  public void ZL(int paramInt) {
    this.Zc = paramInt;
  }
  
  public Zeu4<? extends Zz4b> ZF() {
    return ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */