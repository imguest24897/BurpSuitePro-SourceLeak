package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Registration;
import burp.api.montoya.websocket.MessageHandler;
import burp.api.montoya.websocket.WebSocket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zzi1 implements WebSocket {
  private final Zxym Zo;
  
  private final Ze2b Zs;
  
  private final List<MessageHandler> Zn;
  
  public Zzi1(Zxym paramZxym, Ze2b paramZe2b, Zskl paramZskl) {
    this.Zo = paramZxym;
    this.Zs = paramZe2b;
    this.Zn = new CopyOnWriteArrayList<>();
    Ztf2 ztf2 = new Ztf2(paramZskl, this.Zn);
    String str = Zrvt.ZJ();
    paramZxym.Zm(new Zejs(this, ztf2, paramZxym));
    if (Zbqc.Zwu() == null)
      Zrvt.ZH("h9otwb"); 
  }
  
  public void sendTextMessage(String paramString) {
    Zl36 zl36 = this.Zs.ZI(Ze3o.CLIENT_TO_SERVER, Zsg3.TEXT, paramString);
    this.Zo.Zr(zl36, Ze3o.CLIENT_TO_SERVER, Zeew.EXTENDER);
  }
  
  public void sendBinaryMessage(ByteArray paramByteArray) {
    Zl36 zl36 = this.Zs.ZH(Ze3o.CLIENT_TO_SERVER, Zsg3.BINARY, paramByteArray.getBytes());
    this.Zo.Zr(zl36, Ze3o.CLIENT_TO_SERVER, Zeew.EXTENDER);
  }
  
  public Registration registerMessageHandler(MessageHandler paramMessageHandler) {
    this.Zn.add(paramMessageHandler);
    return new Zt2n(this, paramMessageHandler);
  }
  
  public void close() {
    this.Zo.Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzi1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */