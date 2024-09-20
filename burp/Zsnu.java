package burp;

public class Zsnu implements Ztf_<Zzh2> {
  private final Zbp5 ZG;
  
  private final Zz6e<Zzh2> Zm;
  
  private Zgsq Za;
  
  private byte[] Zt;
  
  Zsnu(Zbp5 paramZbp5, Zz6e<Zzh2> paramZz6e) {
    this.ZG = paramZbp5;
    this.Zm = paramZz6e;
  }
  
  public boolean ZZ() {
    return this.Zm.ZZ();
  }
  
  public Zgsq ZQ() {
    return (this.Za != null) ? this.Za : this.Zm.ZQ();
  }
  
  public void Zl(Zgsq paramZgsq) {
    this.Za = paramZgsq;
  }
  
  public byte[] ZY() {
    return this.Zm.ZY();
  }
  
  public void Zb(byte[] paramArrayOfbyte) {
    this.Zm.Zb(paramArrayOfbyte);
  }
  
  public byte[] Zk() {
    return this.Zm.Zk();
  }
  
  public boolean Zd() {
    return this.Zm.Zd();
  }
  
  public void Zd(boolean paramBoolean) {
    this.Zm.Zd(paramBoolean);
  }
  
  public Zmzk ZJ() {
    return this.Zm.ZJ();
  }
  
  public void ZP(Zmzk paramZmzk) {
    this.Zm.ZP(paramZmzk);
  }
  
  public Zzh2 ZH() {
    return this.Zm.ZL();
  }
  
  public Zz1p ZS() {
    return this.Zm.ZS();
  }
  
  public Zs68 ZU() {
    return this.Zm.ZU();
  }
  
  public byte[] Zr() {
    return this.Zm.Zr();
  }
  
  public String Z_() {
    return this.Zm.Z_();
  }
  
  public void ZJ(Zekl paramZekl, boolean paramBoolean) {
    this.Zm.ZJ(paramZekl, paramBoolean);
  }
  
  public Zgu3 Za() {
    return this.Zm.Za();
  }
  
  public Zsmh Zx() {
    return this.Zm.Zx();
  }
  
  public void ZA(Zeyk paramZeyk) {
    this.Zm.ZA(paramZeyk);
  }
  
  public String ZB(Zmzk paramZmzk) {
    return this.Zm.ZB(paramZmzk);
  }
  
  public void Ze() {
    synchronized (this.Zm) {
      this.Zm.notifyAll();
    } 
  }
  
  public void ZQ(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != Zk())
      this.Zt = paramArrayOfbyte; 
  }
  
  public byte[] Zm() {
    return (this.Zt == null) ? Zk() : this.Zt;
  }
  
  public boolean ZW() {
    return (this.Zt != null);
  }
  
  public boolean Zc() {
    return ((Zzh2)this.Zm.ZL()).ZGf();
  }
  
  public Zlit Zy() {
    return (new Zlcx(this.ZG)).Za(this.Zm.ZL());
  }
  
  public byte ZaP() {
    return ZH().ZaP();
  }
  
  public void ZB(byte paramByte) {
    ZH().ZB(paramByte);
  }
  
  public String ZAs() {
    return ZH().ZAs();
  }
  
  public void ZWK(String paramString) {
    ZH().ZWK(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */