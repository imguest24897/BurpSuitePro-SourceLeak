package burp;

import burp.api.montoya.websocket.Direction;
import burp.api.montoya.websocket.MessageHandler;

class Zejs implements Zlgo {
  final Ztf2 ZD;
  
  final Zxym ZZ;
  
  final Zzi1 Zx;
  
  Zejs(Zzi1 paramZzi1, Ztf2 paramZtf2, Zxym paramZxym) {}
  
  public Zl36 ZI(Zl36 paramZl36) {
    return this.ZD.ZL(paramZl36, Direction.SERVER_TO_CLIENT);
  }
  
  public Zl36 Zl(Zl36 paramZl36, Zeew paramZeew) {
    return this.ZD.ZL(paramZl36, Direction.CLIENT_TO_SERVER);
  }
  
  public void ZP() {
    this.Zx.Zn.forEach(MessageHandler::onClose);
    this.ZZ.ZL(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */