package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.proxy.websocket.ProxyMessageHandler;

class Ztgx implements Registration {
  final ProxyMessageHandler Zy;
  
  final Ztzm ZM;
  
  Ztgx(Ztzm paramZtzm, ProxyMessageHandler paramProxyMessageHandler) {}
  
  public boolean isRegistered() {
    return this.ZM.Zi.contains(this.Zy);
  }
  
  public void deregister() {
    this.ZM.Zi.remove(this.Zy);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */