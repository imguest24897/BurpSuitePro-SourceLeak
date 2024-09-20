package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.audits.IssueAdded;
import net.portswigger.devtools.protocol.types.audits.EncodedResponse;
import net.portswigger.devtools.protocol.types.audits.GenericIssueDetails;
import net.portswigger.devtools.protocol.types.audits.GetEncodedResponseEncoding;

@Zy
public interface Audits {
  CompletableFuture<Zf<EncodedResponse>> getEncodedResponse(@Zu("requestId") String paramString, @Zu("encoding") GetEncodedResponseEncoding paramGetEncodedResponseEncoding);
  
  CompletableFuture<Zf<EncodedResponse>> getEncodedResponse(@Zu("requestId") String paramString, @Zu("encoding") GetEncodedResponseEncoding paramGetEncodedResponseEncoding, @Zj @Zu("quality") Double paramDouble, @Zj @Zu("sizeOnly") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> checkContrast();
  
  CompletableFuture<Zf<Void>> checkContrast(@Zj @Zu("reportAAA") Boolean paramBoolean);
  
  @Zr("formIssues")
  CompletableFuture<Zf<List<GenericIssueDetails>>> checkFormsIssues();
  
  @Zb("issueAdded")
  Zs onIssueAdded(Zp<IssueAdded> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Audits.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */