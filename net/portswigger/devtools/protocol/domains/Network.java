package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zi7;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.network.DataReceived;
import net.portswigger.devtools.protocol.events.network.EventSourceMessageReceived;
import net.portswigger.devtools.protocol.events.network.LoadingFailed;
import net.portswigger.devtools.protocol.events.network.LoadingFinished;
import net.portswigger.devtools.protocol.events.network.PolicyUpdated;
import net.portswigger.devtools.protocol.events.network.ReportingApiEndpointsChangedForOrigin;
import net.portswigger.devtools.protocol.events.network.ReportingApiReportAdded;
import net.portswigger.devtools.protocol.events.network.ReportingApiReportUpdated;
import net.portswigger.devtools.protocol.events.network.RequestIntercepted;
import net.portswigger.devtools.protocol.events.network.RequestServedFromCache;
import net.portswigger.devtools.protocol.events.network.RequestWillBeSent;
import net.portswigger.devtools.protocol.events.network.RequestWillBeSentExtraInfo;
import net.portswigger.devtools.protocol.events.network.ResourceChangedPriority;
import net.portswigger.devtools.protocol.events.network.ResponseReceived;
import net.portswigger.devtools.protocol.events.network.ResponseReceivedEarlyHints;
import net.portswigger.devtools.protocol.events.network.ResponseReceivedExtraInfo;
import net.portswigger.devtools.protocol.events.network.SignedExchangeReceived;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleInnerResponseError;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleInnerResponseParsed;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleMetadataError;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleMetadataReceived;
import net.portswigger.devtools.protocol.events.network.TrustTokenOperationDone;
import net.portswigger.devtools.protocol.events.network.WebSocketClosed;
import net.portswigger.devtools.protocol.events.network.WebSocketCreated;
import net.portswigger.devtools.protocol.events.network.WebSocketFrameError;
import net.portswigger.devtools.protocol.events.network.WebSocketFrameReceived;
import net.portswigger.devtools.protocol.events.network.WebSocketFrameSent;
import net.portswigger.devtools.protocol.events.network.WebSocketHandshakeResponseReceived;
import net.portswigger.devtools.protocol.events.network.WebSocketWillSendHandshakeRequest;
import net.portswigger.devtools.protocol.events.network.WebTransportClosed;
import net.portswigger.devtools.protocol.events.network.WebTransportConnectionEstablished;
import net.portswigger.devtools.protocol.events.network.WebTransportCreated;
import net.portswigger.devtools.protocol.types.debugger.SearchMatch;
import net.portswigger.devtools.protocol.types.network.AuthChallengeResponse;
import net.portswigger.devtools.protocol.types.network.ConnectionType;
import net.portswigger.devtools.protocol.types.network.ContentEncoding;
import net.portswigger.devtools.protocol.types.network.Cookie;
import net.portswigger.devtools.protocol.types.network.CookieParam;
import net.portswigger.devtools.protocol.types.network.CookiePartitionKey;
import net.portswigger.devtools.protocol.types.network.CookiePriority;
import net.portswigger.devtools.protocol.types.network.CookieSameSite;
import net.portswigger.devtools.protocol.types.network.CookieSourceScheme;
import net.portswigger.devtools.protocol.types.network.ErrorReason;
import net.portswigger.devtools.protocol.types.network.LoadNetworkResourceOptions;
import net.portswigger.devtools.protocol.types.network.LoadNetworkResourcePageResult;
import net.portswigger.devtools.protocol.types.network.RequestPattern;
import net.portswigger.devtools.protocol.types.network.ResponseBody;
import net.portswigger.devtools.protocol.types.network.ResponseBodyForInterception;
import net.portswigger.devtools.protocol.types.network.SecurityIsolationStatus;

public interface Network {
  @Zy
  CompletableFuture<Zf<Void>> setAcceptedEncodings(@Zu("encodings") List<ContentEncoding> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> clearAcceptedEncodingsOverride();
  
  @Deprecated
  @Zr("result")
  CompletableFuture<Zf<Boolean>> canClearBrowserCache();
  
  @Deprecated
  @Zr("result")
  CompletableFuture<Zf<Boolean>> canClearBrowserCookies();
  
  @Deprecated
  @Zr("result")
  CompletableFuture<Zf<Boolean>> canEmulateNetworkConditions();
  
  CompletableFuture<Zf<Void>> clearBrowserCache();
  
  CompletableFuture<Zf<Void>> clearBrowserCookies();
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> continueInterceptedRequest(@Zu("interceptionId") String paramString);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> continueInterceptedRequest(@Zu("interceptionId") String paramString1, @Zj @Zu("errorReason") ErrorReason paramErrorReason, @Zj @Zu("rawResponse") String paramString2, @Zj @Zu("url") String paramString3, @Zj @Zu("method") String paramString4, @Zj @Zu("postData") String paramString5, @Zj @Zu("headers") Map<String, Zi7> paramMap, @Zj @Zu("authChallengeResponse") AuthChallengeResponse paramAuthChallengeResponse);
  
  CompletableFuture<Zf<Void>> deleteCookies(@Zu("name") String paramString);
  
  CompletableFuture<Zf<Void>> deleteCookies(@Zu("name") String paramString1, @Zj @Zu("url") String paramString2, @Zj @Zu("domain") String paramString3, @Zj @Zu("path") String paramString4, @Zy @Zj @Zu("partitionKey") CookiePartitionKey paramCookiePartitionKey);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> emulateNetworkConditions(@Zu("offline") Boolean paramBoolean, @Zu("latency") Double paramDouble1, @Zu("downloadThroughput") Double paramDouble2, @Zu("uploadThroughput") Double paramDouble3);
  
  CompletableFuture<Zf<Void>> emulateNetworkConditions(@Zu("offline") Boolean paramBoolean1, @Zu("latency") Double paramDouble1, @Zu("downloadThroughput") Double paramDouble2, @Zu("uploadThroughput") Double paramDouble3, @Zj @Zu("connectionType") ConnectionType paramConnectionType, @Zy @Zj @Zu("packetLoss") Double paramDouble4, @Zy @Zj @Zu("packetQueueLength") Integer paramInteger, @Zy @Zj @Zu("packetReordering") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zy @Zj @Zu("maxTotalBufferSize") Integer paramInteger1, @Zy @Zj @Zu("maxResourceBufferSize") Integer paramInteger2, @Zj @Zu("maxPostDataSize") Integer paramInteger3);
  
  @Deprecated
  @Zr("cookies")
  CompletableFuture<Zf<List<Cookie>>> getAllCookies();
  
  @Zy
  @Zr("tableNames")
  CompletableFuture<Zf<List<String>>> getCertificate(@Zu("origin") String paramString);
  
  @Zr("cookies")
  CompletableFuture<Zf<List<Cookie>>> getCookies();
  
  @Zr("cookies")
  CompletableFuture<Zf<List<Cookie>>> getCookies(@Zj @Zu("urls") List<String> paramList);
  
  CompletableFuture<Zf<ResponseBody>> getResponseBody(@Zu("requestId") String paramString);
  
  @Zr("postData")
  CompletableFuture<Zf<String>> getRequestPostData(@Zu("requestId") String paramString);
  
  @Zy
  CompletableFuture<Zf<ResponseBodyForInterception>> getResponseBodyForInterception(@Zu("interceptionId") String paramString);
  
  @Zy
  @Zr("stream")
  CompletableFuture<Zf<String>> takeResponseBodyForInterceptionAsStream(@Zu("interceptionId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> replayXHR(@Zu("requestId") String paramString);
  
  @Zy
  @Zr("result")
  CompletableFuture<Zf<List<SearchMatch>>> searchInResponseBody(@Zu("requestId") String paramString1, @Zu("query") String paramString2);
  
  @Zy
  @Zr("result")
  CompletableFuture<Zf<List<SearchMatch>>> searchInResponseBody(@Zu("requestId") String paramString1, @Zu("query") String paramString2, @Zj @Zu("caseSensitive") Boolean paramBoolean1, @Zj @Zu("isRegex") Boolean paramBoolean2);
  
  @Zy
  CompletableFuture<Zf<Void>> setBlockedURLs(@Zu("urls") List<String> paramList);
  
  CompletableFuture<Zf<Void>> setBypassServiceWorker(@Zu("bypass") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setCacheDisabled(@Zu("cacheDisabled") Boolean paramBoolean);
  
  @Zr("success")
  CompletableFuture<Zf<Boolean>> setCookie(@Zu("name") String paramString1, @Zu("value") String paramString2);
  
  @Zr("success")
  CompletableFuture<Zf<Boolean>> setCookie(@Zu("name") String paramString1, @Zu("value") String paramString2, @Zj @Zu("url") String paramString3, @Zj @Zu("domain") String paramString4, @Zj @Zu("path") String paramString5, @Zj @Zu("secure") Boolean paramBoolean1, @Zj @Zu("httpOnly") Boolean paramBoolean2, @Zj @Zu("sameSite") CookieSameSite paramCookieSameSite, @Zj @Zu("expires") Double paramDouble, @Zy @Zj @Zu("priority") CookiePriority paramCookiePriority, @Zy @Zj @Zu("sameParty") Boolean paramBoolean3, @Zy @Zj @Zu("sourceScheme") CookieSourceScheme paramCookieSourceScheme, @Zy @Zj @Zu("sourcePort") Integer paramInteger, @Zy @Zj @Zu("partitionKey") CookiePartitionKey paramCookiePartitionKey);
  
  CompletableFuture<Zf<Void>> setCookies(@Zu("cookies") List<CookieParam> paramList);
  
  CompletableFuture<Zf<Void>> setExtraHTTPHeaders(@Zu("headers") Map<String, Zi7> paramMap);
  
  @Zy
  CompletableFuture<Zf<Void>> setAttachDebugStack(@Zu("enabled") Boolean paramBoolean);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> setRequestInterception(@Zu("patterns") List<RequestPattern> paramList);
  
  @Zy
  @Zr("bufferedData")
  CompletableFuture<Zf<String>> streamResourceContent(@Zu("requestId") String paramString);
  
  @Zy
  @Zr("status")
  CompletableFuture<Zf<SecurityIsolationStatus>> getSecurityIsolationStatus();
  
  @Zy
  @Zr("status")
  CompletableFuture<Zf<SecurityIsolationStatus>> getSecurityIsolationStatus(@Zj @Zu("frameId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> enableReportingApi(@Zu("enable") Boolean paramBoolean);
  
  @Zy
  @Zr("resource")
  CompletableFuture<Zf<LoadNetworkResourcePageResult>> loadNetworkResource(@Zu("url") String paramString, @Zu("options") LoadNetworkResourceOptions paramLoadNetworkResourceOptions);
  
  @Zy
  @Zr("resource")
  CompletableFuture<Zf<LoadNetworkResourcePageResult>> loadNetworkResource(@Zj @Zu("frameId") String paramString1, @Zu("url") String paramString2, @Zu("options") LoadNetworkResourceOptions paramLoadNetworkResourceOptions);
  
  @Zb("dataReceived")
  Zs onDataReceived(Zp<DataReceived> paramZp) throws Zp;
  
  @Zb("eventSourceMessageReceived")
  Zs onEventSourceMessageReceived(Zp<EventSourceMessageReceived> paramZp) throws Zp;
  
  @Zb("loadingFailed")
  Zs onLoadingFailed(Zp<LoadingFailed> paramZp) throws Zp;
  
  @Zb("loadingFinished")
  Zs onLoadingFinished(Zp<LoadingFinished> paramZp) throws Zp;
  
  @Zb("requestIntercepted")
  @Deprecated
  @Zy
  Zs onRequestIntercepted(Zp<RequestIntercepted> paramZp) throws Zp;
  
  @Zb("requestServedFromCache")
  Zs onRequestServedFromCache(Zp<RequestServedFromCache> paramZp) throws Zp;
  
  @Zb("requestWillBeSent")
  Zs onRequestWillBeSent(Zp<RequestWillBeSent> paramZp) throws Zp;
  
  @Zb("resourceChangedPriority")
  @Zy
  Zs onResourceChangedPriority(Zp<ResourceChangedPriority> paramZp) throws Zp;
  
  @Zb("signedExchangeReceived")
  @Zy
  Zs onSignedExchangeReceived(Zp<SignedExchangeReceived> paramZp) throws Zp;
  
  @Zb("responseReceived")
  Zs onResponseReceived(Zp<ResponseReceived> paramZp) throws Zp;
  
  @Zb("webSocketClosed")
  Zs onWebSocketClosed(Zp<WebSocketClosed> paramZp) throws Zp;
  
  @Zb("webSocketCreated")
  Zs onWebSocketCreated(Zp<WebSocketCreated> paramZp) throws Zp;
  
  @Zb("webSocketFrameError")
  Zs onWebSocketFrameError(Zp<WebSocketFrameError> paramZp) throws Zp;
  
  @Zb("webSocketFrameReceived")
  Zs onWebSocketFrameReceived(Zp<WebSocketFrameReceived> paramZp) throws Zp;
  
  @Zb("webSocketFrameSent")
  Zs onWebSocketFrameSent(Zp<WebSocketFrameSent> paramZp) throws Zp;
  
  @Zb("webSocketHandshakeResponseReceived")
  Zs onWebSocketHandshakeResponseReceived(Zp<WebSocketHandshakeResponseReceived> paramZp) throws Zp;
  
  @Zb("webSocketWillSendHandshakeRequest")
  Zs onWebSocketWillSendHandshakeRequest(Zp<WebSocketWillSendHandshakeRequest> paramZp) throws Zp;
  
  @Zb("webTransportCreated")
  Zs onWebTransportCreated(Zp<WebTransportCreated> paramZp) throws Zp;
  
  @Zb("webTransportConnectionEstablished")
  Zs onWebTransportConnectionEstablished(Zp<WebTransportConnectionEstablished> paramZp) throws Zp;
  
  @Zb("webTransportClosed")
  Zs onWebTransportClosed(Zp<WebTransportClosed> paramZp) throws Zp;
  
  @Zb("requestWillBeSentExtraInfo")
  @Zy
  Zs onRequestWillBeSentExtraInfo(Zp<RequestWillBeSentExtraInfo> paramZp) throws Zp;
  
  @Zb("responseReceivedExtraInfo")
  @Zy
  Zs onResponseReceivedExtraInfo(Zp<ResponseReceivedExtraInfo> paramZp) throws Zp;
  
  @Zb("responseReceivedEarlyHints")
  @Zy
  Zs onResponseReceivedEarlyHints(Zp<ResponseReceivedEarlyHints> paramZp) throws Zp;
  
  @Zb("trustTokenOperationDone")
  @Zy
  Zs onTrustTokenOperationDone(Zp<TrustTokenOperationDone> paramZp) throws Zp;
  
  @Zb("policyUpdated")
  @Zy
  Zs onPolicyUpdated(Zp<PolicyUpdated> paramZp) throws Zp;
  
  @Zb("subresourceWebBundleMetadataReceived")
  @Zy
  Zs onSubresourceWebBundleMetadataReceived(Zp<SubresourceWebBundleMetadataReceived> paramZp) throws Zp;
  
  @Zb("subresourceWebBundleMetadataError")
  @Zy
  Zs onSubresourceWebBundleMetadataError(Zp<SubresourceWebBundleMetadataError> paramZp) throws Zp;
  
  @Zb("subresourceWebBundleInnerResponseParsed")
  @Zy
  Zs onSubresourceWebBundleInnerResponseParsed(Zp<SubresourceWebBundleInnerResponseParsed> paramZp) throws Zp;
  
  @Zb("subresourceWebBundleInnerResponseError")
  @Zy
  Zs onSubresourceWebBundleInnerResponseError(Zp<SubresourceWebBundleInnerResponseError> paramZp) throws Zp;
  
  @Zb("reportingApiReportAdded")
  @Zy
  Zs onReportingApiReportAdded(Zp<ReportingApiReportAdded> paramZp) throws Zp;
  
  @Zb("reportingApiReportUpdated")
  @Zy
  Zs onReportingApiReportUpdated(Zp<ReportingApiReportUpdated> paramZp) throws Zp;
  
  @Zb("reportingApiEndpointsChangedForOrigin")
  @Zy
  Zs onReportingApiEndpointsChangedForOrigin(Zp<ReportingApiEndpointsChangedForOrigin> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Network.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */