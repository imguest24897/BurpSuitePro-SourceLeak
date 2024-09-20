package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.ImageResource")
public class ImageResource {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "sizes")
  @Zj
  public final String sizes;
  
  @Zvd(Zp = "type")
  @Zj
  public final String type;
  
  @Zox
  public ImageResource(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "sizes", ZS = "null") String paramString2, @Zc5(Ze = "type", ZS = "null") String paramString3) {
    this.url = paramString1;
    this.sizes = paramString2;
    this.type = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ImageResource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */