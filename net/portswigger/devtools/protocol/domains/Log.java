package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.events.log.EntryAdded;
import net.portswigger.devtools.protocol.types.log.ViolationSetting;

public interface Log {
  CompletableFuture<Zf<Void>> clear();
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> startViolationsReport(@Zu("config") List<ViolationSetting> paramList);
  
  CompletableFuture<Zf<Void>> stopViolationsReport();
  
  @Zb("entryAdded")
  Zs onEntryAdded(Zp<EntryAdded> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Log.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */