package burp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsbg implements Runnable {
  private final Ztdn Zf;
  
  private final Ztwv Zc;
  
  private final Zbsw ZU;
  
  private final BlockingQueue<Zzig> Zp;
  
  public Zsbg(Zbsw paramZbsw, Ztdn paramZtdn, Ztwv paramZtwv) {
    this.ZU = paramZbsw;
    this.Zf = paramZtdn;
    this.Zc = paramZtwv;
    this.Zp = new LinkedBlockingQueue<>();
  }
  
  public void Zb() {
    this.Zc.Zx(this);
  }
  
  public void ZP(Zzig paramZzig) {
    synchronized (this.Zp) {
      try {
        this.Zp.offer(paramZzig);
        this.Zf.Zr(this.Zp.size());
        this.Zp.notify();
      } catch (Zsty zsty) {
        Zah.Zl(zsty, Zk_.IGNORED);
      } 
    } 
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZZ : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zf : Lburp/Ztdn;
    //   8: invokeinterface ZM : ()V
    //   13: aload_0
    //   14: getfield Zp : Ljava/util/concurrent/BlockingQueue;
    //   17: dup
    //   18: astore_2
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield Zf : Lburp/Ztdn;
    //   24: aload_0
    //   25: getfield Zp : Ljava/util/concurrent/BlockingQueue;
    //   28: invokeinterface size : ()I
    //   33: invokeinterface Zr : (I)V
    //   38: aload_2
    //   39: monitorexit
    //   40: goto -> 48
    //   43: astore_3
    //   44: aload_2
    //   45: monitorexit
    //   46: aload_3
    //   47: athrow
    //   48: aload_0
    //   49: invokevirtual ZL : ()Lburp/Zzig;
    //   52: astore_2
    //   53: aload_2
    //   54: ifnonnull -> 69
    //   57: iconst_0
    //   58: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   61: lconst_1
    //   62: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   65: iload_1
    //   66: ifeq -> 13
    //   69: aload_2
    //   70: getfield ZF : Lburp/Zstu;
    //   73: ifnull -> 84
    //   76: iconst_1
    //   77: goto -> 85
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: iconst_0
    //   85: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   88: ldc2_w 2
    //   91: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   94: aload_0
    //   95: getfield ZU : Lburp/Zbsw;
    //   98: aload_2
    //   99: getfield Zb : Lburp/Zmzk;
    //   102: aload_2
    //   103: getfield Zj : Lburp/Zstu;
    //   106: aload_2
    //   107: getfield ZF : Lburp/Zstu;
    //   110: aload_2
    //   111: getfield Zo : S
    //   114: aload_2
    //   115: getfield ZG : Z
    //   118: invokevirtual Zm : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;SZ)V
    //   121: goto -> 13
    //   124: astore_2
    //   125: aload_2
    //   126: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   129: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   132: ldc2_w 2000
    //   135: invokestatic sleep : (J)V
    //   138: goto -> 149
    //   141: astore_3
    //   142: aload_3
    //   143: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   146: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   149: goto -> 13
    // Exception table:
    //   from	to	target	type
    //   13	65	124	java/lang/Exception
    //   20	40	43	finally
    //   43	46	43	finally
    //   69	80	80	java/lang/Exception
    //   69	121	124	java/lang/Exception
    //   132	138	141	java/lang/Exception
  }
  
  private Zzig ZL() {
    this.Zf.Zc();
    synchronized (this.Zp) {
      while (true) {
        Zzig zzig = this.Zp.poll();
        if (zzig == null)
          try {
            this.Zp.wait();
          } catch (InterruptedException interruptedException) {
            Zah.Zl(interruptedException, Zk_.UNEXPECTED);
          }  
        if (zzig != null) {
          this.Zf.ZM();
          return zzig;
        } 
      } 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */