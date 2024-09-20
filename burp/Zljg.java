package burp;

class Zljg implements Zla3 {
  private final Zkit ZK;
  
  private final Zlu6 ZO;
  
  Zljg(Zkit paramZkit, Zlu6 paramZlu6) {
    this.ZK = paramZkit;
    this.ZO = paramZlu6;
  }
  
  public void Zl(Zzir paramZzir) {
    Zeh6 zeh6 = paramZzir.Zvj();
    if (zeh6 == null) {
      Zl3g.ZJ(this.ZK, paramZzir);
      this.ZO.Zr();
      this.ZO.Zb();
      return;
    } 
    if (zeh6.Ziv() == null) {
      Ztx3.Zk(this.ZK, zeh6);
      this.ZO.Zr();
      this.ZO.Zs();
    } 
    if (zeh6.ZiT() == null) {
      Ztx3.Zx(this.ZK, zeh6);
      this.ZO.Zr();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */