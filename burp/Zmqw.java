package burp;

public class Zmqw extends Zmqz {
  public void Zt(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/lang/Long
    //   4: ifeq -> 41
    //   7: aload_1
    //   8: checkcast java/lang/Long
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual longValue : ()J
    //   16: lconst_0
    //   17: lcmp
    //   18: ifle -> 41
    //   21: getstatic burp/Zlb0.Zd : Ljava/text/DateFormat;
    //   24: new java/util/Date
    //   27: dup
    //   28: aload_3
    //   29: invokevirtual longValue : ()J
    //   32: invokespecial <init> : (J)V
    //   35: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   38: goto -> 43
    //   41: ldc ''
    //   43: astore_2
    //   44: aload_0
    //   45: aload_2
    //   46: invokevirtual setText : (Ljava/lang/String;)V
    //   49: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */