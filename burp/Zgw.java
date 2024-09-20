package burp;

import java.io.ByteArrayOutputStream;

class Zgw extends Zgj {
  final int Zj;
  
  Zgw(int paramInt) {
    this.Zj = paramInt;
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    try {
      if (paramZbi8.Zo >= 1)
        try {
          if (paramZbi8.Zu[paramZbi8.Zv] >= 48)
            try {
              if (paramZbi8.Zu[paramZbi8.Zv] <= 57);
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    // Byte code:
    //   0: lconst_0
    //   1: lstore #5
    //   3: invokestatic ZB : ()Ljava/lang/String;
    //   6: aload_1
    //   7: getfield Zu : [B
    //   10: aload_1
    //   11: getfield Zv : I
    //   14: aload_1
    //   15: getfield Zo : I
    //   18: invokestatic Zo : ([BII)Ljava/lang/String;
    //   21: astore #7
    //   23: astore_3
    //   24: iconst_1
    //   25: istore #4
    //   27: iload #4
    //   29: aload_1
    //   30: getfield Zo : I
    //   33: if_icmpgt -> 83
    //   36: aload #7
    //   38: iconst_0
    //   39: iload #4
    //   41: invokevirtual substring : (II)Ljava/lang/String;
    //   44: invokestatic parseLong : (Ljava/lang/String;)J
    //   47: lstore #5
    //   49: goto -> 69
    //   52: astore #8
    //   54: aload #8
    //   56: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   59: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   62: iinc #4, -1
    //   65: aload_3
    //   66: ifnull -> 83
    //   69: iinc #4, 1
    //   72: aload_3
    //   73: ifnull -> 27
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   82: athrow
    //   83: lload #5
    //   85: aload_0
    //   86: getfield Zj : I
    //   89: invokestatic toString : (JI)Ljava/lang/String;
    //   92: astore #8
    //   94: aload #8
    //   96: invokestatic Zy : (Ljava/lang/String;)[B
    //   99: astore #9
    //   101: aload_2
    //   102: aload #9
    //   104: iconst_0
    //   105: aload #9
    //   107: arraylength
    //   108: invokevirtual write : ([BII)V
    //   111: aload_1
    //   112: dup
    //   113: getfield Zv : I
    //   116: iload #4
    //   118: iadd
    //   119: putfield Zv : I
    //   122: aload_1
    //   123: dup
    //   124: getfield Zo : I
    //   127: iload #4
    //   129: isub
    //   130: putfield Zo : I
    //   133: return
    // Exception table:
    //   from	to	target	type
    //   36	49	52	java/lang/NumberFormatException
    //   54	76	79	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */