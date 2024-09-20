package burp;

import java.security.KeyStore;

public class Zzz8 {
  public static final char[] ZN;
  
  private final KeyStore ZC;
  
  private final char[] ZL;
  
  private static String ZF;
  
  public Zzz8(KeyStore paramKeyStore, char[] paramArrayOfchar) {
    this.ZC = paramKeyStore;
    this.ZL = paramArrayOfchar;
  }
  
  public KeyStore Zr() {
    return this.ZC;
  }
  
  public char[] Zu() {
    return this.ZL;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zn : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'HXNVX'
    //   8: invokestatic Zz : (Ljava/lang/String;)V
    //   11: bipush #79
    //   13: ldc 'zN5*;hI#/'
    //   15: iconst_m1
    //   16: goto -> 23
    //   19: astore_0
    //   20: goto -> 162
    //   23: dup_x2
    //   24: pop
    //   25: invokevirtual toCharArray : ()[C
    //   28: dup_x1
    //   29: arraylength
    //   30: dup_x2
    //   31: pop
    //   32: iconst_0
    //   33: istore_1
    //   34: dup2_x1
    //   35: pop2
    //   36: dup_x2
    //   37: iconst_1
    //   38: if_icmpgt -> 136
    //   41: dup2
    //   42: swap
    //   43: iload_1
    //   44: dup2_x1
    //   45: caload
    //   46: swap
    //   47: iload_1
    //   48: bipush #7
    //   50: irem
    //   51: tableswitch default -> 118, 0 -> 88, 1 -> 93, 2 -> 98, 3 -> 103, 4 -> 108, 5 -> 113
    //   88: bipush #66
    //   90: goto -> 120
    //   93: bipush #104
    //   95: goto -> 120
    //   98: bipush #22
    //   100: goto -> 120
    //   103: bipush #9
    //   105: goto -> 120
    //   108: bipush #62
    //   110: goto -> 120
    //   113: bipush #58
    //   115: goto -> 120
    //   118: bipush #31
    //   120: ixor
    //   121: ixor
    //   122: i2c
    //   123: castore
    //   124: iinc #1, 1
    //   127: dup
    //   128: ifne -> 136
    //   131: dup2
    //   132: dup_x1
    //   133: goto -> 44
    //   136: dup2_x1
    //   137: pop2
    //   138: dup_x2
    //   139: iload_1
    //   140: if_icmpgt -> 41
    //   143: pop
    //   144: new java/lang/String
    //   147: dup_x1
    //   148: swap
    //   149: invokespecial <init> : ([C)V
    //   152: invokevirtual intern : ()Ljava/lang/String;
    //   155: swap
    //   156: pop
    //   157: swap
    //   158: pop
    //   159: goto -> 19
    //   162: aload_0
    //   163: invokevirtual toCharArray : ()[C
    //   166: putstatic burp/Zzz8.ZN : [C
    //   169: return
  }
  
  public static void Zz(String paramString) {
    ZF = paramString;
  }
  
  public static String Zn() {
    return ZF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzz8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */