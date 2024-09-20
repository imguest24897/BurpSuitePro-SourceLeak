package burp;

import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.proxy.websocket.ProxyWebSocket;
import burp.api.montoya.proxy.websocket.ProxyWebSocketCreation;

public final class Zrdc extends Record implements ProxyWebSocketCreation {
  private final ProxyWebSocket proxyWebSocket;
  
  private final HttpRequest upgradeRequest;
  
  public Zrdc(ProxyWebSocket paramProxyWebSocket, HttpRequest paramHttpRequest) {
    this.proxyWebSocket = paramProxyWebSocket;
    this.upgradeRequest = paramHttpRequest;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrdc;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrdc;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrdc;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public ProxyWebSocket proxyWebSocket() {
    return this.proxyWebSocket;
  }
  
  public HttpRequest upgradeRequest() {
    return this.upgradeRequest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */