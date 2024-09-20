package burp;

import java.util.function.Supplier;
import net.portswigger.Zsy;

public class Zmsh implements Zbnr {
  private final Ze3n ZG;
  
  private final Zkq4 Zg;
  
  private final Zssh Zv;
  
  private final Zz_9 Zz;
  
  private final Zrgd ZO;
  
  private final Zskh Zs;
  
  private final Zz1i Zr;
  
  private final Ztwv Zp;
  
  private final Zkl6 Zl;
  
  private final Zsy ZP;
  
  private final Supplier<String> Zq;
  
  public Zmsh(Ze3n paramZe3n, Zkq4 paramZkq4, Zssh paramZssh, Zz_9 paramZz_9, Zrgd paramZrgd, Zskh paramZskh, Zz1i paramZz1i, Ztwv paramZtwv, Zkl6 paramZkl6, Zsy paramZsy, Supplier<String> paramSupplier) {
    this.ZG = paramZe3n;
    this.Zg = paramZkq4;
    this.Zv = paramZssh;
    this.Zz = paramZz_9;
    this.ZO = paramZrgd;
    this.Zs = paramZskh;
    this.Zr = paramZz1i;
    this.Zp = paramZtwv;
    this.Zl = paramZkl6;
    this.ZP = paramZsy;
    this.Zq = paramSupplier;
  }
  
  public Zkl6 ZE() {
    return this.Zl;
  }
  
  public Ze3n Zx() {
    return this.ZG;
  }
  
  public Zskh Zr() {
    return this.Zs;
  }
  
  public Zkq4 Zh() {
    return this.Zg;
  }
  
  public String ZG() {
    return this.Zq.get();
  }
  
  public Zz_9 Zv() {
    return this.Zz;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmsh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */