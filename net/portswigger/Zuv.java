package net.portswigger;

import burp.Zbqc;
import java.util.List;

@Zsi("Issue")
public class Zuv {
  @Zvd(Zp = "name", ZY = "Friendly name for the issue type. Subject to change so use index in preference")
  public final String ZO;
  
  @Zvd(Zp = "typeIndex")
  public final int Za;
  
  @Zvd(Zp = "serialNumber")
  public final long ZG;
  
  @Zvd(Zp = "origin")
  public final String Zo;
  
  @Zvd(Zp = "path")
  public final String Zr;
  
  @Zvd(Zp = "severity")
  public final Zl6 ZL;
  
  @Zvd(Zp = "confidence")
  public final Ztp ZV;
  
  @Zvd(Zp = "userOverriddenSeverity")
  public final Zl6 Zt;
  
  @Zvd(Zp = "userOverriddenConfidence")
  public final Ztp Zc;
  
  @Zvd(Zp = "description")
  public final String Zu;
  
  @Zvd(Zp = "remediation")
  public final String ZP;
  
  @Zvd(Zp = "issueBackground")
  public final String Zd;
  
  @Zvd(Zp = "remediationBackground")
  public final String ZK;
  
  @Zvd(Zp = "caption")
  public final String Zs;
  
  @Zvd(Zp = "evidence")
  public final List<Zl_> ZJ;
  
  @Zvd(Zp = "internalData")
  public final String Zn;
  
  @Zvd(Zp = "extensionName")
  public final String ZE;
  
  private static String[] Zw;
  
  @Zox
  public Zuv(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "typeIndex") int paramInt, @Zc5(Ze = "serialNumber") long paramLong, @Zc5(Ze = "origin") String paramString2, @Zc5(Ze = "path") String paramString3, @Zc5(Ze = "severity") Zl6 paramZl61, @Zc5(Ze = "confidence") Ztp paramZtp1, @Zc5(Ze = "userOverriddenSeverity", ZS = "null") Zl6 paramZl62, @Zc5(Ze = "userOverriddenConfidence", ZS = "null") Ztp paramZtp2, @Zc5(Ze = "description", ZS = "null") String paramString4, @Zc5(Ze = "remediation", ZS = "null") String paramString5, @Zc5(Ze = "issueBackground", ZS = "null") String paramString6, @Zc5(Ze = "remediationBackground", ZS = "null") String paramString7, @Zc5(Ze = "caption") String paramString8, @Zc5(Ze = "evidence") List<Zl_> paramList, @Zc5(Ze = "internalData") String paramString9, @Zc5(Ze = "extensionName", ZS = "null") String paramString10) {
    this.ZO = paramString1;
    this.Za = paramInt;
    this.ZG = paramLong;
    this.Zo = (Zmg.Zz(paramString2)).ZL;
    this.Zr = paramString3;
    this.ZL = paramZl61;
    this.ZV = paramZtp1;
    this.Zt = paramZl62;
    String[] arrayOfString = Za();
    this.Zc = paramZtp2;
    this.Zu = paramString4;
    this.ZP = paramString5;
    this.Zd = paramString6;
    this.ZK = paramString7;
    this.Zs = paramString8;
    this.ZJ = paramList;
    this.Zn = paramString9;
    this.ZE = paramString10;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public static void ZR(String[] paramArrayOfString) {
    Zw = paramArrayOfString;
  }
  
  public static String[] Za() {
    return Zw;
  }
  
  static {
    if (Za() != null)
      ZR(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zuv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */