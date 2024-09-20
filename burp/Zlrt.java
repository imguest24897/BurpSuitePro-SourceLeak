package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import java.util.Collections;
import java.util.List;

public class Zlrt extends Zlrr implements Zzu7 {
  private final List<int[]> Zl;
  
  private final List<int[]> ZH;
  
  public Zlrt(HttpRequestResponse paramHttpRequestResponse, Zbnt paramZbnt) {
    super(paramHttpRequestResponse, paramZbnt);
    this.Zl = ZX(Zblx.ZT(paramHttpRequestResponse.request().markers()), Zp());
    this.ZH = ZX(Zblx.ZT((paramHttpRequestResponse.response() == null) ? null : paramHttpRequestResponse.response().markers()), ZM());
  }
  
  public List<int[]> Zx() {
    return this.Zl;
  }
  
  public List<int[]> Zv() {
    return this.ZH;
  }
  
  private List<int[]> ZX(List<int[]> paramList, byte[] paramArrayOfbyte) {
    return (paramList == null || paramArrayOfbyte == null) ? (List)Collections.<int[]>emptyList() : (List)List.<int[]>copyOf(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */