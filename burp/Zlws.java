package burp;

class Zlws {
  private final Ze0c Zq;
  
  private final Ze0c Ze;
  
  private final Zg6m ZS;
  
  private final Ze0c ZT;
  
  private final Ze0c Zg;
  
  private final Ze0c ZQ;
  
  Zlws(Ztdi paramZtdi, Zbnt paramZbnt) {
    Zeg_ zeg_ = new Zeg_(paramZbnt);
    this.Zq = new Zq7(zeg_);
    Zeow zeow = new Zeow(paramZbnt);
    Zxxs zxxs = new Zxxs(zeg_, zeow);
    Zr37 zr37 = new Zr37(zeg_, zxxs);
    Ztm6 ztm6 = new Ztm6(zeg_);
    Zg9b zg9b = new Zg9b(zeg_, zxxs);
    Zt2c zt2c = new Zt2c(new Zx5v(paramZtdi), paramZbnt);
    this.Ze = new Zmi9(paramZbnt);
    this.ZS = new Zg6m(new Zr1k[] { zeow, zr37, zg9b, ztm6 });
    this.ZT = new Zkbu(zt2c, this.ZS);
    this.Zg = new Zzk0(this.Zq, zt2c);
    int i = Zrc1.ZL();
    this.ZQ = new Zz7f(paramZbnt);
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  Ze0c ZM() {
    return this.ZQ;
  }
  
  Ze0c ZF() {
    return this.Zq;
  }
  
  Ze0c ZJ() {
    return this.ZS;
  }
  
  Ze0c ZS() {
    return this.ZT;
  }
  
  Ze0c ZY() {
    return this.Ze;
  }
  
  Ze0c ZC() {
    return this.Zg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlws.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */