package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.backgroundservice.BackgroundServiceEventReceived;
import net.portswigger.devtools.protocol.events.backgroundservice.RecordingStateChanged;
import net.portswigger.devtools.protocol.types.backgroundservice.ServiceName;

@Zy
public interface BackgroundService {
  CompletableFuture<Zf<Void>> startObserving(@Zu("service") ServiceName paramServiceName);
  
  CompletableFuture<Zf<Void>> stopObserving(@Zu("service") ServiceName paramServiceName);
  
  CompletableFuture<Zf<Void>> setRecording(@Zu("shouldRecord") Boolean paramBoolean, @Zu("service") ServiceName paramServiceName);
  
  CompletableFuture<Zf<Void>> clearEvents(@Zu("service") ServiceName paramServiceName);
  
  @Zb("recordingStateChanged")
  Zs onRecordingStateChanged(Zp<RecordingStateChanged> paramZp) throws Zp;
  
  @Zb("backgroundServiceEventReceived")
  Zs onBackgroundServiceEventReceived(Zp<BackgroundServiceEventReceived> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\BackgroundService.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */