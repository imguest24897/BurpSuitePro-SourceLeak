package burp;

import java.io.ByteArrayOutputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Zt73 implements Zrch {
  final int Zg;
  
  Zt73(int paramInt) {
    this.Zg = paramInt;
  }
  
  public short ZX(Zbi8 paramZbi8) {
    switch (this.Zg) {
    
    } 
    return 0;
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    try {
      if (paramZbi8.Zo < 1)
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      Integer.parseInt(Zkb.Zo(paramZbi8.Zu, paramZbi8.Zv, 1), this.Zg);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return false;
    } 
    return true;
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
    //   33: if_icmpgt -> 87
    //   36: aload #7
    //   38: iconst_0
    //   39: iload #4
    //   41: invokevirtual substring : (II)Ljava/lang/String;
    //   44: aload_0
    //   45: getfield Zg : I
    //   48: invokestatic parseLong : (Ljava/lang/String;I)J
    //   51: lstore #5
    //   53: goto -> 73
    //   56: astore #8
    //   58: aload #8
    //   60: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   63: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   66: iinc #4, -1
    //   69: aload_3
    //   70: ifnull -> 87
    //   73: iinc #4, 1
    //   76: aload_3
    //   77: ifnull -> 27
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   86: athrow
    //   87: lload #5
    //   89: invokestatic toString : (J)Ljava/lang/String;
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
    //   36	53	56	java/lang/NumberFormatException
    //   58	80	83	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt73.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */