package burp;

import java.util.function.Supplier;

class Ze_d implements Zz9e {
  private final boolean ZJ;
  
  private final Zlg9 Zb;
  
  private final Zz9e ZS;
  
  private final Supplier<Zz9e> ZB;
  
  Ze_d(boolean paramBoolean, Zlg9 paramZlg9, Zz9e paramZz9e, Supplier<Zz9e> paramSupplier) {
    this.ZJ = paramBoolean;
    this.Zb = paramZlg9;
    this.ZS = paramZz9e;
    this.ZB = paramSupplier;
  }
  
  public Zsxd Zh(Zefx paramZefx, Zlhj paramZlhj) {
    Zsxd zsxd = this.ZS.Zh(paramZefx, paramZlhj);
    if (this.ZJ && zsxd.ZG().Ze() != null && zsxd.ZG().Ze().ZF() > 0)
      zsxd = this.Zb.ZE(zsxd, this.ZB.get()); 
    return zsxd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */