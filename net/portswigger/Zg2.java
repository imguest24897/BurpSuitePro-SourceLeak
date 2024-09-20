package net.portswigger;

import burp.Zbqc;

@Zsi("License")
public class Zg2 {
  @Zvd(Zp = "state")
  public final Zlo ZA;
  
  @Zvd(Zp = "type")
  public final String ZY;
  
  @Zvd(Zp = "number")
  public final String Zg;
  
  @Zvd(Zp = "caption")
  public final String Zm;
  
  @Zvd(Zp = "expires")
  public final String Zq;
  
  @Zvd(Zp = "agentCount")
  public final Integer Zh;
  
  @Zvd(Zp = "agentSubKey")
  public final String Zi;
  
  @Zvd(Zp = "agentExpires")
  public final String Ze;
  
  @Zvd(Zp = "activationMessage")
  public final String Zf;
  
  @Zvd(Zp = "keyCode")
  public final String Zp;
  
  @Zox
  public Zg2(@Zc5(Ze = "state") Zlo paramZlo, @Zc5(Ze = "type", ZS = "null") String paramString1, @Zc5(Ze = "number", ZS = "null") String paramString2, @Zc5(Ze = "caption", ZS = "null") String paramString3, @Zc5(Ze = "expires", ZS = "null") String paramString4, @Zc5(Ze = "agentCount", ZS = "null") Integer paramInteger, @Zc5(Ze = "agentSubKey", ZS = "null") String paramString5, @Zc5(Ze = "agentExpires", ZS = "null") String paramString6, @Zc5(Ze = "activationMessage", ZS = "null") String paramString7, @Zc5(Ze = "keyCode", ZS = "null") String paramString8) {
    this.ZA = paramZlo;
    this.ZY = paramString1;
    this.Zg = paramString2;
    this.Zm = paramString3;
    this.Zq = paramString4;
    this.Zh = paramInteger;
    this.Zi = paramString5;
    this.Ze = paramString6;
    int i = Zlo.ZC();
    this.Zf = paramString7;
    this.Zp = paramString8;
    if (Zbqc.Zwu() == null)
      Zlo.ZJ(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zg2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */