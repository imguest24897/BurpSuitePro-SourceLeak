package burp;

public class Zznp implements Zzrl {
  private final String Zt;
  
  private final Zkmp Zc;
  
  private final String ZG;
  
  private static final String a;
  
  public Zznp(String paramString1, Zkmp paramZkmp, String paramString2) {
    this.Zt = paramString1;
    this.Zc = paramZkmp;
    this.ZG = paramString2;
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    return paramZlzh.Zz(this.Zc.Zv()).ZP((byte)11, this.Zt + this.Zt + this.Zc.ZS() + this.ZG, paramZgk_.ZL());
  }
  
  static {
    // Byte code:
    //   0: bipush #48
    //   2: ldc 'AnUH3oXB3$'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zznp.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
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
    //   80: bipush #75
    //   82: goto -> 111
    //   85: bipush #21
    //   87: goto -> 111
    //   90: bipush #92
    //   92: goto -> 111
    //   95: bipush #44
    //   97: goto -> 111
    //   100: bipush #70
    //   102: goto -> 111
    //   105: bipush #64
    //   107: goto -> 111
    //   110: iconst_1
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zznp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */