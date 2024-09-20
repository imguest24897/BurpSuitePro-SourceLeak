package burp;

import burp.api.montoya.http.HttpService;
import burp.api.montoya.intruder.AttackConfiguration;
import burp.api.montoya.intruder.HttpRequestTemplate;
import java.util.Optional;

class Zrlq implements AttackConfiguration {
  final IIntruderAttack Zd;
  
  final Zsut Zb;
  
  Zrlq(Zsut paramZsut, IIntruderAttack paramIIntruderAttack) {}
  
  public Optional<HttpService> httpService() {
    IHttpService iHttpService = this.Zd.getHttpService();
    return Optional.ofNullable((iHttpService == null) ? null : this.Zb.Zq.Zg(iHttpService));
  }
  
  public HttpRequestTemplate requestTemplate() {
    return this.Zb.Ze(this.Zd.getRequestTemplate());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrlq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */