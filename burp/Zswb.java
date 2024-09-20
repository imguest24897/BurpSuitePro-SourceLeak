package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.HighlightColor;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zswb implements IHttpRequestResponse {
  private final HttpRequestResponse Zl;
  
  private IHttpService Zr;
  
  private byte[] Zw;
  
  private byte[] ZG;
  
  public Zswb(HttpRequestResponse paramHttpRequestResponse) {
    this.Zl = paramHttpRequestResponse;
  }
  
  public byte[] getRequest() {
    return (this.Zw == null) ? Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::request).map(HttpRequest::toByteArray).map(ByteArray::getBytes).orElse(null) : this.Zw;
  }
  
  public void setRequest(byte[] paramArrayOfbyte) {
    this.Zw = paramArrayOfbyte;
  }
  
  public byte[] getResponse() {
    return (this.ZG == null) ? Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::response).map(HttpResponse::toByteArray).map(ByteArray::getBytes).orElse(null) : this.ZG;
  }
  
  public void setResponse(byte[] paramArrayOfbyte) {
    this.ZG = paramArrayOfbyte;
  }
  
  public String getComment() {
    return Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::annotations).map(Annotations::notes).orElse("");
  }
  
  public void setComment(String paramString) {
    this.Zl.annotations().setNotes(paramString);
  }
  
  public String getHighlight() {
    return Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::annotations).map(Annotations::highlightColor).map(Enum::name).map(String::toLowerCase).orElse(null);
  }
  
  public void setHighlight(String paramString) {
    HighlightColor highlightColor = (paramString == null) ? null : HighlightColor.valueOf(paramString.toUpperCase());
    this.Zl.annotations().setHighlightColor(highlightColor);
  }
  
  public IHttpService getHttpService() {
    return (this.Zr == null) ? Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::request).map(HttpRequest::httpService).map(Zzgg::ZG).orElse(null) : this.Zr;
  }
  
  public void setHttpService(IHttpService paramIHttpService) {
    this.Zr = paramIHttpService;
  }
  
  public String getHost() {
    return Optional.<IHttpService>ofNullable(getHttpService()).map(IHttpService::getHost).orElse(null);
  }
  
  public int getPort() {
    return ((Integer)Optional.<IHttpService>ofNullable(getHttpService()).map(IHttpService::getPort).orElse(Integer.valueOf(0))).intValue();
  }
  
  public String getProtocol() {
    return Optional.<IHttpService>ofNullable(getHttpService()).map(IHttpService::getProtocol).orElse(null);
  }
  
  public void setHost(String paramString) {
    int i = getPort();
    String str = getProtocol();
    this.Zr = new Ztff(this, paramString, i, str);
  }
  
  public void setPort(int paramInt) {
    String str1 = getHost();
    String str2 = getProtocol();
    this.Zr = new Ze9s(this, str1, paramInt, str2);
  }
  
  public void setProtocol(String paramString) {
    String str = getHost();
    int i = getPort();
    this.Zr = new Zbzw(this, str, i, paramString);
  }
  
  public URL getUrl() {
    String str = Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::request).map(HttpRequest::url).orElse(null);
    try {
      try {
      
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      return (str == null) ? null : new URL(str);
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public short getStatusCode() {
    return ((Short)Optional.<HttpRequestResponse>of(this.Zl).map(HttpRequestResponse::response).map(HttpResponse::statusCode).orElse(Short.valueOf((short)0))).shortValue();
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */