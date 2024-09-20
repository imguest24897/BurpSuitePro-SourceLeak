package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

class Zx4z {
  private static final Zx4z Zi = new Zx4z(Map.of(Zb2t.SEND, Collections.emptyList(), Zb2t.SEND_SEQUENCE, Collections.emptyList(), Zb2t.SEND_ON_SINGLE_CONNECTION, Collections.emptyList(), Zb2t.SEND_PARALLEL, Collections.emptyList()));
  
  private final Map<Zb2t, List<Ztsf>> ZE;
  
  private Zx4z(Map<Zb2t, List<Ztsf>> paramMap) {
    this.ZE = paramMap;
  }
  
  public boolean Zl(Zb2t paramZb2t) {
    return ((List)this.ZE.get(paramZb2t)).isEmpty();
  }
  
  public List<Ztsf> Zt(Zb2t paramZb2t) {
    return this.ZE.get(paramZb2t);
  }
  
  static Zx4z ZS(Zsny paramZsny) {
    // Byte code:
    //   0: invokestatic ZC : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual Zz : ()Ljava/util/Collection;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifne -> 24
    //   16: iconst_1
    //   17: goto -> 25
    //   20: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   23: athrow
    //   24: iconst_0
    //   25: istore_2
    //   26: aload_0
    //   27: invokevirtual Zy : ()Ljava/util/Collection;
    //   30: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   35: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   40: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   45: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   50: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   55: istore_3
    //   56: aload_0
    //   57: invokevirtual Zy : ()Ljava/util/Collection;
    //   60: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   65: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   70: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   75: istore #4
    //   77: aload_0
    //   78: invokevirtual Zy : ()Ljava/util/Collection;
    //   81: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   86: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   91: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   96: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   101: invokeinterface count : ()J
    //   106: lstore #5
    //   108: aload_0
    //   109: invokevirtual Zy : ()Ljava/util/Collection;
    //   112: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   117: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   122: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   127: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   132: invokeinterface count : ()J
    //   137: lstore #7
    //   139: lload #5
    //   141: lconst_1
    //   142: lcmp
    //   143: ifgt -> 160
    //   146: lload #7
    //   148: lconst_1
    //   149: lcmp
    //   150: ifle -> 168
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   159: athrow
    //   160: iconst_1
    //   161: goto -> 169
    //   164: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   167: athrow
    //   168: iconst_0
    //   169: istore #9
    //   171: aload_0
    //   172: invokevirtual Zy : ()Ljava/util/Collection;
    //   175: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   180: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   185: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   190: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   195: invokeinterface count : ()J
    //   200: lstore #10
    //   202: lload #10
    //   204: lconst_1
    //   205: lcmp
    //   206: ifle -> 217
    //   209: iconst_1
    //   210: goto -> 218
    //   213: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   216: athrow
    //   217: iconst_0
    //   218: istore #12
    //   220: aload_0
    //   221: invokestatic Zj : (Lburp/Zsny;)Lburp/Zgsq;
    //   224: astore #13
    //   226: aload #13
    //   228: getstatic burp/Zgsq.HTTP1 : Lburp/Zgsq;
    //   231: if_acmpeq -> 249
    //   234: aload #13
    //   236: getstatic burp/Zgsq.AUTO : Lburp/Zgsq;
    //   239: if_acmpne -> 286
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   248: athrow
    //   249: aload_0
    //   250: invokevirtual Zy : ()Ljava/util/Collection;
    //   253: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   258: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   263: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   268: ifeq -> 286
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   277: athrow
    //   278: iconst_1
    //   279: goto -> 287
    //   282: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   285: athrow
    //   286: iconst_0
    //   287: istore #14
    //   289: aload #13
    //   291: getstatic burp/Zgsq.HTTP2 : Lburp/Zgsq;
    //   294: if_acmpeq -> 312
    //   297: aload #13
    //   299: getstatic burp/Zgsq.AUTO : Lburp/Zgsq;
    //   302: if_acmpne -> 349
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   311: athrow
    //   312: aload_0
    //   313: invokevirtual Zy : ()Ljava/util/Collection;
    //   316: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   321: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   326: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   331: ifeq -> 349
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   340: athrow
    //   341: iconst_1
    //   342: goto -> 350
    //   345: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   348: athrow
    //   349: iconst_0
    //   350: istore #15
    //   352: invokestatic ZH : ()Lburp/Zkd3;
    //   355: iload_3
    //   356: invokevirtual Zv : (Z)Lburp/Zkd3;
    //   359: iload #4
    //   361: invokevirtual ZZ : (Z)Lburp/Zkd3;
    //   364: iload_2
    //   365: invokevirtual Zh : (Z)Lburp/Zkd3;
    //   368: iload #9
    //   370: invokevirtual Zu : (Z)Lburp/Zkd3;
    //   373: iload #12
    //   375: invokevirtual ZX : (Z)Lburp/Zkd3;
    //   378: iload #14
    //   380: invokevirtual Zp : (Z)Lburp/Zkd3;
    //   383: iload #15
    //   385: invokevirtual Zj : (Z)Lburp/Zkd3;
    //   388: invokevirtual Zh : ()Lburp/Zx4z;
    //   391: invokestatic Zwu : ()[Lburp/Zbqc;
    //   394: ifnonnull -> 411
    //   397: iconst_2
    //   398: anewarray burp/Zbqc
    //   401: invokestatic Zu : ([Lburp/Zbqc;)V
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   410: athrow
    //   411: areturn
    // Exception table:
    //   from	to	target	type
    //   4	20	20	java/lang/IllegalStateException
    //   139	153	156	java/lang/IllegalStateException
    //   146	164	164	java/lang/IllegalStateException
    //   202	213	213	java/lang/IllegalStateException
    //   226	242	245	java/lang/IllegalStateException
    //   234	271	274	java/lang/IllegalStateException
    //   249	282	282	java/lang/IllegalStateException
    //   289	305	308	java/lang/IllegalStateException
    //   297	334	337	java/lang/IllegalStateException
    //   312	345	345	java/lang/IllegalStateException
    //   352	404	407	java/lang/IllegalStateException
  }
  
  private static Zkd3 ZH() {
    return new Zkd3();
  }
  
  static Zgsq Zj(Zsny paramZsny) {
    return (Zgsq)paramZsny.Zy().stream().map(Ztpl::ZB).findFirst().orElseThrow(IllegalStateException::new);
  }
  
  private static boolean lambda$availableSendOptions$3(Ztpl paramZtpl) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !paramZtpl.Zr().Zh().Zu8();
  }
  
  private static boolean lambda$availableSendOptions$2(Ztpl paramZtpl) {
    return paramZtpl.Zr().Zh().Zuq();
  }
  
  private static boolean lambda$availableSendOptions$1(Ztpl paramZtpl) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramZtpl.Zl() == null);
  }
  
  private static boolean lambda$availableSendOptions$0(Zefx paramZefx) {
    try {
      if (paramZefx != null) {
        try {
          if (paramZefx.Zh());
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */