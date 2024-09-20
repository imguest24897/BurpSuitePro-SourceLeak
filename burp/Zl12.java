package burp;

import java.util.Map;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zl12 implements Ztf0 {
  private static final Zlqd ZF;
  
  private static final Zl_p<Zstu> Zd;
  
  private static final Zl_p<Zsdr> ZQ;
  
  private static final Zl_p<Zelu> Zl;
  
  private static final Zl_p<Zg0d> ZY;
  
  private static final Zl_p<Zb4i> Z_;
  
  private final Ztew ZC;
  
  private final Zlof Zr;
  
  private final Zkit Za;
  
  private final Zkit Zg;
  
  private final Ze24 Zb;
  
  private final Zl2m Zq;
  
  private final Zb3h Zf;
  
  private static final String a;
  
  Zl12(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m, Zb3h paramZb3h) {
    this.ZC = paramZtew;
    this.Zr = paramZlof;
    this.Za = paramZkit1;
    this.Zg = paramZkit2;
    this.Zb = paramZe24;
    this.Zq = paramZl2m;
    this.Zf = paramZb3h;
  }
  
  public <T extends Zgpi> T Zb(T paramT) {
    String[] arrayOfString = Ztgq.ZZ();
    if (paramT instanceof Zsy_) {
      Zsy_ zsy_ = (Zsy_)paramT;
      try {
        if (arrayOfString == null);
      } catch (Ztgq ztgq) {
        throw a(null);
      } 
      return (T)ZR(zsy_);
    } 
  }
  
  public boolean Zr(Zr_4 paramZr_4, Zgpi paramZgpi) {
    return paramZgpi instanceof Zsy_;
  }
  
  Zsy_ ZR(Zsy_ paramZsy_) {
    Zsy_ zsy_;
    try {
      zsy_ = this.Zg.<Zsy_>ZH(new Zkih());
      this.Zb.Zb(paramZsy_, zsy_);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Zr.ZK(throwable);
      return null;
    } 
    try {
      if (this.Za == null)
        return Zf((Zw9)paramZsy_, zsy_); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    return Zb(paramZsy_, zsy_);
  }
  
  private Zsy_ Zf(Zw9 paramZw9, Zsy_ paramZsy_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zkit;
    //   4: aload_2
    //   5: getstatic burp/Zk__.ZV : Lburp/Zekb;
    //   8: invokevirtual ZJ : (Lburp/Zgpi;Lburp/Zekb;)Lburp/Zgpi;
    //   11: checkcast burp/Zxlv
    //   14: astore #4
    //   16: invokestatic ZZ : ()[Ljava/lang/String;
    //   19: new java/util/HashMap
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #5
    //   28: astore_3
    //   29: aload_1
    //   30: invokevirtual ZPU : ()Ljava/util/Set;
    //   33: invokeinterface iterator : ()Ljava/util/Iterator;
    //   38: astore #6
    //   40: aload #6
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 215
    //   50: aload #6
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: checkcast java/util/Map$Entry
    //   60: astore #7
    //   62: aload_0
    //   63: getfield Zg : Lburp/Zkit;
    //   66: aload #7
    //   68: invokeinterface getKey : ()Ljava/lang/Object;
    //   73: checkcast java/lang/String
    //   76: invokevirtual Zz : (Ljava/lang/String;)Lburp/Zsdr;
    //   79: astore #8
    //   81: aload #8
    //   83: ifnonnull -> 90
    //   86: aload_3
    //   87: ifnonnull -> 40
    //   90: aload #7
    //   92: invokeinterface getValue : ()Ljava/lang/Object;
    //   97: ifnonnull -> 122
    //   100: aload #5
    //   102: aload #8
    //   104: aconst_null
    //   105: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: aload_3
    //   112: ifnonnull -> 174
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   121: athrow
    //   122: aload #7
    //   124: invokeinterface toString : ()Ljava/lang/String;
    //   129: astore #9
    //   131: aload_0
    //   132: aload #9
    //   134: aload #7
    //   136: invokeinterface getValue : ()Ljava/lang/Object;
    //   141: invokevirtual ZX : (Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Optional;
    //   144: aload_0
    //   145: aload #9
    //   147: aload #7
    //   149: <illegal opcode> get : (Lburp/Zl12;Ljava/lang/String;Ljava/util/Map$Entry;)Ljava/util/function/Supplier;
    //   154: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   157: checkcast java/lang/Long
    //   160: astore #10
    //   162: aload #5
    //   164: aload #8
    //   166: aload #10
    //   168: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   173: pop
    //   174: goto -> 211
    //   177: astore #8
    //   179: aload #8
    //   181: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   184: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   187: aload #8
    //   189: athrow
    //   190: astore #8
    //   192: aload #8
    //   194: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   197: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   200: aload_0
    //   201: getfield Zr : Lburp/Zlof;
    //   204: aload #8
    //   206: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   211: aload_3
    //   212: ifnonnull -> 40
    //   215: goto -> 254
    //   218: astore #6
    //   220: aload #6
    //   222: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   225: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   228: aload #6
    //   230: athrow
    //   231: astore #6
    //   233: aload #6
    //   235: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   238: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   241: aload_0
    //   242: getfield Zr : Lburp/Zlof;
    //   245: aload #6
    //   247: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   252: aconst_null
    //   253: areturn
    //   254: aload #5
    //   256: invokeinterface entrySet : ()Ljava/util/Set;
    //   261: invokeinterface iterator : ()Ljava/util/Iterator;
    //   266: astore #6
    //   268: aload #6
    //   270: invokeinterface hasNext : ()Z
    //   275: ifeq -> 325
    //   278: aload #6
    //   280: invokeinterface next : ()Ljava/lang/Object;
    //   285: checkcast java/util/Map$Entry
    //   288: astore #7
    //   290: aload #4
    //   292: aload #7
    //   294: invokeinterface getKey : ()Ljava/lang/Object;
    //   299: checkcast burp/Zsdr
    //   302: aload #7
    //   304: invokeinterface getValue : ()Ljava/lang/Object;
    //   309: checkcast java/lang/Long
    //   312: invokevirtual longValue : ()J
    //   315: invokeinterface Zr : (Lburp/Zgpi;J)Ljava/lang/Long;
    //   320: pop
    //   321: aload_3
    //   322: ifnonnull -> 268
    //   325: aload_2
    //   326: areturn
    //   327: astore #6
    //   329: aload #6
    //   331: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   334: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   337: aload_0
    //   338: getfield Zr : Lburp/Zlof;
    //   341: aload #6
    //   343: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   348: aconst_null
    //   349: areturn
    // Exception table:
    //   from	to	target	type
    //   29	215	218	burp/Ztgq
    //   29	215	218	burp/Zb_f
    //   29	215	231	java/lang/Throwable
    //   62	86	177	burp/Ztgq
    //   62	86	177	burp/Zb_f
    //   62	86	190	java/lang/Throwable
    //   90	115	118	burp/Ztgq
    //   90	174	177	burp/Ztgq
    //   90	174	177	burp/Zb_f
    //   90	174	190	java/lang/Throwable
    //   254	326	327	java/lang/Throwable
  }
  
  private Zsy_ Zb(Zsy_ paramZsy_1, Zsy_ paramZsy_2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lburp/Zkit;
    //   4: aload_1
    //   5: getstatic burp/Zk__.ZV : Lburp/Zekb;
    //   8: invokevirtual ZJ : (Lburp/Zgpi;Lburp/Zekb;)Lburp/Zgpi;
    //   11: checkcast burp/Zxlv
    //   14: astore #4
    //   16: invokestatic ZZ : ()[Ljava/lang/String;
    //   19: aload_0
    //   20: getfield Zg : Lburp/Zkit;
    //   23: aload_2
    //   24: getstatic burp/Zk__.ZV : Lburp/Zekb;
    //   27: invokevirtual ZJ : (Lburp/Zgpi;Lburp/Zekb;)Lburp/Zgpi;
    //   30: checkcast burp/Zxlv
    //   33: astore #5
    //   35: new java/util/HashMap
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #6
    //   44: astore_3
    //   45: aload #4
    //   47: invokeinterface ZqI : ()Ljava/util/Set;
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore #7
    //   59: aload #7
    //   61: invokeinterface hasNext : ()Z
    //   66: ifeq -> 216
    //   69: aload #7
    //   71: invokeinterface next : ()Ljava/lang/Object;
    //   76: checkcast burp/Zsdr
    //   79: astore #8
    //   81: aload_0
    //   82: getfield ZC : Lburp/Ztew;
    //   85: aload #8
    //   87: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   90: checkcast burp/Zsdr
    //   93: astore #9
    //   95: aload #9
    //   97: ifnonnull -> 104
    //   100: aload_3
    //   101: ifnonnull -> 59
    //   104: aload #4
    //   106: aload #8
    //   108: invokeinterface ZI : (Ljava/lang/Object;)Ljava/lang/Long;
    //   113: astore #10
    //   115: aload #10
    //   117: ifnonnull -> 142
    //   120: aload #6
    //   122: aload #9
    //   124: aconst_null
    //   125: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   130: pop
    //   131: aload_3
    //   132: ifnonnull -> 175
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload_0
    //   143: aload #8
    //   145: aload #10
    //   147: invokevirtual longValue : ()J
    //   150: invokevirtual Zr : (Lburp/Zsdr;J)Ljava/util/Optional;
    //   153: aload #10
    //   155: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   158: checkcast java/lang/Long
    //   161: astore #11
    //   163: aload #6
    //   165: aload #9
    //   167: aload #11
    //   169: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   174: pop
    //   175: goto -> 212
    //   178: astore #9
    //   180: aload #9
    //   182: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   185: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   188: aload #9
    //   190: athrow
    //   191: astore #9
    //   193: aload #9
    //   195: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   198: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   201: aload_0
    //   202: getfield Zr : Lburp/Zlof;
    //   205: aload #9
    //   207: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   212: aload_3
    //   213: ifnonnull -> 59
    //   216: goto -> 255
    //   219: astore #7
    //   221: aload #7
    //   223: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   226: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   229: aload #7
    //   231: athrow
    //   232: astore #7
    //   234: aload #7
    //   236: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   239: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   242: aload_0
    //   243: getfield Zr : Lburp/Zlof;
    //   246: aload #7
    //   248: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   253: aconst_null
    //   254: areturn
    //   255: aload #6
    //   257: invokeinterface entrySet : ()Ljava/util/Set;
    //   262: invokeinterface iterator : ()Ljava/util/Iterator;
    //   267: astore #7
    //   269: aload #7
    //   271: invokeinterface hasNext : ()Z
    //   276: ifeq -> 326
    //   279: aload #7
    //   281: invokeinterface next : ()Ljava/lang/Object;
    //   286: checkcast java/util/Map$Entry
    //   289: astore #8
    //   291: aload #5
    //   293: aload #8
    //   295: invokeinterface getKey : ()Ljava/lang/Object;
    //   300: checkcast burp/Zsdr
    //   303: aload #8
    //   305: invokeinterface getValue : ()Ljava/lang/Object;
    //   310: checkcast java/lang/Long
    //   313: invokevirtual longValue : ()J
    //   316: invokeinterface Zr : (Lburp/Zgpi;J)Ljava/lang/Long;
    //   321: pop
    //   322: aload_3
    //   323: ifnonnull -> 269
    //   326: aload_2
    //   327: areturn
    //   328: astore #7
    //   330: aload #7
    //   332: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   335: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   338: aload_0
    //   339: getfield Zr : Lburp/Zlof;
    //   342: aload #7
    //   344: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   349: aconst_null
    //   350: areturn
    // Exception table:
    //   from	to	target	type
    //   45	216	219	burp/Ztgq
    //   45	216	219	burp/Zb_f
    //   45	216	232	java/lang/Throwable
    //   81	100	178	burp/Ztgq
    //   81	100	178	burp/Zb_f
    //   81	100	191	java/lang/Throwable
    //   104	175	178	burp/Ztgq
    //   104	175	178	burp/Zb_f
    //   104	175	191	java/lang/Throwable
    //   115	135	138	burp/Ztgq
    //   255	327	328	java/lang/Throwable
  }
  
  private Optional<Long> ZX(String paramString, Object paramObject) {
    Zgpi zgpi = null;
    if (Zsp0.ZL(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zn(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zx(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zu(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.ZH(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.ZG(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zm(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zo(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.ZZ(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Ze(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.ZT(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zk(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.Zg(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.ZJ(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } else if (Zsp0.ZS(paramString)) {
      zgpi = this.ZC.Zc(paramObject);
    } 
    return Zr(zgpi);
  }
  
  private Optional<Long> Zr(Zsdr paramZsdr, long paramLong) {
    String str = paramZsdr.toString();
    Zgpi zgpi = null;
    if (Zsp0.ZL(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zmfv>Zo(paramLong, Zmfv.ZO));
    } else if (Zsp0.Zn(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zstu>Zo(paramLong, Zstu.Zc));
    } else if (Zsp0.Zx(str)) {
      zgpi = this.ZC.Zc(this.Za.Zo(paramLong, Zd));
    } else if (Zsp0.Zu(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zg06>Zo(paramLong, Zg06.Zs));
    } else if (Zsp0.ZH(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zmg>Zo(paramLong, ZF));
    } else if (Zsp0.ZG(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zxsn>Zo(paramLong, Zxsn.ZY));
    } else if (Zsp0.Zm(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zsdr>Zo(paramLong, Zsdr.Zo));
    } else if (Zsp0.Zo(str)) {
      zgpi = this.ZC.Zc(this.Za.Zo(paramLong, ZQ));
    } else if (Zsp0.ZZ(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zelu>Zo(paramLong, Zelu.ZB));
    } else if (Zsp0.Ze(str)) {
      zgpi = this.ZC.Zc(this.Za.Zo(paramLong, Zl));
    } else if (Zsp0.ZT(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zg0d>Zo(paramLong, Zg0d.ZQ));
    } else if (Zsp0.Zk(str)) {
      zgpi = this.ZC.Zc(this.Za.Zo(paramLong, ZY));
    } else if (Zsp0.Zg(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zb4i>Zo(paramLong, Zb4i.Zl));
    } else if (Zsp0.ZJ(str)) {
      zgpi = this.ZC.Zc(this.Za.Zo(paramLong, Z_));
    } else if (Zsp0.ZS(str)) {
      zgpi = this.ZC.Zc(this.Za.<Zsy_>Zo(paramLong, Zsy_.ZG));
    } 
    return Zr(zgpi);
  }
  
  private Optional<Long> Zr(Zgpi<?> paramZgpi) {
    try {
      if (paramZgpi == null)
        return Optional.empty(); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    long l = this.Zg.ZY(paramZgpi);
    try {
    
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    Zuh.ZT((l != 0L), Zqf.Zr, a);
    return Optional.of(Long.valueOf(l));
  }
  
  private Long ZB(String paramString, Object paramObject) {
    try {
      if (paramObject == null)
        return null; 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (Zsp0.ZF(paramString))
        return Zsp0.ZE((Boolean)paramObject); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (Zsp0.Zs(paramString))
        return Long.valueOf(((Byte)paramObject).longValue()); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (Zsp0.Zl(paramString))
        return Long.valueOf(((Short)paramObject).longValue()); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (Zsp0.Zc(paramString))
        return Long.valueOf(((Integer)paramObject).longValue()); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (Zsp0.ZX(paramString))
        return (Long)paramObject; 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  private Long lambda$copyHeapMemoryDataNode$0(String paramString, Map.Entry paramEntry) {
    return ZB(paramString, paramEntry.getValue());
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc '`Tv$<'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl12.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_2
    //   81: goto -> 111
    //   84: bipush #33
    //   86: goto -> 111
    //   89: bipush #14
    //   91: goto -> 111
    //   94: bipush #69
    //   96: goto -> 111
    //   99: bipush #77
    //   101: goto -> 111
    //   104: bipush #75
    //   106: goto -> 111
    //   109: bipush #52
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: new burp/Zlqd
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: putstatic burp/Zl12.ZF : Lburp/Zlqd;
    //   163: new burp/Zl_p
    //   166: dup
    //   167: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   170: invokespecial <init> : (Lburp/Zeu4;)V
    //   173: putstatic burp/Zl12.Zd : Lburp/Zl_p;
    //   176: new burp/Zl_p
    //   179: dup
    //   180: getstatic burp/Zsdr.Zo : Lburp/Zk_l;
    //   183: invokespecial <init> : (Lburp/Zeu4;)V
    //   186: putstatic burp/Zl12.ZQ : Lburp/Zl_p;
    //   189: new burp/Zl_p
    //   192: dup
    //   193: getstatic burp/Zelu.ZB : Lburp/Zk_4;
    //   196: invokespecial <init> : (Lburp/Zeu4;)V
    //   199: putstatic burp/Zl12.Zl : Lburp/Zl_p;
    //   202: new burp/Zl_p
    //   205: dup
    //   206: getstatic burp/Zg0d.ZQ : Lburp/Zk_s;
    //   209: invokespecial <init> : (Lburp/Zeu4;)V
    //   212: putstatic burp/Zl12.ZY : Lburp/Zl_p;
    //   215: new burp/Zl_p
    //   218: dup
    //   219: getstatic burp/Zb4i.Zl : Lburp/Zk_p;
    //   222: invokespecial <init> : (Lburp/Zeu4;)V
    //   225: putstatic burp/Zl12.Z_ : Lburp/Zl_p;
    //   228: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl12.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */