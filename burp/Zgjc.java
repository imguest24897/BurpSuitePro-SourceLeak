package burp;

import burp.api.montoya.http.message.requests.HttpRequest;
import java.util.Iterator;

class Zgjc implements Iterator<HttpRequest> {
  private final Iterator<Zelu> Zk = this.Zy.ZN.iterator();
  
  final Zz4w Zy;
  
  Zgjc(Zz4w paramZz4w) {}
  
  public boolean hasNext() {
    return this.Zk.hasNext();
  }
  
  public HttpRequest ZU() {
    return Zsie.Zg(this.Zk.next(), this.Zy.Zo, this.Zy.ZG, this.Zy.ZR, this.Zy.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */