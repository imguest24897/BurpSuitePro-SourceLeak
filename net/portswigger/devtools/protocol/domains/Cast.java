package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.cast.IssueUpdated;
import net.portswigger.devtools.protocol.events.cast.SinksUpdated;

@Zy
public interface Cast {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zj @Zu("presentationUrl") String paramString);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> setSinkToUse(@Zu("sinkName") String paramString);
  
  CompletableFuture<Zf<Void>> startDesktopMirroring(@Zu("sinkName") String paramString);
  
  CompletableFuture<Zf<Void>> startTabMirroring(@Zu("sinkName") String paramString);
  
  CompletableFuture<Zf<Void>> stopCasting(@Zu("sinkName") String paramString);
  
  @Zb("sinksUpdated")
  Zs onSinksUpdated(Zp<SinksUpdated> paramZp) throws Zp;
  
  @Zb("issueUpdated")
  Zs onIssueUpdated(Zp<IssueUpdated> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Cast.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */