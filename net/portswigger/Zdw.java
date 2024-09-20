package net.portswigger;

import burp.Zbqc;

@Zsi("ScanConfigurationResources")
public class Zdw {
  @Zvd(Zp = "uiScreen")
  public final String Zp;
  
  @Zvd(Zp = "configDefaults")
  public final String Zy;
  
  @Zvd(Zp = "configSchema")
  public final String Ze;
  
  private static String ZZ;
  
  @Zox
  public Zdw(@Zc5(Ze = "uiScreen") String paramString1, @Zc5(Ze = "configDefaults") String paramString2, @Zc5(Ze = "configSchema") String paramString3) {
    String str = ZS();
    this.Zp = paramString1;
    this.Zy = paramString2;
    this.Ze = paramString3;
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zs(String paramString) {
    ZZ = paramString;
  }
  
  public static String ZS() {
    return ZZ;
  }
  
  static {
    if (ZS() != null)
      Zs("zboL0b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zdw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */