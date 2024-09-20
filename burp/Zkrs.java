package burp;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Zkrs {
  private final Zkia Zr = new Zkia(null, true);
  
  private final BlockingQueue<Zkia> Zs;
  
  private final Consumer<Zrnd> ZY;
  
  private final ExecutorService Z_;
  
  final AtomicInteger ZG;
  
  private final AtomicInteger ZQ;
  
  private final AtomicBoolean ZS;
  
  private final AtomicBoolean ZT;
  
  private final AtomicBoolean Zf = new AtomicBoolean();
  
  private volatile CompletableFuture<Void> ZH;
  
  private static final String a;
  
  public Zkrs(Consumer<Zrnd> paramConsumer, Ztwh paramZtwh, String paramString) {
    boolean bool = Ze97.Zo();
    this.ZY = Objects.<Consumer<Zrnd>>requireNonNull(paramConsumer);
    this.ZQ = new AtomicInteger();
    this.ZG = new AtomicInteger(0);
    this.Zs = new PriorityBlockingQueue<>();
    this.Z_ = Executors.newCachedThreadPool(new Zrdt(paramString + paramString));
    this.ZS = new AtomicBoolean(false);
    this.ZT = new AtomicBoolean(false);
    ZF(paramZtwh);
    this.ZS.set(true);
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public synchronized void ZF(Ztwh paramZtwh) {
    boolean bool = Ze97.Zo();
    this.ZQ.set(paramZtwh.Zw() ? paramZtwh.ZY() : 999);
    int i = this.ZG.get() - this.ZQ.get();
    int j = 0;
    while (j < i) {
      this.Zs.add(this.Zr);
      j++;
      if (bool)
        break; 
    } 
    j = this.ZQ.get() - this.ZG.get();
    byte b = 0;
    while (b < j) {
      Zm();
      b++;
      if (bool)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Ze97.ZP(!bool); 
  }
  
  public synchronized Future<Void> Zb(boolean paramBoolean) {
    this.Zf.set(paramBoolean);
    int i = this.ZG.get();
    boolean bool = Ze97.ZJ();
    if (!this.Zf.get() || i <= 1) {
      CompletableFuture<Void> completableFuture = new CompletableFuture();
      completableFuture.complete(null);
      return completableFuture;
    } 
    if (this.ZH == null)
      this.ZH = new CompletableFuture<>(); 
    while (i > 1) {
      this.Zs.add(this.Zr);
      i--;
      if (!bool)
        break; 
    } 
    return this.ZH;
  }
  
  public synchronized void ZF() {
    this.ZS.set(false);
    int i = this.ZG.get();
    boolean bool = Ze97.Zo();
    while (i > 0) {
      this.Zs.add(this.Zr);
      i--;
      if (bool)
        break; 
    } 
  }
  
  public synchronized void ZE() {
    this.ZS.set(true);
    byte b = 0;
    boolean bool = Ze97.Zo();
    while (b < ZT()) {
      Zm();
      b++;
      if (bool)
        break; 
    } 
  }
  
  public void ZY(Zrnd paramZrnd) {
    Zj(paramZrnd, false);
  }
  
  public void Zp(Zrnd paramZrnd) {
    Zj(paramZrnd, true);
  }
  
  private void Zj(Zrnd paramZrnd, boolean paramBoolean) {
    Objects.requireNonNull(paramZrnd);
    this.Zs.add(new Zkia(paramZrnd, paramBoolean));
    Zm();
  }
  
  private void Zm() {
    synchronized (this.ZG) {
      if (!this.ZS.get() || this.ZG.get() >= this.ZQ.get() || (this.Zf.get() && this.ZG.get() >= 1) || this.Zs.isEmpty())
        return; 
      Zy();
    } 
  }
  
  public synchronized void Zf() {
    boolean bool = Ze97.Zo();
    if (this.ZT.compareAndSet(false, true)) {
      this.ZS.set(false);
      int i = this.ZG.get();
      while (i >= 0) {
        this.Zs.add(this.Zr);
        i--;
        if (bool)
          break; 
      } 
      this.Z_.shutdown();
    } 
  }
  
  public int ZT() {
    return this.Zs.size();
  }
  
  private void Zy() {
    this.ZG.incrementAndGet();
    this.Z_.submit(this::lambda$addOneWorker$0);
  }
  
  private void lambda$addOneWorker$0() {
    // Byte code:
    //   0: invokestatic ZJ : ()Z
    //   3: istore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: iload_2
    //   7: ifne -> 100
    //   10: aload_0
    //   11: getfield Zs : Ljava/util/concurrent/BlockingQueue;
    //   14: ldc2_w 20
    //   17: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   20: invokeinterface poll : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   25: checkcast burp/Zkia
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull -> 77
    //   33: aload_3
    //   34: getfield Zd : Lburp/Zrnd;
    //   37: ifnull -> 77
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   46: athrow
    //   47: aload_0
    //   48: getfield ZY : Ljava/util/function/Consumer;
    //   51: aload_3
    //   52: getfield Zd : Lburp/Zrnd;
    //   55: invokeinterface accept : (Ljava/lang/Object;)V
    //   60: goto -> 79
    //   63: astore #4
    //   65: aload #4
    //   67: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   70: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   73: iload_1
    //   74: ifne -> 79
    //   77: iconst_1
    //   78: istore_2
    //   79: goto -> 6
    //   82: astore_3
    //   83: aload_3
    //   84: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   87: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   90: invokestatic currentThread : ()Ljava/lang/Thread;
    //   93: invokevirtual interrupt : ()V
    //   96: iload_1
    //   97: ifne -> 6
    //   100: aload_0
    //   101: getfield ZG : Ljava/util/concurrent/atomic/AtomicInteger;
    //   104: invokevirtual decrementAndGet : ()I
    //   107: pop
    //   108: aload_0
    //   109: getfield ZH : Ljava/util/concurrent/CompletableFuture;
    //   112: ifnull -> 213
    //   115: aload_0
    //   116: getfield ZG : Ljava/util/concurrent/atomic/AtomicInteger;
    //   119: invokevirtual get : ()I
    //   122: iconst_1
    //   123: if_icmpgt -> 213
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   132: athrow
    //   133: aload_0
    //   134: getfield ZH : Ljava/util/concurrent/CompletableFuture;
    //   137: aconst_null
    //   138: invokevirtual complete : (Ljava/lang/Object;)Z
    //   141: pop
    //   142: aload_0
    //   143: aconst_null
    //   144: putfield ZH : Ljava/util/concurrent/CompletableFuture;
    //   147: goto -> 213
    //   150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   153: athrow
    //   154: astore #5
    //   156: aload_0
    //   157: getfield ZG : Ljava/util/concurrent/atomic/AtomicInteger;
    //   160: invokevirtual decrementAndGet : ()I
    //   163: pop
    //   164: aload_0
    //   165: getfield ZH : Ljava/util/concurrent/CompletableFuture;
    //   168: ifnull -> 210
    //   171: aload_0
    //   172: getfield ZG : Ljava/util/concurrent/atomic/AtomicInteger;
    //   175: invokevirtual get : ()I
    //   178: iconst_1
    //   179: if_icmpgt -> 210
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   188: athrow
    //   189: aload_0
    //   190: getfield ZH : Ljava/util/concurrent/CompletableFuture;
    //   193: aconst_null
    //   194: invokevirtual complete : (Ljava/lang/Object;)Z
    //   197: pop
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield ZH : Ljava/util/concurrent/CompletableFuture;
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   209: athrow
    //   210: aload #5
    //   212: athrow
    //   213: return
    // Exception table:
    //   from	to	target	type
    //   6	100	154	finally
    //   10	79	82	java/lang/InterruptedException
    //   29	40	43	java/lang/Throwable
    //   47	60	63	java/lang/Throwable
    //   100	126	129	java/lang/Throwable
    //   115	150	150	java/lang/Throwable
    //   154	156	154	finally
    //   156	182	185	java/lang/Throwable
    //   171	203	206	java/lang/Throwable
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: ldc 'H~=0r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkrs.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #66
    //   82: goto -> 112
    //   85: bipush #68
    //   87: goto -> 112
    //   90: bipush #54
    //   92: goto -> 112
    //   95: bipush #104
    //   97: goto -> 112
    //   100: bipush #89
    //   102: goto -> 112
    //   105: bipush #114
    //   107: goto -> 112
    //   110: bipush #39
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */