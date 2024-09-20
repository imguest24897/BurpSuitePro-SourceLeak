package burp;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zlcn implements Zle0 {
  private final Zzwf ZZ;
  
  private final ExecutorService Zm;
  
  private final ExecutorService ZF;
  
  private final ScheduledExecutorService Zh;
  
  private final Zg3q ZM;
  
  private Future<?> ZQ;
  
  private ScheduledFuture<?> Zb;
  
  private CountDownLatch ZH;
  
  private CountDownLatch ZV;
  
  private volatile Zt63 ZY;
  
  private volatile boolean ZN;
  
  private boolean Zq;
  
  Zlcn(Zzwf paramZzwf, Zbnt paramZbnt, Zey9 paramZey9, ExecutorService paramExecutorService1, ExecutorService paramExecutorService2, ScheduledExecutorService paramScheduledExecutorService) {
    this.Zm = paramExecutorService1;
    this.ZF = paramExecutorService2;
    this.Zh = paramScheduledExecutorService;
    this.ZZ = paramZzwf;
    this.ZY = Zt63.ZI;
    this.ZM = new Zzh8(paramZbnt, paramZey9, this::lambda$new$0);
  }
  
  public void Zr() {
    this.Zm.submit(new Zmz2(this::lambda$clearMessageSource$1));
  }
  
  public void Zk(Zzxp paramZzxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   4: new burp/Zmz2
    //   7: dup
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zlcn;Lburp/Zzxp;)Ljava/lang/Runnable;
    //   15: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   18: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   23: pop
    //   24: return
  }
  
  public void ZG(Zzxp paramZzxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   4: new burp/Zmz2
    //   7: dup
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zlcn;Lburp/Zzxp;)Ljava/lang/Runnable;
    //   15: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   18: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   23: pop
    //   24: return
  }
  
  public void Zn(Zzxp paramZzxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   4: new burp/Zmz2
    //   7: dup
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zlcn;Lburp/Zzxp;)Ljava/lang/Runnable;
    //   15: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   18: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   23: pop
    //   24: return
  }
  
  public void ZL(Zzxp paramZzxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   4: new burp/Zmz2
    //   7: dup
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zlcn;Lburp/Zzxp;)Ljava/lang/Runnable;
    //   15: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   18: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   23: pop
    //   24: return
  }
  
  public void ZF(Zzxp paramZzxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   4: new burp/Zmz2
    //   7: dup
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zlcn;Lburp/Zzxp;)Ljava/lang/Runnable;
    //   15: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   18: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   23: pop
    //   24: return
  }
  
  public void ZA(Zzxp paramZzxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   4: new burp/Zmz2
    //   7: dup
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zlcn;Lburp/Zzxp;)Ljava/lang/Runnable;
    //   15: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   18: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   23: pop
    //   24: return
  }
  
  public void Zm() {
    this.Zm.submit(new Zmz2(this::lambda$requestModified$8));
  }
  
  public void ZJ() {
    this.Zm.submit(new Zmz2(this::lambda$responseModified$9));
  }
  
  public void ZA() {
    this.Zm.submit(new Zmz2(this::lambda$webSocketMessageModified$10));
  }
  
  public void ZX() {
    this.Zm.submit(new Zmz2(this::lambda$viewChanged$11));
  }
  
  public Zg3q ZR() {
    return this.ZM;
  }
  
  public boolean Zi() {
    return this.ZN;
  }
  
  private void ZB(boolean paramBoolean) {
    this.Zq = paramBoolean;
  }
  
  public boolean ZK() {
    return this.Zq;
  }
  
  private void Zv() {
    this.ZH = new CountDownLatch(1);
    this.ZV = new CountDownLatch(1);
    this.ZQ = this.ZF.submit(new Zmz2(this::lambda$scheduleRefresh$12));
  }
  
  private void Zw() {
    this.ZH = new CountDownLatch(1);
    this.ZV = new CountDownLatch(1);
    this.ZQ = this.ZF.submit(new Zmz2(this::lambda$scheduleAutoRefresh$13));
  }
  
  private void ZB() {
    if (this.ZQ != null) {
      Zt(this.ZH, 1000);
      this.ZN = true;
      this.ZQ.cancel(true);
      Zt(this.ZV, 10000);
      this.ZN = false;
    } 
  }
  
  private void ZE(int paramInt) {
    ZY(true, paramInt);
  }
  
  public void ZO() {
    this.ZQ = this.ZF.submit(this::lambda$refreshView$14);
  }
  
  public void ZY(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aconst_null
    //   5: astore #4
    //   7: aload_0
    //   8: getfield ZH : Ljava/util/concurrent/CountDownLatch;
    //   11: invokevirtual countDown : ()V
    //   14: iload_2
    //   15: i2l
    //   16: invokestatic sleep : (J)V
    //   19: aload_0
    //   20: invokevirtual ZS : ()Ljava/util/concurrent/ScheduledFuture;
    //   23: astore #4
    //   25: iload_1
    //   26: ifeq -> 68
    //   29: aload_0
    //   30: getfield ZM : Lburp/Zg3q;
    //   33: invokeinterface ZT : ()Z
    //   38: ifeq -> 84
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   47: athrow
    //   48: aload_0
    //   49: getfield ZZ : Lburp/Zzwf;
    //   52: invokeinterface ZI : ()V
    //   57: aload_3
    //   58: ifnonnull -> 84
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield ZZ : Lburp/Zzwf;
    //   72: invokeinterface ZI : ()V
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   83: athrow
    //   84: aload_0
    //   85: aload #4
    //   87: invokevirtual Z_ : (Ljava/util/concurrent/ScheduledFuture;)V
    //   90: aload_0
    //   91: getfield ZN : Z
    //   94: ifne -> 113
    //   97: aload_0
    //   98: getfield ZZ : Lburp/Zzwf;
    //   101: invokeinterface Z_ : ()V
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   112: athrow
    //   113: aload_0
    //   114: getfield ZV : Ljava/util/concurrent/CountDownLatch;
    //   117: invokevirtual countDown : ()V
    //   120: goto -> 248
    //   123: astore #5
    //   125: aload #5
    //   127: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   130: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   133: aload_0
    //   134: aload #4
    //   136: invokevirtual Z_ : (Ljava/util/concurrent/ScheduledFuture;)V
    //   139: aload_0
    //   140: getfield ZN : Z
    //   143: ifne -> 155
    //   146: aload_0
    //   147: getfield ZZ : Lburp/Zzwf;
    //   150: invokeinterface Z_ : ()V
    //   155: aload_0
    //   156: getfield ZV : Ljava/util/concurrent/CountDownLatch;
    //   159: invokevirtual countDown : ()V
    //   162: goto -> 248
    //   165: astore #5
    //   167: aload #5
    //   169: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   172: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   175: aload_0
    //   176: aload #4
    //   178: invokevirtual Z_ : (Ljava/util/concurrent/ScheduledFuture;)V
    //   181: aload_0
    //   182: getfield ZN : Z
    //   185: ifne -> 197
    //   188: aload_0
    //   189: getfield ZZ : Lburp/Zzwf;
    //   192: invokeinterface Z_ : ()V
    //   197: aload_0
    //   198: getfield ZV : Ljava/util/concurrent/CountDownLatch;
    //   201: invokevirtual countDown : ()V
    //   204: goto -> 248
    //   207: astore #6
    //   209: aload_0
    //   210: aload #4
    //   212: invokevirtual Z_ : (Ljava/util/concurrent/ScheduledFuture;)V
    //   215: aload_0
    //   216: getfield ZN : Z
    //   219: ifne -> 238
    //   222: aload_0
    //   223: getfield ZZ : Lburp/Zzwf;
    //   226: invokeinterface Z_ : ()V
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   237: athrow
    //   238: aload_0
    //   239: getfield ZV : Ljava/util/concurrent/CountDownLatch;
    //   242: invokevirtual countDown : ()V
    //   245: aload #6
    //   247: athrow
    //   248: return
    // Exception table:
    //   from	to	target	type
    //   7	84	123	java/lang/InterruptedException
    //   7	84	165	java/lang/Exception
    //   7	84	207	finally
    //   25	41	44	java/lang/InterruptedException
    //   29	61	64	java/lang/InterruptedException
    //   48	77	80	java/lang/InterruptedException
    //   84	106	109	java/lang/InterruptedException
    //   123	133	207	finally
    //   165	175	207	finally
    //   207	209	207	finally
    //   209	231	234	java/lang/InterruptedException
  }
  
  private ScheduledFuture<?> ZS() {
    if (this.Zb != null)
      this.Zb.cancel(true); 
    Objects.requireNonNull(this.ZZ);
    ScheduledFuture<?> scheduledFuture = this.Zh.schedule(new Zmz2(this.ZZ::Za), 250L, TimeUnit.MILLISECONDS);
    this.Zb = scheduledFuture;
    return scheduledFuture;
  }
  
  private void Zo() {
    Z_(this.Zb);
  }
  
  private void Z_(ScheduledFuture<?> paramScheduledFuture) {
    if (paramScheduledFuture != null)
      paramScheduledFuture.cancel(true); 
    this.Zh.submit(new Zmz2(this::Zl));
  }
  
  void Zl() {
    String[] arrayOfString = Zbds.Ze();
    if (this.ZM.ZE() || this.ZM.Z_() || !this.ZY.Zd()) {
      this.ZZ.Zr();
      if (arrayOfString == null) {
        this.ZZ.Zx();
        return;
      } 
      return;
    } 
    this.ZZ.Zx();
  }
  
  public void Zj(int paramInt1, int paramInt2, String paramString) {
    Zt63 zt63 = Zt63.ZM(paramInt1, paramInt2, paramString);
    if (zt63.equals(this.ZY))
      return; 
    this.ZY = zt63;
    ZL();
    Zq();
  }
  
  private void ZL() {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZY : Lburp/Zt63;
    //   8: invokevirtual Zl : ()Z
    //   11: ifeq -> 48
    //   14: aload_0
    //   15: getfield ZZ : Lburp/Zzwf;
    //   18: aload_0
    //   19: getfield ZY : Lburp/Zt63;
    //   22: getfield ZH : I
    //   25: aload_0
    //   26: getfield ZY : Lburp/Zt63;
    //   29: getfield Zd : I
    //   32: aload_0
    //   33: getfield ZY : Lburp/Zt63;
    //   36: getfield ZZ : Ljava/lang/String;
    //   39: invokeinterface ZZ : (IILjava/lang/String;)V
    //   44: aload_1
    //   45: ifnonnull -> 153
    //   48: aload_0
    //   49: getfield ZY : Lburp/Zt63;
    //   52: invokevirtual Zk : ()Z
    //   55: ifeq -> 144
    //   58: aload_0
    //   59: getfield ZM : Lburp/Zg3q;
    //   62: aload_0
    //   63: getfield ZY : Lburp/Zt63;
    //   66: getfield ZH : I
    //   69: invokeinterface Zq : (I)Lburp/Zre8;
    //   74: astore_2
    //   75: aload_0
    //   76: getfield ZM : Lburp/Zg3q;
    //   79: invokeinterface ZD : ()Z
    //   84: aload_0
    //   85: getfield ZY : Lburp/Zt63;
    //   88: getfield ZZ : Ljava/lang/String;
    //   91: aload_2
    //   92: aload_2
    //   93: aload_0
    //   94: getfield ZY : Lburp/Zt63;
    //   97: getfield ZZ : Ljava/lang/String;
    //   100: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/String;
    //   105: invokestatic ZB : (ZLjava/lang/String;Lburp/Zre8;Ljava/lang/String;)Ljava/util/List;
    //   108: astore_3
    //   109: aload_0
    //   110: getfield ZZ : Lburp/Zzwf;
    //   113: aload_0
    //   114: getfield ZY : Lburp/Zt63;
    //   117: getfield ZH : I
    //   120: aload_0
    //   121: getfield ZY : Lburp/Zt63;
    //   124: getfield Zd : I
    //   127: aload_0
    //   128: getfield ZY : Lburp/Zt63;
    //   131: getfield ZZ : Ljava/lang/String;
    //   134: aload_3
    //   135: invokeinterface Zf : (IILjava/lang/String;Ljava/util/List;)V
    //   140: aload_1
    //   141: ifnonnull -> 153
    //   144: aload_0
    //   145: getfield ZZ : Lburp/Zzwf;
    //   148: invokeinterface ZP : ()V
    //   153: return
  }
  
  public void ZO(int paramInt1, int paramInt2, String paramString) {
    Zt63 zt63 = Zt63.Zp(paramInt1, paramInt2, paramString);
    if (zt63.equals(this.ZY))
      return; 
    this.ZY = zt63;
    Zu();
    Zq();
  }
  
  private void Zu() {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZY : Lburp/Zt63;
    //   8: invokevirtual Zl : ()Z
    //   11: ifeq -> 48
    //   14: aload_0
    //   15: getfield ZZ : Lburp/Zzwf;
    //   18: aload_0
    //   19: getfield ZY : Lburp/Zt63;
    //   22: getfield ZH : I
    //   25: aload_0
    //   26: getfield ZY : Lburp/Zt63;
    //   29: getfield Zd : I
    //   32: aload_0
    //   33: getfield ZY : Lburp/Zt63;
    //   36: getfield ZZ : Ljava/lang/String;
    //   39: invokeinterface Zi : (IILjava/lang/String;)V
    //   44: aload_1
    //   45: ifnonnull -> 153
    //   48: aload_0
    //   49: getfield ZY : Lburp/Zt63;
    //   52: invokevirtual Zk : ()Z
    //   55: ifeq -> 144
    //   58: aload_0
    //   59: getfield ZM : Lburp/Zg3q;
    //   62: aload_0
    //   63: getfield ZY : Lburp/Zt63;
    //   66: getfield ZH : I
    //   69: invokeinterface Zv : (I)Lburp/Zre8;
    //   74: astore_2
    //   75: aload_0
    //   76: getfield ZM : Lburp/Zg3q;
    //   79: invokeinterface Zc : ()Z
    //   84: aload_0
    //   85: getfield ZY : Lburp/Zt63;
    //   88: getfield ZZ : Ljava/lang/String;
    //   91: aload_2
    //   92: aload_2
    //   93: aload_0
    //   94: getfield ZY : Lburp/Zt63;
    //   97: getfield ZZ : Ljava/lang/String;
    //   100: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/String;
    //   105: invokestatic ZB : (ZLjava/lang/String;Lburp/Zre8;Ljava/lang/String;)Ljava/util/List;
    //   108: astore_3
    //   109: aload_0
    //   110: getfield ZZ : Lburp/Zzwf;
    //   113: aload_0
    //   114: getfield ZY : Lburp/Zt63;
    //   117: getfield ZH : I
    //   120: aload_0
    //   121: getfield ZY : Lburp/Zt63;
    //   124: getfield Zd : I
    //   127: aload_0
    //   128: getfield ZY : Lburp/Zt63;
    //   131: getfield ZZ : Ljava/lang/String;
    //   134: aload_3
    //   135: invokeinterface ZY : (IILjava/lang/String;Ljava/util/List;)V
    //   140: aload_1
    //   141: ifnonnull -> 153
    //   144: aload_0
    //   145: getfield ZZ : Lburp/Zzwf;
    //   148: invokeinterface ZP : ()V
    //   153: return
  }
  
  public void Zz(int paramInt1, int paramInt2, String paramString) {
    Zt63 zt63 = Zt63.ZB(paramInt1, paramInt2, paramString);
    if (zt63.equals(this.ZY))
      return; 
    this.ZY = zt63;
    Zk();
    Zq();
  }
  
  private void Zk() {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZY : Lburp/Zt63;
    //   8: invokevirtual Zl : ()Z
    //   11: ifeq -> 48
    //   14: aload_0
    //   15: getfield ZZ : Lburp/Zzwf;
    //   18: aload_0
    //   19: getfield ZY : Lburp/Zt63;
    //   22: getfield ZH : I
    //   25: aload_0
    //   26: getfield ZY : Lburp/Zt63;
    //   29: getfield Zd : I
    //   32: aload_0
    //   33: getfield ZY : Lburp/Zt63;
    //   36: getfield ZZ : Ljava/lang/String;
    //   39: invokeinterface ZL : (IILjava/lang/String;)V
    //   44: aload_1
    //   45: ifnonnull -> 132
    //   48: aload_0
    //   49: getfield ZY : Lburp/Zt63;
    //   52: invokevirtual Zk : ()Z
    //   55: ifeq -> 123
    //   58: aload_0
    //   59: getfield ZM : Lburp/Zg3q;
    //   62: invokeinterface ZX : ()Z
    //   67: aload_0
    //   68: getfield ZY : Lburp/Zt63;
    //   71: getfield ZZ : Ljava/lang/String;
    //   74: getstatic burp/Zre8.Zw : Lburp/Zre8;
    //   77: aload_0
    //   78: getfield ZY : Lburp/Zt63;
    //   81: getfield ZZ : Ljava/lang/String;
    //   84: invokestatic ZB : (ZLjava/lang/String;Lburp/Zre8;Ljava/lang/String;)Ljava/util/List;
    //   87: astore_2
    //   88: aload_0
    //   89: getfield ZZ : Lburp/Zzwf;
    //   92: aload_0
    //   93: getfield ZY : Lburp/Zt63;
    //   96: getfield ZH : I
    //   99: aload_0
    //   100: getfield ZY : Lburp/Zt63;
    //   103: getfield Zd : I
    //   106: aload_0
    //   107: getfield ZY : Lburp/Zt63;
    //   110: getfield ZZ : Ljava/lang/String;
    //   113: aload_2
    //   114: invokeinterface ZE : (IILjava/lang/String;Ljava/util/List;)V
    //   119: aload_1
    //   120: ifnonnull -> 132
    //   123: aload_0
    //   124: getfield ZZ : Lburp/Zzwf;
    //   127: invokeinterface ZP : ()V
    //   132: return
  }
  
  private void Zq() {
    this.Zm.submit(this::lambda$scheduleSelectionOfInspectorView$15);
  }
  
  private void Zt(CountDownLatch paramCountDownLatch, int paramInt) {
    try {
      paramCountDownLatch.await(paramInt, TimeUnit.MILLISECONDS);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$scheduleSelectionOfInspectorView$15() {
    if (this.ZQ == null || this.ZQ.isDone())
      Zo(); 
  }
  
  private void lambda$refreshView$14() {
    ZY(false, 0);
  }
  
  private void lambda$scheduleAutoRefresh$13() {
    ZE(500);
  }
  
  private void lambda$scheduleRefresh$12() {
    ZE(0);
  }
  
  private void lambda$viewChanged$11() {
    ZB();
    Zv();
  }
  
  private void lambda$webSocketMessageModified$10() {
    ZB();
    Zw();
  }
  
  private void lambda$responseModified$9() {
    ZB();
    this.ZM.Zf();
    Zw();
  }
  
  private void lambda$requestModified$8() {
    ZB();
    this.ZM.ZQ();
    Zw();
  }
  
  private void lambda$setWebSocketMessageSource$7(Zzxp paramZzxp) {
    ZB(true);
    ZB();
    this.ZM.Zu(paramZzxp);
    Zv();
  }
  
  private void lambda$setResponseMessageSource$6(Zzxp paramZzxp) {
    ZB(false);
    ZB();
    this.ZM.ZP(paramZzxp);
    Zv();
  }
  
  private void lambda$setRequestMessageSource$5(Zzxp paramZzxp) {
    ZB(false);
    ZB();
    this.ZM.ZW(paramZzxp);
    Zv();
  }
  
  private void lambda$setWebSocketMessageSourceAndClearOthers$4(Zzxp paramZzxp) {
    ZB(true);
    ZB();
    this.ZM.ZW(Zzxp.Zr);
    this.ZM.ZP(Zzxp.Zr);
    this.ZM.Zu(paramZzxp);
    Zv();
  }
  
  private void lambda$setResponseMessageSourceAndClearOthers$3(Zzxp paramZzxp) {
    ZB(false);
    ZB();
    this.ZM.ZW(Zzxp.Zr);
    this.ZM.ZP(paramZzxp);
    this.ZM.Zu(Zzxp.Zr);
    Zv();
  }
  
  private void lambda$setRequestMessageSourceAndClearOthers$2(Zzxp paramZzxp) {
    ZB(false);
    ZB();
    this.ZM.ZW(paramZzxp);
    this.ZM.ZP(Zzxp.Zr);
    this.ZM.Zu(Zzxp.Zr);
    Zv();
  }
  
  private void lambda$clearMessageSource$1() {
    ZB(false);
    ZB();
    this.ZM.ZW(Zzxp.Zr);
    this.ZM.ZP(Zzxp.Zr);
    this.ZM.Zu(Zzxp.Zr);
    Zv();
  }
  
  private Boolean lambda$new$0() {
    return Boolean.valueOf(this.ZN);
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlcn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */