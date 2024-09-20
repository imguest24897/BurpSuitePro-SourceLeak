package burp;

import java.util.Collection;

public class Zk1m {
  private final Zl5x Zz;
  
  private final long Zc;
  
  private final Collection<Zblb> Zf;
  
  private Zro0 ZE;
  
  private Zbsl Zx;
  
  private boolean ZX;
  
  private static String ZB;
  
  private Zk1m(Zl5x paramZl5x, long paramLong, Collection<Zblb> paramCollection) {
    this.Zz = paramZl5x;
    this.Zc = paramLong;
    this.Zf = paramCollection;
  }
  
  public Zk1m ZN(Zxs7 paramZxs7) {
    this.ZE = paramZxs7.Zl();
    return this;
  }
  
  public Zk1m ZY(Zbsl paramZbsl) {
    this.Zx = paramZbsl;
    return this;
  }
  
  public Zk1m Zm() {
    this.ZX = true;
    return this;
  }
  
  public Zb09 Zn() {
    return new Zpf(this.Zz, this.Zc, this.ZE, this.Zx, this.ZX, this.Zf);
  }
  
  public static void Ze(String paramString) {
    ZB = paramString;
  }
  
  public static String ZQ() {
    return ZB;
  }
  
  static {
    if (ZQ() == null)
      Ze("CJO63"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */