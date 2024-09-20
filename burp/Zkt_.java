package burp;

import java.util.Collections;
import java.util.List;

public class Zkt_ extends Zktn implements Zzu7 {
  private final List<int[]> Zx;
  
  private final List<int[]> ZG;
  
  public Zkt_(IHttpRequestResponseWithMarkers paramIHttpRequestResponseWithMarkers, Zbnt paramZbnt) {
    super(paramIHttpRequestResponseWithMarkers, paramZbnt);
    this.Zx = Zs(paramIHttpRequestResponseWithMarkers.getRequestMarkers(), Zp());
    this.ZG = Zs(paramIHttpRequestResponseWithMarkers.getResponseMarkers(), ZM());
  }
  
  public List<int[]> Zx() {
    return this.Zx;
  }
  
  public List<int[]> Zv() {
    return this.ZG;
  }
  
  private List<int[]> Zs(List<int[]> paramList, byte[] paramArrayOfbyte) {
    return (paramList == null || paramArrayOfbyte == null) ? (List)Collections.<int[]>emptyList() : (List)List.<int[]>copyOf(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkt_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */