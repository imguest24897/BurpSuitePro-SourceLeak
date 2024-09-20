package burp;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("SensitivityResponse")
public final class Zmie {
  @Zvd(Zp = "success")
  public final boolean Za;
  
  @Zvd(Zp = "classification")
  public final Zs78 ZH;
  
  @Zvd(Zp = "reasoning")
  public final String ZO;
  
  @Zvd(Zp = "durationInMillis")
  public final int ZB;
  
  private static String[] ZU;
  
  @Zox
  public Zmie(@Zc5(Ze = "success") boolean paramBoolean, @Zc5(Ze = "classification") Zs78 paramZs78, @Zc5(Ze = "reasoning") String paramString, @Zc5(Ze = "durationInMillis") int paramInt) {
    this.Za = paramBoolean;
    this.ZH = paramZs78;
    this.ZO = paramString;
    String[] arrayOfString = Ze();
    this.ZB = paramInt;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Zq(String[] paramArrayOfString) {
    ZU = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return ZU;
  }
  
  static {
    if (Ze() != null)
      Zq(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */