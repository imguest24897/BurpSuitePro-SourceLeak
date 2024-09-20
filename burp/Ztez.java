package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.websocket.WebSocket;
import burp.api.montoya.websocket.WebSocketCreated;

public final class Ztez extends Record implements WebSocketCreated {
  private final WebSocket webSocket;
  
  private final HttpRequest upgradeRequest;
  
  private final ToolSource toolSource;
  
  public Ztez(WebSocket paramWebSocket, HttpRequest paramHttpRequest, ToolSource paramToolSource) {
    this.webSocket = paramWebSocket;
    this.upgradeRequest = paramHttpRequest;
    this.toolSource = paramToolSource;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztez;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztez;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztez;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public WebSocket webSocket() {
    return this.webSocket;
  }
  
  public HttpRequest upgradeRequest() {
    return this.upgradeRequest;
  }
  
  public ToolSource toolSource() {
    return this.toolSource;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztez.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */