package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;

@Zy
public interface DeviceOrientation {
  CompletableFuture<Zf<Void>> clearDeviceOrientationOverride();
  
  CompletableFuture<Zf<Void>> setDeviceOrientationOverride(@Zu("alpha") Double paramDouble1, @Zu("beta") Double paramDouble2, @Zu("gamma") Double paramDouble3);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\DeviceOrientation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */