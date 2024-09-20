package burp;

import burp.api.montoya.http.HttpService;

class Zsid implements IHttpService {
  final HttpService Zt;
  
  Zsid(HttpService paramHttpService) {}
  
  public String getHost() {
    return this.Zt.host();
  }
  
  public int getPort() {
    return this.Zt.port();
  }
  
  public String getProtocol() {
    return Zzgg.ZZ(this.Zt.secure());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsid.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */