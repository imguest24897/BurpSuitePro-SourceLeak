package burp;

import java.util.Collections;
import java.util.List;

class Zmdt extends Zmdg implements IHttpRequestResponseWithMarkers {
  public List<int[]> getRequestMarkers() {
    return (List)Collections.emptyList();
  }
  
  public List<int[]> getResponseMarkers() {
    return (List)Collections.emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */