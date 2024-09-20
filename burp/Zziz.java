package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.sessions.SessionHandlingActionData;
import java.util.List;

public class Zziz implements SessionHandlingActionData {
  private final HttpRequest ZB;
  
  private final Annotations Zx;
  
  private final List<HttpRequestResponse> Zh;
  
  public Zziz(HttpRequest paramHttpRequest, Annotations paramAnnotations, List<HttpRequestResponse> paramList) {
    this.ZB = paramHttpRequest;
    this.Zx = paramAnnotations;
    this.Zh = paramList;
  }
  
  public Annotations annotations() {
    return this.Zx;
  }
  
  public HttpRequest request() {
    return this.ZB;
  }
  
  public List<HttpRequestResponse> macroRequestResponses() {
    return this.Zh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zziz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */