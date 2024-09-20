package burp;

import java.util.regex.Pattern;

class Zb9z extends Zbiy {
  private final Zbiy Zz;
  
  private final Pattern Zs;
  
  private final Zbiy ZO;
  
  public Zb9z(Zbiy paramZbiy1, String paramString, Zbiy paramZbiy2) {
    this.Zz = paramZbiy1;
    this.Zs = Pattern.compile(paramString);
    this.ZO = paramZbiy2;
  }
  
  public String Zq(Zzvx paramZzvx) {
    return Zlsd.ZH(this.Zz.Zq(paramZzvx), this.Zs, this.ZO.Zq(paramZzvx));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */