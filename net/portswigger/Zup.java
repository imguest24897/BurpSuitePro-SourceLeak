package net.portswigger;

import burp.Zbqc;
import java.util.List;

@Zsi("UpdateServiceResponse")
public class Zup {
  @Zvd(Zp = "result")
  public final Za8 ZS;
  
  @Zvd(Zp = "licenseId")
  public final String Zy;
  
  @Zvd(Zp = "manualDownloadUrl")
  public final String Zd;
  
  @Zvd(Zp = "autoDownloadUrl")
  public final String Zv;
  
  @Zvd(Zp = "updates")
  public final List<Zfc> ZU;
  
  @Zvd(Zp = "allowedChannels")
  public final List<Zrmt> ZR;
  
  @Zvd(Zp = "currentBuildChannel")
  public final Zrmt Zj;
  
  @Zvd(Zp = "updatedLicenseKey")
  public final String Zo;
  
  @Zvd(Zp = "questionnaire")
  public final Zq5 Zs;
  
  @Zox
  public Zup(@Zc5(Ze = "result") Za8 paramZa8, @Zc5(Ze = "licenseId") String paramString1, @Zc5(Ze = "manualDownloadUrl") String paramString2, @Zc5(Ze = "autoDownloadUrl") String paramString3, @Zc5(Ze = "updates") List<Zfc> paramList, @Zc5(Ze = "allowedChannels") List<Zrmt> paramList1, @Zc5(Ze = "currentBuildChannel") Zrmt paramZrmt, @Zc5(Ze = "updatedLicenseKey") String paramString4, @Zc5(Ze = "questionnaire") Zq5 paramZq5) {
    this.ZS = paramZa8;
    this.Zy = paramString1;
    this.Zd = paramString2;
    this.Zv = paramString3;
    this.ZU = paramList;
    this.ZR = paramList1;
    String str = Zs1.ZW();
    this.Zj = paramZrmt;
    this.Zo = paramString4;
    this.Zs = paramZq5;
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zup.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */