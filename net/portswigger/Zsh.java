package net.portswigger;

import burp.Zbqc;

@Zsi("LicenseActivationRequest")
public class Zsh {
  @Zvd(Zp = "activationRequest")
  public final String Zc;
  
  @Zvd(Zp = "proxyHost")
  public final String ZK;
  
  @Zvd(Zp = "proxyPort")
  public final Integer Za;
  
  @Zvd(Zp = "proxyUsername")
  public final String Zl;
  
  @Zvd(Zp = "proxyPassword")
  public final String Zn;
  
  @Zvd(Zp = "version")
  public final String ZU;
  
  @Zox
  public Zsh(@Zc5(Ze = "activationRequest", ZS = "null") String paramString1, @Zc5(Ze = "proxyHost", ZS = "null") String paramString2, @Zc5(Ze = "proxyPort", ZS = "null") Integer paramInteger, @Zc5(Ze = "proxyUsername", ZS = "null") String paramString3, @Zc5(Ze = "proxyPassword", ZS = "null") String paramString4, @Zc5(Ze = "version", ZS = "null") String paramString5) {
    int i = Zlo.Zw();
    this.Zc = paramString1;
    this.ZK = "".equals(paramString2) ? null : paramString2;
    this.Za = (paramInteger == null || paramInteger.intValue() == 0) ? null : paramInteger;
    this.Zl = "".equals(paramString3) ? null : paramString3;
    this.Zn = "".equals(paramString4) ? null : paramString4;
    this.ZU = "".equals(paramString5) ? null : paramString5;
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */