package burp;

import javax.swing.SwingWorker;

class Zkbk extends SwingWorker<Void, Void> {
  final Zbrl Zq;
  
  Zkbk(Zbrl paramZbrl) {}
  
  protected Void Zh() throws Exception {
    this.Zq.Zv(this.Zq.ZR, this.Zq.Zr, this.Zq.Zg, this.Zq.Zi, this.Zq.ZF);
    return null;
  }
  
  protected void done() {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual get : ()Ljava/lang/Object;
    //   8: pop
    //   9: aload_0
    //   10: getfield Zq : Lburp/Zbrl;
    //   13: getfield Zj : Lburp/Zrk1;
    //   16: invokevirtual Z_ : ()V
    //   19: goto -> 136
    //   22: astore_2
    //   23: aload_2
    //   24: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   27: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   30: goto -> 136
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   38: astore_3
    //   39: aload_3
    //   40: instanceof burp/Ztgq
    //   43: ifeq -> 84
    //   46: aload_2
    //   47: aload_3
    //   48: checkcast burp/Ztgq
    //   51: invokevirtual ZN : ()Z
    //   54: ifeq -> 74
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   63: athrow
    //   64: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   67: goto -> 77
    //   70: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   73: athrow
    //   74: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   77: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   80: aload_1
    //   81: ifnull -> 98
    //   84: aload_2
    //   85: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   88: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   97: athrow
    //   98: aload_3
    //   99: invokevirtual getMessage : ()Ljava/lang/String;
    //   102: astore #4
    //   104: aload #4
    //   106: ifnull -> 118
    //   109: aload #4
    //   111: goto -> 122
    //   114: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   117: athrow
    //   118: aload_3
    //   119: invokevirtual toString : ()Ljava/lang/String;
    //   122: astore #5
    //   124: aload_0
    //   125: getfield Zq : Lburp/Zbrl;
    //   128: getfield Zj : Lburp/Zrk1;
    //   131: aload #5
    //   133: invokevirtual Zd : (Ljava/lang/String;)V
    //   136: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/InterruptedException
    //   4	19	33	java/util/concurrent/ExecutionException
    //   39	57	60	java/lang/InterruptedException
    //   46	70	70	java/lang/InterruptedException
    //   77	91	94	java/lang/InterruptedException
    //   104	114	114	java/lang/InterruptedException
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */