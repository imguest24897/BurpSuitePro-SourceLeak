package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import java.util.Iterator;

class Zmcn implements Iterator<HttpRequestResponse> {
  private final Iterator<Zb4i> Zf = this.Zq.Zp.iterator();
  
  final Zxlt Zq;
  
  Zmcn(Zxlt paramZxlt) {}
  
  public boolean hasNext() {
    return this.Zf.hasNext();
  }
  
  public HttpRequestResponse Zt() {
    return Zx8k.ZS(this.Zf.next(), this.Zq.ZR, this.Zq.Zs, this.Zq.ZS, this.Zq.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmcn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */