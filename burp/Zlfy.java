package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zlfy extends Zlft {
  private byte[] ZB;
  
  private byte[] ZP;
  
  private byte[] Zc;
  
  private Zlf8 Za;
  
  private String ZX;
  
  private static final String a;
  
  Zlfy(byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, Zlf8 paramZlf8, short paramShort, Zbnt paramZbnt) {
    super(paramByte1, paramByte2, paramArrayOfbyte1, paramArrayOfbyte2, paramShort, paramZbnt);
    this.ZB = paramArrayOfbyte3;
    this.ZP = paramArrayOfbyte4;
    this.Zc = paramArrayOfbyte5;
    this.Za = paramZlf8;
    this.ZX = a + a;
  }
  
  public void Zz(Zm82 paramZm82, Zzv5 paramZzv5) {
    super.Zz(paramZm82, paramZzv5);
    try {
      do {
        if (!ZL())
          return; 
        byte[] arrayOfByte = this.Za.ZO(paramZm82.Zz());
        if (arrayOfByte == null) {
          this.ZR = true;
          return;
        } 
        try {
          ZS(this.Zc, arrayOfByte);
          if (this.ZP != null)
            ZS(this.ZB, arrayOfByte); 
        } catch (Exception exception) {
          throw b(null);
        } 
      } while (Math.random() <= 0.95D);
      return;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.ZR = true;
      return;
    } 
  }
  
  public String toString() {
    return this.ZX;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #121
    //   2: ldc '\\b(4Y(53YSi|:2Y]i({/^'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlfy.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #37
    //   82: goto -> 112
    //   85: bipush #26
    //   87: goto -> 112
    //   90: bipush #34
    //   92: goto -> 112
    //   95: bipush #57
    //   97: goto -> 112
    //   100: bipush #73
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #126
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
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
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */