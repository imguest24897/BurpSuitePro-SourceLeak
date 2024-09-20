package net.portswigger.browser;

import java.awt.image.BufferedImage;
import net.portswigger.Zkb;
import net.portswigger.Zoq;
import net.portswigger.Zzc;

public class Zcv {
  private final String ZP;
  
  private final Zoq<BufferedImage> ZV;
  
  public Zcv(String paramString) {
    this.ZP = paramString;
    this.ZV = Zoq.ZZ(paramString::lambda$new$0);
  }
  
  public String ZU() {
    return this.ZP;
  }
  
  public BufferedImage Zg() {
    return (BufferedImage)this.ZV.Zz();
  }
  
  private static BufferedImage lambda$new$0(String paramString) {
    return Zjg.Zb().Z_(Zkb.Zy(Zzc.Zt(paramString)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */