package burp;

class Zzdf implements Zla3 {
  private final Zkit Zm;
  
  private final Zlu6 ZP;
  
  Zzdf(Zkit paramZkit, Zlu6 paramZlu6) {
    this.Zm = paramZkit;
    this.ZP = paramZlu6;
  }
  
  public void Zl(Zzir paramZzir) {
    Zskz zskz = paramZzir.Zvm();
    if (zskz == null) {
      Zl3g.Z_(this.Zm, paramZzir);
      this.ZP.Zr();
      this.ZP.Zh();
      return;
    } 
    if (zskz.Zwx() == null || zskz.ZwG() == null || zskz.Zws() == null || zskz.Zwe() == null) {
      Zrkx.ZO(this.Zm, zskz);
      Zrkx.ZD(this.Zm, zskz);
      Zrkx.ZI(this.Zm, zskz);
      Zrkx.ZC(this.Zm, zskz);
      this.ZP.Zr();
      this.ZP.Zh();
    } 
    if (this.Zm.ZJ(zskz, (Zekb<Zmnm>)Zk35.ZA) == null) {
      Zrkx.Zr(this.Zm, zskz);
      this.ZP.Zr();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzdf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */