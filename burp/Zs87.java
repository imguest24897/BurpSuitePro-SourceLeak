package burp;

import burp.api.montoya.websocket.extension.ExtensionWebSocketMessageHandler;
import java.util.List;

final class Zs87 extends Record {
  private final Zskl Zo;
  
  private final List<ExtensionWebSocketMessageHandler> ZR;
  
  private Zs87(Zskl paramZskl, List<ExtensionWebSocketMessageHandler> paramList) {
    this.Zo = paramZskl;
    this.ZR = paramList;
  }
  
  Zl36 Zo(Zl36 paramZl36) {
    // Byte code:
    //   0: invokestatic ZJ : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zgv8.ZR : [I
    //   7: aload_1
    //   8: invokevirtual ZY : ()Lburp/Zsg3;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: lookupswitch default -> 174, 1 -> 40, 2 -> 106
    //   40: aload_0
    //   41: getfield ZR : Ljava/util/List;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore_3
    //   50: aload_3
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 102
    //   59: aload_3
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: checkcast burp/api/montoya/websocket/extension/ExtensionWebSocketMessageHandler
    //   68: astore #4
    //   70: aload_1
    //   71: invokevirtual ZH : ()[B
    //   74: invokestatic ZG : ([B)Ljava/lang/String;
    //   77: astore #5
    //   79: aload #4
    //   81: new burp/Zg3c
    //   84: dup
    //   85: aload #5
    //   87: getstatic burp/api/montoya/websocket/Direction.SERVER_TO_CLIENT : Lburp/api/montoya/websocket/Direction;
    //   90: invokespecial <init> : (Ljava/lang/String;Lburp/api/montoya/websocket/Direction;)V
    //   93: invokeinterface textMessageReceived : (Lburp/api/montoya/websocket/TextMessage;)V
    //   98: aload_2
    //   99: ifnonnull -> 50
    //   102: aload_2
    //   103: ifnonnull -> 174
    //   106: aload_0
    //   107: getfield ZR : Ljava/util/List;
    //   110: invokeinterface iterator : ()Ljava/util/Iterator;
    //   115: astore_3
    //   116: aload_3
    //   117: invokeinterface hasNext : ()Z
    //   122: ifeq -> 174
    //   125: aload_3
    //   126: invokeinterface next : ()Ljava/lang/Object;
    //   131: checkcast burp/api/montoya/websocket/extension/ExtensionWebSocketMessageHandler
    //   134: astore #4
    //   136: aload_0
    //   137: getfield Zo : Lburp/Zskl;
    //   140: aload_1
    //   141: invokevirtual ZH : ()[B
    //   144: invokeinterface ZI : ([B)Lburp/api/montoya/core/ByteArray;
    //   149: astore #5
    //   151: aload #4
    //   153: new burp/Zgq3
    //   156: dup
    //   157: aload #5
    //   159: getstatic burp/api/montoya/websocket/Direction.SERVER_TO_CLIENT : Lburp/api/montoya/websocket/Direction;
    //   162: invokespecial <init> : (Lburp/api/montoya/core/ByteArray;Lburp/api/montoya/websocket/Direction;)V
    //   165: invokeinterface binaryMessageReceived : (Lburp/api/montoya/websocket/BinaryMessage;)V
    //   170: aload_2
    //   171: ifnonnull -> 116
    //   174: aload_1
    //   175: areturn
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zs87;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zs87;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zs87;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs87.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */