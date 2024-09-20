package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.logger.LoggerHttpRequestResponse;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;

public class Ztk6 implements LoggerHttpRequestResponse {
  private final Zto7 ZP;
  
  private final Zskl Zc;
  
  private HttpRequest Zf;
  
  private HttpResponse ZN;
  
  private Annotations Z_;
  
  private TimingData Zv;
  
  public Ztk6(Zto7 paramZto7, Zskl paramZskl) {
    this.ZP = paramZto7;
    this.Zc = paramZskl;
  }
  
  public Annotations annotations() {
    if (this.Z_ == null)
      this.Z_ = new Zsyb(this.Zc, this.ZP); 
    return this.Z_;
  }
  
  public ZonedDateTime time() {
    return ZonedDateTime.ofInstant(Instant.ofEpochMilli(this.ZP.ZoB()), ZoneId.systemDefault());
  }
  
  public MimeType mimeType() {
    return Ztc3.Zp(this.ZP.ZEb());
  }
  
  public boolean hasResponse() {
    return (this.ZP.Zlq() > 0);
  }
  
  public TimingData timingData() {
    if (this.Zv == null)
      this.Zv = this.Zc.Zq(this.ZP.ZES(), this.ZP.ZEg(), this.ZP.ZoB()); 
    return this.Zv;
  }
  
  public String pageTitle() {
    String str = this.ZP.ZEJ();
    return (str == null) ? "" : str;
  }
  
  public ToolSource toolSource() {
    return Zt6v.ZK(this.ZP.Ze2());
  }
  
  public HttpService httpService() {
    HttpRequest httpRequest = request();
    return (httpRequest == null) ? null : httpRequest.httpService();
  }
  
  public HttpRequest request() {
    if (this.Zf == null)
      this.Zf = this.Zc.Zf(this.ZP.Zod(), this.ZP.Zos().ZiD()); 
    return this.Zf;
  }
  
  public HttpResponse response() {
    if (this.ZN == null)
      this.ZN = this.Zc.ZY(this.ZP.ZoO()); 
    return this.ZN;
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    boolean bool = paramBoolean ? Zsw8.ZY(annotations().notes(), paramString) : Zsw8.ZK(annotations().notes(), paramString);
    return (bool || request().contains(paramString, paramBoolean) || (response() != null && response().contains(paramString, paramBoolean)));
  }
  
  public boolean contains(Pattern paramPattern) {
    return (Zsw8.ZC(annotations().notes(), paramPattern) || request().contains(paramPattern) || (response() != null && response().contains(paramPattern)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztk6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */