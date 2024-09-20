package net.portswigger.devtools.protocol.events.preload;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.preload.PrefetchStatus;
import net.portswigger.devtools.protocol.types.preload.PreloadingAttemptKey;
import net.portswigger.devtools.protocol.types.preload.PreloadingStatus;

@Zsi("net.portswigger.devtools.protocol.events.preload.PrefetchStatusUpdated")
public class PrefetchStatusUpdated implements Zl {
  @Zvd(Zp = "key")
  public final PreloadingAttemptKey key;
  
  @Zvd(Zp = "initiatingFrameId")
  public final String initiatingFrameId;
  
  @Zvd(Zp = "prefetchUrl")
  public final String prefetchUrl;
  
  @Zvd(Zp = "status")
  public final PreloadingStatus status;
  
  @Zvd(Zp = "prefetchStatus")
  public final PrefetchStatus prefetchStatus;
  
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zox
  public PrefetchStatusUpdated(@Zc5(Ze = "key") PreloadingAttemptKey paramPreloadingAttemptKey, @Zc5(Ze = "initiatingFrameId") String paramString1, @Zc5(Ze = "prefetchUrl") String paramString2, @Zc5(Ze = "status") PreloadingStatus paramPreloadingStatus, @Zc5(Ze = "prefetchStatus") PrefetchStatus paramPrefetchStatus, @Zc5(Ze = "requestId") String paramString3) {
    this.key = paramPreloadingAttemptKey;
    int[] arrayOfInt = RuleSetUpdated.Zl();
    this.initiatingFrameId = paramString1;
    this.prefetchUrl = paramString2;
    this.status = paramPreloadingStatus;
    this.prefetchStatus = paramPrefetchStatus;
    this.requestId = paramString3;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\preload\PrefetchStatusUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */