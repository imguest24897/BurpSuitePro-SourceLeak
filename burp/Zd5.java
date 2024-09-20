package burp;

public class Zd5 {
  private final Ze4y Zm;
  
  private final Zedm Zk;
  
  private final Zrc_ Zi;
  
  public Zd5(Ze4y paramZe4y, Zedm paramZedm, Zrc_ paramZrc_) {
    this.Zm = paramZe4y;
    this.Zk = paramZedm;
    this.Zi = paramZrc_;
  }
  
  public Zxdl ZH(Zewm paramZewm) {
    if (paramZewm.Zv())
      return new Zxt(); 
    if (paramZewm.ZN() == 1) {
      Ztx4 ztx4 = paramZewm.ZQ();
      return (Zxdl)((ztx4 instanceof Zbop) ? new Zk1b((Zbop)ztx4) : new Zb6y((Zr9_)ztx4, this.Zi, this.Zm));
    } 
    return new Zsfh(paramZewm, this.Zk, this.Zi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zd5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */