package burp;

import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.websocket.extension.ExtensionWebSocketCreation;
import burp.api.montoya.websocket.extension.ExtensionWebSocketCreationStatus;
import java.util.Optional;
import net.portswigger.Zkb;

public final class Zzus extends Record {
  private final Zkh3 ZI;
  
  private final Zbnt ZO;
  
  private final Ze2b ZS;
  
  private final Zskl Zh;
  
  private final MontoyaObjectFactory Zf;
  
  private final Zey9 ZH;
  
  public Zzus(Zkh3 paramZkh3, Zbnt paramZbnt, Ze2b paramZe2b, Zskl paramZskl, MontoyaObjectFactory paramMontoyaObjectFactory, Zey9 paramZey9) {
    this.ZI = paramZkh3;
    this.ZO = paramZbnt;
    this.ZS = paramZe2b;
    this.Zh = paramZskl;
    this.Zf = paramMontoyaObjectFactory;
    this.ZH = paramZey9;
  }
  
  ExtensionWebSocketCreation ZU(HttpService paramHttpService, String paramString) {
    Zmzk zmzk = Zblx.Zm(paramHttpService, this.ZO);
    Zma9 zma9 = this.ZI.ZV(zmzk, paramString);
    return ZQ(zma9);
  }
  
  ExtensionWebSocketCreation ZI(HttpRequest paramHttpRequest) {
    Zefx zefx = Zblx.ZW(paramHttpRequest, this.ZO, this.ZH);
    Zma9 zma9 = this.ZI.ZU(zefx.ZT(), zefx.ZD());
    return ZQ(zma9);
  }
  
  private ExtensionWebSocketCreation ZQ(Zma9 paramZma9) {
    Optional<T> optional1 = (paramZma9.ZM == Zr42.CONNECTED) ? Optional.<T>of((T)new Zesm(paramZma9.ZJ, this.ZS, this.Zh)) : Optional.<T>empty();
    ExtensionWebSocketCreationStatus extensionWebSocketCreationStatus = Zt6v.ZC(paramZma9.ZM);
    Optional<T> optional2 = (paramZma9.ZK != null) ? Optional.<T>of((T)this.Zf.httpResponse(Zkb.ZG(paramZma9.ZK))) : Optional.<T>empty();
    return new Zl6i(extensionWebSocketCreationStatus, (Optional)optional1, (Optional)optional2);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzus;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzus;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzus;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */