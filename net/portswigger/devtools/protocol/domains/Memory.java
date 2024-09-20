package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.memory.DOMCounters;
import net.portswigger.devtools.protocol.types.memory.PressureLevel;
import net.portswigger.devtools.protocol.types.memory.SamplingProfile;

@Zy
public interface Memory {
  CompletableFuture<Zf<DOMCounters>> getDOMCounters();
  
  CompletableFuture<Zf<Void>> prepareForLeakDetection();
  
  CompletableFuture<Zf<Void>> forciblyPurgeJavaScriptMemory();
  
  CompletableFuture<Zf<Void>> setPressureNotificationsSuppressed(@Zu("suppressed") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> simulatePressureNotification(@Zu("level") PressureLevel paramPressureLevel);
  
  CompletableFuture<Zf<Void>> startSampling();
  
  CompletableFuture<Zf<Void>> startSampling(@Zj @Zu("samplingInterval") Integer paramInteger, @Zj @Zu("suppressRandomness") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> stopSampling();
  
  @Zr("profile")
  CompletableFuture<Zf<SamplingProfile>> getAllTimeSamplingProfile();
  
  @Zr("profile")
  CompletableFuture<Zf<SamplingProfile>> getBrowserSamplingProfile();
  
  @Zr("profile")
  CompletableFuture<Zf<SamplingProfile>> getSamplingProfile();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Memory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */