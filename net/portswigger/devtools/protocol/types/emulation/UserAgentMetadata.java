package net.portswigger.devtools.protocol.types.emulation;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.UserAgentMetadata")
public class UserAgentMetadata {
  @Zvd(Zp = "brands")
  @Zj
  public final List<UserAgentBrandVersion> brands;
  
  @Zvd(Zp = "fullVersionList")
  @Zj
  public final List<UserAgentBrandVersion> fullVersionList;
  
  @Zvd(Zp = "fullVersion")
  @Deprecated
  @Zj
  public final String fullVersion;
  
  @Zvd(Zp = "platform")
  public final String platform;
  
  @Zvd(Zp = "platformVersion")
  public final String platformVersion;
  
  @Zvd(Zp = "architecture")
  public final String architecture;
  
  @Zvd(Zp = "model")
  public final String model;
  
  @Zvd(Zp = "mobile")
  public final Boolean mobile;
  
  @Zvd(Zp = "bitness")
  @Zj
  public final String bitness;
  
  @Zvd(Zp = "wow64")
  @Zj
  public final Boolean wow64;
  
  @Zox
  public UserAgentMetadata(@Zc5(Ze = "brands", ZS = "null") List<UserAgentBrandVersion> paramList1, @Zc5(Ze = "fullVersionList", ZS = "null") List<UserAgentBrandVersion> paramList2, @Zc5(Ze = "fullVersion", ZS = "null") String paramString1, @Zc5(Ze = "platform") String paramString2, @Zc5(Ze = "platformVersion") String paramString3, @Zc5(Ze = "architecture") String paramString4, @Zc5(Ze = "model") String paramString5, @Zc5(Ze = "mobile") Boolean paramBoolean1, @Zc5(Ze = "bitness", ZS = "null") String paramString6, @Zc5(Ze = "wow64", ZS = "null") Boolean paramBoolean2) {
    this.brands = paramList1;
    String[] arrayOfString = VirtualTimePolicy.Zr();
    this.fullVersionList = paramList2;
    this.fullVersion = paramString1;
    this.platform = paramString2;
    this.platformVersion = paramString3;
    this.architecture = paramString4;
    this.model = paramString5;
    this.mobile = paramBoolean1;
    this.bitness = paramString6;
    this.wow64 = paramBoolean2;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\UserAgentMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */