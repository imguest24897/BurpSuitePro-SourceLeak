package net.portswigger;

public class Zts {
  private Ztb Zn;
  
  public Zts(Ztb paramZtb) {
    this.Zn = paramZtb;
  }
  
  public Zrmf ZP(Zrmf paramZrmf) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: new net/portswigger/Zqa
    //   6: dup
    //   7: aload_1
    //   8: invokespecial <init> : (Lnet/portswigger/Zrmf;)V
    //   11: astore_3
    //   12: astore_2
    //   13: aload_0
    //   14: getfield Zn : Lnet/portswigger/Ztb;
    //   17: invokevirtual Zj : ()Ljava/util/List;
    //   20: invokeinterface isEmpty : ()Z
    //   25: ifne -> 117
    //   28: new net/portswigger/Ztz
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #4
    //   37: aload_0
    //   38: getfield Zn : Lnet/portswigger/Ztb;
    //   41: invokevirtual Zj : ()Ljava/util/List;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #5
    //   51: aload #5
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 107
    //   61: aload #5
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast net/portswigger/Zi5
    //   71: astore #6
    //   73: aload #6
    //   75: invokestatic ZA : (Lnet/portswigger/Zi5;)Ljava/util/Optional;
    //   78: aload #4
    //   80: aload #6
    //   82: <illegal opcode> accept : (Lnet/portswigger/Ztz;Lnet/portswigger/Zi5;)Ljava/util/function/Consumer;
    //   87: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   90: goto -> 103
    //   93: astore #7
    //   95: aload #7
    //   97: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   100: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   103: aload_2
    //   104: ifnonnull -> 51
    //   107: aload_3
    //   108: aload #4
    //   110: invokevirtual ZX : ()Lnet/portswigger/Zu3;
    //   113: invokevirtual ZE : (Lnet/portswigger/Zms;)Lnet/portswigger/Zqa;
    //   116: pop
    //   117: goto -> 130
    //   120: astore #4
    //   122: aload #4
    //   124: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   127: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   130: aload_3
    //   131: invokevirtual ZG : ()Lnet/portswigger/Zrmf;
    //   134: areturn
    // Exception table:
    //   from	to	target	type
    //   13	117	120	java/lang/Exception
    //   73	90	93	net/portswigger/Zki
  }
  
  private static void lambda$from$0(Ztz paramZtz, Zi5 paramZi5, Zms paramZms) {
    paramZtz.ZK(paramZi5.ZX(), paramZms);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zts.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */