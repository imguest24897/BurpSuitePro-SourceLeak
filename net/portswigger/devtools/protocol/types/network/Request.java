package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.security.MixedContentType;

@Zsi("net.portswigger.devtools.protocol.types.network.Request")
public class Request {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "urlFragment")
  @Zj
  public final String urlFragment;
  
  @Zvd(Zp = "method")
  public final String method;
  
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zvd(Zp = "postData")
  @Deprecated
  @Zj
  public final String postData;
  
  @Zvd(Zp = "hasPostData")
  @Zj
  public final Boolean hasPostData;
  
  @Zvd(Zp = "postDataEntries")
  @Zy
  @Zj
  public final List<PostDataEntry> postDataEntries;
  
  @Zvd(Zp = "mixedContentType")
  @Zj
  public final MixedContentType mixedContentType;
  
  @Zvd(Zp = "initialPriority")
  public final ResourcePriority initialPriority;
  
  @Zvd(Zp = "referrerPolicy")
  public final RequestReferrerPolicy referrerPolicy;
  
  @Zvd(Zp = "isLinkPreload")
  @Zj
  public final Boolean isLinkPreload;
  
  @Zvd(Zp = "trustTokenParams")
  @Zy
  @Zj
  public final TrustTokenParams trustTokenParams;
  
  @Zvd(Zp = "isSameSite")
  @Zy
  @Zj
  public final Boolean isSameSite;
  
  @Zox
  public Request(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "urlFragment", ZS = "null") String paramString2, @Zc5(Ze = "method") String paramString3, @Zc5(Ze = "headers") Map<String, Zi7> paramMap, @Zc5(Ze = "postData", ZS = "null") String paramString4, @Zc5(Ze = "hasPostData", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "postDataEntries", ZS = "null") List<PostDataEntry> paramList, @Zc5(Ze = "mixedContentType", ZS = "null") MixedContentType paramMixedContentType, @Zc5(Ze = "initialPriority") ResourcePriority paramResourcePriority, @Zc5(Ze = "referrerPolicy") RequestReferrerPolicy paramRequestReferrerPolicy, @Zc5(Ze = "isLinkPreload", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "trustTokenParams", ZS = "null") TrustTokenParams paramTrustTokenParams, @Zc5(Ze = "isSameSite", ZS = "null") Boolean paramBoolean3) {
    this.url = paramString1;
    this.urlFragment = paramString2;
    this.method = paramString3;
    this.headers = paramMap;
    this.postData = paramString4;
    this.hasPostData = paramBoolean1;
    this.postDataEntries = paramList;
    this.mixedContentType = paramMixedContentType;
    this.initialPriority = paramResourcePriority;
    this.referrerPolicy = paramRequestReferrerPolicy;
    this.isLinkPreload = paramBoolean2;
    this.trustTokenParams = paramTrustTokenParams;
    this.isSameSite = paramBoolean3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\Request.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */