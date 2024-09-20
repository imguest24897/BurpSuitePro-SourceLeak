package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.proxy.websocket.ProxyWebSocket;
import burp.api.montoya.proxy.websocket.ProxyWebSocketCreationHandler;
import burp.api.montoya.websocket.WebSocket;
import burp.api.montoya.websocket.WebSocketCreatedHandler;

class Zzq implements Zt95 {
  final WebSocket Zm;
  
  final HttpRequest ZA;
  
  final ToolSource Zw;
  
  final Zeew Zo;
  
  final Zefe Zd;
  
  Zzq(Zefe paramZefe, WebSocket paramWebSocket, HttpRequest paramHttpRequest, ToolSource paramToolSource, Zeew paramZeew) {}
  
  public void ZR(Zxym paramZxym) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zefe;
    //   4: getfield ZQ : Ljava/util/List;
    //   7: aload_0
    //   8: getfield Zm : Lburp/api/montoya/websocket/WebSocket;
    //   11: aload_0
    //   12: getfield ZA : Lburp/api/montoya/http/message/requests/HttpRequest;
    //   15: aload_0
    //   16: getfield Zw : Lburp/api/montoya/core/ToolSource;
    //   19: <illegal opcode> accept : (Lburp/api/montoya/websocket/WebSocket;Lburp/api/montoya/http/message/requests/HttpRequest;Lburp/api/montoya/core/ToolSource;)Ljava/util/function/Consumer;
    //   24: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   29: return
  }
  
  public void Zi(Zth_ paramZth_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zefe;
    //   4: getfield ZQ : Ljava/util/List;
    //   7: aload_0
    //   8: getfield Zm : Lburp/api/montoya/websocket/WebSocket;
    //   11: aload_0
    //   12: getfield ZA : Lburp/api/montoya/http/message/requests/HttpRequest;
    //   15: aload_0
    //   16: getfield Zw : Lburp/api/montoya/core/ToolSource;
    //   19: <illegal opcode> accept : (Lburp/api/montoya/websocket/WebSocket;Lburp/api/montoya/http/message/requests/HttpRequest;Lburp/api/montoya/core/ToolSource;)Ljava/util/function/Consumer;
    //   24: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   29: aload_0
    //   30: getfield Zo : Lburp/Zeew;
    //   33: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   36: if_acmpne -> 84
    //   39: new burp/Ztzm
    //   42: dup
    //   43: aload_1
    //   44: aload_0
    //   45: getfield Zd : Lburp/Zefe;
    //   48: getfield ZW : Lburp/Ze2b;
    //   51: aload_0
    //   52: getfield Zd : Lburp/Zefe;
    //   55: getfield Zw : Lburp/Zskl;
    //   58: invokespecial <init> : (Lburp/Zth_;Lburp/Ze2b;Lburp/Zskl;)V
    //   61: astore_2
    //   62: aload_0
    //   63: getfield Zd : Lburp/Zefe;
    //   66: getfield ZY : Ljava/util/List;
    //   69: aload_2
    //   70: aload_0
    //   71: getfield ZA : Lburp/api/montoya/http/message/requests/HttpRequest;
    //   74: <illegal opcode> accept : (Lburp/api/montoya/proxy/websocket/ProxyWebSocket;Lburp/api/montoya/http/message/requests/HttpRequest;)Ljava/util/function/Consumer;
    //   79: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   84: return
  }
  
  private static void lambda$visit$2(ProxyWebSocket paramProxyWebSocket, HttpRequest paramHttpRequest, ProxyWebSocketCreationHandler paramProxyWebSocketCreationHandler) {
    paramProxyWebSocketCreationHandler.handleWebSocketCreation(new Zrdc(paramProxyWebSocket, paramHttpRequest));
  }
  
  private static void lambda$visit$0(WebSocket paramWebSocket, HttpRequest paramHttpRequest, ToolSource paramToolSource, WebSocketCreatedHandler paramWebSocketCreatedHandler) {
    paramWebSocketCreatedHandler.handleWebSocketCreated(new Ztez(paramWebSocket, paramHttpRequest, paramToolSource));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */