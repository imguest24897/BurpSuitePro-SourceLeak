package net.portswigger;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class Zt9 {
  private static final String[] a;
  
  private static final String[] b;
  
  static Optional<Zms> ZP(String paramString, Zav paramZav, Map<String, Integer> paramMap, List<Zms> paramList, boolean paramBoolean) {
    return Zn(paramString, paramZav, 0, paramMap, paramList, paramBoolean);
  }
  
  private static Optional<Zms> Zn(String paramString, Zav paramZav, int paramInt, Map<String, Integer> paramMap, List<Zms> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: iconst_1
    //   2: iadd
    //   3: istore #6
    //   5: aload_1
    //   6: invokevirtual Zp : ()Ljava/lang/String;
    //   9: astore #7
    //   11: aload #7
    //   13: ifnull -> 57
    //   16: aload_3
    //   17: aload #7
    //   19: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   24: invokeinterface compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    //   29: checkcast java/lang/Integer
    //   32: invokevirtual intValue : ()I
    //   35: iconst_4
    //   36: if_icmple -> 57
    //   39: goto -> 46
    //   42: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   45: athrow
    //   46: invokestatic Zf : ()Lnet/portswigger/Zz5;
    //   49: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   52: areturn
    //   53: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual Zc : ()Ljava/util/List;
    //   61: astore #8
    //   63: aload #8
    //   65: invokeinterface isEmpty : ()Z
    //   70: ifne -> 89
    //   73: aload_0
    //   74: iload #6
    //   76: aload_3
    //   77: aload #4
    //   79: aload #8
    //   81: invokestatic Zd : (Ljava/lang/String;ILjava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/util/Optional;
    //   84: areturn
    //   85: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   88: athrow
    //   89: aload_1
    //   90: invokevirtual ZY : ()Ljava/util/List;
    //   93: astore #9
    //   95: aload #9
    //   97: invokeinterface isEmpty : ()Z
    //   102: ifne -> 121
    //   105: aload_0
    //   106: iload #6
    //   108: aload_3
    //   109: aload #4
    //   111: aload #9
    //   113: invokestatic Zd : (Ljava/lang/String;ILjava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/util/Optional;
    //   116: areturn
    //   117: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   120: athrow
    //   121: aload_1
    //   122: invokevirtual ZP : ()Ljava/util/List;
    //   125: astore #10
    //   127: aload #10
    //   129: invokeinterface isEmpty : ()Z
    //   134: ifne -> 261
    //   137: new net/portswigger/Ztk
    //   140: dup
    //   141: invokespecial <init> : ()V
    //   144: astore #11
    //   146: aload #10
    //   148: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   153: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   158: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   163: iload #6
    //   165: aload_3
    //   166: aload #4
    //   168: <illegal opcode> apply : (ILjava/util/Map;Ljava/util/List;)Ljava/util/function/Function;
    //   173: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   178: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   183: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   188: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   193: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   198: aload #11
    //   200: dup
    //   201: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: <illegal opcode> accept : (Lnet/portswigger/Ztk;)Ljava/util/function/Consumer;
    //   210: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   215: aload_0
    //   216: ifnull -> 248
    //   219: new net/portswigger/Zuq
    //   222: dup
    //   223: invokespecial <init> : ()V
    //   226: aload_0
    //   227: invokevirtual Zb : (Ljava/lang/String;)Lnet/portswigger/Zuq;
    //   230: aload #11
    //   232: invokevirtual Zk : ()Lnet/portswigger/Zt2;
    //   235: invokevirtual Za : (Lnet/portswigger/Zms;)Lnet/portswigger/Zuq;
    //   238: invokevirtual Zu : ()Lnet/portswigger/Zlw;
    //   241: goto -> 253
    //   244: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   247: athrow
    //   248: aload #11
    //   250: invokevirtual Zk : ()Lnet/portswigger/Zt2;
    //   253: astore #12
    //   255: aload #12
    //   257: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   260: areturn
    //   261: getstatic net/portswigger/Zvx.ZW : [I
    //   264: aload_1
    //   265: invokevirtual Zg : ()Lnet/portswigger/Ziq;
    //   268: invokevirtual ordinal : ()I
    //   271: iaload
    //   272: lookupswitch default -> 338, 1 -> 300, 2 -> 322
    //   300: aload_0
    //   301: aload_1
    //   302: iload #6
    //   304: aload_3
    //   305: aload #4
    //   307: iload #5
    //   309: invokestatic ZR : (Ljava/lang/String;Lnet/portswigger/Zav;ILjava/util/Map;Ljava/util/List;Z)Lnet/portswigger/Zms;
    //   312: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   315: goto -> 367
    //   318: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   321: athrow
    //   322: aload_0
    //   323: aload_1
    //   324: iload #6
    //   326: aload_3
    //   327: iload #5
    //   329: invokestatic Zh : (Ljava/lang/String;Lnet/portswigger/Zav;ILjava/util/Map;Z)Lnet/portswigger/Zms;
    //   332: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   335: goto -> 367
    //   338: aload_1
    //   339: aload_1
    //   340: invokevirtual Zj : ()Ljava/util/stream/Stream;
    //   343: iload #5
    //   345: aload_1
    //   346: invokevirtual Zh : ()Ljava/lang/String;
    //   349: invokestatic ZK : (Lnet/portswigger/Zav;Ljava/util/stream/Stream;ZLjava/lang/String;)Lnet/portswigger/Zms;
    //   352: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   355: aload_1
    //   356: aload_0
    //   357: iload #5
    //   359: <illegal opcode> apply : (Lnet/portswigger/Zav;Ljava/lang/String;Z)Ljava/util/function/Function;
    //   364: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   367: areturn
    // Exception table:
    //   from	to	target	type
    //   11	39	42	net/portswigger/Zki
    //   16	53	53	net/portswigger/Zki
    //   63	85	85	net/portswigger/Zki
    //   95	117	117	net/portswigger/Zki
    //   146	244	244	net/portswigger/Zki
    //   261	318	318	net/portswigger/Zki
  }
  
  private static Optional<Zms> Zd(String paramString, int paramInt, Map<String, Integer> paramMap, List<Zms> paramList, List<Zav> paramList1) {
    // Byte code:
    //   0: new net/portswigger/Zoa
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: aload #4
    //   11: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   16: iload_1
    //   17: aload_2
    //   18: aload_3
    //   19: <illegal opcode> apply : (ILjava/util/Map;Ljava/util/List;)Ljava/util/function/Function;
    //   24: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   29: aload #5
    //   31: dup
    //   32: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   35: pop
    //   36: <illegal opcode> accept : (Lnet/portswigger/Zoa;)Ljava/util/function/Consumer;
    //   41: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   46: aload_0
    //   47: ifnull -> 79
    //   50: new net/portswigger/Zuq
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: aload_0
    //   58: invokevirtual Zb : (Ljava/lang/String;)Lnet/portswigger/Zuq;
    //   61: aload #5
    //   63: invokevirtual ZS : ()Lnet/portswigger/Zsj;
    //   66: invokevirtual Za : (Lnet/portswigger/Zms;)Lnet/portswigger/Zuq;
    //   69: invokevirtual Zu : ()Lnet/portswigger/Zlw;
    //   72: goto -> 84
    //   75: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   78: athrow
    //   79: aload #5
    //   81: invokevirtual ZS : ()Lnet/portswigger/Zsj;
    //   84: astore #6
    //   86: aload #6
    //   88: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   91: areturn
    // Exception table:
    //   from	to	target	type
    //   9	75	75	net/portswigger/Zki
  }
  
  private static Zms ZR(String paramString, Zav paramZav, int paramInt, Map<String, Integer> paramMap, List<Zms> paramList, boolean paramBoolean) {
    try {
      if (paramString == null)
        return ZU(paramZav, paramInt, paramMap, paramList); 
    } catch (Zki zki) {
      throw a(null);
    } 
    return Zm(paramString, paramZav, paramInt, paramMap, paramList, paramBoolean);
  }
  
  static Zlw Zm(String paramString, Zav paramZav, int paramInt, Map<String, Integer> paramMap, List<Zms> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual Zr : ()Lnet/portswigger/Zab;
    //   7: astore #7
    //   9: astore #6
    //   11: aload #7
    //   13: invokevirtual ZL : ()Ljava/lang/String;
    //   16: ifnull -> 31
    //   19: aload #7
    //   21: invokevirtual ZL : ()Ljava/lang/String;
    //   24: goto -> 32
    //   27: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   30: athrow
    //   31: aload_0
    //   32: astore #8
    //   34: aload #7
    //   36: invokevirtual Zw : ()Ljava/lang/String;
    //   39: ifnull -> 78
    //   42: sipush #9366
    //   45: sipush #-26972
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: iconst_2
    //   52: anewarray java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload #7
    //   59: invokevirtual Zw : ()Ljava/lang/String;
    //   62: aastore
    //   63: dup
    //   64: iconst_1
    //   65: aload #8
    //   67: aastore
    //   68: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   71: goto -> 80
    //   74: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   77: athrow
    //   78: aload #8
    //   80: astore #8
    //   82: new net/portswigger/Zuq
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: astore #9
    //   91: new net/portswigger/Ztk
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: astore #10
    //   100: new net/portswigger/Ztk
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore #11
    //   109: aload #7
    //   111: invokevirtual ZQ : ()Ljava/lang/String;
    //   114: ifnull -> 182
    //   117: aload #11
    //   119: new net/portswigger/Zuq
    //   122: dup
    //   123: invokespecial <init> : ()V
    //   126: sipush #9365
    //   129: sipush #19596
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: iconst_1
    //   136: anewarray java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload #7
    //   143: invokevirtual Zw : ()Ljava/lang/String;
    //   146: aastore
    //   147: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   150: invokevirtual Zb : (Ljava/lang/String;)Lnet/portswigger/Zuq;
    //   153: new net/portswigger/Zrm7
    //   156: dup
    //   157: aload #7
    //   159: invokevirtual ZQ : ()Ljava/lang/String;
    //   162: invokespecial <init> : (Ljava/lang/String;)V
    //   165: invokevirtual Za : (Lnet/portswigger/Zms;)Lnet/portswigger/Zuq;
    //   168: invokevirtual Zu : ()Lnet/portswigger/Zlw;
    //   171: invokevirtual Zt : (Lnet/portswigger/Zms;)Lnet/portswigger/Ztk;
    //   174: pop
    //   175: goto -> 182
    //   178: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   181: athrow
    //   182: aload_1
    //   183: invokevirtual Zi : ()Ljava/util/Map;
    //   186: aload_1
    //   187: iload_2
    //   188: iload #5
    //   190: aload_3
    //   191: aload #11
    //   193: aload #10
    //   195: <illegal opcode> accept : (Lnet/portswigger/Zav;IZLjava/util/Map;Lnet/portswigger/Ztk;Lnet/portswigger/Ztk;)Ljava/util/function/BiConsumer;
    //   200: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   205: aload #9
    //   207: aload #8
    //   209: invokevirtual Zb : (Ljava/lang/String;)Lnet/portswigger/Zuq;
    //   212: aload #10
    //   214: invokevirtual Zk : ()Lnet/portswigger/Zt2;
    //   217: invokevirtual Za : (Lnet/portswigger/Zms;)Lnet/portswigger/Zuq;
    //   220: aload #11
    //   222: invokevirtual Zk : ()Lnet/portswigger/Zt2;
    //   225: invokevirtual ZT : (Lnet/portswigger/Zms;)Lnet/portswigger/Zuq;
    //   228: aload #4
    //   230: invokevirtual Zx : (Ljava/util/List;)Lnet/portswigger/Zuq;
    //   233: iload #5
    //   235: invokevirtual Zq : (Z)Lnet/portswigger/Zuq;
    //   238: invokevirtual Zu : ()Lnet/portswigger/Zlw;
    //   241: aload #6
    //   243: ifnonnull -> 260
    //   246: iconst_1
    //   247: anewarray burp/Zbqc
    //   250: invokestatic Zr : ([Lburp/Zbqc;)V
    //   253: goto -> 260
    //   256: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   259: athrow
    //   260: areturn
    // Exception table:
    //   from	to	target	type
    //   11	27	27	net/portswigger/Zki
    //   34	74	74	net/portswigger/Zki
    //   109	175	178	net/portswigger/Zki
    //   182	253	256	net/portswigger/Zki
  }
  
  static Zt2 ZU(Zav paramZav, int paramInt, Map<String, Integer> paramMap, List<Zms> paramList) {
    // Byte code:
    //   0: new net/portswigger/Ztk
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload #4
    //   11: aload_3
    //   12: invokevirtual ZD : (Ljava/util/List;)Lnet/portswigger/Ztk;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual Zi : ()Ljava/util/Map;
    //   20: aload_0
    //   21: iload_1
    //   22: aload_2
    //   23: aload_3
    //   24: aload #4
    //   26: <illegal opcode> accept : (Lnet/portswigger/Zav;ILjava/util/Map;Ljava/util/List;Lnet/portswigger/Ztk;)Ljava/util/function/BiConsumer;
    //   31: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   36: aload #4
    //   38: invokevirtual Zk : ()Lnet/portswigger/Zt2;
    //   41: areturn
  }
  
  static Zms Zh(String paramString, Zav paramZav, int paramInt, Map<String, Integer> paramMap, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zr : ()Lnet/portswigger/Zab;
    //   4: astore #5
    //   6: aload #5
    //   8: invokevirtual ZL : ()Ljava/lang/String;
    //   11: ifnull -> 26
    //   14: aload #5
    //   16: invokevirtual ZL : ()Ljava/lang/String;
    //   19: goto -> 27
    //   22: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   25: athrow
    //   26: aload_0
    //   27: astore #6
    //   29: aload #5
    //   31: invokevirtual ZV : ()Ljava/lang/Boolean;
    //   34: invokevirtual booleanValue : ()Z
    //   37: istore #7
    //   39: new net/portswigger/Zuq
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: astore #8
    //   48: new net/portswigger/Zfj
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #9
    //   57: aload_1
    //   58: invokevirtual ZK : ()Ljava/util/Optional;
    //   61: astore #10
    //   63: aload #10
    //   65: aload #6
    //   67: iload_2
    //   68: aload_3
    //   69: iload #4
    //   71: aload #9
    //   73: <illegal opcode> accept : (Ljava/lang/String;ILjava/util/Map;ZLnet/portswigger/Zfj;)Ljava/util/function/Consumer;
    //   78: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   81: aload #9
    //   83: invokevirtual ZK : ()Lnet/portswigger/Zlq;
    //   86: astore #11
    //   88: iload #7
    //   90: ifeq -> 113
    //   93: aload #8
    //   95: aload #6
    //   97: invokevirtual Zb : (Ljava/lang/String;)Lnet/portswigger/Zuq;
    //   100: aload #11
    //   102: invokevirtual Za : (Lnet/portswigger/Zms;)Lnet/portswigger/Zuq;
    //   105: invokevirtual Zu : ()Lnet/portswigger/Zlw;
    //   108: areturn
    //   109: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   112: athrow
    //   113: aload #11
    //   115: areturn
    // Exception table:
    //   from	to	target	type
    //   6	22	22	net/portswigger/Zki
    //   88	109	109	net/portswigger/Zki
  }
  
  private static void lambda$buildXmlFragmentForArray$7(String paramString, int paramInt, Map<String, Integer> paramMap, boolean paramBoolean, Zfj paramZfj, Zav paramZav) {
    Zms zms = Zn(paramString, paramZav, paramInt, paramMap, Collections.emptyList(), paramBoolean).orElseGet(Zrmr::new);
    paramZfj.Zh(zms);
  }
  
  private static void lambda$buildXmlFragmentObjectAsContents$6(Zav paramZav, int paramInt, Map paramMap, List paramList, Ztk paramZtk, String paramString, Zoc paramZoc) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zm : ()Ljava/util/List;
    //   4: ifnull -> 36
    //   7: aload_0
    //   8: invokevirtual Zm : ()Ljava/util/List;
    //   11: aload #5
    //   13: invokeinterface contains : (Ljava/lang/Object;)Z
    //   18: ifeq -> 36
    //   21: goto -> 28
    //   24: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   27: athrow
    //   28: iconst_1
    //   29: goto -> 37
    //   32: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   35: athrow
    //   36: iconst_0
    //   37: istore #7
    //   39: iload_1
    //   40: bipush #6
    //   42: if_icmplt -> 70
    //   45: iload_1
    //   46: bipush #12
    //   48: if_icmpge -> 107
    //   51: goto -> 58
    //   54: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   57: athrow
    //   58: iload #7
    //   60: ifeq -> 107
    //   63: goto -> 70
    //   66: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   69: athrow
    //   70: aload #5
    //   72: aload #6
    //   74: invokevirtual ZF : ()Lnet/portswigger/Zav;
    //   77: iload_1
    //   78: aload_2
    //   79: aload_3
    //   80: iload #7
    //   82: invokestatic Zn : (Ljava/lang/String;Lnet/portswigger/Zav;ILjava/util/Map;Ljava/util/List;Z)Ljava/util/Optional;
    //   85: aload #4
    //   87: dup
    //   88: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: <illegal opcode> accept : (Lnet/portswigger/Ztk;)Ljava/util/function/Consumer;
    //   97: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   100: goto -> 107
    //   103: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   106: athrow
    //   107: return
    // Exception table:
    //   from	to	target	type
    //   0	21	24	net/portswigger/Zki
    //   7	32	32	net/portswigger/Zki
    //   39	51	54	net/portswigger/Zki
    //   45	63	66	net/portswigger/Zki
    //   58	100	103	net/portswigger/Zki
  }
  
  private static void lambda$buildXmlFragmentForObjectAsObject$5(Zav paramZav, int paramInt, boolean paramBoolean, Map paramMap, Ztk paramZtk1, Ztk paramZtk2, String paramString, Zoc paramZoc) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: astore #8
    //   5: aload_0
    //   6: invokevirtual Zm : ()Ljava/util/List;
    //   9: ifnull -> 41
    //   12: aload_0
    //   13: invokevirtual Zm : ()Ljava/util/List;
    //   16: aload #6
    //   18: invokeinterface contains : (Ljava/lang/Object;)Z
    //   23: ifeq -> 41
    //   26: goto -> 33
    //   29: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   32: athrow
    //   33: iconst_1
    //   34: goto -> 42
    //   37: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   40: athrow
    //   41: iconst_0
    //   42: istore #9
    //   44: iload_1
    //   45: bipush #6
    //   47: if_icmplt -> 74
    //   50: iload_1
    //   51: bipush #12
    //   53: if_icmpge -> 164
    //   56: goto -> 63
    //   59: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   62: athrow
    //   63: iload_2
    //   64: ifeq -> 164
    //   67: goto -> 74
    //   70: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   73: athrow
    //   74: aload #7
    //   76: invokevirtual ZF : ()Lnet/portswigger/Zav;
    //   79: astore #10
    //   81: aload #6
    //   83: aload #10
    //   85: iload_1
    //   86: new java/util/HashMap
    //   89: dup
    //   90: aload_3
    //   91: invokespecial <init> : (Ljava/util/Map;)V
    //   94: invokestatic emptyList : ()Ljava/util/List;
    //   97: iload #9
    //   99: invokestatic Zn : (Ljava/lang/String;Lnet/portswigger/Zav;ILjava/util/Map;Ljava/util/List;Z)Ljava/util/Optional;
    //   102: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   107: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   110: checkcast net/portswigger/Zms
    //   113: astore #11
    //   115: aload #10
    //   117: invokevirtual Zr : ()Lnet/portswigger/Zab;
    //   120: invokevirtual Zy : ()Ljava/lang/Boolean;
    //   123: invokevirtual booleanValue : ()Z
    //   126: ifeq -> 149
    //   129: aload #4
    //   131: aload #11
    //   133: invokevirtual Zt : (Lnet/portswigger/Zms;)Lnet/portswigger/Ztk;
    //   136: pop
    //   137: aload #8
    //   139: ifnonnull -> 164
    //   142: goto -> 149
    //   145: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   148: athrow
    //   149: aload #5
    //   151: aload #11
    //   153: invokevirtual Zt : (Lnet/portswigger/Zms;)Lnet/portswigger/Ztk;
    //   156: pop
    //   157: goto -> 164
    //   160: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   163: athrow
    //   164: return
    // Exception table:
    //   from	to	target	type
    //   5	26	29	net/portswigger/Zki
    //   12	37	37	net/portswigger/Zki
    //   44	56	59	net/portswigger/Zki
    //   50	67	70	net/portswigger/Zki
    //   115	142	145	net/portswigger/Zki
    //   129	157	160	net/portswigger/Zki
  }
  
  private static Zt2 lambda$buildOneOfFragment$4(int paramInt, Map<String, Integer> paramMap, List<Zms> paramList, Zav paramZav) {
    return ZU(paramZav, paramInt, paramMap, paramList);
  }
  
  private static Zms lambda$buildXmlFragment$3(Zav paramZav, String paramString, boolean paramBoolean, Zms paramZms) {
    Zab zab = paramZav.Zr();
    try {
    
    } catch (Zki zki) {
      throw a(null);
    } 
    String str = (zab.Zw() != null) ? String.format(a(9364, 5900), new Object[] { zab.Zw(), paramString }) : paramString;
    Zuq zuq = (new Zuq()).Zb(str).Zq(paramBoolean).Za(paramZms);
    try {
      if (zab.ZQ() != null)
        zuq.ZT((new Zuq()).Zb(String.format(a(9367, 18747), new Object[] { zab.Zw() })).Za(new Zrm7(zab.ZQ())).Zq(paramBoolean).Zu()); 
    } catch (Zki zki) {
      throw a(null);
    } 
    return zuq.Zu();
  }
  
  private static Zt2 lambda$buildXmlFragment$2(int paramInt, Map<String, Integer> paramMap, List<Zms> paramList, Zav paramZav) {
    return ZU(paramZav, paramInt, paramMap, paramList);
  }
  
  private static boolean lambda$buildXmlFragment$1(Zav paramZav) {
    try {
    
    } catch (Zki zki) {
      throw a(null);
    } 
    return (paramZav.Zg() == Ziq.OBJECT);
  }
  
  private static Integer lambda$buildXmlFragment$0(String paramString, Integer paramInteger) {
    try {
    
    } catch (Zki zki) {
      throw a(null);
    } 
    return Integer.valueOf((paramInteger == null) ? 1 : (paramInteger.intValue() + 1));
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'äíÕÕï\\b[Zµ '
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #9
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'ÆÖ½\\bîU,l ±÷'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_5
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #106
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic net/portswigger/Zt9.a : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic net/portswigger/Zt9.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #92
    //   210: goto -> 240
    //   213: bipush #8
    //   215: goto -> 240
    //   218: bipush #81
    //   220: goto -> 240
    //   223: bipush #121
    //   225: goto -> 240
    //   228: bipush #89
    //   230: goto -> 240
    //   233: bipush #52
    //   235: goto -> 240
    //   238: bipush #8
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2494) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'ð';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zt9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */