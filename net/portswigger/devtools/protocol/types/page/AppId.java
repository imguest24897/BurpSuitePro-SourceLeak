package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.page.AppId")
public class AppId {
  @Zvd(Zp = "appId")
  @Zj
  public final String appId;
  
  @Zvd(Zp = "recommendedId")
  @Zj
  public final String recommendedId;
  
  @Zox
  public AppId(@Zc5(Ze = "appId", ZS = "null") String paramString1, @Zc5(Ze = "recommendedId", ZS = "null") String paramString2) {
    this.appId = paramString1;
    this.recommendedId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\AppId.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */