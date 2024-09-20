package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgev {
  private final Zt5o Ze;
  
  private final Zefg<Zbza> Zd;
  
  private final Zrgd Zl;
  
  private final Object Z_;
  
  private final Zz1i ZN;
  
  private final Zkyp Zt;
  
  private final Consumer<Zl5x> Zz;
  
  private final Supplier<List<Zt0r>> Zp;
  
  private final Supplier<List<Zz86>> Zi;
  
  private final Ztos<Zt1o> ZZ;
  
  private final int Zs;
  
  public Zgev(Zz1i paramZz1i, Zkyp paramZkyp, Zrgd paramZrgd, Consumer<Zl5x> paramConsumer, Supplier<List<Zt0r>> paramSupplier, Supplier<List<Zz86>> paramSupplier1, Ztos<Zt1o> paramZtos, int paramInt) {
    this.ZN = paramZz1i;
    this.Zt = paramZkyp;
    this.Zl = paramZrgd;
    this.Z_ = paramZz1i.ZH0();
    this.Zd = paramZz1i.ZHU();
    this.Zz = paramConsumer;
    this.Zp = paramSupplier;
    this.Zi = paramSupplier1;
    this.ZZ = paramZtos;
    this.Zs = paramInt;
    this.Ze = Zn();
  }
  
  public boolean Zc() {
    int j = ZO();
    Iterator<Zl5x> iterator = ((List)this.Zp.get()).iterator();
    int i = Zrjd.ZL();
    while (iterator.hasNext()) {
      Zl5x zl5x = iterator.next();
      if (((Integer)this.Ze.Zl.computeIfAbsent((K)zl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue() < j)
        return true; 
      if (((Integer)this.Ze.Zr.computeIfAbsent(zl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue() != j)
        return false; 
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  public Zbza ZT() {
    return ZQ((Collection<? extends Zl5x>)this.Zi.get());
  }
  
  public Zbza ZB() {
    return ZQ((Collection<? extends Zl5x>)this.Zp.get());
  }
  
  boolean Zt(Zl5x paramZl5x, Zbza paramZbza) {
    return (!paramZbza.ZO(paramZl5x) || this.ZN.Zd(paramZl5x) >= this.Zt.ZY1());
  }
  
  public synchronized void Zr(Zbza paramZbza) {
    // Byte code:
    //   0: getstatic burp/Zl5x.ZA : Ljava/util/List;
    //   3: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   8: aload_1
    //   9: <illegal opcode> test : (Lburp/Zbza;)Ljava/util/function/Predicate;
    //   14: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   19: aload_0
    //   20: aload_1
    //   21: <illegal opcode> accept : (Lburp/Zgev;Lburp/Zbza;)Ljava/util/function/Consumer;
    //   26: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   31: return
  }
  
  synchronized void ZP(Zl5x paramZl5x, Zlby paramZlby) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: invokevirtual ZW : ()Z
    //   8: ifeq -> 16
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual Zq : (Lburp/Zl5x;)V
    //   16: aload_0
    //   17: getfield Ze : Lburp/Zt5o;
    //   20: getfield Zw : Ljava/util/Set;
    //   23: aload_1
    //   24: invokeinterface contains : (Ljava/lang/Object;)Z
    //   29: ifeq -> 33
    //   32: return
    //   33: aload_0
    //   34: invokevirtual Zv : ()Z
    //   37: ifeq -> 48
    //   40: aload_0
    //   41: invokevirtual Zx : ()Z
    //   44: ifeq -> 48
    //   47: return
    //   48: aload_0
    //   49: getfield Ze : Lburp/Zt5o;
    //   52: getfield Zl : Ljava/util/Map;
    //   55: aload_1
    //   56: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   61: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   66: checkcast java/lang/Integer
    //   69: invokevirtual intValue : ()I
    //   72: istore #4
    //   74: iload #4
    //   76: aload_0
    //   77: getfield Zd : Lburp/Zefg;
    //   80: invokeinterface size : ()I
    //   85: if_icmpge -> 170
    //   88: aload_0
    //   89: getfield Zd : Lburp/Zefg;
    //   92: iload #4
    //   94: invokeinterface get : (I)Ljava/lang/Object;
    //   99: checkcast burp/Zbza
    //   102: aload_1
    //   103: invokeinterface ZW : (Lburp/Zl5x;)Lburp/Zlby;
    //   108: invokevirtual ZW : ()Z
    //   111: ifne -> 163
    //   114: aload_0
    //   115: getfield Zd : Lburp/Zefg;
    //   118: iload #4
    //   120: invokeinterface get : (I)Ljava/lang/Object;
    //   125: checkcast burp/Zbza
    //   128: aload_1
    //   129: invokeinterface ZW : (Lburp/Zl5x;)Lburp/Zlby;
    //   134: invokevirtual Zk : ()Z
    //   137: ifne -> 163
    //   140: aload_0
    //   141: getfield Zd : Lburp/Zefg;
    //   144: iload #4
    //   146: invokeinterface get : (I)Ljava/lang/Object;
    //   151: checkcast burp/Zbza
    //   154: invokeinterface Zg6 : ()B
    //   159: iconst_4
    //   160: if_icmpne -> 170
    //   163: iinc #4, 1
    //   166: iload_3
    //   167: ifne -> 74
    //   170: aload_0
    //   171: getfield Ze : Lburp/Zt5o;
    //   174: getfield Zl : Ljava/util/Map;
    //   177: aload_1
    //   178: iload #4
    //   180: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   183: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   188: pop
    //   189: aload_0
    //   190: getfield Ze : Lburp/Zt5o;
    //   193: getfield Zr : Ljava/util/Map;
    //   196: aload_1
    //   197: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   202: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   207: checkcast java/lang/Integer
    //   210: invokevirtual intValue : ()I
    //   213: istore #5
    //   215: iload #5
    //   217: aload_0
    //   218: getfield Zd : Lburp/Zefg;
    //   221: invokeinterface size : ()I
    //   226: if_icmpge -> 349
    //   229: aload_0
    //   230: getfield Zd : Lburp/Zefg;
    //   233: iload #5
    //   235: invokeinterface get : (I)Ljava/lang/Object;
    //   240: checkcast burp/Zbza
    //   243: aload_1
    //   244: invokeinterface ZW : (Lburp/Zl5x;)Lburp/Zlby;
    //   249: invokevirtual Zk : ()Z
    //   252: ifne -> 278
    //   255: aload_0
    //   256: getfield Zd : Lburp/Zefg;
    //   259: iload #5
    //   261: invokeinterface get : (I)Ljava/lang/Object;
    //   266: checkcast burp/Zbza
    //   269: invokeinterface Zg6 : ()B
    //   274: iconst_4
    //   275: if_icmpne -> 349
    //   278: aload_0
    //   279: getfield Zd : Lburp/Zefg;
    //   282: iload #5
    //   284: invokeinterface get : (I)Ljava/lang/Object;
    //   289: checkcast burp/Zbza
    //   292: invokeinterface Zg6 : ()B
    //   297: iconst_4
    //   298: if_icmpeq -> 342
    //   301: aload_0
    //   302: getfield Zd : Lburp/Zefg;
    //   305: iload #5
    //   307: invokeinterface get : (I)Ljava/lang/Object;
    //   312: checkcast burp/Zbza
    //   315: aload_1
    //   316: invokeinterface ZO : (Lburp/Zl5x;)Z
    //   321: ifeq -> 342
    //   324: aload_0
    //   325: getfield Ze : Lburp/Zt5o;
    //   328: getfield ZZ : Ljava/util/Map;
    //   331: aload_1
    //   332: iconst_1
    //   333: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   336: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   341: pop
    //   342: iinc #5, 1
    //   345: iload_3
    //   346: ifne -> 215
    //   349: aload_0
    //   350: getfield Ze : Lburp/Zt5o;
    //   353: getfield Zr : Ljava/util/Map;
    //   356: aload_1
    //   357: iload #5
    //   359: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   362: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   367: pop
    //   368: iload #5
    //   370: aload_0
    //   371: invokevirtual ZO : ()I
    //   374: if_icmpne -> 784
    //   377: aload_1
    //   378: invokeinterface Zv : ()Z
    //   383: ifeq -> 400
    //   386: aload_0
    //   387: getfield ZN : Lburp/Zz1i;
    //   390: aload_1
    //   391: invokeinterface Zz : (Lburp/Zl5x;)V
    //   396: iload_3
    //   397: ifne -> 410
    //   400: aload_0
    //   401: getfield ZN : Lburp/Zz1i;
    //   404: aload_1
    //   405: invokeinterface ZZ : (Lburp/Zl5x;)V
    //   410: aload_0
    //   411: getfield Zz : Ljava/util/function/Consumer;
    //   414: aload_1
    //   415: invokeinterface accept : (Ljava/lang/Object;)V
    //   420: aload_0
    //   421: getfield Ze : Lburp/Zt5o;
    //   424: getfield Zw : Ljava/util/Set;
    //   427: aload_1
    //   428: invokeinterface add : (Ljava/lang/Object;)Z
    //   433: pop
    //   434: aload_0
    //   435: getfield Ze : Lburp/Zt5o;
    //   438: getfield ZZ : Ljava/util/Map;
    //   441: aload_1
    //   442: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   447: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   452: checkcast java/lang/Boolean
    //   455: invokevirtual booleanValue : ()Z
    //   458: ifeq -> 600
    //   461: aload_0
    //   462: getfield ZN : Lburp/Zz1i;
    //   465: aload_1
    //   466: invokeinterface Zl : (Lburp/Zl5x;)J
    //   471: aload_0
    //   472: getfield Zt : Lburp/Zkyp;
    //   475: invokeinterface ZY1 : ()I
    //   480: i2l
    //   481: lcmp
    //   482: ifgt -> 600
    //   485: aload_0
    //   486: getfield Ze : Lburp/Zt5o;
    //   489: getfield Zw : Ljava/util/Set;
    //   492: aload_1
    //   493: invokeinterface remove : (Ljava/lang/Object;)Z
    //   498: pop
    //   499: aload_0
    //   500: getfield ZN : Lburp/Zz1i;
    //   503: aload_1
    //   504: invokeinterface ZT : (Lburp/Zl5x;)I
    //   509: istore #6
    //   511: aload_0
    //   512: getfield Ze : Lburp/Zt5o;
    //   515: getfield Zr : Ljava/util/Map;
    //   518: aload_1
    //   519: iload #6
    //   521: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   524: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   529: pop
    //   530: aload_0
    //   531: getfield Ze : Lburp/Zt5o;
    //   534: getfield Zl : Ljava/util/Map;
    //   537: aload_1
    //   538: iload #6
    //   540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   543: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   548: pop
    //   549: aload_0
    //   550: getfield Ze : Lburp/Zt5o;
    //   553: getfield ZZ : Ljava/util/Map;
    //   556: aload_1
    //   557: iconst_0
    //   558: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   561: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   566: pop
    //   567: aload_0
    //   568: getfield Zd : Lburp/Zefg;
    //   571: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   576: iload #6
    //   578: i2l
    //   579: invokeinterface skip : (J)Ljava/util/stream/Stream;
    //   584: aload_0
    //   585: aload_1
    //   586: <illegal opcode> accept : (Lburp/Zgev;Lburp/Zl5x;)Ljava/util/function/Consumer;
    //   591: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   596: iload_3
    //   597: ifne -> 784
    //   600: aload_0
    //   601: getfield ZN : Lburp/Zz1i;
    //   604: aload_1
    //   605: aload_0
    //   606: invokevirtual ZO : ()I
    //   609: invokeinterface ZN : (Lburp/Zl5x;I)V
    //   614: aload_0
    //   615: invokevirtual Zv : ()Z
    //   618: istore #6
    //   620: aload_0
    //   621: invokevirtual Zx : ()Z
    //   624: istore #7
    //   626: iload #6
    //   628: ifeq -> 695
    //   631: aload_0
    //   632: getfield Zp : Ljava/util/function/Supplier;
    //   635: invokeinterface get : ()Ljava/lang/Object;
    //   640: checkcast java/util/List
    //   643: invokeinterface iterator : ()Ljava/util/Iterator;
    //   648: astore #8
    //   650: aload #8
    //   652: invokeinterface hasNext : ()Z
    //   657: ifeq -> 695
    //   660: aload #8
    //   662: invokeinterface next : ()Ljava/lang/Object;
    //   667: checkcast burp/Zl5x
    //   670: astore #9
    //   672: aload_0
    //   673: getfield Ze : Lburp/Zt5o;
    //   676: getfield ZZ : Ljava/util/Map;
    //   679: aload #9
    //   681: iconst_0
    //   682: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   685: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   690: pop
    //   691: iload_3
    //   692: ifne -> 650
    //   695: iload #7
    //   697: ifeq -> 764
    //   700: aload_0
    //   701: getfield Zi : Ljava/util/function/Supplier;
    //   704: invokeinterface get : ()Ljava/lang/Object;
    //   709: checkcast java/util/List
    //   712: invokeinterface iterator : ()Ljava/util/Iterator;
    //   717: astore #8
    //   719: aload #8
    //   721: invokeinterface hasNext : ()Z
    //   726: ifeq -> 764
    //   729: aload #8
    //   731: invokeinterface next : ()Ljava/lang/Object;
    //   736: checkcast burp/Zl5x
    //   739: astore #9
    //   741: aload_0
    //   742: getfield Ze : Lburp/Zt5o;
    //   745: getfield ZZ : Ljava/util/Map;
    //   748: aload #9
    //   750: iconst_0
    //   751: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   754: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   759: pop
    //   760: iload_3
    //   761: ifne -> 719
    //   764: iload #6
    //   766: ifeq -> 784
    //   769: iload #7
    //   771: ifeq -> 784
    //   774: aload_0
    //   775: getfield ZZ : Lburp/Ztos;
    //   778: getstatic burp/Zt1o.Zg : Lburp/Zxr8;
    //   781: invokevirtual ZD : (Lburp/Zxr8;)V
    //   784: return
  }
  
  public boolean Zv() {
    int i = this.Zd.size();
    Zl5x zl5x = Zt();
    return (zl5x == null) ? true : ((this.Ze != null && (!((Boolean)this.Ze.ZZ.computeIfAbsent(zl5x, Zgev::lambda$notifyAuditPhaseFinished$6)).booleanValue() || this.ZN.Zd(zl5x) >= this.Zt.ZY1()) && ((Integer)this.Ze.Zr.computeIfAbsent(zl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue() == i));
  }
  
  public boolean Zx() {
    int i = this.Zd.size();
    Zl5x zl5x = Zw();
    return (zl5x == null) ? true : ((this.Ze != null && (!((Boolean)this.Ze.ZZ.computeIfAbsent(zl5x, Zgev::lambda$notifyAuditPhaseFinished$6)).booleanValue() || this.ZN.Zd(zl5x) >= this.Zt.ZY1()) && ((Integer)this.Ze.Zr.computeIfAbsent(zl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue() == i));
  }
  
  private synchronized Zbza ZQ(Collection<? extends Zl5x> paramCollection) {
    Zbza zbza = ZF(paramCollection);
    if (zbza != null)
      this.ZZ.ZD(new Zxr8(Zt1o.ZS, Ze6e.Zb(zbza))); 
    return zbza;
  }
  
  private Zbza ZF(Collection<? extends Zl5x> paramCollection) {
    int j = ZO();
    Iterator<? extends Zl5x> iterator = paramCollection.iterator();
    int i = Zrjd.ZG();
    while (iterator.hasNext()) {
      Zl5x zl5x = iterator.next();
      if (((Integer)this.Ze.Zl.computeIfAbsent((K)zl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue() < j) {
        if (ZB(zl5x) >= this.Zs)
          return null; 
        if (this.ZN.Zd(zl5x) < 1L) {
          Zbza zbza1 = Zl(zl5x, false);
          if (zbza1 != null)
            ZJ(this.Ze, zl5x); 
          return zbza1;
        } 
        Zbza zbza = Zl(zl5x, true);
        if (zbza != null) {
          synchronized (zbza.Zz6()) {
            zbza.Zy(zl5x);
            zbza.Zu(zl5x, Zlby.RUNNING);
            zbza.ZN((byte)1);
          } 
          ZJ(this.Ze, zl5x);
        } 
        return zbza;
      } 
      if (((Integer)this.Ze.Zr.computeIfAbsent(zl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue() != j)
        return null; 
      if (i != 0)
        break; 
    } 
    return null;
  }
  
  private Zbza Zl(Zl5x paramZl5x, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Ljava/lang/Object;
    //   4: dup
    //   5: astore #4
    //   7: monitorenter
    //   8: aload_0
    //   9: aload_1
    //   10: aload_1
    //   11: iload_2
    //   12: <illegal opcode> test : (Lburp/Zl5x;Z)Ljava/util/function/Predicate;
    //   17: invokevirtual ZD : (Lburp/Zl5x;Ljava/util/function/Predicate;)Ljava/lang/Integer;
    //   20: astore #5
    //   22: aload #5
    //   24: ifnonnull -> 32
    //   27: aconst_null
    //   28: aload #4
    //   30: monitorexit
    //   31: areturn
    //   32: aload_0
    //   33: getfield Zd : Lburp/Zefg;
    //   36: aload #5
    //   38: invokevirtual intValue : ()I
    //   41: invokeinterface get : (I)Ljava/lang/Object;
    //   46: checkcast burp/Zbza
    //   49: astore_3
    //   50: aload_3
    //   51: invokeinterface Zg6 : ()B
    //   56: iconst_1
    //   57: if_icmpeq -> 80
    //   60: aload_3
    //   61: iconst_1
    //   62: invokeinterface ZN : (B)V
    //   67: aload_3
    //   68: aload_0
    //   69: getfield Zl : Lburp/Zrgd;
    //   72: invokevirtual ZX : ()J
    //   75: invokeinterface Zt : (J)V
    //   80: aload #4
    //   82: monitorexit
    //   83: goto -> 94
    //   86: astore #6
    //   88: aload #4
    //   90: monitorexit
    //   91: aload #6
    //   93: athrow
    //   94: aload_3
    //   95: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   100: dup
    //   101: astore #4
    //   103: monitorenter
    //   104: aload_3
    //   105: aload_1
    //   106: getstatic burp/Zlby.RUNNING : Lburp/Zlby;
    //   109: invokeinterface Zu : (Lburp/Zl5x;Lburp/Zlby;)V
    //   114: aload #4
    //   116: monitorexit
    //   117: goto -> 128
    //   120: astore #7
    //   122: aload #4
    //   124: monitorexit
    //   125: aload #7
    //   127: athrow
    //   128: aload_3
    //   129: areturn
    // Exception table:
    //   from	to	target	type
    //   8	31	86	finally
    //   32	83	86	finally
    //   86	91	86	finally
    //   104	117	120	finally
    //   120	125	120	finally
  }
  
  private Integer ZD(Zl5x paramZl5x, Predicate<Zbza> paramPredicate) {
    int i = ((Integer)this.Ze.Zl.computeIfAbsent(paramZl5x, Zgev::lambda$hasNextActiveWaitingItem$0)).intValue();
    int j = this.Zd.size();
    if (i >= j)
      return null; 
    i = ZE(j, i, paramPredicate);
    if (i >= j) {
      this.Ze.Zl.put(paramZl5x, Integer.valueOf(i));
      return null;
    } 
    int k = ZE(j, i + 1, paramPredicate);
    this.Ze.Zl.put(paramZl5x, Integer.valueOf(k));
    return Integer.valueOf(i);
  }
  
  private int ZE(int paramInt1, int paramInt2, Predicate<Zbza> paramPredicate) {
    int i = Zrjd.ZL();
    while (paramInt2 < paramInt1 && !paramPredicate.test(this.Zd.get(paramInt2))) {
      paramInt2++;
      if (i == 0)
        break; 
    } 
    return paramInt2;
  }
  
  private static boolean Z_(Zbza paramZbza, Zl5x paramZl5x, boolean paramBoolean) {
    Zlby zlby = paramZbza.ZW(paramZl5x);
    return (zlby == (paramBoolean ? Zlby.UNINITIALIZED_WITH_ERROR : Zlby.UNINITIALIZED) && paramZbza.Zg6() != 2 && paramZbza.Zg6() != 4);
  }
  
  private int ZO() {
    synchronized (this.Z_) {
      return this.Zd.size();
    } 
  }
  
  private Zt5o Zn() {
    Zt5o zt5o = new Zt5o(this::ZO);
    Zv(zt5o, (Collection<? extends Zl5x>)this.Zp.get(), true);
    Zv(zt5o, (Collection<? extends Zl5x>)this.Zi.get(), true);
    if (this.Zd.size() > 0 && Zx() && Zv())
      this.ZZ.ZD(Zt1o.Zg); 
    return zt5o;
  }
  
  private Zl5x Zt() {
    List<Zl5x> list = (List)this.Zp.get();
    return list.isEmpty() ? null : list.get(list.size() - 1);
  }
  
  private Zl5x Zw() {
    List<Zl5x> list = (List)this.Zi.get();
    return list.isEmpty() ? null : list.get(list.size() - 1);
  }
  
  private void Zv(Zt5o paramZt5o, Collection<? extends Zl5x> paramCollection, boolean paramBoolean) {
    int i = Zrjd.ZL();
    byte b = 0;
    while (b < this.Zd.size()) {
      Zbza zbza = this.Zd.get(b);
      if (zbza.Zg6() != 4)
        for (Zl5x zl5x : paramCollection) {
          if (this.ZN.Zd(zl5x) > 0L && zbza.ZW(zl5x) == Zlby.UNINITIALIZED && paramBoolean)
            zbza.Zu(zl5x, Zlby.UNINITIALIZED_WITH_ERROR); 
          switch (Zekw.Zv[zbza.ZW(zl5x).ordinal()]) {
            case 1:
            case 2:
              paramZt5o.Zl.putIfAbsent(zl5x, Integer.valueOf(b));
              paramZt5o.Zr.putIfAbsent(zl5x, Integer.valueOf(b));
            case 3:
              paramZt5o.ZZ.put(zl5x, Boolean.valueOf(true));
            case 4:
              paramZt5o.Zr.putIfAbsent(zl5x, Integer.valueOf(b));
              ZJ(paramZt5o, zl5x);
            case 5:
              if (b >= this.ZN.ZT(zl5x))
                paramZt5o.ZZ.put(zl5x, Boolean.valueOf(true)); 
              break;
          } 
          continue;
          if (i == 0)
            break; 
        }  
      b++;
      if (i == 0)
        break; 
    } 
    for (Zl5x zl5x : paramCollection) {
      if (!paramZt5o.Zr.containsKey(zl5x))
        paramZt5o.ZZ.put(zl5x, Boolean.valueOf(false)); 
      paramZt5o.Zl.putIfAbsent(zl5x, Integer.valueOf(this.Zd.size()));
      paramZt5o.Zr.putIfAbsent(zl5x, Integer.valueOf(this.Zd.size()));
      paramZt5o.ZZ.putIfAbsent(zl5x, Boolean.valueOf(false));
      if (i == 0)
        break; 
    } 
  }
  
  private void ZJ(Zt5o paramZt5o, Zl5x paramZl5x) {
    ((AtomicInteger)paramZt5o.ZF.computeIfAbsent(paramZl5x, Zgev::lambda$incrementItemsInProgress$16)).incrementAndGet();
  }
  
  private void Zq(Zl5x paramZl5x) {
    ((AtomicInteger)this.Ze.ZF.computeIfAbsent(paramZl5x, Zgev::lambda$decrementItemsInProgress$17)).decrementAndGet();
  }
  
  private int ZB(Zl5x paramZl5x) {
    return ((AtomicInteger)this.Ze.ZF.computeIfAbsent(paramZl5x, Zgev::lambda$incrementItemsInProgress$16)).get();
  }
  
  public synchronized void ZW() {
    this.Ze.Zw.clear();
    this.ZN.ZHH();
  }
  
  public Zt5o Zd() {
    return this.Ze;
  }
  
  public Zt5o ZM() {
    Zt5o zt5o = new Zt5o(this::ZO);
    Zv(zt5o, (Collection<? extends Zl5x>)this.Zp.get(), false);
    Zv(zt5o, (Collection<? extends Zl5x>)this.Zi.get(), false);
    return zt5o;
  }
  
  private static AtomicInteger lambda$decrementItemsInProgress$17(Zl5x paramZl5x) {
    Zuh.Zb(false, Zqf.ZC);
    return new AtomicInteger();
  }
  
  private static AtomicInteger lambda$incrementItemsInProgress$16(Zl5x paramZl5x) {
    return new AtomicInteger();
  }
  
  private static boolean lambda$getNextUninitialized$14(Zl5x paramZl5x, boolean paramBoolean, Zbza paramZbza) {
    return Z_(paramZbza, paramZl5x, paramBoolean);
  }
  
  private void lambda$notifyAuditPhaseFinished$7(Zl5x paramZl5x, Zbza paramZbza) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: aload_1
    //   6: invokeinterface ZO : (Lburp/Zl5x;)Z
    //   11: ifeq -> 103
    //   14: aload_2
    //   15: aload_1
    //   16: invokeinterface ZW : (Lburp/Zl5x;)Lburp/Zlby;
    //   21: invokevirtual Zk : ()Z
    //   24: ifeq -> 45
    //   27: aload_0
    //   28: getfield ZZ : Lburp/Ztos;
    //   31: new burp/Zxr8
    //   34: dup
    //   35: getstatic burp/Zt1o.ZG : Lburp/Zlnb;
    //   38: aload_1
    //   39: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   42: invokevirtual ZD : (Lburp/Zxr8;)V
    //   45: aload_2
    //   46: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   51: dup
    //   52: astore #4
    //   54: monitorenter
    //   55: aload_2
    //   56: invokeinterface Zg6 : ()B
    //   61: iconst_4
    //   62: if_icmpeq -> 79
    //   65: aload_2
    //   66: aload_1
    //   67: getstatic burp/Zlby.UNINITIALIZED_WITH_ERROR : Lburp/Zlby;
    //   70: invokeinterface Zu : (Lburp/Zl5x;Lburp/Zlby;)V
    //   75: iload_3
    //   76: ifne -> 89
    //   79: aload_2
    //   80: aload_1
    //   81: getstatic burp/Zlby.FINISHED_WITH_ERROR : Lburp/Zlby;
    //   84: invokeinterface Zu : (Lburp/Zl5x;Lburp/Zlby;)V
    //   89: aload #4
    //   91: monitorexit
    //   92: goto -> 103
    //   95: astore #5
    //   97: aload #4
    //   99: monitorexit
    //   100: aload #5
    //   102: athrow
    //   103: return
    // Exception table:
    //   from	to	target	type
    //   55	92	95	finally
    //   95	100	95	finally
  }
  
  private static Boolean lambda$notifyAuditPhaseFinished$6(Zl5x paramZl5x) {
    return Boolean.valueOf(false);
  }
  
  private void lambda$itemCancelled$3(Zbza paramZbza, Zl5x paramZl5x) {
    ZP(paramZl5x, paramZbza.ZW(paramZl5x));
    paramZbza.Zu(paramZl5x, Zlby.FINISHED);
  }
  
  private static boolean lambda$itemCancelled$2(Zbza paramZbza, Zl5x paramZl5x) {
    return !paramZbza.ZW(paramZl5x).Zk();
  }
  
  private static Integer lambda$hasNextActiveWaitingItem$0(Zl5x paramZl5x) {
    return Integer.valueOf(0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */