package burp;

class Zsxv implements Zla3 {
  private final Zkit Zk;
  
  private final Zlu6 Zo;
  
  Zsxv(Zkit paramZkit, Zlu6 paramZlu6) {
    this.Zk = paramZkit;
    this.Zo = paramZlu6;
  }
  
  public void Zl(Zzir paramZzir) {
    Zz4b zz4b = paramZzir.Zv9();
    if (zz4b == null) {
      Zl3g.ZK(this.Zk, paramZzir);
      if (ZZ()) {
        this.Zo.Zr();
        this.Zo.ZU();
      } 
      return;
    } 
    if (zz4b.ZV_() == null) {
      Zmff.Zk(this.Zk, zz4b);
      this.Zo.Zr();
      this.Zo.ZI();
    } 
    if (Zepo.ZN(zz4b.ZVq())) {
      Zmff.Zp(this.Zk, zz4b);
      this.Zo.Zr();
    } 
    if (zz4b.ZVQ() == null) {
      Zmff.ZI(this.Zk, zz4b);
      this.Zo.Zr();
    } 
    if (zz4b.ZVR() == null) {
      Zmff.Zu(this.Zk, zz4b);
      this.Zo.Zr();
    } 
  }
  
  private boolean ZZ() {
    return (this.Zk.ZZ() >= Zrnb.Zk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsxv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */