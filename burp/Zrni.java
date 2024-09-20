package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrni {
  private final Ztew ZH;
  
  private final Zlof ZO;
  
  private final Zkit ZF;
  
  private final Zkit ZK;
  
  private final Ze24 ZE;
  
  private final Zl2m ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrni(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m) {
    this.ZH = paramZtew;
    this.ZO = paramZlof;
    this.ZF = paramZkit1;
    this.ZK = paramZkit2;
    this.ZE = paramZe24;
    this.ZY = paramZl2m;
  }
  
  Zgpi ZT(Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    Zlmv<Zgpi, Zgpi> zlmv = new Zlmv<>(paramZeu41, paramZeu42);
    return ZU(paramZzwo, zlmv);
  }
  
  Zgpi Zx(Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    Zqs<Zgpi, Zgpi> zqs = new Zqs<>(paramZeu41, paramZeu42);
    return ZU(paramZzwo, zqs);
  }
  
  private Zgpi ZU(Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zsqx<Zzwo> paramZsqx) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZK : Lburp/Zkit;
    //   8: aload_2
    //   9: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   12: checkcast burp/Zzwo
    //   15: astore #4
    //   17: aload_0
    //   18: getfield ZE : Lburp/Ze24;
    //   21: aload_1
    //   22: aload #4
    //   24: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   29: goto -> 55
    //   32: astore #5
    //   34: aload #5
    //   36: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   39: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   42: aload_0
    //   43: getfield ZO : Lburp/Zlof;
    //   46: aload #5
    //   48: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   53: aconst_null
    //   54: areturn
    //   55: new java/util/HashMap
    //   58: dup
    //   59: aload_1
    //   60: invokeinterface Zl3 : ()I
    //   65: invokespecial <init> : (I)V
    //   68: astore #5
    //   70: getstatic burp/Zszd.ZL : Z
    //   73: ifeq -> 102
    //   76: aload_0
    //   77: getfield ZF : Lburp/Zkit;
    //   80: ifnull -> 102
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   89: athrow
    //   90: aload_0
    //   91: aload_1
    //   92: invokevirtual ZU : (Lburp/Zzwo;)V
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   101: athrow
    //   102: aload_1
    //   103: invokeinterface ZlW : ()Ljava/util/Set;
    //   108: invokeinterface iterator : ()Ljava/util/Iterator;
    //   113: astore #6
    //   115: aload #6
    //   117: invokeinterface hasNext : ()Z
    //   122: ifeq -> 356
    //   125: aload #6
    //   127: invokeinterface next : ()Ljava/lang/Object;
    //   132: checkcast burp/Zgpi
    //   135: astore #7
    //   137: aload #7
    //   139: ifnonnull -> 149
    //   142: aconst_null
    //   143: astore #8
    //   145: aload_3
    //   146: ifnonnull -> 206
    //   149: aload_0
    //   150: getfield ZH : Lburp/Ztew;
    //   153: aload #7
    //   155: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   158: astore #8
    //   160: aload #8
    //   162: ifnonnull -> 169
    //   165: aload_3
    //   166: ifnonnull -> 115
    //   169: aload #8
    //   171: checkcast burp/Zxsr
    //   174: invokevirtual ZXU : ()J
    //   177: lconst_0
    //   178: lcmp
    //   179: ifeq -> 190
    //   182: iconst_1
    //   183: goto -> 191
    //   186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   189: athrow
    //   190: iconst_0
    //   191: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   194: sipush #10312
    //   197: sipush #-10412
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   206: aload_1
    //   207: aload #7
    //   209: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   214: astore #9
    //   216: aload #9
    //   218: ifnonnull -> 243
    //   221: aload #5
    //   223: aload #8
    //   225: aconst_null
    //   226: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   231: pop
    //   232: aload_3
    //   233: ifnonnull -> 315
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: aload_0
    //   244: getfield ZH : Lburp/Ztew;
    //   247: aload #9
    //   249: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   252: astore #10
    //   254: aload #10
    //   256: ifnull -> 315
    //   259: aload #10
    //   261: checkcast burp/Zxsr
    //   264: invokevirtual ZXU : ()J
    //   267: lconst_0
    //   268: lcmp
    //   269: ifeq -> 287
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: iconst_1
    //   280: goto -> 288
    //   283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   286: athrow
    //   287: iconst_0
    //   288: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   291: sipush #10311
    //   294: sipush #29814
    //   297: invokestatic a : (II)Ljava/lang/String;
    //   300: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   303: aload #5
    //   305: aload #8
    //   307: aload #10
    //   309: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   314: pop
    //   315: goto -> 352
    //   318: astore #8
    //   320: aload #8
    //   322: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   325: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   328: aload #8
    //   330: athrow
    //   331: astore #8
    //   333: aload #8
    //   335: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   338: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   341: aload_0
    //   342: getfield ZO : Lburp/Zlof;
    //   345: aload #8
    //   347: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   352: aload_3
    //   353: ifnonnull -> 115
    //   356: goto -> 395
    //   359: astore #6
    //   361: aload #6
    //   363: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   366: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   369: aload #6
    //   371: athrow
    //   372: astore #6
    //   374: aload #6
    //   376: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   379: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   382: aload_0
    //   383: getfield ZO : Lburp/Zlof;
    //   386: aload #6
    //   388: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   393: aconst_null
    //   394: areturn
    //   395: aload #5
    //   397: invokeinterface entrySet : ()Ljava/util/Set;
    //   402: invokeinterface iterator : ()Ljava/util/Iterator;
    //   407: astore #6
    //   409: aload #6
    //   411: invokeinterface hasNext : ()Z
    //   416: ifeq -> 463
    //   419: aload #6
    //   421: invokeinterface next : ()Ljava/lang/Object;
    //   426: checkcast java/util/Map$Entry
    //   429: astore #7
    //   431: aload #4
    //   433: aload #7
    //   435: invokeinterface getKey : ()Ljava/lang/Object;
    //   440: checkcast burp/Zgpi
    //   443: aload #7
    //   445: invokeinterface getValue : ()Ljava/lang/Object;
    //   450: checkcast burp/Zgpi
    //   453: invokeinterface Zu : (Lburp/Zgpi;Lburp/Zgpi;)Lburp/Zgpi;
    //   458: pop
    //   459: aload_3
    //   460: ifnonnull -> 409
    //   463: aload #4
    //   465: areturn
    //   466: astore #6
    //   468: aload #6
    //   470: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   473: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   476: aload_0
    //   477: getfield ZO : Lburp/Zlof;
    //   480: aload #6
    //   482: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   487: aconst_null
    //   488: areturn
    // Exception table:
    //   from	to	target	type
    //   4	29	32	java/lang/Throwable
    //   70	83	86	java/lang/Throwable
    //   76	95	98	java/lang/Throwable
    //   102	356	359	burp/Ztgq
    //   102	356	359	burp/Zb_f
    //   102	356	372	java/lang/Throwable
    //   137	165	318	burp/Ztgq
    //   137	165	318	burp/Zb_f
    //   137	165	331	java/lang/Throwable
    //   169	186	186	java/lang/Throwable
    //   169	315	318	burp/Ztgq
    //   169	315	318	burp/Zb_f
    //   169	315	331	java/lang/Throwable
    //   216	236	239	java/lang/Throwable
    //   254	272	275	java/lang/Throwable
    //   259	283	283	java/lang/Throwable
    //   395	465	466	java/lang/Throwable
  }
  
  Zgpi Zd(Zg49<? extends Zgpi> paramZg49, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: new burp/Zmwj
    //   6: dup
    //   7: aload_2
    //   8: aload_3
    //   9: invokespecial <init> : (Lburp/Zeu4;Lburp/Ztdo;)V
    //   12: astore #5
    //   14: astore #4
    //   16: aload_0
    //   17: getfield ZK : Lburp/Zkit;
    //   20: aload #5
    //   22: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   25: checkcast burp/Zg49
    //   28: astore #6
    //   30: aload_0
    //   31: getfield ZE : Lburp/Ze24;
    //   34: aload_1
    //   35: aload #6
    //   37: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   42: goto -> 68
    //   45: astore #7
    //   47: aload #7
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_0
    //   56: getfield ZO : Lburp/Zlof;
    //   59: aload #7
    //   61: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   66: aconst_null
    //   67: areturn
    //   68: new java/util/HashMap
    //   71: dup
    //   72: aload_1
    //   73: invokeinterface ZpR : ()I
    //   78: invokespecial <init> : (I)V
    //   81: astore #7
    //   83: getstatic burp/Zszd.ZL : Z
    //   86: ifeq -> 115
    //   89: aload_0
    //   90: getfield ZF : Lburp/Zkit;
    //   93: ifnull -> 115
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual Zr : (Lburp/Zg49;)V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload_1
    //   116: invokeinterface Zpb : ()Ljava/util/Set;
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #8
    //   128: aload #8
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 244
    //   138: aload #8
    //   140: invokeinterface next : ()Ljava/lang/Object;
    //   145: checkcast burp/Zgpi
    //   148: astore #9
    //   150: aload #9
    //   152: ifnonnull -> 163
    //   155: aconst_null
    //   156: astore #10
    //   158: aload #4
    //   160: ifnonnull -> 184
    //   163: aload_0
    //   164: getfield ZH : Lburp/Ztew;
    //   167: aload #9
    //   169: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   172: astore #10
    //   174: aload #10
    //   176: ifnonnull -> 184
    //   179: aload #4
    //   181: ifnonnull -> 128
    //   184: aload #7
    //   186: aload #10
    //   188: aload_1
    //   189: aload #9
    //   191: invokeinterface Zx : (Ljava/lang/Object;)Ljava/lang/Byte;
    //   196: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: goto -> 239
    //   205: astore #10
    //   207: aload #10
    //   209: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   212: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   215: aload #10
    //   217: athrow
    //   218: astore #10
    //   220: aload #10
    //   222: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   225: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   228: aload_0
    //   229: getfield ZO : Lburp/Zlof;
    //   232: aload #10
    //   234: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   239: aload #4
    //   241: ifnonnull -> 128
    //   244: goto -> 283
    //   247: astore #8
    //   249: aload #8
    //   251: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   254: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   257: aload #8
    //   259: athrow
    //   260: astore #8
    //   262: aload #8
    //   264: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   267: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   270: aload_0
    //   271: getfield ZO : Lburp/Zlof;
    //   274: aload #8
    //   276: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   281: aconst_null
    //   282: areturn
    //   283: aload #7
    //   285: invokeinterface entrySet : ()Ljava/util/Set;
    //   290: invokeinterface iterator : ()Ljava/util/Iterator;
    //   295: astore #8
    //   297: aload #8
    //   299: invokeinterface hasNext : ()Z
    //   304: ifeq -> 355
    //   307: aload #8
    //   309: invokeinterface next : ()Ljava/lang/Object;
    //   314: checkcast java/util/Map$Entry
    //   317: astore #9
    //   319: aload #6
    //   321: aload #9
    //   323: invokeinterface getKey : ()Ljava/lang/Object;
    //   328: checkcast burp/Zgpi
    //   331: aload #9
    //   333: invokeinterface getValue : ()Ljava/lang/Object;
    //   338: checkcast java/lang/Byte
    //   341: invokevirtual byteValue : ()B
    //   344: invokeinterface ZS : (Lburp/Zgpi;B)Ljava/lang/Byte;
    //   349: pop
    //   350: aload #4
    //   352: ifnonnull -> 297
    //   355: aload #6
    //   357: areturn
    //   358: astore #8
    //   360: aload #8
    //   362: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   365: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   368: aload_0
    //   369: getfield ZO : Lburp/Zlof;
    //   372: aload #8
    //   374: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   379: aconst_null
    //   380: areturn
    // Exception table:
    //   from	to	target	type
    //   16	42	45	java/lang/Throwable
    //   83	96	99	java/lang/Throwable
    //   89	108	111	java/lang/Throwable
    //   115	244	247	burp/Ztgq
    //   115	244	247	burp/Zb_f
    //   115	244	260	java/lang/Throwable
    //   150	179	205	burp/Ztgq
    //   150	179	205	burp/Zb_f
    //   150	179	218	java/lang/Throwable
    //   184	202	205	burp/Ztgq
    //   184	202	205	burp/Zb_f
    //   184	202	218	java/lang/Throwable
    //   283	357	358	java/lang/Throwable
  }
  
  Zgpi ZO(Zxsf<? extends Zgpi> paramZxsf, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: new burp/Zert
    //   6: dup
    //   7: aload_2
    //   8: aload_3
    //   9: invokespecial <init> : (Lburp/Zeu4;Lburp/Ztdo;)V
    //   12: astore #5
    //   14: astore #4
    //   16: aload_0
    //   17: getfield ZK : Lburp/Zkit;
    //   20: aload #5
    //   22: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   25: checkcast burp/Zxsf
    //   28: astore #6
    //   30: aload_0
    //   31: getfield ZE : Lburp/Ze24;
    //   34: aload_1
    //   35: aload #6
    //   37: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   42: goto -> 68
    //   45: astore #7
    //   47: aload #7
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_0
    //   56: getfield ZO : Lburp/Zlof;
    //   59: aload #7
    //   61: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   66: aconst_null
    //   67: areturn
    //   68: new java/util/HashMap
    //   71: dup
    //   72: aload_1
    //   73: invokeinterface Zit : ()I
    //   78: invokespecial <init> : (I)V
    //   81: astore #7
    //   83: getstatic burp/Zszd.ZL : Z
    //   86: ifeq -> 115
    //   89: aload_0
    //   90: getfield ZF : Lburp/Zkit;
    //   93: ifnull -> 115
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual ZD : (Lburp/Zxsf;)V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload_1
    //   116: invokeinterface Zim : ()Ljava/util/Set;
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #8
    //   128: aload #8
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 244
    //   138: aload #8
    //   140: invokeinterface next : ()Ljava/lang/Object;
    //   145: checkcast burp/Zgpi
    //   148: astore #9
    //   150: aload #9
    //   152: ifnonnull -> 163
    //   155: aconst_null
    //   156: astore #10
    //   158: aload #4
    //   160: ifnonnull -> 184
    //   163: aload_0
    //   164: getfield ZH : Lburp/Ztew;
    //   167: aload #9
    //   169: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   172: astore #10
    //   174: aload #10
    //   176: ifnonnull -> 184
    //   179: aload #4
    //   181: ifnonnull -> 128
    //   184: aload #7
    //   186: aload #10
    //   188: aload_1
    //   189: aload #9
    //   191: invokeinterface Zi : (Ljava/lang/Object;)Ljava/lang/Short;
    //   196: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: goto -> 239
    //   205: astore #10
    //   207: aload #10
    //   209: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   212: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   215: aload #10
    //   217: athrow
    //   218: astore #10
    //   220: aload #10
    //   222: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   225: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   228: aload_0
    //   229: getfield ZO : Lburp/Zlof;
    //   232: aload #10
    //   234: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   239: aload #4
    //   241: ifnonnull -> 128
    //   244: goto -> 283
    //   247: astore #8
    //   249: aload #8
    //   251: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   254: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   257: aload #8
    //   259: athrow
    //   260: astore #8
    //   262: aload #8
    //   264: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   267: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   270: aload_0
    //   271: getfield ZO : Lburp/Zlof;
    //   274: aload #8
    //   276: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   281: aconst_null
    //   282: areturn
    //   283: aload #7
    //   285: invokeinterface entrySet : ()Ljava/util/Set;
    //   290: invokeinterface iterator : ()Ljava/util/Iterator;
    //   295: astore #8
    //   297: aload #8
    //   299: invokeinterface hasNext : ()Z
    //   304: ifeq -> 355
    //   307: aload #8
    //   309: invokeinterface next : ()Ljava/lang/Object;
    //   314: checkcast java/util/Map$Entry
    //   317: astore #9
    //   319: aload #6
    //   321: aload #9
    //   323: invokeinterface getKey : ()Ljava/lang/Object;
    //   328: checkcast burp/Zgpi
    //   331: aload #9
    //   333: invokeinterface getValue : ()Ljava/lang/Object;
    //   338: checkcast java/lang/Short
    //   341: invokevirtual shortValue : ()S
    //   344: invokeinterface ZY : (Lburp/Zgpi;S)Ljava/lang/Short;
    //   349: pop
    //   350: aload #4
    //   352: ifnonnull -> 297
    //   355: aload #6
    //   357: areturn
    //   358: astore #8
    //   360: aload #8
    //   362: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   365: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   368: aload_0
    //   369: getfield ZO : Lburp/Zlof;
    //   372: aload #8
    //   374: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   379: aconst_null
    //   380: areturn
    // Exception table:
    //   from	to	target	type
    //   16	42	45	java/lang/Throwable
    //   83	96	99	java/lang/Throwable
    //   89	108	111	java/lang/Throwable
    //   115	244	247	burp/Ztgq
    //   115	244	247	burp/Zb_f
    //   115	244	260	java/lang/Throwable
    //   150	179	205	burp/Ztgq
    //   150	179	205	burp/Zb_f
    //   150	179	218	java/lang/Throwable
    //   184	202	205	burp/Ztgq
    //   184	202	205	burp/Zb_f
    //   184	202	218	java/lang/Throwable
    //   283	357	358	java/lang/Throwable
  }
  
  Zgpi Zl(Zr5a<? extends Zgpi> paramZr5a, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: new burp/Zepl
    //   6: dup
    //   7: aload_2
    //   8: aload_3
    //   9: invokespecial <init> : (Lburp/Zeu4;Lburp/Ztdo;)V
    //   12: astore #5
    //   14: astore #4
    //   16: aload_0
    //   17: getfield ZK : Lburp/Zkit;
    //   20: aload #5
    //   22: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   25: checkcast burp/Zr5a
    //   28: astore #6
    //   30: aload_0
    //   31: getfield ZE : Lburp/Ze24;
    //   34: aload_1
    //   35: aload #6
    //   37: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   42: goto -> 68
    //   45: astore #7
    //   47: aload #7
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_0
    //   56: getfield ZO : Lburp/Zlof;
    //   59: aload #7
    //   61: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   66: aconst_null
    //   67: areturn
    //   68: new java/util/HashMap
    //   71: dup
    //   72: aload_1
    //   73: invokeinterface ZfE : ()I
    //   78: invokespecial <init> : (I)V
    //   81: astore #7
    //   83: getstatic burp/Zszd.ZL : Z
    //   86: ifeq -> 115
    //   89: aload_0
    //   90: getfield ZF : Lburp/Zkit;
    //   93: ifnull -> 115
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual Zn : (Lburp/Zr5a;)V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload_1
    //   116: invokeinterface ZfQ : ()Ljava/util/Set;
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #8
    //   128: aload #8
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 244
    //   138: aload #8
    //   140: invokeinterface next : ()Ljava/lang/Object;
    //   145: checkcast burp/Zgpi
    //   148: astore #9
    //   150: aload #9
    //   152: ifnonnull -> 163
    //   155: aconst_null
    //   156: astore #10
    //   158: aload #4
    //   160: ifnonnull -> 184
    //   163: aload_0
    //   164: getfield ZH : Lburp/Ztew;
    //   167: aload #9
    //   169: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   172: astore #10
    //   174: aload #10
    //   176: ifnonnull -> 184
    //   179: aload #4
    //   181: ifnonnull -> 128
    //   184: aload #7
    //   186: aload #10
    //   188: aload_1
    //   189: aload #9
    //   191: invokeinterface ZX : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   196: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: goto -> 239
    //   205: astore #10
    //   207: aload #10
    //   209: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   212: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   215: aload #10
    //   217: athrow
    //   218: astore #10
    //   220: aload #10
    //   222: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   225: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   228: aload_0
    //   229: getfield ZO : Lburp/Zlof;
    //   232: aload #10
    //   234: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   239: aload #4
    //   241: ifnonnull -> 128
    //   244: goto -> 283
    //   247: astore #8
    //   249: aload #8
    //   251: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   254: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   257: aload #8
    //   259: athrow
    //   260: astore #8
    //   262: aload #8
    //   264: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   267: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   270: aload_0
    //   271: getfield ZO : Lburp/Zlof;
    //   274: aload #8
    //   276: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   281: aconst_null
    //   282: areturn
    //   283: aload #7
    //   285: invokeinterface entrySet : ()Ljava/util/Set;
    //   290: invokeinterface iterator : ()Ljava/util/Iterator;
    //   295: astore #8
    //   297: aload #8
    //   299: invokeinterface hasNext : ()Z
    //   304: ifeq -> 355
    //   307: aload #8
    //   309: invokeinterface next : ()Ljava/lang/Object;
    //   314: checkcast java/util/Map$Entry
    //   317: astore #9
    //   319: aload #6
    //   321: aload #9
    //   323: invokeinterface getKey : ()Ljava/lang/Object;
    //   328: checkcast burp/Zgpi
    //   331: aload #9
    //   333: invokeinterface getValue : ()Ljava/lang/Object;
    //   338: checkcast java/lang/Integer
    //   341: invokevirtual intValue : ()I
    //   344: invokeinterface Zs : (Lburp/Zgpi;I)Ljava/lang/Integer;
    //   349: pop
    //   350: aload #4
    //   352: ifnonnull -> 297
    //   355: aload #6
    //   357: areturn
    //   358: astore #8
    //   360: aload #8
    //   362: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   365: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   368: aload_0
    //   369: getfield ZO : Lburp/Zlof;
    //   372: aload #8
    //   374: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   379: aconst_null
    //   380: areturn
    // Exception table:
    //   from	to	target	type
    //   16	42	45	java/lang/Throwable
    //   83	96	99	java/lang/Throwable
    //   89	108	111	java/lang/Throwable
    //   115	244	247	burp/Ztgq
    //   115	244	247	burp/Zb_f
    //   115	244	260	java/lang/Throwable
    //   150	179	205	burp/Ztgq
    //   150	179	205	burp/Zb_f
    //   150	179	218	java/lang/Throwable
    //   184	202	205	burp/Ztgq
    //   184	202	205	burp/Zb_f
    //   184	202	218	java/lang/Throwable
    //   283	357	358	java/lang/Throwable
  }
  
  Zgpi ZU(Zxlv<? extends Zgpi> paramZxlv, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: new burp/Zla8
    //   6: dup
    //   7: aload_2
    //   8: aload_3
    //   9: invokespecial <init> : (Lburp/Zeu4;Lburp/Ztdo;)V
    //   12: astore #5
    //   14: astore #4
    //   16: aload_0
    //   17: getfield ZK : Lburp/Zkit;
    //   20: aload #5
    //   22: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   25: checkcast burp/Zxlv
    //   28: astore #6
    //   30: aload_0
    //   31: getfield ZE : Lburp/Ze24;
    //   34: aload_1
    //   35: aload #6
    //   37: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   42: goto -> 68
    //   45: astore #7
    //   47: aload #7
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_0
    //   56: getfield ZO : Lburp/Zlof;
    //   59: aload #7
    //   61: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   66: aconst_null
    //   67: areturn
    //   68: new java/util/HashMap
    //   71: dup
    //   72: aload_1
    //   73: invokeinterface Zqw : ()I
    //   78: invokespecial <init> : (I)V
    //   81: astore #7
    //   83: getstatic burp/Zszd.ZL : Z
    //   86: ifeq -> 115
    //   89: aload_0
    //   90: getfield ZF : Lburp/Zkit;
    //   93: ifnull -> 115
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual ZN : (Lburp/Zxlv;)V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload_1
    //   116: invokeinterface ZqI : ()Ljava/util/Set;
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #8
    //   128: aload #8
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 260
    //   138: aload #8
    //   140: invokeinterface next : ()Ljava/lang/Object;
    //   145: checkcast burp/Zgpi
    //   148: astore #9
    //   150: aload #9
    //   152: ifnonnull -> 163
    //   155: aconst_null
    //   156: astore #10
    //   158: aload #4
    //   160: ifnonnull -> 184
    //   163: aload_0
    //   164: getfield ZH : Lburp/Ztew;
    //   167: aload #9
    //   169: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   172: astore #10
    //   174: aload #10
    //   176: ifnonnull -> 184
    //   179: aload #4
    //   181: ifnonnull -> 128
    //   184: aload_1
    //   185: aload #9
    //   187: invokeinterface ZI : (Ljava/lang/Object;)Ljava/lang/Long;
    //   192: astore #11
    //   194: aload #11
    //   196: ifnull -> 218
    //   199: aload #7
    //   201: aload #10
    //   203: aload #11
    //   205: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   210: pop
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   217: athrow
    //   218: goto -> 255
    //   221: astore #10
    //   223: aload #10
    //   225: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   228: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   231: aload #10
    //   233: athrow
    //   234: astore #10
    //   236: aload #10
    //   238: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   241: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   244: aload_0
    //   245: getfield ZO : Lburp/Zlof;
    //   248: aload #10
    //   250: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   255: aload #4
    //   257: ifnonnull -> 128
    //   260: goto -> 299
    //   263: astore #8
    //   265: aload #8
    //   267: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   270: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   273: aload #8
    //   275: athrow
    //   276: astore #8
    //   278: aload #8
    //   280: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   283: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   286: aload_0
    //   287: getfield ZO : Lburp/Zlof;
    //   290: aload #8
    //   292: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   297: aconst_null
    //   298: areturn
    //   299: aload #7
    //   301: invokeinterface entrySet : ()Ljava/util/Set;
    //   306: invokeinterface iterator : ()Ljava/util/Iterator;
    //   311: astore #8
    //   313: aload #8
    //   315: invokeinterface hasNext : ()Z
    //   320: ifeq -> 371
    //   323: aload #8
    //   325: invokeinterface next : ()Ljava/lang/Object;
    //   330: checkcast java/util/Map$Entry
    //   333: astore #9
    //   335: aload #6
    //   337: aload #9
    //   339: invokeinterface getKey : ()Ljava/lang/Object;
    //   344: checkcast burp/Zgpi
    //   347: aload #9
    //   349: invokeinterface getValue : ()Ljava/lang/Object;
    //   354: checkcast java/lang/Long
    //   357: invokevirtual longValue : ()J
    //   360: invokeinterface Zr : (Lburp/Zgpi;J)Ljava/lang/Long;
    //   365: pop
    //   366: aload #4
    //   368: ifnonnull -> 313
    //   371: aload #6
    //   373: areturn
    //   374: astore #8
    //   376: aload #8
    //   378: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   381: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   384: aload_0
    //   385: getfield ZO : Lburp/Zlof;
    //   388: aload #8
    //   390: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   395: aconst_null
    //   396: areturn
    // Exception table:
    //   from	to	target	type
    //   16	42	45	java/lang/Throwable
    //   83	96	99	java/lang/Throwable
    //   89	108	111	java/lang/Throwable
    //   115	260	263	burp/Ztgq
    //   115	260	263	burp/Zb_f
    //   115	260	276	java/lang/Throwable
    //   150	179	221	burp/Ztgq
    //   150	179	221	burp/Zb_f
    //   150	179	234	java/lang/Throwable
    //   184	218	221	burp/Ztgq
    //   184	218	221	burp/Zb_f
    //   184	218	234	java/lang/Throwable
    //   194	211	214	java/lang/Throwable
    //   299	373	374	java/lang/Throwable
  }
  
  Zgpi ZQ(Zmwp<? extends Zgpi> paramZmwp, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: new burp/Zlcz
    //   6: dup
    //   7: aload_2
    //   8: aload_3
    //   9: invokespecial <init> : (Lburp/Zeu4;Lburp/Ztdo;)V
    //   12: astore #5
    //   14: astore #4
    //   16: aload_0
    //   17: getfield ZK : Lburp/Zkit;
    //   20: aload #5
    //   22: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   25: checkcast burp/Zmwp
    //   28: astore #6
    //   30: aload_0
    //   31: getfield ZE : Lburp/Ze24;
    //   34: aload_1
    //   35: aload #6
    //   37: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   42: goto -> 68
    //   45: astore #7
    //   47: aload #7
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_0
    //   56: getfield ZO : Lburp/Zlof;
    //   59: aload #7
    //   61: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   66: aconst_null
    //   67: areturn
    //   68: new java/util/HashMap
    //   71: dup
    //   72: aload_1
    //   73: invokeinterface Zx1 : ()I
    //   78: invokespecial <init> : (I)V
    //   81: astore #7
    //   83: getstatic burp/Zszd.ZL : Z
    //   86: ifeq -> 115
    //   89: aload_0
    //   90: getfield ZF : Lburp/Zkit;
    //   93: ifnull -> 115
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual Zi : (Lburp/Zmwp;)V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload_1
    //   116: invokeinterface ZMO : ()Ljava/util/Set;
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #8
    //   128: aload #8
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 247
    //   138: aload #8
    //   140: invokeinterface next : ()Ljava/lang/Object;
    //   145: checkcast burp/Zgpi
    //   148: astore #9
    //   150: aload #9
    //   152: ifnonnull -> 163
    //   155: aconst_null
    //   156: astore #10
    //   158: aload #4
    //   160: ifnonnull -> 184
    //   163: aload_0
    //   164: getfield ZH : Lburp/Ztew;
    //   167: aload #9
    //   169: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   172: astore #10
    //   174: aload #10
    //   176: ifnonnull -> 184
    //   179: aload #4
    //   181: ifnonnull -> 128
    //   184: aload #7
    //   186: aload #10
    //   188: aload_1
    //   189: aload #9
    //   191: invokeinterface Zz : (Ljava/lang/Object;)J
    //   196: invokestatic valueOf : (J)Ljava/lang/Long;
    //   199: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: goto -> 242
    //   208: astore #10
    //   210: aload #10
    //   212: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   215: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   218: aload #10
    //   220: athrow
    //   221: astore #10
    //   223: aload #10
    //   225: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   228: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   231: aload_0
    //   232: getfield ZO : Lburp/Zlof;
    //   235: aload #10
    //   237: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   242: aload #4
    //   244: ifnonnull -> 128
    //   247: goto -> 286
    //   250: astore #8
    //   252: aload #8
    //   254: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   257: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   260: aload #8
    //   262: athrow
    //   263: astore #8
    //   265: aload #8
    //   267: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   270: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   273: aload_0
    //   274: getfield ZO : Lburp/Zlof;
    //   277: aload #8
    //   279: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   284: aconst_null
    //   285: areturn
    //   286: aload #7
    //   288: invokeinterface entrySet : ()Ljava/util/Set;
    //   293: invokeinterface iterator : ()Ljava/util/Iterator;
    //   298: astore #8
    //   300: aload #8
    //   302: invokeinterface hasNext : ()Z
    //   307: ifeq -> 358
    //   310: aload #8
    //   312: invokeinterface next : ()Ljava/lang/Object;
    //   317: checkcast java/util/Map$Entry
    //   320: astore #9
    //   322: aload #6
    //   324: aload #9
    //   326: invokeinterface getKey : ()Ljava/lang/Object;
    //   331: checkcast burp/Zgpi
    //   334: aload #9
    //   336: invokeinterface getValue : ()Ljava/lang/Object;
    //   341: checkcast java/lang/Long
    //   344: invokevirtual longValue : ()J
    //   347: invokeinterface ZB : (Lburp/Zgpi;J)J
    //   352: pop2
    //   353: aload #4
    //   355: ifnonnull -> 300
    //   358: aload #6
    //   360: areturn
    //   361: astore #8
    //   363: aload #8
    //   365: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   368: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   371: aload_0
    //   372: getfield ZO : Lburp/Zlof;
    //   375: aload #8
    //   377: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   382: aconst_null
    //   383: areturn
    // Exception table:
    //   from	to	target	type
    //   16	42	45	java/lang/Throwable
    //   83	96	99	java/lang/Throwable
    //   89	108	111	java/lang/Throwable
    //   115	247	250	burp/Ztgq
    //   115	247	250	burp/Zb_f
    //   115	247	263	java/lang/Throwable
    //   150	179	208	burp/Ztgq
    //   150	179	208	burp/Zb_f
    //   150	179	221	java/lang/Throwable
    //   184	205	208	burp/Ztgq
    //   184	205	208	burp/Zb_f
    //   184	205	221	java/lang/Throwable
    //   286	360	361	java/lang/Throwable
  }
  
  Zgpi ZC(Ze93<? extends Zgpi> paramZe93, Zeu4<? extends Zgpi> paramZeu4) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: new burp/Zzgi
    //   7: dup
    //   8: aload_2
    //   9: invokespecial <init> : (Lburp/Zeu4;)V
    //   12: astore #5
    //   14: aload_0
    //   15: getfield ZK : Lburp/Zkit;
    //   18: aload #5
    //   20: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   23: checkcast burp/Ze93
    //   26: astore #4
    //   28: aload_0
    //   29: getfield ZE : Lburp/Ze24;
    //   32: aload_1
    //   33: aload #4
    //   35: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   40: goto -> 66
    //   43: astore #5
    //   45: aload #5
    //   47: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   50: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   53: aload_0
    //   54: getfield ZO : Lburp/Zlof;
    //   57: aload #5
    //   59: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   64: aconst_null
    //   65: areturn
    //   66: new java/util/HashMap
    //   69: dup
    //   70: aload_1
    //   71: invokeinterface Zjp : ()I
    //   76: invokespecial <init> : (I)V
    //   79: astore #5
    //   81: getstatic burp/Zszd.ZL : Z
    //   84: ifeq -> 113
    //   87: aload_0
    //   88: getfield ZF : Lburp/Zkit;
    //   91: ifnull -> 113
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   100: athrow
    //   101: aload_0
    //   102: aload_1
    //   103: invokevirtual ZT : (Lburp/Ze93;)V
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   112: athrow
    //   113: aload_1
    //   114: invokeinterface ZjP : ()Ljava/util/Set;
    //   119: invokeinterface iterator : ()Ljava/util/Iterator;
    //   124: astore #6
    //   126: aload #6
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 264
    //   136: aload #6
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: checkcast java/lang/Short
    //   146: astore #7
    //   148: aload_1
    //   149: aload #7
    //   151: invokevirtual shortValue : ()S
    //   154: invokeinterface Zz : (S)Lburp/Zgpi;
    //   159: astore #8
    //   161: aload #8
    //   163: ifnonnull -> 188
    //   166: aload #5
    //   168: aload #7
    //   170: aconst_null
    //   171: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   176: pop
    //   177: aload_3
    //   178: ifnonnull -> 223
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   187: athrow
    //   188: aload_0
    //   189: getfield ZH : Lburp/Ztew;
    //   192: aload #8
    //   194: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   197: astore #9
    //   199: aload #9
    //   201: ifnull -> 223
    //   204: aload #5
    //   206: aload #7
    //   208: aload #9
    //   210: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   215: pop
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   222: athrow
    //   223: goto -> 260
    //   226: astore #8
    //   228: aload #8
    //   230: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   233: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   236: aload #8
    //   238: athrow
    //   239: astore #8
    //   241: aload #8
    //   243: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   246: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   249: aload_0
    //   250: getfield ZO : Lburp/Zlof;
    //   253: aload #8
    //   255: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   260: aload_3
    //   261: ifnonnull -> 126
    //   264: goto -> 303
    //   267: astore #6
    //   269: aload #6
    //   271: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   274: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   277: aload #6
    //   279: athrow
    //   280: astore #6
    //   282: aload #6
    //   284: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   287: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   290: aload_0
    //   291: getfield ZO : Lburp/Zlof;
    //   294: aload #6
    //   296: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   301: aconst_null
    //   302: areturn
    //   303: aload #5
    //   305: invokeinterface entrySet : ()Ljava/util/Set;
    //   310: invokeinterface iterator : ()Ljava/util/Iterator;
    //   315: astore #6
    //   317: aload #6
    //   319: invokeinterface hasNext : ()Z
    //   324: ifeq -> 374
    //   327: aload #6
    //   329: invokeinterface next : ()Ljava/lang/Object;
    //   334: checkcast java/util/Map$Entry
    //   337: astore #7
    //   339: aload #4
    //   341: aload #7
    //   343: invokeinterface getKey : ()Ljava/lang/Object;
    //   348: checkcast java/lang/Short
    //   351: invokevirtual shortValue : ()S
    //   354: aload #7
    //   356: invokeinterface getValue : ()Ljava/lang/Object;
    //   361: checkcast burp/Zgpi
    //   364: invokeinterface Zl : (SLburp/Zgpi;)Lburp/Zgpi;
    //   369: pop
    //   370: aload_3
    //   371: ifnonnull -> 317
    //   374: aload #4
    //   376: areturn
    //   377: astore #6
    //   379: aload #6
    //   381: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   384: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   387: aload_0
    //   388: getfield ZO : Lburp/Zlof;
    //   391: aload #6
    //   393: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   398: aconst_null
    //   399: areturn
    // Exception table:
    //   from	to	target	type
    //   4	40	43	java/lang/Throwable
    //   81	94	97	java/lang/Throwable
    //   87	106	109	java/lang/Throwable
    //   113	264	267	burp/Ztgq
    //   113	264	267	burp/Zb_f
    //   113	264	280	java/lang/Throwable
    //   148	223	226	burp/Ztgq
    //   148	223	226	burp/Zb_f
    //   148	223	239	java/lang/Throwable
    //   161	181	184	java/lang/Throwable
    //   199	216	219	java/lang/Throwable
    //   303	376	377	java/lang/Throwable
  }
  
  Zgpi ZY(Zt7v<? extends Zgpi> paramZt7v, Zeu4<? extends Zgpi> paramZeu4) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: new burp/Ze4j
    //   7: dup
    //   8: aload_2
    //   9: invokespecial <init> : (Lburp/Zeu4;)V
    //   12: astore #5
    //   14: aload_0
    //   15: getfield ZK : Lburp/Zkit;
    //   18: aload #5
    //   20: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   23: checkcast burp/Zt7v
    //   26: astore #4
    //   28: aload_0
    //   29: getfield ZE : Lburp/Ze24;
    //   32: aload_1
    //   33: aload #4
    //   35: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   40: goto -> 66
    //   43: astore #5
    //   45: aload #5
    //   47: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   50: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   53: aload_0
    //   54: getfield ZO : Lburp/Zlof;
    //   57: aload #5
    //   59: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   64: aconst_null
    //   65: areturn
    //   66: new java/util/HashMap
    //   69: dup
    //   70: aload_1
    //   71: invokeinterface Zx1 : ()I
    //   76: invokespecial <init> : (I)V
    //   79: astore #5
    //   81: getstatic burp/Zszd.ZL : Z
    //   84: ifeq -> 113
    //   87: aload_0
    //   88: getfield ZF : Lburp/Zkit;
    //   91: ifnull -> 113
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   100: athrow
    //   101: aload_0
    //   102: aload_1
    //   103: invokevirtual ZA : (Lburp/Zt7v;)V
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   112: athrow
    //   113: aload_1
    //   114: invokeinterface ZP4 : ()Ljava/util/Set;
    //   119: invokeinterface iterator : ()Ljava/util/Iterator;
    //   124: astore #6
    //   126: aload #6
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 264
    //   136: aload #6
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: checkcast java/lang/Long
    //   146: astore #7
    //   148: aload_1
    //   149: aload #7
    //   151: invokevirtual longValue : ()J
    //   154: invokeinterface ZJ : (J)Lburp/Zgpi;
    //   159: astore #8
    //   161: aload #8
    //   163: ifnonnull -> 188
    //   166: aload #5
    //   168: aload #7
    //   170: aconst_null
    //   171: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   176: pop
    //   177: aload_3
    //   178: ifnonnull -> 223
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   187: athrow
    //   188: aload_0
    //   189: getfield ZH : Lburp/Ztew;
    //   192: aload #8
    //   194: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   197: astore #9
    //   199: aload #9
    //   201: ifnull -> 223
    //   204: aload #5
    //   206: aload #7
    //   208: aload #9
    //   210: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   215: pop
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   222: athrow
    //   223: goto -> 260
    //   226: astore #8
    //   228: aload #8
    //   230: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   233: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   236: aload #8
    //   238: athrow
    //   239: astore #8
    //   241: aload #8
    //   243: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   246: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   249: aload_0
    //   250: getfield ZO : Lburp/Zlof;
    //   253: aload #8
    //   255: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   260: aload_3
    //   261: ifnonnull -> 126
    //   264: goto -> 303
    //   267: astore #6
    //   269: aload #6
    //   271: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   274: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   277: aload #6
    //   279: athrow
    //   280: astore #6
    //   282: aload #6
    //   284: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   287: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   290: aload_0
    //   291: getfield ZO : Lburp/Zlof;
    //   294: aload #6
    //   296: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   301: aconst_null
    //   302: areturn
    //   303: aload #5
    //   305: invokeinterface entrySet : ()Ljava/util/Set;
    //   310: invokeinterface iterator : ()Ljava/util/Iterator;
    //   315: astore #6
    //   317: aload #6
    //   319: invokeinterface hasNext : ()Z
    //   324: ifeq -> 374
    //   327: aload #6
    //   329: invokeinterface next : ()Ljava/lang/Object;
    //   334: checkcast java/util/Map$Entry
    //   337: astore #7
    //   339: aload #4
    //   341: aload #7
    //   343: invokeinterface getKey : ()Ljava/lang/Object;
    //   348: checkcast java/lang/Long
    //   351: invokevirtual longValue : ()J
    //   354: aload #7
    //   356: invokeinterface getValue : ()Ljava/lang/Object;
    //   361: checkcast burp/Zgpi
    //   364: invokeinterface ZI : (JLburp/Zgpi;)Lburp/Zgpi;
    //   369: pop
    //   370: aload_3
    //   371: ifnonnull -> 317
    //   374: aload #4
    //   376: areturn
    //   377: astore #6
    //   379: aload #6
    //   381: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   384: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   387: aload_0
    //   388: getfield ZO : Lburp/Zlof;
    //   391: aload #6
    //   393: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   398: aconst_null
    //   399: areturn
    // Exception table:
    //   from	to	target	type
    //   4	40	43	java/lang/Throwable
    //   81	94	97	java/lang/Throwable
    //   87	106	109	java/lang/Throwable
    //   113	264	267	burp/Ztgq
    //   113	264	267	burp/Zb_f
    //   113	264	280	java/lang/Throwable
    //   148	223	226	burp/Ztgq
    //   148	223	226	burp/Zb_f
    //   148	223	239	java/lang/Throwable
    //   161	181	184	java/lang/Throwable
    //   199	216	219	java/lang/Throwable
    //   303	376	377	java/lang/Throwable
  }
  
  Zgpi ZZ(Zltc paramZltc) {
    Zltc zltc;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      Zz7k zz7k = new Zz7k();
      zltc = this.ZK.<Zltc>ZH(zz7k);
      this.ZE.Zb(paramZltc, zltc);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
      return null;
    } 
    HashMap<Object, Object> hashMap = new HashMap<>(paramZltc.Zx1());
    try {
      if (Zszd.ZL)
        try {
          if (this.ZF != null)
            Zr(paramZltc); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      for (Long long_ : paramZltc.ZxV()) {
        try {
          Long long_1 = paramZltc.Zg(long_.longValue());
          hashMap.put(long_, long_1);
        } catch (Ztgq ztgq) {
          Zah.Zl(ztgq, Zk_.IGNORED);
          throw ztgq;
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.PROCESSED_LATER);
          this.ZO.ZG(throwable);
        } 
        if (arrayOfString == null)
          break; 
      } 
    } catch (Ztgq|Zb_f ztgq) {
      Zah.Zl(ztgq, Zk_.IGNORED);
      throw ztgq;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.ZO.ZG(throwable);
      return null;
    } 
    try {
      for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
        zltc.ZN(((Long)entry.getKey()).longValue(), (Long)entry.getValue());
        if (arrayOfString == null)
          break; 
      } 
      return zltc;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
      return null;
    } 
  }
  
  private void ZU(Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo) {
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      Zekb<Zmwp> zekb = (paramZzwo instanceof Zx2d) ? ((Zx4q)paramZzwo.ZF()).Zf : ((Zx5x)paramZzwo.ZF()).ZG;
      Zmwp zmwp = this.ZF.<Zmwp>ZJ(paramZzwo, zekb);
      this.ZY.ZU(zmwp);
      Zi(zmwp);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10317, -19479), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zr(Zg49<?> paramZg49) {
    try {
      Zx29<Zkc3> zx29 = (Zx29)this.ZF.ZJ(paramZg49, ((Ze6s)paramZg49.ZF()).ZL);
      Zp(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10308, 23931), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZD(Zxsf<?> paramZxsf) {
    try {
      Zx29<Zm0z> zx29 = (Zx29)this.ZF.ZJ(paramZxsf, ((Zb67)paramZxsf.ZF()).Za);
      Zy(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10314, -28115), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zn(Zr5a<?> paramZr5a) {
    try {
      Zx29<Zl5f> zx29 = (Zx29)this.ZF.ZJ(paramZr5a, ((Zb1m)paramZr5a.ZF()).ZD);
      Zk(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10310, -6488), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZN(Zxlv<?> paramZxlv) {
    try {
      Zx29<Ztrr> zx29 = (Zx29)this.ZF.ZJ(paramZxlv, ((Zl4d)paramZxlv.ZF()).ZF);
      ZH(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10316, 26019), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zi(Zmwp<?> paramZmwp) {
    try {
      Zx29<Ztrr> zx29 = (Zx29)this.ZF.ZJ(paramZmwp, ((Zmfn)paramZmwp.ZF()).ZT);
      ZX(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10313, -10486), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZT(Ze93<?> paramZe93) {
    try {
      Zx29<Zmkl> zx29 = (Zx29)this.ZF.ZJ(paramZe93, ((Zldq)paramZe93.ZF()).ZT);
      ZJ(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10319, -27858), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZA(Zt7v<?> paramZt7v) {
    try {
      Zx29<Ztrr> zx29 = (Zx29)this.ZF.ZJ(paramZt7v, ((Zz0v)paramZt7v.ZF()).ZU);
      ZH(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10318, 1404), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zr(Zltc paramZltc) {
    try {
      Zx29<Ztrr> zx29 = (Zx29)this.ZF.ZJ(paramZltc, Ztoq.Zc);
      ZH(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(10315, -15946), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZJ(Zx29<Zmkl> paramZx29) {
    this.ZY.ZU(paramZx29);
    Zx2h zx2h = this.ZF.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    String[] arrayOfString = Ztgq.ZZ();
    this.ZY.ZU(zx2h);
    Zgpi zgpi = (Zgpi)this.ZF.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    this.ZY.ZU(zgpi);
    for (Zrte<Zmkl> zrte : (Iterable<Zrte<Zmkl>>)zx2h) {
      if (zrte != null) {
        this.ZY.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zmkl zmkl = zrte.ZdF(b);
          if (zmkl != null) {
            this.ZY.ZU(zmkl);
            Zm5a zm5a = this.ZF.<Zm5a>ZA(zmkl, ((Zxcq)zmkl.ZF()).ZR);
            this.ZY.ZU(zm5a);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zp(Zx29<Zkc3> paramZx29) {
    this.ZY.ZU(paramZx29);
    Zx2h zx2h = this.ZF.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZY.ZU(zx2h);
    Zgpi zgpi = (Zgpi)this.ZF.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    this.ZY.ZU(zgpi);
    Iterator<Zrte> iterator = zx2h.iterator();
    String[] arrayOfString = Ztgq.ZZ();
    while (iterator.hasNext()) {
      Zrte<Zkc3> zrte = iterator.next();
      if (zrte != null) {
        this.ZY.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zkc3 zkc3 = zrte.ZdF(b);
          if (zkc3 != null) {
            this.ZY.ZU(zkc3);
            Zzxh zzxh = this.ZF.<Zzxh>ZA(zkc3, ((Zs7c)zkc3.ZF()).ZC);
            this.ZY.ZU(zzxh);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zy(Zx29<Zm0z> paramZx29) {
    this.ZY.ZU(paramZx29);
    Zx2h zx2h = this.ZF.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZY.ZU(zx2h);
    Zgpi zgpi = (Zgpi)this.ZF.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    this.ZY.ZU(zgpi);
    Iterator<Zrte> iterator = zx2h.iterator();
    String[] arrayOfString = Ztgq.ZZ();
    while (iterator.hasNext()) {
      Zrte<Zm0z> zrte = iterator.next();
      if (zrte != null) {
        this.ZY.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zm0z zm0z = zrte.ZdF(b);
          if (zm0z != null) {
            this.ZY.ZU(zm0z);
            Zmxo zmxo = this.ZF.<Zmxo>ZA(zm0z, ((Ze36)zm0z.ZF()).ZV);
            this.ZY.ZU(zmxo);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zk(Zx29<Zl5f> paramZx29) {
    this.ZY.ZU(paramZx29);
    Zx2h zx2h = this.ZF.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZY.ZU(zx2h);
    Zgpi zgpi = (Zgpi)this.ZF.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    String[] arrayOfString = Ztgq.ZZ();
    this.ZY.ZU(zgpi);
    for (Zrte<Zl5f> zrte : (Iterable<Zrte<Zl5f>>)zx2h) {
      if (zrte != null) {
        this.ZY.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zl5f zl5f = zrte.ZdF(b);
          if (zl5f != null) {
            this.ZY.ZU(zl5f);
            Zs62 zs62 = this.ZF.<Zs62>ZA(zl5f, ((Zsi0)zl5f.ZF()).ZT);
            this.ZY.ZU(zs62);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZH(Zx29<Ztrr> paramZx29) {
    this.ZY.ZU(paramZx29);
    String[] arrayOfString = Ztgq.ZZ();
    Zx2h zx2h = this.ZF.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZY.ZU(zx2h);
    Zgpi zgpi = (Zgpi)this.ZF.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    this.ZY.ZU(zgpi);
    for (Zrte<Ztrr> zrte : (Iterable<Zrte<Ztrr>>)zx2h) {
      if (zrte != null) {
        this.ZY.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Ztrr ztrr = zrte.ZdF(b);
          if (ztrr != null) {
            this.ZY.ZU(ztrr);
            Zb0w zb0w = this.ZF.<Zb0w>ZA(ztrr, ((Zx_9)ztrr.ZF()).ZP);
            this.ZY.ZU(zb0w);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZX(Zx29<Ztrr> paramZx29) {
    ZH(paramZx29);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '* £NXô¿gª7Í¬/¢üø£52µþ;'=WÅË:Þ 4Ù³ã°§²¢©bu¿åÕËÑ^AZÜ­ÁY­ð-T3½ÓV;$-Ä|¸]p7tÊ¾!GØJ³óÞÕ\\n7cÕ)í¬ä2ÊNàHÍ<7;Y7;»¼ïÝkt=²¢ºß«ncÝd)¹s2ãùuÛ+ì'êRréSXñ>½Q\\ttzÓâØÊ,@)4Êò¾n¯üò\\nÇW1T³f`óÇbdî~Ü$P|zï7ìé¬¶7þx9UÕçºdZ>wã¾º¹%'´©u¿\\r7¤k+ /£JBd\\n12^WÄú;BÓ>ÙÿÝ¥FÈÂ*ÓucPjL^1FÞ%f·t}r:XWøÕ üÀìß×XUà¡vo¾¯ úüú(gÎ@k£.]øæ¾Oªböàâ*Îì?ïN3÷x+OKgN³Y®í½×Ì¡j_ÐÛ¿!Y<õ²ø6Åæ^çíHDTS Ô3ÊLvÎbj²Ï:)ï÷HÓaý2â­^úJU_gÛÏwêÀ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #64
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #111
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Zus \\n7,Õj[YÛºZ£\\n¥\\t:¢xw}°ÕBF9åÏÜ«Ò-£å2ÿËj¯M»Yÿ]'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #42
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zrni.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrni.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #108
    //   214: goto -> 244
    //   217: bipush #86
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #51
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #22
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x284E) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrni.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */