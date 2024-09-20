package net.portswigger.devtools.protocol.types.page;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.page.Frame")
public class Frame {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "parentId")
  @Zj
  public final String parentId;
  
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "urlFragment")
  @Zy
  @Zj
  public final String urlFragment;
  
  @Zvd(Zp = "domainAndRegistry")
  @Zy
  public final String domainAndRegistry;
  
  @Zvd(Zp = "securityOrigin")
  public final String securityOrigin;
  
  @Zvd(Zp = "mimeType")
  public final String mimeType;
  
  @Zvd(Zp = "unreachableUrl")
  @Zy
  @Zj
  public final String unreachableUrl;
  
  @Zvd(Zp = "adFrameStatus")
  @Zy
  @Zj
  public final AdFrameStatus adFrameStatus;
  
  @Zvd(Zp = "secureContextType")
  @Zy
  public final SecureContextType secureContextType;
  
  @Zvd(Zp = "crossOriginIsolatedContextType")
  @Zy
  public final CrossOriginIsolatedContextType crossOriginIsolatedContextType;
  
  @Zvd(Zp = "gatedAPIFeatures")
  @Zy
  public final List<GatedAPIFeatures> gatedAPIFeatures;
  
  @Zox
  public Frame(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "parentId", ZS = "null") String paramString2, @Zc5(Ze = "loaderId") String paramString3, @Zc5(Ze = "name", ZS = "null") String paramString4, @Zc5(Ze = "url") String paramString5, @Zc5(Ze = "urlFragment", ZS = "null") String paramString6, @Zc5(Ze = "domainAndRegistry") String paramString7, @Zc5(Ze = "securityOrigin") String paramString8, @Zc5(Ze = "mimeType") String paramString9, @Zc5(Ze = "unreachableUrl", ZS = "null") String paramString10, @Zc5(Ze = "adFrameStatus", ZS = "null") AdFrameStatus paramAdFrameStatus, @Zc5(Ze = "secureContextType") SecureContextType paramSecureContextType, @Zc5(Ze = "crossOriginIsolatedContextType") CrossOriginIsolatedContextType paramCrossOriginIsolatedContextType, @Zc5(Ze = "gatedAPIFeatures") List<GatedAPIFeatures> paramList) {
    this.id = paramString1;
    this.parentId = paramString2;
    this.loaderId = paramString3;
    this.name = paramString4;
    this.url = paramString5;
    this.urlFragment = paramString6;
    this.domainAndRegistry = paramString7;
    this.securityOrigin = paramString8;
    this.mimeType = paramString9;
    boolean bool = NavigationHistory.ZL();
    this.unreachableUrl = paramString10;
    this.adFrameStatus = paramAdFrameStatus;
    this.secureContextType = paramSecureContextType;
    this.crossOriginIsolatedContextType = paramCrossOriginIsolatedContextType;
    this.gatedAPIFeatures = paramList;
    if (Zbqc.Zwu() == null)
      NavigationHistory.ZP(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\Frame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */