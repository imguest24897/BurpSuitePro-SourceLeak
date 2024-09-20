package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Registration;
import burp.api.montoya.proxy.websocket.ProxyMessageHandler;
import burp.api.montoya.proxy.websocket.ProxyWebSocket;
import burp.api.montoya.websocket.Direction;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ztzm implements ProxyWebSocket {
  private final Zth_ ZF;
  
  private final Ze2b ZI;
  
  private final List<ProxyMessageHandler> Zi;
  
  public Ztzm(Zth_ paramZth_, Ze2b paramZe2b, Zskl paramZskl) {
    this.ZF = paramZth_;
    String str = Zrvt.ZJ();
    this.ZI = paramZe2b;
    this.Zi = new CopyOnWriteArrayList<>();
    Zsis zsis = new Zsis(paramZskl, this.Zi);
    Zkoi zkoi = new Zkoi(paramZskl, this.Zi);
    paramZth_.ZI(new Zl53(this, zsis, zkoi, paramZth_));
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Registration registerProxyMessageHandler(ProxyMessageHandler paramProxyMessageHandler) {
    this.Zi.add(paramProxyMessageHandler);
    return new Ztgx(this, paramProxyMessageHandler);
  }
  
  public void sendTextMessage(String paramString, Direction paramDirection) {
    Ze3o ze3o = Zblx.ZY(paramDirection);
    Zl36 zl36 = this.ZI.ZI(ze3o, Zsg3.TEXT, paramString);
    this.ZF.Zr(zl36, ze3o, Zeew.EXTENDER);
  }
  
  public void sendBinaryMessage(ByteArray paramByteArray, Direction paramDirection) {
    Ze3o ze3o = Zblx.ZY(paramDirection);
    Zl36 zl36 = this.ZI.ZH(ze3o, Zsg3.BINARY, paramByteArray.getBytes());
    this.ZF.Zr(zl36, ze3o, Zeew.EXTENDER);
  }
  
  public void close() {
    this.ZF.Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */