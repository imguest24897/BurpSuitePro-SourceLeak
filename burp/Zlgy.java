package burp;

import java.util.regex.Pattern;

class Zlgy extends Zlge {
  private final Zlge ZO;
  
  private final Pattern Zx;
  
  private final Zlge Zk;
  
  public Zlgy(Zlge paramZlge1, String paramString, Zlge paramZlge2) {
    this.ZO = paramZlge1;
    this.Zx = Pattern.compile(paramString);
    this.Zk = paramZlge2;
  }
  
  public String Zs(Zzvx paramZzvx) {
    return Zkbi.Zv(this.ZO.Zs(paramZzvx), this.Zx, this.Zk.Zs(paramZzvx));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlgy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */