package burp;

import java.util.Collections;

public class Zm6_ {
  private static final byte[] ZE;
  
  private static String ZO;
  
  public static Zsqx<Zrdb> Zs(Zmzk paramZmzk, Zvow paramZvow, int paramInt) {
    String str = Zb();
    if (Zbqc.Zwu() == null)
      ZN("g05K5b"); 
    return new Zx_5(Zzu2.SILVERLIGHT_CROSS_DOMAIN_POLICY, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, Z_(paramInt), paramZmzk, ZE, null);
  }
  
  private static byte Z_(int paramInt) {
    return (paramInt >= 16777216) ? 4 : ((paramInt >= 65536) ? 2 : 1);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'JdjPwc'
    //   8: invokestatic ZN : (Ljava/lang/String;)V
    //   11: bipush #77
    //   13: ldc 'WFZV5F LK1I\\nF9I'
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
    //   88: bipush #53
    //   90: goto -> 120
    //   93: bipush #104
    //   95: goto -> 120
    //   98: bipush #46
    //   100: goto -> 120
    //   103: bipush #61
    //   105: goto -> 120
    //   108: bipush #114
    //   110: goto -> 120
    //   113: bipush #117
    //   115: goto -> 120
    //   118: bipush #12
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
    //   163: invokestatic Zy : (Ljava/lang/String;)[B
    //   166: putstatic burp/Zm6_.ZE : [B
    //   169: return
  }
  
  public static void ZN(String paramString) {
    ZO = paramString;
  }
  
  public static String Zb() {
    return ZO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */