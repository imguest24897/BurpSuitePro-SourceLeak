package burp;

import burp.api.montoya.proxy.websocket.ProxyMessageHandler;
import burp.api.montoya.websocket.Direction;

class Zl53 implements Zlm {
  final Zsis ZU;
  
  final Zkoi ZY;
  
  final Zth_ Za;
  
  final Ztzm Zl;
  
  Zl53(Ztzm paramZtzm, Zsis paramZsis, Zkoi paramZkoi, Zth_ paramZth_) {}
  
  public Zl3z ZG(Zl3z paramZl3z) {
    return this.ZU.Zn(paramZl3z, Direction.CLIENT_TO_SERVER);
  }
  
  public Zl36 Zt(Zl36 paramZl36, Zeew paramZeew) {
    return this.ZY.Zx(paramZl36, Direction.CLIENT_TO_SERVER);
  }
  
  public Zl3z Ze(Zl3z paramZl3z) {
    return this.ZU.Zn(paramZl3z, Direction.SERVER_TO_CLIENT);
  }
  
  public Zl36 Zs(Zl36 paramZl36, Zeew paramZeew) {
    return this.ZY.Zx(paramZl36, Direction.SERVER_TO_CLIENT);
  }
  
  public void ZI() {
    this.Zl.Zi.forEach(ProxyMessageHandler::onClose);
    this.Za.Zl(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl53.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */