package burp;

class Ztvc implements Zear {
  private final Zbnt ZW;
  
  private final Zmzk Zm;
  
  private final Zs17 Zo;
  
  private final Zstu ZX;
  
  private final Zstu ZN;
  
  private Zlit ZA;
  
  private Zs68 ZI;
  
  Ztvc(Zbnt paramZbnt, Zmzk paramZmzk, Zs17 paramZs17, Zstu paramZstu1, Zstu paramZstu2) {
    this.ZW = paramZbnt;
    this.Zm = paramZmzk;
    this.Zo = paramZs17;
    this.ZX = paramZstu1;
    this.ZN = paramZstu2;
  }
  
  public boolean ZR(String paramString) {
    return this.Zo.Zg(paramString);
  }
  
  public Zstu ZI() {
    return this.ZX;
  }
  
  public Zstu Zi() {
    return this.ZN;
  }
  
  public Zlit Zq() {
    if (this.ZA == null && this.ZX != null) {
      Zz1p zz1p = Zghc.ZY(this.Zm, this.ZX, (byte)1, this.ZW);
      this.ZA = zz1p.Zo;
    } 
    return this.ZA;
  }
  
  public Zs68 Zb() {
    if (this.ZI == null && this.ZN != null)
      this.ZI = Zbwc.Zt(Zq(), this.ZN, Zt0k.HTML_ANALYSIS, this.ZW); 
    return this.ZI;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */