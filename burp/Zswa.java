package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import java.util.List;

class Zswa extends Zswe implements IHttpRequestResponseWithMarkers {
  private final HttpRequestResponse ZA;
  
  Zswa(HttpRequestResponse paramHttpRequestResponse) {
    super(paramHttpRequestResponse);
    this.ZA = paramHttpRequestResponse;
  }
  
  public List<int[]> getRequestMarkers() {
    return (List)this.ZA.requestMarkers().stream().map(Zzgg::ZI).toList();
  }
  
  public List<int[]> getResponseMarkers() {
    return (List)this.ZA.responseMarkers().stream().map(Zzgg::ZI).toList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */