package burp;

class Zl9t extends Zl9l {
  public int Zf = 0;
  
  public boolean ZO;
  
  public byte ZK;
  
  public byte ZT;
  
  private int ZF = 9999;
  
  final Zgd Zt;
  
  private Zl9t(Zgd paramZgd) {}
  
  public boolean ZF(Zez3 paramZez3) {
    if (this.Zt.ZW.Za(paramZez3))
      return false; 
    Zxya zxya = this.Zt.ZC.ZK(paramZez3);
    if (zxya != null) {
      this.Zf++;
      if (Zgzm.Zc(zxya.Zp, 2L))
        this.ZO = true; 
      Zs3g zs3g = new Zs3g(this.Zt.ZB, zxya);
      int i = zs3g.ZN();
      if (i < this.ZF) {
        this.ZF = i;
        this.ZK = zs3g.ZM();
        this.ZT = zs3g.Zk();
      } 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */