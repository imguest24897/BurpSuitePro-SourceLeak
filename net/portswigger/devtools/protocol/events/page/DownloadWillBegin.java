package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Deprecated
@Zsi("net.portswigger.devtools.protocol.events.page.DownloadWillBegin")
public class DownloadWillBegin implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "guid")
  public final String guid;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "suggestedFilename")
  public final String suggestedFilename;
  
  @Zox
  public DownloadWillBegin(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "guid") String paramString2, @Zc5(Ze = "url") String paramString3, @Zc5(Ze = "suggestedFilename") String paramString4) {
    this.frameId = paramString1;
    this.guid = paramString2;
    this.url = paramString3;
    this.suggestedFilename = paramString4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\DownloadWillBegin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */