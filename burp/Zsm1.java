package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zsm1 implements Zmgs {
  private final Supplier<Ztwh> Zp;
  
  private final Zz1m<Zt1p> ZR;
  
  private final Zttn ZN;
  
  private final String Zg;
  
  private final Zkrs ZJ;
  
  private final AtomicInteger Zf;
  
  private final Zxw_ Zw;
  
  private final Zz4t Zk;
  
  private final AtomicBoolean ZG;
  
  private final Object Zl;
  
  private final List<Zg7a> ZO;
  
  private final Zzvd ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsm1(Supplier<Ztwh> paramSupplier, Zv8z paramZv8z, Zz1m<Zt1p> paramZz1m, Zttn paramZttn, Zz4t paramZz4t, int paramInt, Zskh paramZskh) {
    this.Zp = paramSupplier;
    this.ZR = paramZz1m;
    this.ZN = paramZttn;
    this.Zk = paramZz4t;
    this.Zf = new AtomicInteger();
    this.Zg = String.format(a(-30561, -24893), new Object[] { Integer.valueOf(paramInt) });
    int i = Zgum.Zj();
    Ztwh ztwh = paramSupplier.get();
    this.ZJ = new Zkrs(this::ZE, ztwh, this.Zg);
    Objects.requireNonNull(this.ZJ);
    this.Zw = new Zxw_(paramZttn, paramZv8z, this.ZJ::Zp, this.Zg, paramZskh);
    this.ZG = new AtomicBoolean();
    this.Zl = new Object();
    this.ZO = new ArrayList<>();
    this.ZL = Zzvd.ZS();
    if (ztwh.ZK())
      this.Zw.Zm(); 
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  Future<Zsxd> Zh(Zrnd paramZrnd) {
    if (!this.Zw.Zl(paramZrnd))
      this.ZJ.ZY(paramZrnd); 
    this.ZR.ZD(new Zxr8(Zt1p.ZU, ZD()));
    paramZrnd.Zb();
    return paramZrnd.Zj();
  }
  
  public void ZZ() {
    this.ZJ.ZF();
    this.Zw.Zu();
  }
  
  public void Zi(long paramLong) {
    try {
      ZZ();
      Zsk5.ZJ(paramLong);
    } finally {
      ZK();
    } 
  }
  
  public void ZK() {
    this.ZJ.ZE();
    this.Zw.Zg();
  }
  
  public void Zh() {
    // Byte code:
    //   0: invokestatic ZA : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zl : Ljava/lang/Object;
    //   8: dup
    //   9: astore_2
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield Zp : Ljava/util/function/Supplier;
    //   15: invokeinterface get : ()Ljava/lang/Object;
    //   20: checkcast burp/Ztwh
    //   23: astore_3
    //   24: aload_0
    //   25: getfield ZJ : Lburp/Zkrs;
    //   28: aload_3
    //   29: invokevirtual ZF : (Lburp/Ztwh;)V
    //   32: aload_3
    //   33: invokevirtual ZK : ()Z
    //   36: ifeq -> 50
    //   39: aload_0
    //   40: getfield Zw : Lburp/Zxw_;
    //   43: invokevirtual Zm : ()V
    //   46: iload_1
    //   47: ifne -> 72
    //   50: aload_0
    //   51: getfield Zw : Lburp/Zxw_;
    //   54: invokevirtual ZQ : ()Ljava/util/List;
    //   57: astore #4
    //   59: aload #4
    //   61: aload_0
    //   62: <illegal opcode> accept : (Lburp/Zsm1;)Ljava/util/function/Consumer;
    //   67: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   72: aload_0
    //   73: getfield Zw : Lburp/Zxw_;
    //   76: invokevirtual Zy : ()Ljava/util/List;
    //   79: astore #4
    //   81: aload #4
    //   83: aload_0
    //   84: <illegal opcode> accept : (Lburp/Zsm1;)Ljava/util/function/Consumer;
    //   89: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   94: aload_2
    //   95: monitorexit
    //   96: goto -> 106
    //   99: astore #5
    //   101: aload_2
    //   102: monitorexit
    //   103: aload #5
    //   105: athrow
    //   106: return
    // Exception table:
    //   from	to	target	type
    //   11	96	99	finally
    //   99	103	99	finally
  }
  
  public void Zl(Zz9t paramZz9t) {
    paramZz9t.ZF(a(-30564, -22926), Integer.valueOf(this.Zf.get()));
    this.ZN.Zc(paramZz9t);
  }
  
  public void ZQ(Zx6t paramZx6t) {
    paramZx6t.ZQ(a(-30562, 20127), Integer.valueOf(this.Zf.get()));
    this.ZN.Zx(paramZx6t);
  }
  
  public void ZH() {
    this.ZJ.Zf();
    this.Zw.Zt();
  }
  
  private void ZE(Zrnd paramZrnd) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZR : Lburp/Zz1m;
    //   8: new burp/Zxr8
    //   11: dup
    //   12: getstatic burp/Zt1p.ZK : Lburp/Zlnb;
    //   15: aload_0
    //   16: invokevirtual ZD : ()Lburp/Zk1g;
    //   19: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   22: invokeinterface ZD : (Lburp/Zxr8;)V
    //   27: aload_1
    //   28: invokevirtual ZV : ()V
    //   31: aload_1
    //   32: invokevirtual Zk : ()Lburp/Zefx;
    //   35: ifnull -> 105
    //   38: aload_1
    //   39: invokevirtual Zk : ()Lburp/Zefx;
    //   42: invokeinterface ZF : ()Lburp/Zlit;
    //   47: ifnull -> 105
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual Zk : ()Lburp/Zefx;
    //   61: invokeinterface ZF : ()Lburp/Zlit;
    //   66: invokeinterface Zdz : ()Lburp/Zmzk;
    //   71: ifnull -> 105
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: getfield ZL : Lburp/Zzvd;
    //   85: aload_1
    //   86: invokevirtual Zk : ()Lburp/Zefx;
    //   89: invokeinterface ZF : ()Lburp/Zlit;
    //   94: aload_0
    //   95: invokevirtual Zw : (Lburp/Zlit;Lburp/Zsm1;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: aload_1
    //   107: invokevirtual ZD : (Lburp/Zrnd;)Lburp/Zsxd;
    //   110: astore_3
    //   111: aload_0
    //   112: getfield Zk : Lburp/Zz4t;
    //   115: aload_3
    //   116: invokevirtual ZM : (Lburp/Zsxd;)Z
    //   119: ifeq -> 139
    //   122: aload_0
    //   123: aload_1
    //   124: aload_3
    //   125: invokevirtual Zk : (Lburp/Zrnd;Lburp/Zsxd;)V
    //   128: iload_2
    //   129: ifeq -> 155
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload_1
    //   140: invokevirtual Zj : ()Ljava/util/concurrent/CompletableFuture;
    //   143: aload_3
    //   144: invokevirtual complete : (Ljava/lang/Object;)Z
    //   147: pop
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: getfield ZL : Lburp/Zzvd;
    //   159: aload_3
    //   160: invokeinterface ZG : ()Lburp/Zg3d;
    //   165: invokevirtual ZW : (Lburp/Zg3d;)V
    //   168: goto -> 188
    //   171: astore_3
    //   172: aload_3
    //   173: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   176: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   179: aload_1
    //   180: invokevirtual Zj : ()Ljava/util/concurrent/CompletableFuture;
    //   183: aload_3
    //   184: invokevirtual completeExceptionally : (Ljava/lang/Throwable;)Z
    //   187: pop
    //   188: return
    // Exception table:
    //   from	to	target	type
    //   4	50	53	java/lang/Exception
    //   4	168	171	java/lang/Exception
    //   38	74	77	java/lang/Exception
    //   57	98	101	java/lang/Exception
    //   111	132	135	java/lang/Exception
    //   122	148	151	java/lang/Exception
  }
  
  private Zsxd ZD(Zrnd paramZrnd) {
    this.Zf.incrementAndGet();
    this.ZN.Zc();
    Zsxd zsxd = paramZrnd.Zv();
    this.Zf.decrementAndGet();
    return zsxd;
  }
  
  private Zk1g ZD() {
    return new Zk1g(this.ZJ.ZT() + this.Zw.Zo());
  }
  
  private void Zk(Zrnd paramZrnd, Zsxd paramZsxd) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   8: iconst_0
    //   9: iconst_1
    //   10: invokevirtual compareAndSet : (ZZ)Z
    //   13: ifeq -> 324
    //   16: aload_0
    //   17: getfield Zl : Ljava/lang/Object;
    //   20: dup
    //   21: astore #4
    //   23: monitorenter
    //   24: aload_0
    //   25: getfield ZJ : Lburp/Zkrs;
    //   28: iconst_1
    //   29: invokevirtual Zb : (Z)Ljava/util/concurrent/Future;
    //   32: astore #5
    //   34: aload #5
    //   36: ldc2_w 5
    //   39: getstatic java/util/concurrent/TimeUnit.MINUTES : Ljava/util/concurrent/TimeUnit;
    //   42: invokeinterface get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   47: pop
    //   48: aload_0
    //   49: getfield Zk : Lburp/Zz4t;
    //   52: aload_1
    //   53: aload_2
    //   54: invokevirtual ZO : (Lburp/Zrnd;Lburp/Zsxd;)Lburp/Zsxd;
    //   57: astore #6
    //   59: aload_1
    //   60: invokevirtual Zj : ()Ljava/util/concurrent/CompletableFuture;
    //   63: aload #6
    //   65: invokevirtual complete : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_0
    //   70: getfield Zk : Lburp/Zz4t;
    //   73: aload #6
    //   75: invokevirtual ZM : (Lburp/Zsxd;)Z
    //   78: ifeq -> 107
    //   81: aload_0
    //   82: getfield Zw : Lburp/Zxw_;
    //   85: invokevirtual Zy : ()Ljava/util/List;
    //   88: astore #7
    //   90: aload #7
    //   92: aload_0
    //   93: <illegal opcode> accept : (Lburp/Zsm1;)Ljava/util/function/Consumer;
    //   98: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   103: iload_3
    //   104: ifeq -> 182
    //   107: aload_0
    //   108: getfield ZO : Ljava/util/List;
    //   111: dup
    //   112: astore #8
    //   114: monitorenter
    //   115: aload_0
    //   116: getfield ZO : Ljava/util/List;
    //   119: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   124: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   129: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   134: invokeinterface toList : ()Ljava/util/List;
    //   139: astore #7
    //   141: aload_0
    //   142: getfield ZO : Ljava/util/List;
    //   145: invokeinterface clear : ()V
    //   150: aload #8
    //   152: monitorexit
    //   153: goto -> 164
    //   156: astore #9
    //   158: aload #8
    //   160: monitorexit
    //   161: aload #9
    //   163: athrow
    //   164: aload_0
    //   165: getfield Zw : Lburp/Zxw_;
    //   168: aload #7
    //   170: aload_1
    //   171: invokevirtual Zk : ()Lburp/Zefx;
    //   174: invokeinterface ZF : ()Lburp/Zlit;
    //   179: invokevirtual Zv : (Ljava/util/List;Lburp/Zlit;)V
    //   182: aload_0
    //   183: invokevirtual Zr : ()V
    //   186: aload_0
    //   187: getfield ZJ : Lburp/Zkrs;
    //   190: iconst_0
    //   191: invokevirtual Zb : (Z)Ljava/util/concurrent/Future;
    //   194: pop
    //   195: aload_0
    //   196: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   199: iconst_0
    //   200: invokevirtual set : (Z)V
    //   203: goto -> 306
    //   206: astore #6
    //   208: aload #6
    //   210: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   213: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   216: invokestatic currentThread : ()Ljava/lang/Thread;
    //   219: invokevirtual interrupt : ()V
    //   222: aload_0
    //   223: invokevirtual Zr : ()V
    //   226: aload_0
    //   227: getfield ZJ : Lburp/Zkrs;
    //   230: iconst_0
    //   231: invokevirtual Zb : (Z)Ljava/util/concurrent/Future;
    //   234: pop
    //   235: aload_0
    //   236: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   239: iconst_0
    //   240: invokevirtual set : (Z)V
    //   243: goto -> 306
    //   246: astore #6
    //   248: aload #6
    //   250: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   253: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   256: aload_0
    //   257: invokevirtual Zr : ()V
    //   260: aload_0
    //   261: getfield ZJ : Lburp/Zkrs;
    //   264: iconst_0
    //   265: invokevirtual Zb : (Z)Ljava/util/concurrent/Future;
    //   268: pop
    //   269: aload_0
    //   270: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   273: iconst_0
    //   274: invokevirtual set : (Z)V
    //   277: goto -> 306
    //   280: astore #10
    //   282: aload_0
    //   283: invokevirtual Zr : ()V
    //   286: aload_0
    //   287: getfield ZJ : Lburp/Zkrs;
    //   290: iconst_0
    //   291: invokevirtual Zb : (Z)Ljava/util/concurrent/Future;
    //   294: pop
    //   295: aload_0
    //   296: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   299: iconst_0
    //   300: invokevirtual set : (Z)V
    //   303: aload #10
    //   305: athrow
    //   306: aload #4
    //   308: monitorexit
    //   309: goto -> 320
    //   312: astore #11
    //   314: aload #4
    //   316: monitorexit
    //   317: aload #11
    //   319: athrow
    //   320: iload_3
    //   321: ifeq -> 365
    //   324: aload_0
    //   325: getfield ZO : Ljava/util/List;
    //   328: dup
    //   329: astore #4
    //   331: monitorenter
    //   332: aload_0
    //   333: getfield ZO : Ljava/util/List;
    //   336: new burp/Zg7a
    //   339: dup
    //   340: aload_1
    //   341: aload_2
    //   342: invokespecial <init> : (Lburp/Zrnd;Lburp/Zsxd;)V
    //   345: invokeinterface add : (Ljava/lang/Object;)Z
    //   350: pop
    //   351: aload #4
    //   353: monitorexit
    //   354: goto -> 365
    //   357: astore #12
    //   359: aload #4
    //   361: monitorexit
    //   362: aload #12
    //   364: athrow
    //   365: return
    // Exception table:
    //   from	to	target	type
    //   24	309	312	finally
    //   34	182	206	java/lang/InterruptedException
    //   34	182	246	java/util/concurrent/ExecutionException
    //   34	182	246	java/util/concurrent/TimeoutException
    //   34	182	280	finally
    //   115	153	156	finally
    //   156	161	156	finally
    //   206	222	280	finally
    //   246	256	280	finally
    //   280	282	280	finally
    //   312	317	312	finally
    //   332	354	357	finally
    //   357	362	357	finally
  }
  
  private void Zr() {
    synchronized (this.ZO) {
      this.ZO.forEach(Zsm1::lambda$releaseAutoThrottlingCandidates$0);
      this.ZO.clear();
    } 
  }
  
  private static void lambda$releaseAutoThrottlingCandidates$0(Zg7a paramZg7a) {
    paramZg7a.Zi3().Zj().complete(paramZg7a.Zit());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'rÄñô5¤k â0.á$ÚS½p:¨Y¡Kòµ±º}697UÒÔ=ä$Iþæè~EÓ¤I§¯¡c©ïPïdd¹;u Bf '
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #39
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #53
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic burp/Zsm1.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zsm1.b : [Ljava/lang/String;
    //   79: goto -> 225
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 198
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 180, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 165, 4 -> 170, 5 -> 175
    //   152: iconst_3
    //   153: goto -> 182
    //   156: bipush #63
    //   158: goto -> 182
    //   161: iconst_5
    //   162: goto -> 182
    //   165: bipush #123
    //   167: goto -> 182
    //   170: bipush #72
    //   172: goto -> 182
    //   175: bipush #42
    //   177: goto -> 182
    //   180: bipush #64
    //   182: ixor
    //   183: ixor
    //   184: i2c
    //   185: castore
    //   186: iinc #6, 1
    //   189: dup
    //   190: ifne -> 198
    //   193: dup2
    //   194: dup_x1
    //   195: goto -> 105
    //   198: dup2_x1
    //   199: pop2
    //   200: dup_x2
    //   201: iload #6
    //   203: if_icmpgt -> 101
    //   206: pop
    //   207: new java/lang/String
    //   210: dup_x1
    //   211: swap
    //   212: invokespecial <init> : ([C)V
    //   215: invokevirtual intern : ()Ljava/lang/String;
    //   218: swap
    //   219: pop
    //   220: swap
    //   221: pop
    //   222: goto -> 39
    //   225: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF889E) & 0xFFFF;
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
      char c = 'À';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsm1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */