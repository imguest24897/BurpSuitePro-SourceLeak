package burp;

import net.portswigger.Zm2;

public class Zzwu implements Zzxf {
  private final Zekl Zz;
  
  private final Zz28 ZV;
  
  public Zzwu(Zekl paramZekl, Zz28 paramZz28) {
    this.Zz = paramZekl;
    this.ZV = paramZz28;
  }
  
  public boolean ZE(Zlit paramZlit) {
    if (paramZlit == null)
      return false; 
    if (this.Zz.Zlc()) {
      Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_DISABLE_LOGGING_TO_HISTORY_AND_SITE_MAP);
      return false;
    } 
    return this.Zz.ZlI() ? this.ZV.ZG(paramZlit) : true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */