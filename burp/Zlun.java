package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.ui.contextmenu.WebSocketMessage;
import burp.api.montoya.websocket.Direction;

public class Zlun implements WebSocketMessage {
  private final Zlv8 ZC;
  
  private final Zskl ZT;
  
  public Zlun(Zlv8 paramZlv8, Zskl paramZskl) {
    this.ZC = paramZlv8;
    this.ZT = paramZskl;
  }
  
  public Annotations annotations() {
    return new Zz6u(this.ZT, this.ZC);
  }
  
  public Direction direction() {
    return this.ZC.ZY() ? Direction.CLIENT_TO_SERVER : Direction.SERVER_TO_CLIENT;
  }
  
  public ByteArray payload() {
    return this.ZT.ZI(this.ZC.ZW());
  }
  
  public HttpRequest upgradeRequest() {
    Zefx zefx = this.ZC.ZP();
    return this.ZT.ZN(zefx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlun.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */