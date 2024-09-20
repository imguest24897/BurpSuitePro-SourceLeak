package net.portswigger.devtools.protocol.events.preload;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.preload.PreloadingAttemptSource;

@Zsi("net.portswigger.devtools.protocol.events.preload.PreloadingAttemptSourcesUpdated")
public class PreloadingAttemptSourcesUpdated implements Zl {
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "preloadingAttemptSources")
  public final List<PreloadingAttemptSource> preloadingAttemptSources;
  
  @Zox
  public PreloadingAttemptSourcesUpdated(@Zc5(Ze = "loaderId") String paramString, @Zc5(Ze = "preloadingAttemptSources") List<PreloadingAttemptSource> paramList) {
    this.loaderId = paramString;
    this.preloadingAttemptSources = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\preload\PreloadingAttemptSourcesUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */