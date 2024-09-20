package burp;

class Zmn {
  private final Zz2j Zv;
  
  private final long Zd;
  
  private final Zeo2 ZM;
  
  private final Zkn ZS;
  
  Zmn(Zz2j paramZz2j, long paramLong, Zeo2 paramZeo2, Zkn paramZkn) {
    this.Zv = paramZz2j;
    this.Zd = paramLong;
    this.ZM = paramZeo2;
    this.ZS = paramZkn;
  }
  
  void ZQ() {
    if (!this.ZM.ZXR())
      return; 
    Zz1p zz1p = this.Zv.Zk();
    if (zz1p == null || zz1p.Zo == null)
      return; 
    this.ZS.Zx(this.Zv.Zx(), this.ZM, zz1p, this.Zd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */