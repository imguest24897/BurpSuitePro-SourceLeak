package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.preload.PrefetchStatusUpdated;
import net.portswigger.devtools.protocol.events.preload.PreloadEnabledStateUpdated;
import net.portswigger.devtools.protocol.events.preload.PreloadingAttemptSourcesUpdated;
import net.portswigger.devtools.protocol.events.preload.PrerenderStatusUpdated;
import net.portswigger.devtools.protocol.events.preload.RuleSetRemoved;
import net.portswigger.devtools.protocol.events.preload.RuleSetUpdated;

@Zy
public interface Preload {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> disable();
  
  @Zb("ruleSetUpdated")
  Zs onRuleSetUpdated(Zp<RuleSetUpdated> paramZp) throws Zp;
  
  @Zb("ruleSetRemoved")
  Zs onRuleSetRemoved(Zp<RuleSetRemoved> paramZp) throws Zp;
  
  @Zb("preloadEnabledStateUpdated")
  Zs onPreloadEnabledStateUpdated(Zp<PreloadEnabledStateUpdated> paramZp) throws Zp;
  
  @Zb("prefetchStatusUpdated")
  Zs onPrefetchStatusUpdated(Zp<PrefetchStatusUpdated> paramZp) throws Zp;
  
  @Zb("prerenderStatusUpdated")
  Zs onPrerenderStatusUpdated(Zp<PrerenderStatusUpdated> paramZp) throws Zp;
  
  @Zb("preloadingAttemptSourcesUpdated")
  Zs onPreloadingAttemptSourcesUpdated(Zp<PreloadingAttemptSourcesUpdated> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Preload.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */