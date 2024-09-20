package burp;

import java.awt.Component;
import java.awt.Point;

class Zk9p implements Zm7i {
  final Zbdf ZF;
  
  private Zk9p(Zbdf paramZbdf) {}
  
  public void Zm(Component paramComponent, Point paramPoint) {
    this.ZF.ZJ(paramComponent, paramPoint);
  }
  
  public void ZP(int paramInt) {
    if (!this.ZF.Zo.Zd(paramInt))
      ZW(paramInt); 
  }
  
  public void Zs(boolean paramBoolean) {
    this.ZF.Zo.Zq(paramBoolean);
  }
  
  public void ZS(boolean paramBoolean) {
    this.ZF.Zo.ZD(paramBoolean);
  }
  
  public void ZQ(boolean paramBoolean) {
    this.ZF.Zo.Ze(paramBoolean);
  }
  
  private void ZW(int paramInt) {
    if (!this.ZF.Zj)
      this.ZF.Zo.ZU(paramInt); 
    Zsmh zsmh = this.ZF.Zi();
    if (this.ZF.ZW && this.ZF.Zo.Zj2().ZR()) {
      this.ZF.Zo.Zs(this.ZF.ZY(), zsmh);
      this.ZF.Za();
    } 
    if (!this.ZF.Zo.ZQ(paramInt))
      this.ZF.ZT(zsmh); 
    this.ZF.Zo.Zi(zsmh, false);
    this.ZF.ZD();
    this.ZF.Zs.ZH();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */