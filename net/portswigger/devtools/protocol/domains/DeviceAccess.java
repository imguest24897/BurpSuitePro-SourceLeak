package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.deviceaccess.DeviceRequestPrompted;

@Zy
public interface DeviceAccess {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> selectPrompt(@Zu("id") String paramString1, @Zu("deviceId") String paramString2);
  
  CompletableFuture<Zf<Void>> cancelPrompt(@Zu("id") String paramString);
  
  @Zb("deviceRequestPrompted")
  Zs onDeviceRequestPrompted(Zp<DeviceRequestPrompted> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\DeviceAccess.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */