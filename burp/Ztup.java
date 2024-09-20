package burp;

class Ztup implements Zg5o {
  private final Zskh ZB;
  
  private final Zxzh ZH;
  
  private final Ze44 Zo;
  
  private final int Zx;
  
  private final Zsxd ZE;
  
  private final String ZO;
  
  private final Zey9 ZY;
  
  private Zsxd ZD;
  
  private Ztup(Zskh paramZskh, Zxzh paramZxzh, Ze44 paramZe44, int paramInt, Zsxd paramZsxd, String paramString, Zey9 paramZey9) {
    this.ZB = paramZskh;
    this.ZH = paramZxzh;
    this.Zo = paramZe44;
    this.Zx = paramInt;
    this.ZE = paramZsxd;
    this.ZO = paramString;
    this.ZY = paramZey9;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZD = Zgg4.ZW(this.ZB, this.ZH, this.Zo, this.Zx, this.ZE, this.ZO, null, this.ZY);
  }
  
  public void ZS(Zr6h paramZr6h) {
    boolean bool = Zlf9.Zr();
    if (paramZr6h.ZH()) {
      this.ZD = this.ZE;
      if (bool) {
        Zefx zefx3 = this.ZE.ZG().ZR();
        Zefx zefx4 = zefx3.Zb();
        Ze5m ze5m1 = new Ze5m(zefx4);
        this.ZD = Zgg4.ZW(this.ZB, this.ZH, this.Zo, this.Zx, ze5m1, this.ZO, null, this.ZY);
        return;
      } 
      return;
    } 
    Zefx zefx1 = this.ZE.ZG().ZR();
    Zefx zefx2 = zefx1.Zb();
    Ze5m ze5m = new Ze5m(zefx2);
    this.ZD = Zgg4.ZW(this.ZB, this.ZH, this.Zo, this.Zx, ze5m, this.ZO, null, this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztup.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */