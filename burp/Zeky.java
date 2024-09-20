package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;

public class Zeky implements LoggerCaptureHttpRequestResponse {
  private final Zesy Zx;
  
  private final Zskl Zq;
  
  private final Zbnt ZT;
  
  private HttpRequest ZK;
  
  private HttpResponse Zr;
  
  private Zs68 ZJ;
  
  private MimeType ZZ;
  
  private TimingData ZC;
  
  private String Zv;
  
  public Zeky(Zesy paramZesy, Zskl paramZskl, Zbnt paramZbnt) {
    this.Zx = paramZesy;
    this.Zq = paramZskl;
    this.ZT = paramZbnt;
  }
  
  public HttpRequest request() {
    if (this.ZK == null)
      this.ZK = this.Zq.ZN(this.Zx.ZV); 
    return this.ZK;
  }
  
  public HttpResponse response() {
    if (this.Zr == null)
      this.Zr = this.Zq.ZY(this.Zx.ZM.Za()); 
    return this.Zr;
  }
  
  public HttpService httpService() {
    HttpRequest httpRequest = request();
    return (httpRequest == null) ? null : httpRequest.httpService();
  }
  
  public ZonedDateTime time() {
    return ZonedDateTime.ofInstant(Instant.ofEpochMilli(this.Zx.Zx), ZoneId.systemDefault());
  }
  
  public MimeType mimeType() {
    if (this.ZZ == null)
      this.ZZ = Ztc3.Zp((Zo()).ZH.ZJ); 
    return this.ZZ;
  }
  
  public boolean hasResponse() {
    return (this.Zx.ZM != null && this.Zx.ZM.ZF() > 0);
  }
  
  public TimingData timingData() {
    if (this.ZC == null)
      this.ZC = this.Zq.Zq(this.Zx.ZQ.toMillis(), this.Zx.Zb.toMillis(), this.Zx.Zx); 
    return this.ZC;
  }
  
  public String pageTitle() {
    if (this.Zv == null)
      this.Zv = ((Zo()).Zd == null) ? "" : Ztnx.ZN((Zo()).Zd); 
    return this.Zv;
  }
  
  public ToolSource toolSource() {
    return Zt6v.ZK(this.Zx.Zd);
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    return (request().contains(paramString, paramBoolean) || (response() != null && response().contains(paramString, paramBoolean)));
  }
  
  public boolean contains(Pattern paramPattern) {
    return (request().contains(paramPattern) || (response() != null && response().contains(paramPattern)));
  }
  
  public boolean isSessionHandlingEvent() {
    return this.Zx.ZG;
  }
  
  private Zs68 Zo() {
    if (this.ZJ == null)
      this.ZJ = Zbwc.Zt(this.Zx.ZV.ZF(), this.Zx.ZM.Za(), Zt0k.HTML_HEAD_ANALYSIS, this.ZT); 
    return this.ZJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeky.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */