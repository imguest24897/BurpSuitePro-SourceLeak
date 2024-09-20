package burp;

public class Zeac implements Runnable {
  private final Zvf8 ZE;
  
  private final Zskh Zz;
  
  Zeac(Zvf8 paramZvf8, Zskh paramZskh) {
    this.ZE = paramZvf8;
    this.Zz = paramZskh;
  }
  
  public void run() {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic ZN : ()[Ljava/lang/String;
    //   5: iconst_0
    //   6: istore_3
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZE : Lburp/Zvf8;
    //   12: iload_3
    //   13: invokevirtual Zw : (Z)Lburp/Zk9r;
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 34
    //   23: aload #4
    //   25: invokevirtual run : ()V
    //   28: iconst_1
    //   29: istore_3
    //   30: aload_1
    //   31: ifnull -> 36
    //   34: iconst_0
    //   35: istore_2
    //   36: goto -> 90
    //   39: astore #4
    //   41: aload #4
    //   43: invokestatic Zm : (Ljava/lang/Throwable;)Z
    //   46: istore #5
    //   48: aload #4
    //   50: iload #5
    //   52: ifeq -> 65
    //   55: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   58: goto -> 68
    //   61: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   64: athrow
    //   65: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: iload #5
    //   73: ifeq -> 90
    //   76: aload_0
    //   77: getfield Zz : Lburp/Zskh;
    //   80: invokestatic ZR : (Lburp/Zskh;)V
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   89: athrow
    //   90: iload_2
    //   91: ifne -> 8
    //   94: return
    // Exception table:
    //   from	to	target	type
    //   8	36	39	java/lang/Throwable
    //   48	61	61	java/lang/Throwable
    //   68	83	86	java/lang/Throwable
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeac.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */