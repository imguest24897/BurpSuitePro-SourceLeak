package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.Marker;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.ContentType;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz2q implements HttpRequestResponse {
  private final IHttpRequestResponse ZY;
  
  private final Zzqf Ze;
  
  private HttpRequestResponse Zp;
  
  public Zz2q(IHttpRequestResponse paramIHttpRequestResponse, Zzqf paramZzqf) {
    this.ZY = paramIHttpRequestResponse;
    this.Ze = paramZzqf;
  }
  
  public void ZE(HttpRequest paramHttpRequest) {
    this.ZY.setRequest(paramHttpRequest.toByteArray().getBytes());
  }
  
  public void ZG(HttpResponse paramHttpResponse) {
    this.ZY.setResponse(paramHttpResponse.toByteArray().getBytes());
  }
  
  public IHttpRequestResponse Zp() {
    return this.ZY;
  }
  
  public HttpRequest request() {
    return ZM().request();
  }
  
  private HttpRequestResponse ZM() {
    if (this.Zp == null)
      this.Zp = this.Ze.ZU(this.ZY); 
    return this.Zp;
  }
  
  public HttpResponse response() {
    return ZM().response();
  }
  
  public boolean hasResponse() {
    return ZM().hasResponse();
  }
  
  public Annotations annotations() {
    return ZM().annotations();
  }
  
  public Optional<TimingData> timingData() {
    Zuh.Zb(false, Zqf.ZC);
    return Optional.empty();
  }
  
  public String url() {
    return ZM().url();
  }
  
  public HttpService httpService() {
    return ZM().httpService();
  }
  
  public ContentType contentType() {
    return ZM().contentType();
  }
  
  public short statusCode() {
    return ZM().statusCode();
  }
  
  public List<Marker> requestMarkers() {
    return ZM().requestMarkers();
  }
  
  public List<Marker> responseMarkers() {
    return ZM().requestMarkers();
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    return ZM().contains(paramString, paramBoolean);
  }
  
  public boolean contains(Pattern paramPattern) {
    return ZM().contains(paramPattern);
  }
  
  public HttpRequestResponse copyToTempFile() {
    return ZM().copyToTempFile();
  }
  
  public HttpRequestResponse withAnnotations(Annotations paramAnnotations) {
    return ZM().withAnnotations(paramAnnotations);
  }
  
  public HttpRequestResponse withRequestMarkers(List<Marker> paramList) {
    return ZM().withRequestMarkers(paramList);
  }
  
  public HttpRequestResponse withRequestMarkers(Marker... paramVarArgs) {
    return ZM().withRequestMarkers(paramVarArgs);
  }
  
  public HttpRequestResponse withResponseMarkers(List<Marker> paramList) {
    return ZM().withResponseMarkers(paramList);
  }
  
  public HttpRequestResponse withResponseMarkers(Marker... paramVarArgs) {
    return ZM().withResponseMarkers(paramVarArgs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */