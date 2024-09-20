package burp;

import java.util.Arrays;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zsyi {
  private final Zt9y Za;
  
  private final Ze45 Zn;
  
  private final String Zj;
  
  private final boolean ZJ;
  
  private Zsyi(Zt9y paramZt9y, Ze45 paramZe45, String paramString, boolean paramBoolean) {
    this.Za = paramZt9y;
    this.Zn = paramZe45;
    this.Zj = paramString;
    this.ZJ = paramBoolean;
  }
  
  static Zsyi ZF() {
    return new Zsyi(Zt9y.RETAIN_CONFIGURED_KEEP_ALIVE, Ze45.ATTEMPT_HTTP2, null, true);
  }
  
  Zsyi ZG(Zt9y paramZt9y) {
    if (paramZt9y.ZR)
      Zuh.Zb((this.Zj == null), Zqf.Zr); 
    return new Zsyi(paramZt9y, this.Zn, this.Zj, this.ZJ);
  }
  
  Zsyi ZK(Ze45 paramZe45) {
    return new Zsyi(this.Za, paramZe45, this.Zj, this.ZJ);
  }
  
  Zsyi ZK(String paramString, boolean paramBoolean) {
    Zuh.Zb(!this.Za.ZR, Zqf.Zr);
    return new Zsyi(this.Za, this.Zn, paramString, paramBoolean);
  }
  
  List<Zrec> ZC() {
    return Arrays.asList(new Zrec[] { this.Za.Zv, new Zt8f(this.Zn) });
  }
  
  boolean Zd() {
    return this.Za.ZR;
  }
  
  Ze45 Zs() {
    return this.Zn;
  }
  
  String Zg() {
    return this.Zj;
  }
  
  boolean Zr() {
    return this.ZJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */