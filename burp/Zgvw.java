package burp;

class Zgvw implements Zg5o {
  private final boolean ZO;
  
  private final boolean ZI;
  
  private Zstu ZY;
  
  Zgvw(boolean paramBoolean1, boolean paramBoolean2) {
    this.ZO = paramBoolean1;
    this.ZI = paramBoolean2;
  }
  
  Zstu ZS() {
    return this.ZY;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZY = Zz9g.Zb(paramZr6q.ZD(), this.ZO, this.ZI);
  }
  
  public void ZS(Zr6h paramZr6h) {
    String str = Zl41.ZU();
    if (paramZr6h.ZH()) {
      if (this.ZI) {
        this.ZY = Zyf.Zy(paramZr6h.Zw());
        if (str != null) {
          byte[] arrayOfByte1 = paramZr6h.Zb().ZD();
          this.ZY = Zz9g.Zb(arrayOfByte1, this.ZO, this.ZI);
          return;
        } 
      } 
      return;
    } 
    byte[] arrayOfByte = paramZr6h.Zb().ZD();
    this.ZY = Zz9g.Zb(arrayOfByte, this.ZO, this.ZI);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */