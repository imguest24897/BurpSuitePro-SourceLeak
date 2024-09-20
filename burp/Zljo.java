package burp;

import java.util.List;

class Zljo extends Zlft {
  private Zlf8 Zu;
  
  private List<String> Zc;
  
  Zljo(byte paramByte1, byte paramByte2, Zlf8 paramZlf8, List<String> paramList, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, short paramShort, Zbnt paramZbnt) {
    super(paramByte1, paramByte2, paramArrayOfbyte1, paramArrayOfbyte2, paramShort, paramZbnt);
    this.Zu = paramZlf8;
    this.Zc = paramList;
  }
  
  public void Zz(Zm82 paramZm82, Zzv5 paramZzv5) {
    // Byte code:
    //   0: invokestatic Zb : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: invokespecial Zz : (Lburp/Zm82;Lburp/Zzv5;)V
    //   10: aload_0
    //   11: invokevirtual ZL : ()Z
    //   14: ifne -> 18
    //   17: return
    //   18: aload_0
    //   19: getfield Zu : Lburp/Zlf8;
    //   22: aload_1
    //   23: invokevirtual Zz : ()Z
    //   26: invokeinterface ZO : (Z)[B
    //   31: astore #4
    //   33: aload #4
    //   35: ifnonnull -> 44
    //   38: aload_0
    //   39: iconst_1
    //   40: putfield ZR : Z
    //   43: return
    //   44: aload_0
    //   45: getfield Zc : Ljava/util/List;
    //   48: ifnonnull -> 70
    //   51: aload_0
    //   52: aload #4
    //   54: aconst_null
    //   55: invokevirtual ZS : ([B[B)Z
    //   58: pop
    //   59: aload_3
    //   60: ifnonnull -> 143
    //   63: goto -> 70
    //   66: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: iconst_0
    //   71: istore #5
    //   73: iload #5
    //   75: aload_0
    //   76: getfield Zc : Ljava/util/List;
    //   79: invokeinterface size : ()I
    //   84: if_icmpge -> 143
    //   87: ldc ''
    //   89: astore #6
    //   91: aload_0
    //   92: getfield Zc : Ljava/util/List;
    //   95: iload #5
    //   97: invokeinterface get : (I)Ljava/lang/Object;
    //   102: checkcast java/lang/String
    //   105: astore #6
    //   107: goto -> 120
    //   110: astore #7
    //   112: aload #7
    //   114: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   117: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   120: aload_0
    //   121: aload #4
    //   123: aload #6
    //   125: invokestatic Zy : (Ljava/lang/String;)[B
    //   128: invokevirtual ZS : ([B[B)Z
    //   131: pop
    //   132: aload_1
    //   133: invokevirtual Zi : ()V
    //   136: iinc #5, 1
    //   139: aload_3
    //   140: ifnonnull -> 73
    //   143: invokestatic random : ()D
    //   146: ldc2_w 0.95
    //   149: dcmpl
    //   150: ifle -> 154
    //   153: return
    //   154: goto -> 10
    //   157: astore #4
    //   159: aload #4
    //   161: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   164: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   167: aload_0
    //   168: iconst_1
    //   169: putfield ZR : Z
    //   172: return
    // Exception table:
    //   from	to	target	type
    //   10	17	157	java/lang/Exception
    //   18	43	157	java/lang/Exception
    //   44	63	66	java/lang/Exception
    //   44	153	157	java/lang/Exception
    //   91	107	110	java/lang/Exception
    //   154	157	157	java/lang/Exception
  }
  
  public String toString() {
    return Ztvb.Zx[this.Zd][this.Zt];
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */