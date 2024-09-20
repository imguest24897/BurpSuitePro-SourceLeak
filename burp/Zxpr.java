package burp;

import java.io.IOException;
import net.portswigger.Zkb;

public class Zxpr {
  private static final byte[] ZK = Zkb.Zy("%");
  
  public static byte[] Zv(byte[] paramArrayOfbyte) {
    int i = Zlt_.ZN();
    if (paramArrayOfbyte == null)
      return null; 
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length * 2];
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      byte b1 = (byte)((paramArrayOfbyte[b] & 0xF0) >> 4);
      arrayOfByte[b * 2] = ZO(b1);
      b1 = (byte)(paramArrayOfbyte[b] & 0xF);
      arrayOfByte[b * 2 + 1] = ZO(b1);
      b++;
      if (i != 0)
        break; 
    } 
    return arrayOfByte;
  }
  
  private static byte ZO(byte paramByte) {
    paramByte = (byte)(paramByte + 48);
    if (paramByte > 57)
      paramByte = (byte)(paramByte + 39); 
    return paramByte;
  }
  
  public static byte[] ZI(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: aload_0
    //   13: astore #4
    //   15: aload #4
    //   17: arraylength
    //   18: istore #5
    //   20: iconst_0
    //   21: istore #6
    //   23: iload #6
    //   25: iload #5
    //   27: if_icmpge -> 104
    //   30: aload #4
    //   32: iload #6
    //   34: baload
    //   35: istore #7
    //   37: iconst_1
    //   38: newarray byte
    //   40: dup
    //   41: iconst_0
    //   42: iload #7
    //   44: bastore
    //   45: astore #8
    //   47: aload_1
    //   48: aload #8
    //   50: invokestatic ZR : ([B[B)I
    //   53: iconst_m1
    //   54: if_icmpne -> 74
    //   57: aload_3
    //   58: iload #7
    //   60: invokevirtual write : (I)V
    //   63: iload_2
    //   64: ifne -> 97
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   73: athrow
    //   74: aload_3
    //   75: getstatic burp/Zxpr.ZK : [B
    //   78: invokevirtual write : ([B)V
    //   81: aload_3
    //   82: aload #8
    //   84: invokestatic Zv : ([B)[B
    //   87: invokevirtual write : ([B)V
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   96: athrow
    //   97: iinc #6, 1
    //   100: iload_2
    //   101: ifne -> 23
    //   104: aload_3
    //   105: invokevirtual toByteArray : ()[B
    //   108: areturn
    //   109: astore_3
    //   110: aload_3
    //   111: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   114: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   117: aload_0
    //   118: areturn
    // Exception table:
    //   from	to	target	type
    //   4	108	109	java/io/IOException
    //   47	67	70	java/io/IOException
    //   57	90	93	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */