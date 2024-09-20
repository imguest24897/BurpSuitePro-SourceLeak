package burp;

class Ztl7 extends Ztlu {
  private final Ztai Ze;
  
  Ztl7(Zey3 paramZey3, Ztdc paramZtdc, Zeye paramZeye, Ztai paramZtai) {
    super(paramZey3, paramZtdc, paramZeye);
    this.Ze = paramZtai;
  }
  
  public void ZG() {
    Zeye zeye2;
    int[] arrayOfInt = Ztl2.Zn();
    Zeye zeye1 = this.ZX.Zb(this.ZK.Zx.Zx());
    if (this.ZP.Zp(zeye1)) {
      zeye2 = zeye1;
      while (zeye1.ZX()) {
        zeye2 = zeye1;
        zeye1 = this.ZX.Zb(zeye1.Zx.ZR());
        if (zeye2.ZW(zeye1))
          break; 
      } 
      if (zeye2.Zx.ZD()) {
        if (this.Ze.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN)) {
          this.ZP.Zs(zeye2);
          if (arrayOfInt == null) {
            if (this.Ze.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ALL_SUBDOMAINS_TRUSTED))
              this.ZP.Zx(zeye2); 
            return;
          } 
        } 
        return;
      } 
    } else {
      return;
    } 
    if (this.Ze.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ALL_SUBDOMAINS_TRUSTED))
      this.ZP.Zx(zeye2); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztl7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */