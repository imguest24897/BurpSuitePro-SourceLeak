package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.console.MessageAdded;

@Deprecated
public interface Console {
  CompletableFuture<Zf<Void>> clearMessages();
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zb("messageAdded")
  Zs onMessageAdded(Zp<MessageAdded> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Console.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */