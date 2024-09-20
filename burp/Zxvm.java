package burp;

import net.portswigger.Zfh;

class Zxvm extends Zxv7 implements Zln2 {
  Zxvm(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zvo1> ZFG() {
    return (Zefg<Zvo1>)this.Za.ZJ(this, Zkpn.ZR);
  }
  
  public Zbr ZFq() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zkpn.Zi);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkpn.Za);
    byte b = this.Za.ZL(this, Zkpn.ZP);
    Zbqc[] arrayOfZbqc = Zfh.ZR();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
    return (zefg == null && zstu == null) ? null : Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public boolean Zgn() {
    return this.Za.Zi(this, Zkpn.ZE);
  }
  
  public void ZXX(boolean paramBoolean) {
    this.Za.ZH(this, Zkpn.ZE, paramBoolean);
  }
  
  public String ZAs() {
    return this.Za.Zz(this, Zkpn.Zf);
  }
  
  public void ZWK(String paramString) {
    this.Za.ZR(this, Zkpn.Zf, paramString);
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkpw.Za, 0);
  }
  
  public Zeu4<Zln2> ZF() {
    return Zln2.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */