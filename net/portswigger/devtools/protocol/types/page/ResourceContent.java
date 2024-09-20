package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.page.ResourceContent")
public class ResourceContent {
  @Zvd(Zp = "content")
  public final String content;
  
  @Zvd(Zp = "base64Encoded")
  public final Boolean base64Encoded;
  
  @Zox
  public ResourceContent(@Zc5(Ze = "content") String paramString, @Zc5(Ze = "base64Encoded") Boolean paramBoolean) {
    this.content = paramString;
    this.base64Encoded = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ResourceContent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */