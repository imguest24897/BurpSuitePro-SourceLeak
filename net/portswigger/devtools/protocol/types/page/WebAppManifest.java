package net.portswigger.devtools.protocol.types.page;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.WebAppManifest")
public class WebAppManifest {
  @Zvd(Zp = "backgroundColor")
  @Zj
  public final String backgroundColor;
  
  @Zvd(Zp = "description")
  @Zj
  public final String description;
  
  @Zvd(Zp = "dir")
  @Zj
  public final String dir;
  
  @Zvd(Zp = "display")
  @Zj
  public final String display;
  
  @Zvd(Zp = "displayOverrides")
  @Zj
  public final List<String> displayOverrides;
  
  @Zvd(Zp = "fileHandlers")
  @Zj
  public final List<FileHandler> fileHandlers;
  
  @Zvd(Zp = "icons")
  @Zj
  public final List<ImageResource> icons;
  
  @Zvd(Zp = "id")
  @Zj
  public final String id;
  
  @Zvd(Zp = "lang")
  @Zj
  public final String lang;
  
  @Zvd(Zp = "launchHandler")
  @Zj
  public final LaunchHandler launchHandler;
  
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "orientation")
  @Zj
  public final String orientation;
  
  @Zvd(Zp = "preferRelatedApplications")
  @Zj
  public final Boolean preferRelatedApplications;
  
  @Zvd(Zp = "protocolHandlers")
  @Zj
  public final List<ProtocolHandler> protocolHandlers;
  
  @Zvd(Zp = "relatedApplications")
  @Zj
  public final List<RelatedApplication> relatedApplications;
  
  @Zvd(Zp = "scope")
  @Zj
  public final String scope;
  
  @Zvd(Zp = "scopeExtensions")
  @Zj
  public final List<ScopeExtension> scopeExtensions;
  
  @Zvd(Zp = "screenshots")
  @Zj
  public final List<Screenshot> screenshots;
  
  @Zvd(Zp = "shareTarget")
  @Zj
  public final ShareTarget shareTarget;
  
  @Zvd(Zp = "shortName")
  @Zj
  public final String shortName;
  
  @Zvd(Zp = "shortcuts")
  @Zj
  public final List<Shortcut> shortcuts;
  
  @Zvd(Zp = "startUrl")
  @Zj
  public final String startUrl;
  
  @Zvd(Zp = "themeColor")
  @Zj
  public final String themeColor;
  
  @Zox
  public WebAppManifest(@Zc5(Ze = "backgroundColor", ZS = "null") String paramString1, @Zc5(Ze = "description", ZS = "null") String paramString2, @Zc5(Ze = "dir", ZS = "null") String paramString3, @Zc5(Ze = "display", ZS = "null") String paramString4, @Zc5(Ze = "displayOverrides", ZS = "null") List<String> paramList, @Zc5(Ze = "fileHandlers", ZS = "null") List<FileHandler> paramList1, @Zc5(Ze = "icons", ZS = "null") List<ImageResource> paramList2, @Zc5(Ze = "id", ZS = "null") String paramString5, @Zc5(Ze = "lang", ZS = "null") String paramString6, @Zc5(Ze = "launchHandler", ZS = "null") LaunchHandler paramLaunchHandler, @Zc5(Ze = "name", ZS = "null") String paramString7, @Zc5(Ze = "orientation", ZS = "null") String paramString8, @Zc5(Ze = "preferRelatedApplications", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "protocolHandlers", ZS = "null") List<ProtocolHandler> paramList3, @Zc5(Ze = "relatedApplications", ZS = "null") List<RelatedApplication> paramList4, @Zc5(Ze = "scope", ZS = "null") String paramString9, @Zc5(Ze = "scopeExtensions", ZS = "null") List<ScopeExtension> paramList5, @Zc5(Ze = "screenshots", ZS = "null") List<Screenshot> paramList6, @Zc5(Ze = "shareTarget", ZS = "null") ShareTarget paramShareTarget, @Zc5(Ze = "shortName", ZS = "null") String paramString10, @Zc5(Ze = "shortcuts", ZS = "null") List<Shortcut> paramList7, @Zc5(Ze = "startUrl", ZS = "null") String paramString11, @Zc5(Ze = "themeColor", ZS = "null") String paramString12) {
    this.backgroundColor = paramString1;
    this.description = paramString2;
    this.dir = paramString3;
    this.display = paramString4;
    this.displayOverrides = paramList;
    this.fileHandlers = paramList1;
    this.icons = paramList2;
    this.id = paramString5;
    boolean bool = NavigationHistory.ZU();
    this.lang = paramString6;
    this.launchHandler = paramLaunchHandler;
    this.name = paramString7;
    this.orientation = paramString8;
    this.preferRelatedApplications = paramBoolean;
    this.protocolHandlers = paramList3;
    this.relatedApplications = paramList4;
    this.scope = paramString9;
    this.scopeExtensions = paramList5;
    this.screenshots = paramList6;
    this.shareTarget = paramShareTarget;
    this.shortName = paramString10;
    this.shortcuts = paramList7;
    this.startUrl = paramString11;
    this.themeColor = paramString12;
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\WebAppManifest.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */