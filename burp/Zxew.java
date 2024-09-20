package burp;

import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.List;

class Zxew extends Zxsr implements Zmnm {
  Zxew(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zmnm> ZO2() {
    return this.Za.<Zefg<Zmnm>>ZJ(this, Zk1j.ZK);
  }
  
  public Zrp0 ZOe() {
    return this.Za.<Zrp0>ZJ(this, Zk1j.ZG);
  }
  
  public Zeu9 ZOD() {
    return this.Za.<Zeu9>ZJ(this, Zk1j.Zh);
  }
  
  public Zszw ZOK() {
    return this.Za.<Zszw>ZJ(this, Zk1j.Zt);
  }
  
  public String ZOZ() {
    return this.Za.Zf(this, Zk1j.Zc);
  }
  
  public List<Zgnc> ZOQ() {
    return this.Za.<List<Zgnc>>ZJ(this, (Zekb)Zk1j.Zk);
  }
  
  public List<Zrdb> ZO1() {
    return List.copyOf(ZFG());
  }
  
  public boolean ZON() {
    return !ZFG().isEmpty();
  }
  
  public Zebg ZVj(boolean paramBoolean) {
    return Zguc.ZY(ZFG(), paramBoolean);
  }
  
  public String ZOM() {
    return this.Za.Zf(this, Zk1j.ZU);
  }
  
  public BufferedImage ZO_() {
    return Zguc.Zp(this.Za.<Zstu>ZA(this, Zk1j.ZR));
  }
  
  public void Zi(Collection<Zrdb> paramCollection) {
    ZFG().addAll(paramCollection);
  }
  
  public void ZA(Collection<Zrdb> paramCollection) {
    ZFG().removeAll(paramCollection);
  }
  
  public int ZVD(boolean paramBoolean) {
    return Zguc.ZL(this, Zb3i.Zs(ZFG(), paramBoolean), paramBoolean);
  }
  
  public Zlah ZVZ(boolean paramBoolean) {
    byte b1 = this.Za.ZL(this, Zk1j.Za);
    byte b2 = this.Za.ZL(this, Zk1j.ZN);
    return Zguc.ZQ(Zb3i.Zs(ZFG(), paramBoolean), b1, b2, paramBoolean);
  }
  
  public int ZOg() {
    byte b1 = this.Za.ZL(this, Zk1j.Za);
    byte b2 = this.Za.ZL(this, Zk1j.ZN);
    return Zguc.Zf(b1, b2);
  }
  
  public void ZB(Zlah paramZlah) {
    this.Za.Zc(this, Zk1j.Za, paramZlah.ZRb());
    this.Za.Zc(this, Zk1j.ZN, paramZlah.ZRN());
  }
  
  public Zl1g ZOw() {
    Zl1g zl1g = this.Za.<Zl1g>ZJ(this, Zk1j.ZD);
    if (zl1g == null) {
      zl1g = this.Za.<Zl1g>ZH(Zrze.ZL());
      this.Za.Zq(this, Zk1j.ZD, zl1g);
    } 
    return zl1g;
  }
  
  private Zefg<Zrdb> ZFG() {
    return this.Za.<Zefg<Zrdb>>ZJ(this, Zk1j.ZP);
  }
  
  public Zeu4<? extends Zmnm> ZF() {
    return Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxew.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */