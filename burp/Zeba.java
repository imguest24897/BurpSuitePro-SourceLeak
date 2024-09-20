package burp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

class Zeba {
  private final BlockingQueue<Zmx3> Zs;
  
  Zeba(Zskh paramZskh, Ztwv paramZtwv, Zekl paramZekl, AtomicBoolean paramAtomicBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/concurrent/LinkedBlockingQueue
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Zs : Ljava/util/concurrent/BlockingQueue;
    //   15: aload_2
    //   16: aload_0
    //   17: aload #4
    //   19: aload_3
    //   20: aload_1
    //   21: <illegal opcode> run : (Lburp/Zeba;Ljava/util/concurrent/atomic/AtomicBoolean;Lburp/Zekl;Lburp/Zskh;)Ljava/lang/Runnable;
    //   26: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   31: pop
    //   32: return
  }
  
  void ZK(Zmx3 paramZmx3) {
    this.Zs.add(paramZmx3);
  }
  
  private void lambda$new$0(AtomicBoolean paramAtomicBoolean, Zekl paramZekl, Zskh paramZskh) {
    // Byte code:
    //   0: invokestatic Zh : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: invokevirtual get : ()Z
    //   9: ifeq -> 162
    //   12: aload_0
    //   13: getfield Zs : Ljava/util/concurrent/BlockingQueue;
    //   16: invokeinterface take : ()Ljava/lang/Object;
    //   21: checkcast burp/Zmx3
    //   24: astore #5
    //   26: aload #5
    //   28: getfield Zf : Lburp/Ztf_;
    //   31: astore #6
    //   33: aload #5
    //   35: getfield ZA : Lburp/Zmxm;
    //   38: invokevirtual ordinal : ()I
    //   41: lookupswitch default -> 104, 1 -> 88, 2 -> 68
    //   68: aload #6
    //   70: aconst_null
    //   71: invokeinterface Zb : ([B)V
    //   76: aload #4
    //   78: ifnull -> 104
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   87: athrow
    //   88: aload #6
    //   90: aload_2
    //   91: iconst_1
    //   92: invokeinterface ZJ : (Lburp/Zekl;Z)V
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   103: athrow
    //   104: aload #6
    //   106: invokeinterface Ze : ()V
    //   111: invokestatic Zc : ()V
    //   114: goto -> 5
    //   117: astore #5
    //   119: aload #5
    //   121: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   124: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   127: goto -> 5
    //   130: astore #5
    //   132: aload #5
    //   134: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   137: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   140: aload_3
    //   141: invokestatic ZR : (Lburp/Zskh;)V
    //   144: goto -> 5
    //   147: astore #5
    //   149: aload #5
    //   151: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   154: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   157: aload #4
    //   159: ifnull -> 5
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   12	114	117	java/lang/InterruptedException
    //   12	114	130	java/lang/OutOfMemoryError
    //   12	114	147	java/lang/Throwable
    //   33	81	84	java/lang/InterruptedException
    //   68	97	100	java/lang/InterruptedException
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeba.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */