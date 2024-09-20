package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.domsnapshot.CaptureSnapshot;
import net.portswigger.devtools.protocol.types.domsnapshot.Snapshot;

@Zy
public interface DOMSnapshot {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Deprecated
  CompletableFuture<Zf<Snapshot>> getSnapshot(@Zu("computedStyleWhitelist") List<String> paramList);
  
  @Deprecated
  CompletableFuture<Zf<Snapshot>> getSnapshot(@Zu("computedStyleWhitelist") List<String> paramList, @Zj @Zu("includeEventListeners") Boolean paramBoolean1, @Zj @Zu("includePaintOrder") Boolean paramBoolean2, @Zj @Zu("includeUserAgentShadowTree") Boolean paramBoolean3);
  
  CompletableFuture<Zf<CaptureSnapshot>> captureSnapshot(@Zu("computedStyles") List<String> paramList);
  
  CompletableFuture<Zf<CaptureSnapshot>> captureSnapshot(@Zu("computedStyles") List<String> paramList, @Zj @Zu("includePaintOrder") Boolean paramBoolean1, @Zj @Zu("includeDOMRects") Boolean paramBoolean2, @Zy @Zj @Zu("includeBlendedBackgroundColors") Boolean paramBoolean3, @Zy @Zj @Zu("includeTextColorOpacities") Boolean paramBoolean4);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\DOMSnapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */