package burp;

import java.util.Set;

class Zgbg implements Zzrl {
  private final Set<String> Zo;
  
  private final Zzrl Zr;
  
  private static final String a;
  
  Zgbg(Set<String> paramSet, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean) {
    this.Zo = paramSet;
    this.Zr = new Zsok(new Zzrl[] { new Zz_n(paramString1, paramString2, paramString3, paramString4, paramBoolean), new Zr1n(paramString1, paramString2, paramString3, paramString4, paramBoolean) });
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    return !this.Zo.contains(a) ? null : this.Zr.ZJ(paramZlzh, paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: ldc '$A*k9'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgbg.a : Ljava/lang/String;
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
    //   80: bipush #104
    //   82: goto -> 112
    //   85: bipush #10
    //   87: goto -> 112
    //   90: bipush #127
    //   92: goto -> 112
    //   95: bipush #59
    //   97: goto -> 112
    //   100: bipush #104
    //   102: goto -> 112
    //   105: bipush #98
    //   107: goto -> 112
    //   110: bipush #42
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */