package burp;

public class Zs0i {
  private final Zl9 Zv;
  
  private final Zee5 Zz;
  
  private final Ztwv Zk;
  
  Zs0i(Zl9 paramZl9, Ztwv paramZtwv, Ze78 paramZe78) {
    this.Zv = paramZl9;
    this.Zk = paramZtwv;
    this.Zz = paramZe78.ZY();
  }
  
  public void ZV(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zl9;
    //   4: aload_1
    //   5: invokevirtual ZS : (Ljava/lang/String;)Lburp/Zeu1;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnull -> 45
    //   13: aload_0
    //   14: getfield Zv : Lburp/Zl9;
    //   17: aload_2
    //   18: invokevirtual Ze : (Lburp/Zeu1;)V
    //   21: aload_2
    //   22: invokevirtual ZP : ()Z
    //   25: ifeq -> 45
    //   28: aload_0
    //   29: getfield Zk : Lburp/Ztwv;
    //   32: aload_0
    //   33: aload_2
    //   34: <illegal opcode> run : (Lburp/Zs0i;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   39: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   44: pop
    //   45: aload_0
    //   46: getfield Zz : Lburp/Zee5;
    //   49: aload_1
    //   50: invokevirtual Zq : (Ljava/lang/String;)Ljava/io/File;
    //   53: astore_3
    //   54: aload_3
    //   55: invokevirtual exists : ()Z
    //   58: ifeq -> 70
    //   61: aload_0
    //   62: getfield Zz : Lburp/Zee5;
    //   65: aload_3
    //   66: invokevirtual ZO : (Ljava/io/File;)Z
    //   69: pop
    //   70: return
  }
  
  private void lambda$removeBapp$0(Zeu1 paramZeu1) {
    this.Zv.Ze(paramZeu1, false);
    paramZeu1.ZU().close();
    paramZeu1.ZJ().close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs0i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */