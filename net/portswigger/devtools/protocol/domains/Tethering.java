package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.tethering.Accepted;

@Zy
public interface Tethering {
  CompletableFuture<Zf<Void>> bind(@Zu("port") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> unbind(@Zu("port") Integer paramInteger);
  
  @Zb("accepted")
  Zs onAccepted(Zp<Accepted> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Tethering.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */