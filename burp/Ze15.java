package burp;

public class Ze15 implements Ze5i {
  private final Ze3n ZZ;
  
  private final Zxs7 ZN;
  
  private final Zlu Zk;
  
  private final Zrj ZD;
  
  private final Zg75 ZT;
  
  private final Zzkd ZJ;
  
  private final Zmhe ZX;
  
  Ze15(Zrj paramZrj, Ze3n paramZe3n, Zg75 paramZg75, Zxs7 paramZxs7, Zlu paramZlu, Zzkd paramZzkd, Zmhe paramZmhe) {
    this.ZD = paramZrj;
    this.ZZ = paramZe3n;
    this.ZT = paramZg75;
    this.ZN = paramZxs7;
    this.Zk = paramZlu;
    this.ZJ = paramZzkd;
    this.ZX = paramZmhe;
  }
  
  public void Zk(Zz4_ paramZz4_) {
    this.ZZ.Zk(this.ZN, Zecx.LIGHT_AUDITING);
    Zmg6 zmg6 = this.ZT.Zi(this.ZN, this.ZJ, this.ZX, this.ZD, paramZz4_);
    boolean bool = Zg75.Zo();
    if (zmg6.ZE() || zmg6.ZS()) {
      this.ZZ.Zk(this.ZN, Zecx.AUDITING);
      ZB(zmg6, paramZz4_);
      if (bool) {
        this.ZZ.Zk(this.ZN, Zecx.LIGHT_AUDITED);
        return;
      } 
      return;
    } 
    this.ZZ.Zk(this.ZN, Zecx.LIGHT_AUDITED);
  }
  
  private void ZB(Zmg6 paramZmg6, Zz4_ paramZz4_) {
    this.ZZ.ZC();
    this.Zk.Zs(this.ZN, paramZmg6, paramZz4_);
    this.ZZ.Zk(this.ZN, this.Zk.Zx() ? Zecx.AUDITED : Zecx.NO_INSERTION_POINT_CHECKS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze15.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */