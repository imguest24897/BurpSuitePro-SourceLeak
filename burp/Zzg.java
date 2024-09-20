package burp;

import javax.swing.JComponent;

public class Zzg {
  final Zxdz ZN;
  
  final JComponent ZT;
  
  final Zzo2 Zv;
  
  final Zbg8 ZK;
  
  Zla4 ZV;
  
  Zrf0 Z_;
  
  Zglk Zm;
  
  int Ze;
  
  public Zzg(Zxdz paramZxdz, JComponent paramJComponent, Zzo2 paramZzo2, Zbg8 paramZbg8) {
    this.ZN = paramZxdz;
    this.ZT = paramJComponent;
    this.Zv = paramZzo2;
    this.ZK = paramZbg8;
    this.ZV = Zla4.SOUTH;
    boolean bool = Zbg8.ZN();
    this.Z_ = Zrf0.WEST;
    this.Zm = Zglk.CENTRE;
    this.Ze = 6;
    if (Zbqc.Zwu() == null)
      Zbg8.Zu(!bool); 
  }
  
  public Zzg(Zxdz paramZxdz, JComponent paramJComponent, Zb_j paramZb_j, Zbg8 paramZbg8) {
    this(paramZxdz, paramJComponent, new Zs67(paramZb_j), paramZbg8);
  }
  
  public Zzg Zm(Zla4 paramZla4) {
    this.ZV = paramZla4;
    return this;
  }
  
  public Zzg ZH(Zrf0 paramZrf0) {
    this.Z_ = paramZrf0;
    return this;
  }
  
  public Zzg Zx(int paramInt) {
    this.Ze = paramInt;
    return this;
  }
  
  public Ze8a ZG() {
    return (this.Zv.ZD(this.ZN) || !this.ZN.Zs()) ? Ze8a.ZV : new Zz71(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */