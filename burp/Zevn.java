package burp;

import java.io.ByteArrayOutputStream;

class Zevn extends ByteArrayOutputStream {
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: dup
    //   7: astore #5
    //   9: monitorenter
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: iload_3
    //   14: invokespecial write : ([BII)V
    //   17: aload_0
    //   18: invokevirtual size : ()I
    //   21: sipush #10000
    //   24: if_icmplt -> 81
    //   27: aload_0
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_1
    //   32: aload_1
    //   33: bipush #10
    //   35: aload_1
    //   36: arraylength
    //   37: sipush #8000
    //   40: isub
    //   41: aload_1
    //   42: arraylength
    //   43: invokestatic ZU : ([BBII)I
    //   46: istore_2
    //   47: iload_2
    //   48: iconst_m1
    //   49: if_icmpne -> 64
    //   52: aload_1
    //   53: arraylength
    //   54: sipush #8000
    //   57: isub
    //   58: istore_2
    //   59: aload #4
    //   61: ifnull -> 67
    //   64: iinc #2, 1
    //   67: aload_0
    //   68: invokevirtual reset : ()V
    //   71: aload_0
    //   72: aload_1
    //   73: iload_2
    //   74: aload_1
    //   75: arraylength
    //   76: iload_2
    //   77: isub
    //   78: invokespecial write : ([BII)V
    //   81: aload #5
    //   83: monitorexit
    //   84: goto -> 95
    //   87: astore #6
    //   89: aload #5
    //   91: monitorexit
    //   92: aload #6
    //   94: athrow
    //   95: return
    // Exception table:
    //   from	to	target	type
    //   10	84	87	finally
    //   87	92	87	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */