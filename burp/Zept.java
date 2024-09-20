package burp;

import burp.api.montoya.collaborator.HttpDetails;
import burp.api.montoya.http.HttpProtocol;
import burp.api.montoya.http.message.HttpRequestResponse;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zept implements HttpDetails {
  final Zxyt ZI;
  
  final Zs8k ZO;
  
  Zept(Zs8k paramZs8k, Zxyt paramZxyt) {}
  
  public HttpProtocol protocol() {
    return this.ZI.ZA().ZV() ? HttpProtocol.HTTPS : HttpProtocol.HTTP;
  }
  
  public HttpRequestResponse requestResponse() {
    return this.ZO.Zu.ZF(ZD(), this.ZI.ZT(), this.ZI.ZM());
  }
  
  private Zmzk ZD() {
    boolean bool = this.ZI.ZA().ZV();
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      return this.ZO.Za.ZY(this.ZO.ZT, bool ? 443 : 80, bool);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zept.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */