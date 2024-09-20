package burp;

import java.util.function.Supplier;

class Zgd9 implements Runnable {
  private final Supplier<Zlku> Zu;
  
  private final Zskh ZW;
  
  private final Object Zj;
  
  private volatile boolean ZR;
  
  private boolean Zh;
  
  Zgd9(Supplier<Zlku> paramSupplier, Zskh paramZskh) {
    this.Zu = paramSupplier;
    this.ZW = paramZskh;
    this.Zj = new Object();
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic Za : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZR : Z
    //   8: ifne -> 166
    //   11: invokestatic currentThread : ()Ljava/lang/Thread;
    //   14: invokevirtual isInterrupted : ()Z
    //   17: ifne -> 166
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   26: athrow
    //   27: aload_0
    //   28: getfield Zu : Ljava/util/function/Supplier;
    //   31: invokeinterface get : ()Ljava/lang/Object;
    //   36: checkcast burp/Zlku
    //   39: astore_2
    //   40: aload_2
    //   41: ifnull -> 59
    //   44: aload_2
    //   45: invokevirtual run : ()V
    //   48: iload_1
    //   49: ifeq -> 97
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   58: athrow
    //   59: aload_0
    //   60: getfield Zj : Ljava/lang/Object;
    //   63: dup
    //   64: astore_3
    //   65: monitorenter
    //   66: aload_0
    //   67: getfield Zh : Z
    //   70: ifne -> 80
    //   73: aload_0
    //   74: getfield Zj : Ljava/lang/Object;
    //   77: invokevirtual wait : ()V
    //   80: aload_0
    //   81: iconst_0
    //   82: putfield Zh : Z
    //   85: aload_3
    //   86: monitorexit
    //   87: goto -> 97
    //   90: astore #4
    //   92: aload_3
    //   93: monitorexit
    //   94: aload #4
    //   96: athrow
    //   97: goto -> 4
    //   100: astore_2
    //   101: aload_2
    //   102: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   105: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   108: invokestatic currentThread : ()Ljava/lang/Thread;
    //   111: invokevirtual interrupt : ()V
    //   114: goto -> 4
    //   117: astore_2
    //   118: aload_2
    //   119: invokestatic Zm : (Ljava/lang/Throwable;)Z
    //   122: istore_3
    //   123: aload_2
    //   124: iload_3
    //   125: ifeq -> 138
    //   128: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   131: goto -> 141
    //   134: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   137: athrow
    //   138: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   141: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   144: iload_3
    //   145: ifeq -> 162
    //   148: aload_0
    //   149: getfield ZW : Lburp/Zskh;
    //   152: invokestatic ZR : (Lburp/Zskh;)V
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   161: athrow
    //   162: iload_1
    //   163: ifeq -> 4
    //   166: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/InterruptedException
    //   27	97	100	java/lang/InterruptedException
    //   27	97	117	java/lang/Throwable
    //   40	52	55	java/lang/InterruptedException
    //   66	87	90	finally
    //   90	94	90	finally
    //   123	134	134	java/lang/InterruptedException
    //   141	155	158	java/lang/InterruptedException
  }
  
  public void ZF() {
    this.ZR = true;
  }
  
  void ZX() {
    boolean bool = Zr_h.Z_();
    synchronized (this.Zj) {
      this.Zh = true;
      this.Zj.notify();
    } 
    if (Zbqc.Zwu() == null)
      Zr_h.Z_(!bool); 
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgd9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */