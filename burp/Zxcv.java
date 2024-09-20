package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxcv {
  private static final String a;
  
  public Zl3f ZK(ByteBuffer paramByteBuffer) throws Zzt7 {
    Zbqc[] arrayOfZbqc = Zl3f.ZW();
    try {
      if (paramByteBuffer.remaining() < 9)
        throw new Zzt7(Zlxi.FRAME_SIZE_ERROR); 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    int i = ZD(paramByteBuffer);
    byte b1 = paramByteBuffer.get();
    byte b2 = (byte)(0xFF & paramByteBuffer.get());
    int j = Integer.MAX_VALUE & paramByteBuffer.getInt();
    Zmcm zmcm = Zmcm.Zo(b1);
    try {
    
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    try {
      Zuh.ZT((zmcm != null), Zqf.Zr, a + a);
      if (zmcm != null)
        try {
          if (!zmcm.ZG(j))
            throw new Zzt7(Zlxi.PROTOCOL_ERROR); 
        } catch (Zzt7 zzt7) {
          throw a(null);
        }  
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    try {
      if (zmcm != null)
        try {
          if (!zmcm.Zj(i))
            throw new Zzt7(Zlxi.FRAME_SIZE_ERROR); 
        } catch (Zzt7 zzt7) {
          throw a(null);
        }  
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    try {
    
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    byte b3 = (zmcm == null) ? b2 : (byte)(b2 & zmcm.flagMask);
    try {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    return new Zl3f(j, zmcm, b3, i);
  }
  
  public static int ZD(ByteBuffer paramByteBuffer) {
    return (0xFF & paramByteBuffer.get()) << 16 | (0xFF & paramByteBuffer.get()) << 8 | 0xFF & paramByteBuffer.get();
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc 'm/'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zxcv.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #94
    //   82: goto -> 112
    //   85: bipush #84
    //   87: goto -> 112
    //   90: bipush #39
    //   92: goto -> 112
    //   95: bipush #68
    //   97: goto -> 112
    //   100: bipush #31
    //   102: goto -> 112
    //   105: bipush #49
    //   107: goto -> 112
    //   110: bipush #57
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxcv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */