package net.portswigger.devtools.protocol.types.network;

import burp.Zbqc;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.security.SecurityState;

@Zsi("net.portswigger.devtools.protocol.types.network.Response")
public class Response {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "status")
  public final Integer status;
  
  @Zvd(Zp = "statusText")
  public final String statusText;
  
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zvd(Zp = "headersText")
  @Deprecated
  @Zj
  public final String headersText;
  
  @Zvd(Zp = "mimeType")
  public final String mimeType;
  
  @Zvd(Zp = "charset")
  public final String charset;
  
  @Zvd(Zp = "requestHeaders")
  @Zj
  public final Map<String, Zi7> requestHeaders;
  
  @Zvd(Zp = "requestHeadersText")
  @Deprecated
  @Zj
  public final String requestHeadersText;
  
  @Zvd(Zp = "connectionReused")
  public final Boolean connectionReused;
  
  @Zvd(Zp = "connectionId")
  public final Double connectionId;
  
  @Zvd(Zp = "remoteIPAddress")
  @Zj
  public final String remoteIPAddress;
  
  @Zvd(Zp = "remotePort")
  @Zj
  public final Integer remotePort;
  
  @Zvd(Zp = "fromDiskCache")
  @Zj
  public final Boolean fromDiskCache;
  
  @Zvd(Zp = "fromServiceWorker")
  @Zj
  public final Boolean fromServiceWorker;
  
  @Zvd(Zp = "fromPrefetchCache")
  @Zj
  public final Boolean fromPrefetchCache;
  
  @Zvd(Zp = "fromEarlyHints")
  @Zj
  public final Boolean fromEarlyHints;
  
  @Zvd(Zp = "serviceWorkerRouterInfo")
  @Zy
  @Zj
  public final ServiceWorkerRouterInfo serviceWorkerRouterInfo;
  
  @Zvd(Zp = "encodedDataLength")
  public final Double encodedDataLength;
  
  @Zvd(Zp = "timing")
  @Zj
  public final ResourceTiming timing;
  
  @Zvd(Zp = "serviceWorkerResponseSource")
  @Zj
  public final ServiceWorkerResponseSource serviceWorkerResponseSource;
  
  @Zvd(Zp = "responseTime")
  @Zj
  public final Double responseTime;
  
  @Zvd(Zp = "cacheStorageCacheName")
  @Zj
  public final String cacheStorageCacheName;
  
  @Zvd(Zp = "protocol")
  @Zj
  public final String protocol;
  
  @Zvd(Zp = "alternateProtocolUsage")
  @Zy
  @Zj
  public final AlternateProtocolUsage alternateProtocolUsage;
  
  @Zvd(Zp = "securityState")
  public final SecurityState securityState;
  
  @Zvd(Zp = "securityDetails")
  @Zj
  public final SecurityDetails securityDetails;
  
  @Zox
  public Response(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "status") Integer paramInteger1, @Zc5(Ze = "statusText") String paramString2, @Zc5(Ze = "headers") Map<String, Zi7> paramMap1, @Zc5(Ze = "headersText", ZS = "null") String paramString3, @Zc5(Ze = "mimeType") String paramString4, @Zc5(Ze = "charset") String paramString5, @Zc5(Ze = "requestHeaders", ZS = "null") Map<String, Zi7> paramMap2, @Zc5(Ze = "requestHeadersText", ZS = "null") String paramString6, @Zc5(Ze = "connectionReused") Boolean paramBoolean1, @Zc5(Ze = "connectionId") Double paramDouble1, @Zc5(Ze = "remoteIPAddress", ZS = "null") String paramString7, @Zc5(Ze = "remotePort", ZS = "null") Integer paramInteger2, @Zc5(Ze = "fromDiskCache", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "fromServiceWorker", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "fromPrefetchCache", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "fromEarlyHints", ZS = "null") Boolean paramBoolean5, @Zc5(Ze = "serviceWorkerRouterInfo", ZS = "null") ServiceWorkerRouterInfo paramServiceWorkerRouterInfo, @Zc5(Ze = "encodedDataLength") Double paramDouble2, @Zc5(Ze = "timing", ZS = "null") ResourceTiming paramResourceTiming, @Zc5(Ze = "serviceWorkerResponseSource", ZS = "null") ServiceWorkerResponseSource paramServiceWorkerResponseSource, @Zc5(Ze = "responseTime", ZS = "null") Double paramDouble3, @Zc5(Ze = "cacheStorageCacheName", ZS = "null") String paramString8, @Zc5(Ze = "protocol", ZS = "null") String paramString9, @Zc5(Ze = "alternateProtocolUsage", ZS = "null") AlternateProtocolUsage paramAlternateProtocolUsage, @Zc5(Ze = "securityState") SecurityState paramSecurityState, @Zc5(Ze = "securityDetails", ZS = "null") SecurityDetails paramSecurityDetails) {
    this.url = paramString1;
    this.status = paramInteger1;
    this.statusText = paramString2;
    this.headers = paramMap1;
    this.headersText = paramString3;
    this.mimeType = paramString4;
    this.charset = paramString5;
    this.requestHeaders = paramMap2;
    this.requestHeadersText = paramString6;
    this.connectionReused = paramBoolean1;
    this.connectionId = paramDouble1;
    this.remoteIPAddress = paramString7;
    this.remotePort = paramInteger2;
    this.fromDiskCache = paramBoolean2;
    this.fromServiceWorker = paramBoolean3;
    this.fromPrefetchCache = paramBoolean4;
    this.fromEarlyHints = paramBoolean5;
    this.serviceWorkerRouterInfo = paramServiceWorkerRouterInfo;
    this.encodedDataLength = paramDouble2;
    this.timing = paramResourceTiming;
    this.serviceWorkerResponseSource = paramServiceWorkerResponseSource;
    this.responseTime = paramDouble3;
    this.cacheStorageCacheName = paramString8;
    this.protocol = paramString9;
    this.alternateProtocolUsage = paramAlternateProtocolUsage;
    boolean bool = ResourceType.ZZ();
    this.securityState = paramSecurityState;
    this.securityDetails = paramSecurityDetails;
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\Response.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */