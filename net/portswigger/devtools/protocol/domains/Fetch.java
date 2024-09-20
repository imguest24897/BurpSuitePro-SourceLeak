package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zij;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.fetch.AuthRequired;
import net.portswigger.devtools.protocol.events.fetch.RequestPaused;
import net.portswigger.devtools.protocol.types.fetch.AuthChallengeResponse;
import net.portswigger.devtools.protocol.types.fetch.HeaderEntry;
import net.portswigger.devtools.protocol.types.fetch.RequestPattern;
import net.portswigger.devtools.protocol.types.fetch.ResponseBody;
import net.portswigger.devtools.protocol.types.network.ErrorReason;

public interface Fetch {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zj @Zu("patterns") List<RequestPattern> paramList, @Zj @Zu("handleAuthRequests") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> failRequest(@Zu("requestId") String paramString, @Zu("errorReason") ErrorReason paramErrorReason);
  
  CompletableFuture<Zf<Void>> fulfillRequest(@Zu("requestId") String paramString, @Zu("responseCode") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> fulfillRequest(@Zu("requestId") String paramString1, @Zu("responseCode") Integer paramInteger, @Zj @Zu("responseHeaders") List<HeaderEntry> paramList, @Zj @Zu("binaryResponseHeaders") String paramString2, @Zj @Zu("body") Zij paramZij, @Zj @Zu("responsePhrase") String paramString3);
  
  CompletableFuture<Zf<Void>> continueRequest(@Zu("requestId") String paramString);
  
  CompletableFuture<Zf<Void>> continueRequest(@Zu("requestId") String paramString1, @Zj @Zu("url") String paramString2, @Zj @Zu("method") String paramString3, @Zj @Zu("postData") String paramString4, @Zj @Zu("headers") List<HeaderEntry> paramList, @Zy @Zj @Zu("interceptResponse") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> continueWithAuth(@Zu("requestId") String paramString, @Zu("authChallengeResponse") AuthChallengeResponse paramAuthChallengeResponse);
  
  @Zy
  CompletableFuture<Zf<Void>> continueResponse(@Zu("requestId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> continueResponse(@Zu("requestId") String paramString1, @Zj @Zu("responseCode") Integer paramInteger, @Zj @Zu("responsePhrase") String paramString2, @Zj @Zu("responseHeaders") List<HeaderEntry> paramList, @Zj @Zu("binaryResponseHeaders") String paramString3);
  
  CompletableFuture<Zf<ResponseBody>> getResponseBody(@Zu("requestId") String paramString);
  
  @Zr("stream")
  CompletableFuture<Zf<String>> takeResponseBodyAsStream(@Zu("requestId") String paramString);
  
  @Zb("requestPaused")
  Zs onRequestPaused(Zp<RequestPaused> paramZp) throws Zp;
  
  @Zb("authRequired")
  Zs onAuthRequired(Zp<AuthRequired> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Fetch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */