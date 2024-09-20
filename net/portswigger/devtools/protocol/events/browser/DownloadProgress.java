package net.portswigger.devtools.protocol.events.browser;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.browser.DownloadProgress")
public class DownloadProgress implements Zl {
  @Zvd(Zp = "guid")
  public final String guid;
  
  @Zvd(Zp = "totalBytes")
  public final Double totalBytes;
  
  @Zvd(Zp = "receivedBytes")
  public final Double receivedBytes;
  
  @Zvd(Zp = "state")
  public final DownloadProgressState state;
  
  @Zox
  public DownloadProgress(@Zc5(Ze = "guid") String paramString, @Zc5(Ze = "totalBytes") Double paramDouble1, @Zc5(Ze = "receivedBytes") Double paramDouble2, @Zc5(Ze = "state") DownloadProgressState paramDownloadProgressState) {
    this.guid = paramString;
    this.totalBytes = paramDouble1;
    Zbqc[] arrayOfZbqc = DownloadProgressState.ZG();
    this.receivedBytes = paramDouble2;
    this.state = paramDownloadProgressState;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\browser\DownloadProgress.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */