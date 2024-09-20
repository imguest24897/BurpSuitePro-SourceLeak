package burp;

import java.util.function.Supplier;

class Zehk implements Zg5o {
  private final Zket ZI;
  
  private final Zbnt Zp;
  
  private final Zey9 Zh;
  
  private final Supplier<Boolean> ZQ;
  
  private Zmlg ZK;
  
  public Zehk(Zket paramZket, Zbnt paramZbnt, Zey9 paramZey9, Supplier<Boolean> paramSupplier) {
    this.ZI = paramZket;
    this.Zp = paramZbnt;
    this.Zh = paramZey9;
    this.ZQ = paramSupplier;
  }
  
  public void Zs(Zr6q paramZr6q) {
    Zz1p zz1p = Zekx.Zy(null, paramZr6q.ZD(), (byte)26, this.Zp, this.ZQ);
    if (!((Boolean)this.ZQ.get()).booleanValue())
      this.ZK = new Zx4n(paramZr6q, this.ZI, zz1p, this.Zh); 
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.ZK = new Zrjy(paramZr6h, this.ZI, this.Zh);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zehk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */