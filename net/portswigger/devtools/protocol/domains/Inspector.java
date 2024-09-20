package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.inspector.Detached;
import net.portswigger.devtools.protocol.events.inspector.TargetCrashed;
import net.portswigger.devtools.protocol.events.inspector.TargetReloadedAfterCrash;

@Zy
public interface Inspector {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zb("detached")
  Zs onDetached(Zp<Detached> paramZp) throws Zp;
  
  @Zb("targetCrashed")
  Zs onTargetCrashed(Zp<TargetCrashed> paramZp) throws Zp;
  
  @Zb("targetReloadedAfterCrash")
  Zs onTargetReloadedAfterCrash(Zp<TargetReloadedAfterCrash> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Inspector.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */