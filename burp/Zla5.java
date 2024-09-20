package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.requests.MalformedRequestException;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.proxy.ProxyHttpRequestResponse;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zla5 implements ProxyHttpRequestResponse {
  private final Zsor Zi;
  
  private final Zskl Zj;
  
  private HttpRequest Zw;
  
  private HttpResponse ZQ;
  
  private Annotations ZP;
  
  private TimingData ZA;
  
  public Zla5(Zsor paramZsor, Zskl paramZskl) {
    this.Zi = paramZsor;
    this.Zj = paramZskl;
  }
  
  public Annotations annotations() {
    try {
      if (this.ZP == null)
        this.ZP = this.Zj.ZM(this.Zi); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return this.ZP;
  }
  
  public HttpService httpService() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return httpRequest.httpService();
  }
  
  public HttpRequest request() {
    return finalRequest();
  }
  
  public HttpRequest finalRequest() {
    try {
      if (this.Zw == null)
        this.Zw = this.Zj.Zf(this.Zi.Zs(), this.Zi.Zp()); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return this.Zw;
  }
  
  public HttpResponse response() {
    return originalResponse();
  }
  
  public HttpResponse originalResponse() {
    try {
      if (this.ZQ == null)
        this.ZQ = this.Zj.Zr(this.Zi); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return this.ZQ;
  }
  
  public String url() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    try {
      return httpRequest.url();
    } catch (MalformedRequestException malformedRequestException) {
      Zah.Zl((Throwable)malformedRequestException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public String method() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    try {
      return httpRequest.method();
    } catch (MalformedRequestException malformedRequestException) {
      Zah.Zl((Throwable)malformedRequestException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public String path() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    try {
      return httpRequest.path();
    } catch (MalformedRequestException malformedRequestException) {
      Zah.Zl((Throwable)malformedRequestException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public String host() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest != null)
        try {
          return (httpRequest.httpService() != null) ? httpRequest.httpService().host() : null;
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return null;
  }
  
  public int port() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest != null)
        try {
          return (httpRequest.httpService() != null) ? httpRequest.httpService().port() : 0;
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return 0;
  }
  
  public boolean secure() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest != null)
        try {
          return (httpRequest.httpService() != null) ? httpRequest.httpService().secure() : false;
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  public String httpServiceString() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest != null)
        try {
          return (httpRequest.httpService() != null) ? httpRequest.httpService().toString() : null;
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return null;
  }
  
  public String requestHttpVersion() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return httpRequest.httpVersion();
  }
  
  public String requestBody() {
    HttpRequest httpRequest = finalRequest();
    try {
      if (httpRequest == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return httpRequest.bodyToString();
  }
  
  public boolean edited() {
    return this.Zi.Zl();
  }
  
  public ZonedDateTime time() {
    Instant instant = Instant.ofEpochMilli(this.Zi.ZR());
    return ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
  }
  
  public int listenerPort() {
    return this.Zi.ZO();
  }
  
  public MimeType mimeType() {
    return Ztc3.Zp(this.Zi.ZD());
  }
  
  public boolean hasResponse() {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return (originalResponse() != null);
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    boolean bool = paramBoolean ? Zsw8.ZY(annotations().notes(), paramString) : Zsw8.ZK(annotations().notes(), paramString);
    try {
      if (!bool)
        try {
          if (!finalRequest().contains(paramString, paramBoolean)) {
            try {
              if (originalResponse() != null)
                try {
                  if (originalResponse().contains(paramString, paramBoolean));
                } catch (MalformedRequestException malformedRequestException) {
                  throw a(null);
                }  
            } catch (MalformedRequestException malformedRequestException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
  }
  
  public boolean contains(Pattern paramPattern) {
    try {
      if (!Zsw8.ZC(annotations().notes(), paramPattern))
        try {
          if (!finalRequest().contains(paramPattern)) {
            try {
              if (originalResponse() != null)
                try {
                  if (originalResponse().contains(paramPattern));
                } catch (MalformedRequestException malformedRequestException) {
                  throw a(null);
                }  
            } catch (MalformedRequestException malformedRequestException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
  }
  
  public TimingData timingData() {
    try {
      if (this.ZA == null)
        this.ZA = this.Zj.Zq(this.Zi.Zd().toMillis(), this.Zi.ZA().toMillis(), this.Zi.Za()); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return this.ZA;
  }
  
  private static MalformedRequestException a(MalformedRequestException paramMalformedRequestException) {
    return paramMalformedRequestException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zla5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */