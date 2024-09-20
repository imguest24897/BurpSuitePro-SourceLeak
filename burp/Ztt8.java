package burp;

class Ztt8 {
  static void ZB(Zxi paramZxi, Zm31[] paramArrayOfZm31, Zs7v paramZs7v) {
    // Byte code:
    //   0: aload_1
    //   1: astore #4
    //   3: invokestatic ZU : ()[Ljava/lang/String;
    //   6: aload #4
    //   8: arraylength
    //   9: istore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: astore_3
    //   15: iload #6
    //   17: iload #5
    //   19: if_icmpge -> 105
    //   22: aload #4
    //   24: iload #6
    //   26: aaload
    //   27: astore #7
    //   29: aload_2
    //   30: invokeinterface ZQ : ()Z
    //   35: ifeq -> 39
    //   38: return
    //   39: aload #7
    //   41: getstatic burp/Zk3o.Zk : Lburp/Zeke;
    //   44: if_acmpne -> 90
    //   47: aload_0
    //   48: invokeinterface ZSM : ()Ljava/lang/Object;
    //   53: dup
    //   54: astore #8
    //   56: monitorenter
    //   57: aload #7
    //   59: aload_2
    //   60: invokeinterface ZK : (Lburp/Zs7v;)V
    //   65: aload #8
    //   67: monitorexit
    //   68: goto -> 79
    //   71: astore #9
    //   73: aload #8
    //   75: monitorexit
    //   76: aload #9
    //   78: athrow
    //   79: aload_3
    //   80: ifnull -> 98
    //   83: iconst_3
    //   84: anewarray burp/Zbqc
    //   87: invokestatic Zr : ([Lburp/Zbqc;)V
    //   90: aload #7
    //   92: aload_2
    //   93: invokeinterface ZK : (Lburp/Zs7v;)V
    //   98: iinc #6, 1
    //   101: aload_3
    //   102: ifnull -> 15
    //   105: return
    // Exception table:
    //   from	to	target	type
    //   57	68	71	finally
    //   71	76	71	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztt8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */