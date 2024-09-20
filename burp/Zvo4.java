package burp;

class Zvo4 implements Zla3 {
  private final Zkit ZE;
  
  private final Zlu6 Z_;
  
  Zvo4(Zkit paramZkit, Zlu6 paramZlu6) {
    this.ZE = paramZkit;
    this.Z_ = paramZlu6;
  }
  
  public void Zl(Zzir paramZzir) {
    Zlod zlod = paramZzir.Zvu();
    if (zlod == null) {
      Zl3g.ZL(this.ZE, paramZzir);
      this.Z_.Zr();
      this.Z_.ZT();
      return;
    } 
    if (zlod.ZGl() == null) {
      Zbsx.ZS(this.ZE, zlod);
      this.Z_.Zr();
      this.Z_.Zw();
    } 
    if (zlod.ZG2() == null) {
      Zbsx.Zz(this.ZE, zlod);
      this.Z_.Zr();
      this.Z_.ZH();
    } 
    if (zlod.ZGW() == null) {
      Zbsx.ZW(this.ZE, zlod);
      this.Z_.Zr();
      this.Z_.ZB();
    } 
    if (zlod.ZGi() == null) {
      Zbsx.ZD(this.ZE, zlod);
      this.Z_.Zr();
      this.Z_.Zy();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvo4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */