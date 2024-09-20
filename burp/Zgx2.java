package burp;

import javax.swing.SwingWorker;

class Zgx2 extends SwingWorker<Void, Void> {
  final Zbr0 ZH;
  
  Zgx2(Zbr0 paramZbr0) {}
  
  protected Void Zg() throws Exception {
    this.ZH.ZY(this.ZH.ZP, this.ZH.ZS, this.ZH.ZT, this.ZH.ZE, this.ZH.ZV);
    return null;
  }
  
  protected void done() {
    // Byte code:
    //   0: invokestatic ZS : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual get : ()Ljava/lang/Object;
    //   8: pop
    //   9: aload_0
    //   10: getfield ZH : Lburp/Zbr0;
    //   13: getfield Zl : Lburp/Zxtz;
    //   16: aload_0
    //   17: getfield ZH : Lburp/Zbr0;
    //   20: invokevirtual ZS : (Lburp/Zsic;)Lburp/Zsic;
    //   23: pop
    //   24: goto -> 151
    //   27: astore_2
    //   28: aload_2
    //   29: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   32: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   35: goto -> 151
    //   38: astore_2
    //   39: aload_2
    //   40: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   43: astore_3
    //   44: aload_3
    //   45: instanceof burp/Ztgq
    //   48: ifeq -> 89
    //   51: aload_2
    //   52: aload_3
    //   53: checkcast burp/Ztgq
    //   56: invokevirtual ZN : ()Z
    //   59: ifeq -> 79
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   68: athrow
    //   69: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   72: goto -> 82
    //   75: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   78: athrow
    //   79: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   82: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   85: aload_1
    //   86: ifnonnull -> 103
    //   89: aload_2
    //   90: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   93: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   102: athrow
    //   103: aload_3
    //   104: invokevirtual getMessage : ()Ljava/lang/String;
    //   107: astore #4
    //   109: aload_0
    //   110: getfield ZH : Lburp/Zbr0;
    //   113: aload #4
    //   115: ifnull -> 127
    //   118: aload #4
    //   120: goto -> 131
    //   123: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   126: athrow
    //   127: aload_3
    //   128: invokevirtual toString : ()Ljava/lang/String;
    //   131: putfield ZU : Ljava/lang/String;
    //   134: aload_0
    //   135: getfield ZH : Lburp/Zbr0;
    //   138: getfield Zl : Lburp/Zxtz;
    //   141: aload_0
    //   142: getfield ZH : Lburp/Zbr0;
    //   145: getfield ZU : Ljava/lang/String;
    //   148: invokevirtual Zf : (Ljava/lang/String;)V
    //   151: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/InterruptedException
    //   4	24	38	java/util/concurrent/ExecutionException
    //   44	62	65	java/lang/InterruptedException
    //   51	75	75	java/lang/InterruptedException
    //   82	96	99	java/lang/InterruptedException
    //   109	123	123	java/lang/InterruptedException
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgx2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */