package burp;

import burp.api.montoya.http.message.responses.HttpResponse;
import java.util.Iterator;

class Zxz0 implements Iterator<HttpResponse> {
  private final Iterator<Zg0d> Zn = this.Zr.ZN.iterator();
  
  final Zgmy Zr;
  
  Zxz0(Zgmy paramZgmy) {}
  
  public boolean hasNext() {
    return this.Zn.hasNext();
  }
  
  public HttpResponse Zs() {
    return Zgtr.Zr(this.Zn.next(), this.Zr.Zu, this.Zr.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */