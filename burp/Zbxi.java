package burp;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zd4;
import net.portswigger.Zfb;
import net.portswigger.Zgl;
import net.portswigger.Zi7;
import net.portswigger.Zm2;
import net.portswigger.Zv3;

public class Zbxi {
  private final Zr69 Zt;
  
  private final Zlog Zo;
  
  private final Zl7h Zz;
  
  private final Zgl Zm;
  
  private final List<Zr9z> ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbxi(Zr69 paramZr69, Zlog paramZlog) {
    this.Zt = paramZr69;
    this.Zo = paramZlog;
    this.Zz = paramZlog.ZnH();
    this.Zm = new Zgl(paramZlog.ZPy());
    this.ZB = new LinkedList<>();
  }
  
  public void ZG(Zlli<Zt18> paramZlli, Zlli<Zt35> paramZlli1) {
    Zts2.Zr().Zz(paramZlli, Zt18.Zc, this::lambda$subscribeTo$0);
    Zts2.Zr().Zz(paramZlli, Zt18.Ze, this::lambda$subscribeTo$0);
    Zbqc[] arrayOfZbqc = Zsd6.ZR();
    try {
      paramZlli1.ZE(Zt35.ZW, this::lambda$subscribeTo$2);
      paramZlli1.ZE(Zt35.Zo, this::lambda$subscribeTo$3);
      paramZlli1.ZE(Zt35.Zy, this::lambda$subscribeTo$4);
      if (Zbqc.Zwu() == null)
        Zsd6.ZD(new Zbqc[3]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private void Ze(Zz2i paramZz2i) {
    paramZz2i.ZS().ifPresent(this::lambda$connectionCheckResultAdded$5);
  }
  
  private void ZF() {
    this.Zz.ZVB();
  }
  
  private void Zg() {
    this.Zz.ZVl();
    this.ZB.add(Zi());
  }
  
  private void ZO() {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zt : Lburp/Zr69;
    //   8: invokeinterface Zb : ()Z
    //   13: ifeq -> 21
    //   16: return
    //   17: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   20: athrow
    //   21: aload_0
    //   22: getfield Zz : Lburp/Zl7h;
    //   25: invokeinterface ZV6 : ()Lburp/Zrmh;
    //   30: invokeinterface Zzz : ()Lburp/Zbq0;
    //   35: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   38: getstatic burp/Zbq0.NORMAL : Lburp/Zbq0;
    //   41: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   44: checkcast burp/Zbq0
    //   47: getfield id : I
    //   50: istore_2
    //   51: lconst_0
    //   52: lstore_3
    //   53: lconst_0
    //   54: lstore #5
    //   56: lconst_0
    //   57: lstore #7
    //   59: new java/util/HashMap
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: astore #9
    //   68: new java/util/HashMap
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: astore #10
    //   77: new java/util/HashMap
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: astore #11
    //   86: new java/util/HashMap
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #12
    //   95: aload_0
    //   96: getfield Zz : Lburp/Zl7h;
    //   99: invokeinterface ZVP : ()Lburp/Zt1i;
    //   104: invokeinterface iterator : ()Ljava/util/Iterator;
    //   109: astore #13
    //   111: aload #13
    //   113: invokeinterface hasNext : ()Z
    //   118: ifeq -> 352
    //   121: aload #13
    //   123: invokeinterface next : ()Ljava/lang/Object;
    //   128: checkcast burp/Zeu9
    //   131: astore #14
    //   133: aload #14
    //   135: instanceof burp/Zgd4
    //   138: ifeq -> 148
    //   141: goto -> 111
    //   144: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   147: athrow
    //   148: lload_3
    //   149: lconst_1
    //   150: ladd
    //   151: lstore_3
    //   152: aload #14
    //   154: invokeinterface ZHV : ()Ljava/util/List;
    //   159: invokeinterface iterator : ()Ljava/util/Iterator;
    //   164: astore #15
    //   166: aload #15
    //   168: invokeinterface hasNext : ()Z
    //   173: ifeq -> 348
    //   176: aload #15
    //   178: invokeinterface next : ()Ljava/lang/Object;
    //   183: checkcast burp/Zrp0
    //   186: astore #16
    //   188: aload #16
    //   190: invokeinterface Zng : ()Ljava/util/Collection;
    //   195: invokeinterface isEmpty : ()Z
    //   200: ifeq -> 210
    //   203: goto -> 166
    //   206: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   209: athrow
    //   210: aload #16
    //   212: invokeinterface Zng : ()Ljava/util/Collection;
    //   217: invokeinterface iterator : ()Ljava/util/Iterator;
    //   222: astore #17
    //   224: aload #17
    //   226: invokeinterface hasNext : ()Z
    //   231: ifeq -> 278
    //   234: aload #17
    //   236: invokeinterface next : ()Ljava/lang/Object;
    //   241: checkcast burp/Zt8i
    //   244: astore #18
    //   246: aload #18
    //   248: invokeinterface Zsu : ()Lburp/Zeu9;
    //   253: invokeinterface ZHk : ()Ljava/util/Optional;
    //   258: aload #18
    //   260: aload #9
    //   262: aload #10
    //   264: aload #11
    //   266: <illegal opcode> accept : (Lburp/Zt8i;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/function/Consumer;
    //   271: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   274: aload_1
    //   275: ifnull -> 224
    //   278: aload #16
    //   280: instanceof burp/Zl_
    //   283: ifeq -> 322
    //   286: aload #16
    //   288: checkcast burp/Zl_
    //   291: astore #17
    //   293: aload #17
    //   295: invokeinterface Zfy : ()Lburp/Zm6i;
    //   300: invokeinterface Zm2 : ()Lburp/Zz3o;
    //   305: astore #18
    //   307: aload #12
    //   309: aload #18
    //   311: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   316: invokeinterface compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    //   321: pop
    //   322: lload #7
    //   324: lconst_1
    //   325: ladd
    //   326: lstore #7
    //   328: aload #16
    //   330: invokeinterface Zny : ()Z
    //   335: ifne -> 344
    //   338: lload #5
    //   340: lconst_1
    //   341: ladd
    //   342: lstore #5
    //   344: aload_1
    //   345: ifnull -> 166
    //   348: aload_1
    //   349: ifnull -> 111
    //   352: aload_0
    //   353: getfield Zm : Lnet/portswigger/Zgl;
    //   356: getstatic burp/Zv8r.CRAWL_STRATEGY_USED : Lburp/Zv8r;
    //   359: iload_2
    //   360: i2l
    //   361: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   364: aload_0
    //   365: getfield Zm : Lnet/portswigger/Zgl;
    //   368: getstatic burp/Zv8r.CRAWL_NUMBER_OF_REQUESTS : Lburp/Zv8r;
    //   371: aload_0
    //   372: getfield Zz : Lburp/Zl7h;
    //   375: invokeinterface ZVI : ()I
    //   380: i2l
    //   381: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   384: aload_0
    //   385: getfield Zm : Lnet/portswigger/Zgl;
    //   388: getstatic burp/Zv8r.CRAWL_NUMBER_OF_SEED_URLS : Lburp/Zv8r;
    //   391: aload_0
    //   392: getfield Zz : Lburp/Zl7h;
    //   395: invokeinterface ZVe : ()Lburp/Zxjt;
    //   400: invokeinterface ZBZ : ()Ljava/util/List;
    //   405: invokeinterface size : ()I
    //   410: i2l
    //   411: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   414: aload_0
    //   415: getfield Zo : Lburp/Zlog;
    //   418: invokeinterface ZPB : ()Ljava/time/Duration;
    //   423: astore #13
    //   425: aload_0
    //   426: getfield Zm : Lnet/portswigger/Zgl;
    //   429: getstatic burp/Zv8r.CRAWL_DURATION : Lburp/Zv8r;
    //   432: aload #13
    //   434: invokevirtual toSeconds : ()J
    //   437: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   440: aload_0
    //   441: getfield Zm : Lnet/portswigger/Zgl;
    //   444: getstatic burp/Zv8r.CRAWL_NUMBER_OF_ROOMS : Lburp/Zv8r;
    //   447: lload_3
    //   448: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   451: aload_0
    //   452: getfield Zm : Lnet/portswigger/Zgl;
    //   455: getstatic burp/Zv8r.CRAWL_NUMBER_OF_ROOMS_ADDED : Lburp/Zv8r;
    //   458: aload_0
    //   459: getfield Zz : Lburp/Zl7h;
    //   462: invokeinterface ZVK : ()I
    //   467: i2l
    //   468: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   471: aload_0
    //   472: getfield Zm : Lnet/portswigger/Zgl;
    //   475: getstatic burp/Zv8r.CRAWL_NUMBER_OF_ROOMS_ENTERED : Lburp/Zv8r;
    //   478: aload_0
    //   479: getfield Zz : Lburp/Zl7h;
    //   482: invokeinterface ZVc : ()I
    //   487: i2l
    //   488: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   491: aload_0
    //   492: getfield Zm : Lnet/portswigger/Zgl;
    //   495: getstatic burp/Zv8r.CRAWL_NUMBER_OF_DOORWAYS : Lburp/Zv8r;
    //   498: lload #7
    //   500: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   503: aload_0
    //   504: getfield Zm : Lnet/portswigger/Zgl;
    //   507: getstatic burp/Zv8r.CRAWL_NUMBER_OF_NON_DETERMINISTIC_DOORS : Lburp/Zv8r;
    //   510: lload #5
    //   512: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   515: aload_0
    //   516: getfield Zm : Lnet/portswigger/Zgl;
    //   519: getstatic burp/Zv8r.CRAWL_AGENT_TYPE : Lburp/Zv8r;
    //   522: aload_0
    //   523: getfield Zz : Lburp/Zl7h;
    //   526: invokeinterface ZVi : ()Z
    //   531: ifeq -> 542
    //   534: lconst_1
    //   535: goto -> 543
    //   538: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   541: athrow
    //   542: lconst_0
    //   543: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   546: aload #12
    //   548: aload_0
    //   549: <illegal opcode> accept : (Lburp/Zbxi;)Ljava/util/function/BiConsumer;
    //   554: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   559: aload_0
    //   560: getfield Zm : Lnet/portswigger/Zgl;
    //   563: getstatic burp/Zec3.CRAWL_INFO : Lburp/Zec3;
    //   566: aload_0
    //   567: aload #9
    //   569: aload #11
    //   571: aload #10
    //   573: invokevirtual Zz : (Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    //   576: invokestatic Zz : (Lnet/portswigger/Zgl;Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   579: return
    // Exception table:
    //   from	to	target	type
    //   4	17	17	java/lang/MatchException
    //   133	144	144	java/lang/MatchException
    //   188	206	206	java/lang/MatchException
    //   425	538	538	java/lang/MatchException
  }
  
  private void Zy(Zz3o paramZz3o, int paramInt) {
    try {
      switch (Zefc.Ze[paramZz3o.ordinal()]) {
        default:
          throw new MatchException(null, null);
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
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zv8r zv8r = Zv8r.CRAWL_NUMBER_OF_DISCOVERED_GRAPHQL_OPERATION_EDGES;
    Zm2.Ze(this.Zm, zv8r, paramInt);
  }
  
  private String Zz(Map<String, List<Duration>> paramMap1, Map<String, List<Duration>> paramMap2, Map<String, List<Duration>> paramMap3) {
    Zi7 zi71 = Zv3.ZU();
    Zi7 zi72 = Zv3.ZU();
    zi72.Zg(a(-10993, 31767), a(-11001, -11714));
    zi72.Zy(a(-10997, -28369), Zt(this.Zz.ZVe().ZBZ()));
    zi72.Zg(a(-11007, 32530), this.Zt.ZL().name());
    zi71.ZN(a(-11003, 18291), (Zd4)zi72);
    Zi7 zi73 = Zv3.ZU();
    zi73.ZN(a(-11008, -23631), (Zd4)Zs(this.ZB));
    zi71.ZN(a(-10998, -3721), (Zd4)zi73);
    Zi7 zi74 = Zv3.ZU();
    Zi7 zi75 = Zv3.ZU();
    Zw(paramMap1, zi75);
    zi74.ZN(a(-10995, 25280), (Zd4)zi75);
    Zi7 zi76 = Zv3.ZU();
    Zw(paramMap3, zi76);
    zi74.ZN(a(-10994, 10656), (Zd4)zi76);
    Zi7 zi77 = Zv3.ZU();
    Zw(paramMap2, zi77);
    zi74.ZN(a(-11006, -25217), (Zd4)zi77);
    zi71.ZN(a(-11002, -7465), (Zd4)zi74);
    return zi71.toString();
  }
  
  private static void Zw(Map<String, List<Duration>> paramMap, Zi7 paramZi7) {
    Zbqc[] arrayOfZbqc = Zsd6.ZR();
    for (Map.Entry<String, List<Duration>> entry : paramMap.entrySet()) {
      int i = Integer.MAX_VALUE;
      int j = Integer.MIN_VALUE;
      long l = 0L;
      List list = (List)entry.getValue();
      for (Duration duration : list) {
        int k = (int)duration.toMillis();
        if (k < i)
          i = k; 
        if (k > j)
          j = k; 
        l += k;
        if (arrayOfZbqc != null)
          break; 
      } 
      Zi7 zi7 = Zv3.ZU();
      zi7.Zy(a(-11004, -3585), i);
      zi7.Zy(a(-10996, 16300), j);
      zi7.Zy(a(-11005, -16641), (int)(l / list.size()));
      paramZi7.ZN(String.valueOf(((String)entry.getKey()).hashCode()), (Zd4)zi7);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  static int Zt(List<Zski> paramList) {
    return paramList.stream().map(Object::toString).sorted().toList().hashCode();
  }
  
  private Zfb Zs(List<Zr9z> paramList) {
    return Zv3.Z_((Zd4[])paramList.stream().map(Zr9z::Ze).toArray(Zbxi::lambda$timestampsAsJson$11));
  }
  
  private Zr9z Zi() {
    return new Zr9z(this.Zt.Zx().Zq(), this.Zo.ZPB());
  }
  
  private static Zi7[] lambda$timestampsAsJson$11(int paramInt) {
    return new Zi7[paramInt];
  }
  
  private static Integer lambda$onActFinished$10(Zz3o paramZz3o, Integer paramInteger) {
    return Integer.valueOf(((Integer)Objects.<Integer>requireNonNullElse(paramInteger, Integer.valueOf(0))).intValue() + 1);
  }
  
  private static void lambda$onActFinished$9(Zt8i paramZt8i, Map<String, List<Duration>> paramMap1, Map<String, List<Duration>> paramMap2, Map<String, List<Duration>> paramMap3, Zski paramZski) {
    Zl1g zl1g = paramZt8i.Zs1();
    if (zl1g.Zar() == Zsze.SUCCESSFUL) {
      String str = paramZski.ZyR().Zd1();
      ((List<Duration>)paramMap1.computeIfAbsent(str, Zbxi::lambda$onActFinished$6)).add(zl1g.ZaK());
      ((List<Duration>)paramMap2.computeIfAbsent(str, Zbxi::lambda$onActFinished$6)).add(zl1g.Za5());
      ((List<Duration>)paramMap3.computeIfAbsent(str, Zbxi::lambda$onActFinished$6)).add(zl1g.ZaA());
    } 
  }
  
  private static List lambda$onActFinished$6(String paramString) {
    return new LinkedList();
  }
  
  private void lambda$connectionCheckResultAdded$5(Zr_j paramZr_j) {
    Zm2.Ze(this.Zm, Zv8r.CRAWL_CONNECTION_CHECK_CODE, paramZr_j.Zp().Zb());
  }
  
  private void lambda$subscribeTo$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Ze);
  }
  
  private void lambda$subscribeTo$3(Zxr8 paramZxr8) {
    Zg();
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    ZF();
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    ZO();
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '& èIÄÊPÿý\\bB¨Çä;+WrNþõa©{ÅàÖdåhôrl~L»ù´ÒÃ?&èð¶(T\Úæâ°Ë(V\\b©¨1{\\bÉj\iw£v©Ï}`§aò6,ÑË!Uîß3ê¦X\øfâ{oôïÉ[ÃXª÷â=±òS '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #19
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #72
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc '¯aö #«I¼\\búF³¢ÜFR'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #126
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbxi.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbxi.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #49
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #50
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #117
    //   239: goto -> 244
    //   242: bipush #62
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD506) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */