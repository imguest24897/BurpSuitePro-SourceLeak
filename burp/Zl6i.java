package burp;

import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.websocket.extension.ExtensionWebSocket;
import burp.api.montoya.websocket.extension.ExtensionWebSocketCreation;
import burp.api.montoya.websocket.extension.ExtensionWebSocketCreationStatus;
import java.util.Optional;

final class Zl6i extends Record implements ExtensionWebSocketCreation {
  private final ExtensionWebSocketCreationStatus status;
  
  private final Optional<ExtensionWebSocket> webSocket;
  
  private final Optional<HttpResponse> upgradeResponse;
  
  Zl6i(ExtensionWebSocketCreationStatus paramExtensionWebSocketCreationStatus, Optional<ExtensionWebSocket> paramOptional, Optional<HttpResponse> paramOptional1) {
    this.status = paramExtensionWebSocketCreationStatus;
    this.webSocket = paramOptional;
    this.upgradeResponse = paramOptional1;
  }
  
  public ExtensionWebSocketCreationStatus status() {
    return this.status;
  }
  
  public Optional<ExtensionWebSocket> webSocket() {
    return this.webSocket;
  }
  
  public Optional<HttpResponse> upgradeResponse() {
    return this.upgradeResponse;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zl6i;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zl6i;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zl6i;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */