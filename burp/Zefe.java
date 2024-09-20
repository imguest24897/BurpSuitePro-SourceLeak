package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.proxy.websocket.ProxyWebSocketCreationHandler;
import burp.api.montoya.websocket.WebSocketCreatedHandler;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.portswigger.Zsy;

class Zefe implements Zemy {
  private final Ze2b ZW;
  
  private final Zktu Zr;
  
  private final List<WebSocketCreatedHandler> ZQ;
  
  private final List<ProxyWebSocketCreationHandler> ZY;
  
  private final Zskl Zw;
  
  private Zefe(Zsy paramZsy, Zktu paramZktu, Zskl paramZskl) {
    this.Zr = paramZktu;
    this.Zw = paramZskl;
    this.ZW = new Ze2b(paramZsy);
    this.ZQ = new CopyOnWriteArrayList<>();
    this.ZY = new CopyOnWriteArrayList<>();
  }
  
  public void Zc(Zlit paramZlit, byte[] paramArrayOfbyte, Zxym paramZxym, Zeew paramZeew) {
    Zzi1 zzi1 = new Zzi1(paramZxym, this.ZW, this.Zw);
    Zztj zztj = this.Zw.Zf(paramZlit.Zdz(), paramArrayOfbyte);
    ToolSource toolSource = Zt6v.ZK(paramZeew);
    paramZxym.Zv(new Zzq(this, zzi1, zztj, toolSource, paramZeew));
  }
  
  void ZJ() {
    this.ZQ.clear();
    this.ZY.clear();
    this.Zr.Zm(this::lambda$refresh$0);
  }
  
  private void lambda$refresh$0(Zeu1 paramZeu1) {
    this.ZQ.addAll(paramZeu1.ZF().ZN());
    this.ZY.addAll(paramZeu1.ZF().Ze());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zefe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */