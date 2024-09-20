package burp;

class Zkji implements Zla3 {
  private final Zkit ZH;
  
  private final Zlu6 ZQ;
  
  Zkji(Zkit paramZkit, Zlu6 paramZlu6) {
    this.ZH = paramZkit;
    this.ZQ = paramZlu6;
  }
  
  public void Zl(Zzir paramZzir) {
    Zg94 zg94 = paramZzir.Zvl();
    if (zg94 == null) {
      Zl3g.ZS(this.ZH, paramZzir);
      this.ZQ.Zr();
      this.ZQ.ZD();
      return;
    } 
    if (zg94.ZG() == null) {
      Zewj.ZU(this.ZH, zg94);
      this.ZQ.Zr();
    } 
    if (zg94.ZI() == null) {
      Zewj.ZP(this.ZH, zg94);
      this.ZQ.Zr();
      this.ZQ.ZR();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkji.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */