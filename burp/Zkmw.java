package burp;

import net.portswigger.Zo;

class Zkmw implements Zgli {
  private final Zzzt Zc;
  
  private final Zl47 ZX;
  
  Zkmw(Zzzt paramZzzt, Zl47 paramZl47) {
    this.Zc = paramZzzt;
    this.ZX = paramZl47;
  }
  
  public int Zs() {
    Zeeg zeeg = Zj();
    return (zeeg == null) ? 0 : zeeg.ZaW();
  }
  
  public byte Zv() {
    return Zj().Zay();
  }
  
  public Zo Zu() {
    return Zj().Zaz();
  }
  
  public Ze3o Zt() {
    Zxym zxym = this.Zc.Zy(this.ZX.Zwy()).Zr();
    return Zku.Zp(zxym, Zj().Za_());
  }
  
  public Zefx ZM() {
    int i = Zs();
    return (i == 0) ? null : this.Zc.ZT(i);
  }
  
  private Zeeg Zj() {
    int i = this.ZX.ZGS();
    return (i == -1) ? null : this.ZX.Zw7().get(i);
  }
  
  public String ZIx() {
    return "";
  }
  
  public void Zxg(String paramString) {}
  
  public byte ZaP() {
    return 0;
  }
  
  public void ZB(byte paramByte) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */