package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.systeminfo.Info;
import net.portswigger.devtools.protocol.types.systeminfo.ProcessInfo;

@Zy
public interface SystemInfo {
  CompletableFuture<Zf<Info>> getInfo();
  
  @Zr("featureEnabled")
  CompletableFuture<Zf<Boolean>> getFeatureState(@Zu("featureState") String paramString);
  
  @Zr("processInfo")
  CompletableFuture<Zf<List<ProcessInfo>>> getProcessInfo();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\SystemInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */