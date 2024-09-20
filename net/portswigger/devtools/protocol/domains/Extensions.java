package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;

@Zy
public interface Extensions {
  @Zr("id")
  CompletableFuture<Zf<String>> loadUnpacked(@Zu("path") String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Extensions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */