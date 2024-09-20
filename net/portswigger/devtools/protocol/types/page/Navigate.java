package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.page.Navigate")
public class Navigate {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "loaderId")
  @Zj
  public final String loaderId;
  
  @Zvd(Zp = "errorText")
  @Zj
  public final String errorText;
  
  @Zox
  public Navigate(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "loaderId", ZS = "null") String paramString2, @Zc5(Ze = "errorText", ZS = "null") String paramString3) {
    this.frameId = paramString1;
    this.loaderId = paramString2;
    this.errorText = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\Navigate.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */