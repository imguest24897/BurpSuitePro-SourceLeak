package burp;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

class Zs1z extends SwingWorker<Zma9, Void> {
  private final Zk75 ZB;
  
  final Zbrv ZQ;
  
  private Zs1z(Zbrv paramZbrv, Zk75 paramZk75) {
    this.ZB = paramZk75;
  }
  
  protected Zma9 Zt() {
    return this.ZQ.Zi.Zd(this.ZB);
  }
  
  protected void done() {
    // Byte code:
    //   0: invokestatic Zv : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual get : ()Ljava/lang/Object;
    //   8: checkcast burp/Zma9
    //   11: astore_2
    //   12: aload_2
    //   13: getfield ZM : Lburp/Zr42;
    //   16: getstatic burp/Zr42.CONNECTED : Lburp/Zr42;
    //   19: if_acmpne -> 44
    //   22: aload_0
    //   23: aload_0
    //   24: aload_2
    //   25: <illegal opcode> run : (Lburp/Zs1z;Lburp/Zma9;)Ljava/lang/Runnable;
    //   30: invokevirtual ZN : (Ljava/lang/Runnable;)V
    //   33: aload_1
    //   34: ifnonnull -> 66
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   43: athrow
    //   44: aload_0
    //   45: getfield ZQ : Lburp/Zbrv;
    //   48: getfield Zz : Lburp/Zb04;
    //   51: aload_0
    //   52: getfield ZB : Lburp/Zk75;
    //   55: aload_2
    //   56: invokevirtual ZJ : (Lburp/Zk75;Lburp/Zma9;)V
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   65: athrow
    //   66: goto -> 112
    //   69: astore_2
    //   70: aload_2
    //   71: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   74: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   77: goto -> 112
    //   80: astore_2
    //   81: aload_2
    //   82: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   85: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   88: aload_0
    //   89: getfield ZQ : Lburp/Zbrv;
    //   92: getfield Zz : Lburp/Zb04;
    //   95: aload_0
    //   96: getfield ZB : Lburp/Zk75;
    //   99: new burp/Zma9
    //   102: dup
    //   103: getstatic burp/Zr42.CONNECTION_FAILED : Lburp/Zr42;
    //   106: invokespecial <init> : (Lburp/Zr42;)V
    //   109: invokevirtual ZJ : (Lburp/Zk75;Lburp/Zma9;)V
    //   112: return
    // Exception table:
    //   from	to	target	type
    //   4	66	69	java/util/concurrent/CancellationException
    //   4	66	80	java/lang/Exception
    //   12	37	40	java/util/concurrent/CancellationException
    //   22	59	62	java/util/concurrent/CancellationException
  }
  
  private void ZN(Runnable paramRunnable) {
    String str = Zxpo.Zv();
    long l = System.currentTimeMillis() - this.ZQ.ZL;
    try {
      if (l < 500L) {
        try {
          Executors.newSingleThreadScheduledExecutor().schedule(paramRunnable::lambda$ensureMinimumVisibleTime$1, 500L - l, TimeUnit.MILLISECONDS);
          if (str == null) {
            paramRunnable.run();
            return;
          } 
        } catch (CancellationException cancellationException) {
          throw a(null);
        } 
        return;
      } 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    paramRunnable.run();
  }
  
  private static void lambda$ensureMinimumVisibleTime$1(Runnable paramRunnable) {
    SwingUtilities.invokeLater(paramRunnable);
  }
  
  private void lambda$done$0(Zma9 paramZma9) {
    this.ZQ.Zz.Zx(this.ZB, paramZma9);
  }
  
  private static CancellationException a(CancellationException paramCancellationException) {
    return paramCancellationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */