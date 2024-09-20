package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.types.io.Read;

public interface IO {
  CompletableFuture<Zf<Void>> close(@Zu("handle") String paramString);
  
  CompletableFuture<Zf<Read>> read(@Zu("handle") String paramString);
  
  CompletableFuture<Zf<Read>> read(@Zu("handle") String paramString, @Zj @Zu("offset") Integer paramInteger1, @Zj @Zu("size") Integer paramInteger2);
  
  @Zr("uuid")
  CompletableFuture<Zf<String>> resolveBlob(@Zu("objectId") String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\IO.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */