package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;

@Zy
public interface EventBreakpoints {
  CompletableFuture<Zf<Void>> setInstrumentationBreakpoint(@Zu("eventName") String paramString);
  
  CompletableFuture<Zf<Void>> removeInstrumentationBreakpoint(@Zu("eventName") String paramString);
  
  CompletableFuture<Zf<Void>> disable();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\EventBreakpoints.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */