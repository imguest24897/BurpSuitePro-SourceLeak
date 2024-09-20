package burp;

import burp.api.montoya.collaborator.HttpDetails;
import burp.api.montoya.http.HttpProtocol;
import burp.api.montoya.http.message.HttpRequestResponse;

class Zxrl implements HttpDetails {
  final Zsnv Zv;
  
  final Zbwn ZE;
  
  Zxrl(Zbwn paramZbwn, Zsnv paramZsnv) {}
  
  public HttpProtocol protocol() {
    Zb25 zb25 = Zb25.ZL(this.Zv.ZL());
    return (zb25 == null) ? null : (zb25.ZV() ? HttpProtocol.HTTPS : HttpProtocol.HTTP);
  }
  
  public HttpRequestResponse requestResponse() {
    return this.ZE.Zq.Zh(this.Zv.Zs().Zq(this.ZE.Zc, this.ZE.Zl));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxrl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */