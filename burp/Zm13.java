package burp;

import java.util.Arrays;

public class Zm13 implements Ztf_<Zeo2> {
  private final Zz6e<Zeo2> Zz;
  
  private final Ze47 ZL;
  
  private Zmzk ZX;
  
  private Zgsq Zp;
  
  private byte[] ZV;
  
  Zm13(Zz6e<Zeo2> paramZz6e, Ze47 paramZe47) {
    this.Zz = paramZz6e;
    this.ZL = paramZe47;
  }
  
  public boolean ZZ() {
    return this.Zz.ZZ();
  }
  
  public Zgsq ZQ() {
    return (this.Zp != null) ? this.Zp : Zgsq.ZW(this.ZL.Zw(ZJ()));
  }
  
  public void Zl(Zgsq paramZgsq) {
    this.Zp = paramZgsq;
  }
  
  public byte[] ZY() {
    return this.Zz.ZY();
  }
  
  public void Zb(byte[] paramArrayOfbyte) {
    this.Zz.Zb(paramArrayOfbyte);
  }
  
  public byte[] Zk() {
    return this.Zz.Zk();
  }
  
  public boolean Zd() {
    return this.Zz.Zd();
  }
  
  public void Zd(boolean paramBoolean) {
    this.Zz.Zd(paramBoolean);
  }
  
  public Zmzk ZJ() {
    return (this.ZX != null) ? this.ZX : this.Zz.ZJ();
  }
  
  public void ZP(Zmzk paramZmzk) {
    this.ZX = paramZmzk;
  }
  
  public Zeo2 ZF() {
    return this.Zz.ZL();
  }
  
  public Zz1p ZS() {
    return this.Zz.ZS();
  }
  
  public Zs68 ZU() {
    return this.Zz.ZU();
  }
  
  public byte[] Zr() {
    return this.Zz.Zr();
  }
  
  public String Z_() {
    return this.Zz.Z_();
  }
  
  public void ZJ(Zekl paramZekl, boolean paramBoolean) {
    this.Zz.ZJ(paramZekl, paramBoolean);
  }
  
  public Zgu3 Za() {
    return this.Zz.Za();
  }
  
  public Zsmh Zx() {
    return this.Zz.Zx();
  }
  
  public void ZA(Zeyk paramZeyk) {
    this.Zz.ZA(paramZeyk);
  }
  
  public String ZB(Zmzk paramZmzk) {
    return this.Zz.ZB(paramZmzk);
  }
  
  public void Ze() {
    synchronized (this.Zz) {
      this.Zz.notifyAll();
    } 
  }
  
  public void ZQ(byte[] paramArrayOfbyte) {
    if (this.ZV != null || !Arrays.equals(paramArrayOfbyte, Zk()))
      this.ZV = paramArrayOfbyte; 
  }
  
  public byte[] Zm() {
    return (this.ZV == null) ? Zk() : this.ZV;
  }
  
  public boolean ZW() {
    return !Arrays.equals(this.ZV, Zk());
  }
  
  public boolean Zc() {
    return (this.Zz.Za() == Zgu3.HTTP_REQUEST);
  }
  
  public Zlit Zy() {
    return ((Zeo2)this.Zz.ZL()).ZlL();
  }
  
  public byte ZaP() {
    return ZF().ZaP();
  }
  
  public void ZB(byte paramByte) {
    ZF().ZB(paramByte);
  }
  
  public String ZAs() {
    return ZF().ZAs();
  }
  
  public void ZWK(String paramString) {
    ZF().ZWK(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm13.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */