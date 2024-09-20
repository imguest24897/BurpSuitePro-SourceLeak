package burp;

import java.util.Collection;

public class Zx18 extends Zxsr implements Zx0c {
  private static int Zl;
  
  Zx18(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  private Zzwo<Zlru, Zefg<Zt8i>> Ziu() {
    return this.Za.<Zzwo<Zlru, Zefg<Zt8i>>>ZJ(this, Zk63.ZA);
  }
  
  public void Ze(Zt8i paramZt8i, Zmv7 paramZmv7) {
    Zlgv.Zz(paramZt8i, Ziu(), this.Za, paramZmv7);
  }
  
  public void ZB(Zt8i paramZt8i) {
    Zlgv.ZG(paramZt8i, Ziu());
  }
  
  public Collection<Zt8i> Zko() {
    return Zlgv.Zk(Ziu());
  }
  
  public Zeu4<? extends Zx0c> ZF() {
    return ZK;
  }
  
  public static void ZP(int paramInt) {
    Zl = paramInt;
  }
  
  public static int ZiZ() {
    return Zl;
  }
  
  public static int Zie() {
    int i = ZiZ();
    return (i == 0) ? 95 : 0;
  }
  
  static {
    if (Zie() != 0)
      ZP(45); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx18.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */