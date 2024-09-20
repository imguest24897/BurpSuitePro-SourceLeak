package net.portswigger.devtools.protocol.events.preload;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.preload.PreloadingAttemptKey;
import net.portswigger.devtools.protocol.types.preload.PreloadingStatus;
import net.portswigger.devtools.protocol.types.preload.PrerenderFinalStatus;
import net.portswigger.devtools.protocol.types.preload.PrerenderMismatchedHeaders;

@Zsi("net.portswigger.devtools.protocol.events.preload.PrerenderStatusUpdated")
public class PrerenderStatusUpdated implements Zl {
  @Zvd(Zp = "key")
  public final PreloadingAttemptKey key;
  
  @Zvd(Zp = "status")
  public final PreloadingStatus status;
  
  @Zvd(Zp = "prerenderStatus")
  @Zj
  public final PrerenderFinalStatus prerenderStatus;
  
  @Zvd(Zp = "disallowedMojoInterface")
  @Zj
  public final String disallowedMojoInterface;
  
  @Zvd(Zp = "mismatchedHeaders")
  @Zj
  public final List<PrerenderMismatchedHeaders> mismatchedHeaders;
  
  @Zox
  public PrerenderStatusUpdated(@Zc5(Ze = "key") PreloadingAttemptKey paramPreloadingAttemptKey, @Zc5(Ze = "status") PreloadingStatus paramPreloadingStatus, @Zc5(Ze = "prerenderStatus", ZS = "null") PrerenderFinalStatus paramPrerenderFinalStatus, @Zc5(Ze = "disallowedMojoInterface", ZS = "null") String paramString, @Zc5(Ze = "mismatchedHeaders", ZS = "null") List<PrerenderMismatchedHeaders> paramList) {
    this.key = paramPreloadingAttemptKey;
    this.status = paramPreloadingStatus;
    this.prerenderStatus = paramPrerenderFinalStatus;
    this.disallowedMojoInterface = paramString;
    this.mismatchedHeaders = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\preload\PrerenderStatusUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */