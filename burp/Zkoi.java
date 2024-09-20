package burp;

import burp.api.montoya.proxy.websocket.ProxyMessageHandler;
import burp.api.montoya.websocket.Direction;
import java.util.List;

final class Zkoi extends Record {
  private final Zskl ZU;
  
  private final List<ProxyMessageHandler> ZL;
  
  private Zkoi(Zskl paramZskl, List<ProxyMessageHandler> paramList) {
    this.ZU = paramZskl;
    this.ZL = paramList;
  }
  
  Zl36 Zx(Zl36 paramZl36, Direction paramDirection) {
    // Byte code:
    //   0: invokestatic ZJ : ()Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic burp/Zz1o.Zr : [I
    //   7: aload_1
    //   8: invokevirtual ZY : ()Lburp/Zsg3;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: lookupswitch default -> 302, 1 -> 40, 2 -> 169
    //   40: aload_0
    //   41: getfield ZL : Ljava/util/List;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #4
    //   51: aload #4
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 165
    //   61: aload #4
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast burp/api/montoya/proxy/websocket/ProxyMessageHandler
    //   71: astore #5
    //   73: new burp/Zmdc
    //   76: dup
    //   77: aload_1
    //   78: invokevirtual ZH : ()[B
    //   81: invokestatic ZG : ([B)Ljava/lang/String;
    //   84: aload_2
    //   85: aload_0
    //   86: getfield ZU : Lburp/Zskl;
    //   89: aload_1
    //   90: invokevirtual ZU : ()Lburp/Zt83;
    //   93: invokeinterface Zk : (Lburp/Zt83;)Lburp/api/montoya/core/Annotations;
    //   98: invokespecial <init> : (Ljava/lang/String;Lburp/api/montoya/websocket/Direction;Lburp/api/montoya/core/Annotations;)V
    //   101: astore #6
    //   103: aload #5
    //   105: aload #6
    //   107: invokeinterface handleTextMessageToBeSent : (Lburp/api/montoya/proxy/websocket/InterceptedTextMessage;)Lburp/api/montoya/proxy/websocket/TextMessageToBeSentAction;
    //   112: astore #7
    //   114: aload #7
    //   116: invokeinterface action : ()Lburp/api/montoya/proxy/MessageToBeSentAction;
    //   121: getstatic burp/api/montoya/proxy/MessageToBeSentAction.DROP : Lburp/api/montoya/proxy/MessageToBeSentAction;
    //   124: if_acmpne -> 129
    //   127: aconst_null
    //   128: areturn
    //   129: aload #6
    //   131: invokeinterface annotations : ()Lburp/api/montoya/core/Annotations;
    //   136: invokestatic ZT : (Lburp/api/montoya/core/Annotations;)Lburp/Zt83;
    //   139: astore #8
    //   141: aload_1
    //   142: aload #7
    //   144: invokeinterface payload : ()Ljava/lang/String;
    //   149: invokevirtual getBytes : ()[B
    //   152: invokevirtual ZV : ([B)Lburp/Zl36;
    //   155: aload #8
    //   157: invokevirtual Zc : (Lburp/Zt83;)Lburp/Zl36;
    //   160: astore_1
    //   161: aload_3
    //   162: ifnonnull -> 51
    //   165: aload_3
    //   166: ifnonnull -> 302
    //   169: aload_0
    //   170: getfield ZL : Ljava/util/List;
    //   173: invokeinterface iterator : ()Ljava/util/Iterator;
    //   178: astore #4
    //   180: aload #4
    //   182: invokeinterface hasNext : ()Z
    //   187: ifeq -> 302
    //   190: aload #4
    //   192: invokeinterface next : ()Ljava/lang/Object;
    //   197: checkcast burp/api/montoya/proxy/websocket/ProxyMessageHandler
    //   200: astore #5
    //   202: new burp/Ztct
    //   205: dup
    //   206: aload_0
    //   207: getfield ZU : Lburp/Zskl;
    //   210: aload_1
    //   211: invokevirtual ZH : ()[B
    //   214: invokeinterface ZI : ([B)Lburp/api/montoya/core/ByteArray;
    //   219: aload_2
    //   220: aload_0
    //   221: getfield ZU : Lburp/Zskl;
    //   224: aload_1
    //   225: invokevirtual ZU : ()Lburp/Zt83;
    //   228: invokeinterface Zk : (Lburp/Zt83;)Lburp/api/montoya/core/Annotations;
    //   233: invokespecial <init> : (Lburp/api/montoya/core/ByteArray;Lburp/api/montoya/websocket/Direction;Lburp/api/montoya/core/Annotations;)V
    //   236: astore #6
    //   238: aload #5
    //   240: aload #6
    //   242: invokeinterface handleBinaryMessageToBeSent : (Lburp/api/montoya/proxy/websocket/InterceptedBinaryMessage;)Lburp/api/montoya/proxy/websocket/BinaryMessageToBeSentAction;
    //   247: astore #7
    //   249: aload #7
    //   251: invokeinterface action : ()Lburp/api/montoya/proxy/MessageToBeSentAction;
    //   256: getstatic burp/api/montoya/proxy/MessageToBeSentAction.DROP : Lburp/api/montoya/proxy/MessageToBeSentAction;
    //   259: if_acmpne -> 264
    //   262: aconst_null
    //   263: areturn
    //   264: aload #6
    //   266: invokeinterface annotations : ()Lburp/api/montoya/core/Annotations;
    //   271: invokestatic ZT : (Lburp/api/montoya/core/Annotations;)Lburp/Zt83;
    //   274: astore #8
    //   276: aload_1
    //   277: aload #7
    //   279: invokeinterface payload : ()Lburp/api/montoya/core/ByteArray;
    //   284: invokeinterface getBytes : ()[B
    //   289: invokevirtual ZV : ([B)Lburp/Zl36;
    //   292: aload #8
    //   294: invokevirtual Zc : (Lburp/Zt83;)Lburp/Zl36;
    //   297: astore_1
    //   298: aload_3
    //   299: ifnonnull -> 180
    //   302: aload_1
    //   303: areturn
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkoi;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkoi;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkoi;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */