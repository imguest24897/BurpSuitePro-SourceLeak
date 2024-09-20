package burp;

import java.util.function.Supplier;

public class Ze47 {
  private final Ztbb ZN;
  
  private final Supplier<Boolean> ZJ;
  
  public Ze47(Ztbb paramZtbb, Supplier<Boolean> paramSupplier) {
    this.ZN = paramZtbb;
    this.ZJ = paramSupplier;
  }
  
  public Zkyt Zw(Zmzk paramZmzk) {
    return (paramZmzk == null) ? Zkyt.AUTO : (!((Boolean)this.ZJ.get()).booleanValue() ? Zkyt.HTTP1 : (this.ZN.ZM(paramZmzk) ? Zkyt.HTTP2 : (this.ZN.ZQ(paramZmzk) ? Zkyt.HTTP1 : (paramZmzk.ZJZ() ? Zkyt.AUTO : Zkyt.HTTP1))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze47.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */