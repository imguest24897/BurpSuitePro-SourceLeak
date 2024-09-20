package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.ResourceType;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.FrameResource")
public class FrameResource {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "type")
  public final ResourceType type;
  
  @Zvd(Zp = "mimeType")
  public final String mimeType;
  
  @Zvd(Zp = "lastModified")
  @Zj
  public final Double lastModified;
  
  @Zvd(Zp = "contentSize")
  @Zj
  public final Double contentSize;
  
  @Zvd(Zp = "failed")
  @Zj
  public final Boolean failed;
  
  @Zvd(Zp = "canceled")
  @Zj
  public final Boolean canceled;
  
  @Zox
  public FrameResource(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "type") ResourceType paramResourceType, @Zc5(Ze = "mimeType") String paramString2, @Zc5(Ze = "lastModified", ZS = "null") Double paramDouble1, @Zc5(Ze = "contentSize", ZS = "null") Double paramDouble2, @Zc5(Ze = "failed", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "canceled", ZS = "null") Boolean paramBoolean2) {
    this.url = paramString1;
    this.type = paramResourceType;
    this.mimeType = paramString2;
    this.lastModified = paramDouble1;
    this.contentSize = paramDouble2;
    this.failed = paramBoolean1;
    this.canceled = paramBoolean2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FrameResource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */