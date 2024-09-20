package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Registration;
import burp.api.montoya.websocket.extension.ExtensionWebSocket;
import burp.api.montoya.websocket.extension.ExtensionWebSocketMessageHandler;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zesm implements ExtensionWebSocket {
  private final Zxym Zg;
  
  private final Ze2b Zp;
  
  private final List<ExtensionWebSocketMessageHandler> ZA;
  
  public Zesm(Zxym paramZxym, Ze2b paramZe2b, Zskl paramZskl) {
    this.Zg = paramZxym;
    this.Zp = paramZe2b;
    this.ZA = new CopyOnWriteArrayList<>();
    Zs87 zs87 = new Zs87(paramZskl, this.ZA);
    paramZxym.Zm(new Zkk_(this, zs87, paramZxym));
    try {
      paramZxym.Zt();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
  }
  
  public Registration registerMessageHandler(ExtensionWebSocketMessageHandler paramExtensionWebSocketMessageHandler) {
    this.ZA.add(paramExtensionWebSocketMessageHandler);
    return new Zkd7(this, paramExtensionWebSocketMessageHandler);
  }
  
  public void sendTextMessage(String paramString) {
    Zl36 zl36 = this.Zp.ZI(Ze3o.CLIENT_TO_SERVER, Zsg3.TEXT, paramString);
    this.Zg.Zr(zl36, Ze3o.CLIENT_TO_SERVER, Zeew.EXTENDER);
  }
  
  public void sendBinaryMessage(ByteArray paramByteArray) {
    Zl36 zl36 = this.Zp.ZH(Ze3o.CLIENT_TO_SERVER, Zsg3.BINARY, paramByteArray.getBytes());
    this.Zg.Zr(zl36, Ze3o.CLIENT_TO_SERVER, Zeew.EXTENDER);
  }
  
  public void close() {
    this.Zg.Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */