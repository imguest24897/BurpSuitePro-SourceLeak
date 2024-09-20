package burp;

import java.util.List;

class Zesf implements Zb4e {
  private final Zs1h ZA;
  
  private final Zskh Zx;
  
  private final Zxzh ZH;
  
  private final Zey9 ZZ;
  
  Zesf(Zs1h paramZs1h, Zskh paramZskh, Zxzh paramZxzh, Zey9 paramZey9) {
    this.ZA = paramZs1h;
    this.Zx = paramZskh;
    this.ZH = paramZxzh;
    this.ZZ = paramZey9;
  }
  
  public boolean Zc() {
    return this.ZA.Z_();
  }
  
  public Zsgw ZX(Zsgw paramZsgw, List<Zkg1> paramList, Zlgm paramZlgm, Ze44 paramZe44, int paramInt) {
    Zxyz zxyz = new Zxyz(this.Zx, this.ZH, this.ZZ, paramZe44, paramInt, paramList, this.ZA.Zk(), paramZsgw);
    Zefx zefx = paramZsgw.Zi.ZG().ZR();
    zefx.Zi(zxyz);
    return zxyz.ZC;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */