package burp;

import java.util.EnumSet;

public class Zb4o implements Zm1o {
  private final Zbdx Zz;
  
  private final EnumSet<Zt8> Zr;
  
  private int Zw;
  
  private int Zk;
  
  Zb4o(Zbdx paramZbdx, EnumSet<Zt8> paramEnumSet) {
    this.Zz = paramZbdx;
    this.Zr = paramEnumSet;
  }
  
  void Zj(int paramInt) {
    this.Zw = paramInt;
  }
  
  void Zi(int paramInt) {
    this.Zk = paramInt;
  }
  
  public EnumSet<Zt8> ZG() {
    return this.Zr;
  }
  
  public void ZQ(Zt8 paramZt8) {
    this.Zz.ZF(paramZt8, this.Zw, this.Zk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */