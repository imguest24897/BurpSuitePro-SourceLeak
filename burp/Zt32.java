package burp;

class Zt32 implements Ztm2 {
  private final Zbll ZA;
  
  final Zz1l ZC;
  
  Zt32(Zz1l paramZz1l, Zbll paramZbll) {
    this.ZA = paramZbll;
  }
  
  public Zbll Zg() {
    if (this.ZC.Zt.Za(this.ZC.Zh.ZG())) {
      Zewn zewn = this.ZC.Zt.Zp(this.ZC.Zh.ZG());
      Zbll zbll = Zbll.Zu(zewn);
      this.ZC.Zw(zbll);
      Ztm2 ztm2 = (Ztm2)(zbll.ZP.isEmpty() ? new Zii(this.ZC, this.ZA) : new Zxl8(this.ZC, zbll));
      return ztm2.Zg();
    } 
    return this.ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt32.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */