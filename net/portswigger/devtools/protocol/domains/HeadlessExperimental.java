package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.headlessexperimental.BeginFrame;
import net.portswigger.devtools.protocol.types.headlessexperimental.ScreenshotParams;

@Zy
public interface HeadlessExperimental {
  CompletableFuture<Zf<BeginFrame>> beginFrame();
  
  CompletableFuture<Zf<BeginFrame>> beginFrame(@Zj @Zu("frameTimeTicks") Double paramDouble1, @Zj @Zu("interval") Double paramDouble2, @Zj @Zu("noDisplayUpdates") Boolean paramBoolean, @Zj @Zu("screenshot") ScreenshotParams paramScreenshotParams);
  
  @Deprecated
  CompletableFuture<Zf<Void>> disable();
  
  @Deprecated
  CompletableFuture<Zf<Void>> enable();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\HeadlessExperimental.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */