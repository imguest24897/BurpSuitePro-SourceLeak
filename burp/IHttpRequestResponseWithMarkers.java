package burp;

import java.util.List;

public interface IHttpRequestResponseWithMarkers extends IHttpRequestResponse {
  List<int[]> getRequestMarkers();
  
  List<int[]> getResponseMarkers();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IHttpRequestResponseWithMarkers.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */