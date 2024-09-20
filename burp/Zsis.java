package burp;

import burp.api.montoya.proxy.websocket.ProxyMessageHandler;
import burp.api.montoya.websocket.Direction;
import java.util.List;

final class Zsis extends Record {
  private final Zskl ZP;
  
  private final List<ProxyMessageHandler> Zw;
  
  private Zsis(Zskl paramZskl, List<ProxyMessageHandler> paramList) {
    this.ZP = paramZskl;
    this.Zw = paramList;
  }
  
  Zl3z Zn(Zl3z paramZl3z, Direction paramDirection) {
    // Byte code:
    //   0: invokestatic ZJ : ()Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic burp/Zz1o.Zr : [I
    //   7: aload_1
    //   8: invokevirtual ZY : ()Lburp/Zsg3;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: lookupswitch default -> 360, 1 -> 40, 2 -> 198
    //   40: aload_0
    //   41: getfield Zw : Ljava/util/List;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #4
    //   51: aload #4
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 194
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
    //   86: getfield ZP : Lburp/Zskl;
    //   89: aload_1
    //   90: invokevirtual ZU : ()Lburp/Zt83;
    //   93: invokeinterface Zk : (Lburp/Zt83;)Lburp/api/montoya/core/Annotations;
    //   98: invokespecial <init> : (Ljava/lang/String;Lburp/api/montoya/websocket/Direction;Lburp/api/montoya/core/Annotations;)V
    //   101: astore #6
    //   103: aload #5
    //   105: aload #6
    //   107: invokeinterface handleTextMessageReceived : (Lburp/api/montoya/proxy/websocket/InterceptedTextMessage;)Lburp/api/montoya/proxy/websocket/TextMessageReceivedAction;
    //   112: astore #7
    //   114: aload #7
    //   116: invokeinterface action : ()Lburp/api/montoya/proxy/MessageReceivedAction;
    //   121: getstatic burp/api/montoya/proxy/MessageReceivedAction.DROP : Lburp/api/montoya/proxy/MessageReceivedAction;
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
    //   160: astore #9
    //   162: new burp/Zl3z
    //   165: dup
    //   166: aload #9
    //   168: aload #7
    //   170: invokeinterface action : ()Lburp/api/montoya/proxy/MessageReceivedAction;
    //   175: getstatic burp/api/montoya/proxy/MessageReceivedAction.INTERCEPT : Lburp/api/montoya/proxy/MessageReceivedAction;
    //   178: if_acmpne -> 185
    //   181: iconst_1
    //   182: goto -> 186
    //   185: iconst_0
    //   186: invokespecial <init> : (Lburp/Zl36;Z)V
    //   189: astore_1
    //   190: aload_3
    //   191: ifnonnull -> 51
    //   194: aload_3
    //   195: ifnonnull -> 360
    //   198: aload_0
    //   199: getfield Zw : Ljava/util/List;
    //   202: invokeinterface iterator : ()Ljava/util/Iterator;
    //   207: astore #4
    //   209: aload #4
    //   211: invokeinterface hasNext : ()Z
    //   216: ifeq -> 360
    //   219: aload #4
    //   221: invokeinterface next : ()Ljava/lang/Object;
    //   226: checkcast burp/api/montoya/proxy/websocket/ProxyMessageHandler
    //   229: astore #5
    //   231: new burp/Ztct
    //   234: dup
    //   235: aload_0
    //   236: getfield ZP : Lburp/Zskl;
    //   239: aload_1
    //   240: invokevirtual ZH : ()[B
    //   243: invokeinterface ZI : ([B)Lburp/api/montoya/core/ByteArray;
    //   248: aload_2
    //   249: aload_0
    //   250: getfield ZP : Lburp/Zskl;
    //   253: aload_1
    //   254: invokevirtual ZU : ()Lburp/Zt83;
    //   257: invokeinterface Zk : (Lburp/Zt83;)Lburp/api/montoya/core/Annotations;
    //   262: invokespecial <init> : (Lburp/api/montoya/core/ByteArray;Lburp/api/montoya/websocket/Direction;Lburp/api/montoya/core/Annotations;)V
    //   265: astore #6
    //   267: aload #5
    //   269: aload #6
    //   271: invokeinterface handleBinaryMessageReceived : (Lburp/api/montoya/proxy/websocket/InterceptedBinaryMessage;)Lburp/api/montoya/proxy/websocket/BinaryMessageReceivedAction;
    //   276: astore #7
    //   278: aload #7
    //   280: invokeinterface action : ()Lburp/api/montoya/proxy/MessageReceivedAction;
    //   285: getstatic burp/api/montoya/proxy/MessageReceivedAction.DROP : Lburp/api/montoya/proxy/MessageReceivedAction;
    //   288: if_acmpne -> 293
    //   291: aconst_null
    //   292: areturn
    //   293: aload #6
    //   295: invokeinterface annotations : ()Lburp/api/montoya/core/Annotations;
    //   300: invokestatic ZT : (Lburp/api/montoya/core/Annotations;)Lburp/Zt83;
    //   303: astore #8
    //   305: aload_1
    //   306: aload #7
    //   308: invokeinterface payload : ()Lburp/api/montoya/core/ByteArray;
    //   313: invokeinterface getBytes : ()[B
    //   318: invokevirtual ZV : ([B)Lburp/Zl36;
    //   321: aload #8
    //   323: invokevirtual Zc : (Lburp/Zt83;)Lburp/Zl36;
    //   326: astore #9
    //   328: new burp/Zl3z
    //   331: dup
    //   332: aload #9
    //   334: aload #7
    //   336: invokeinterface action : ()Lburp/api/montoya/proxy/MessageReceivedAction;
    //   341: getstatic burp/api/montoya/proxy/MessageReceivedAction.INTERCEPT : Lburp/api/montoya/proxy/MessageReceivedAction;
    //   344: if_acmpne -> 351
    //   347: iconst_1
    //   348: goto -> 352
    //   351: iconst_0
    //   352: invokespecial <init> : (Lburp/Zl36;Z)V
    //   355: astore_1
    //   356: aload_3
    //   357: ifnonnull -> 209
    //   360: aload_1
    //   361: areturn
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsis;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsis;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsis;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */