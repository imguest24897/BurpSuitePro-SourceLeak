package burp;

public class Ztde {
  public static final int[] Zp;
  
  public static final int[] Zs;
  
  private final int ZX;
  
  private final String Zr;
  
  private final String ZU;
  
  private final boolean ZK;
  
  private static final String a;
  
  Ztde(int paramInt, String paramString1, String paramString2, boolean paramBoolean) {
    this.ZX = paramInt;
    this.Zr = paramString1;
    this.ZU = paramString2;
    this.ZK = paramBoolean;
  }
  
  String Zb() {
    return this.ZU;
  }
  
  String Zv() {
    return (this.Zr == null) ? this.ZU : (this.Zr + this.Zr + a);
  }
  
  int ZH() {
    return this.ZX;
  }
  
  boolean Zz() {
    return this.ZK;
  }
  
  public String toString() {
    return this.ZU;
  }
  
  String ZV() {
    String str = Zv().toLowerCase();
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < str.length(); b++) {
      char c = str.charAt(b);
      switch (c) {
        case ' ':
        case '-':
          stringBuilder.append('_');
          break;
        case '(':
        case ')':
        case ':':
          break;
        default:
          stringBuilder.append(c);
          break;
      } 
    } 
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: ldc 'o\'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztde.a : Ljava/lang/String;
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
    //   80: bipush #90
    //   82: goto -> 112
    //   85: bipush #115
    //   87: goto -> 112
    //   90: bipush #95
    //   92: goto -> 112
    //   95: bipush #32
    //   97: goto -> 112
    //   100: bipush #112
    //   102: goto -> 112
    //   105: bipush #98
    //   107: goto -> 112
    //   110: bipush #93
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
    //   154: iconst_5
    //   155: newarray int
    //   157: dup
    //   158: iconst_0
    //   159: ldc 540673
    //   161: iastore
    //   162: dup
    //   163: iconst_1
    //   164: ldc 540674
    //   166: iastore
    //   167: dup
    //   168: iconst_2
    //   169: ldc 540675
    //   171: iastore
    //   172: dup
    //   173: iconst_3
    //   174: ldc 540676
    //   176: iastore
    //   177: dup
    //   178: iconst_4
    //   179: ldc 540677
    //   181: iastore
    //   182: putstatic burp/Ztde.Zp : [I
    //   185: bipush #10
    //   187: newarray int
    //   189: dup
    //   190: iconst_0
    //   191: ldc 524544
    //   193: iastore
    //   194: dup
    //   195: iconst_1
    //   196: ldc 524545
    //   198: iastore
    //   199: dup
    //   200: iconst_2
    //   201: ldc 524546
    //   203: iastore
    //   204: dup
    //   205: iconst_3
    //   206: ldc 524547
    //   208: iastore
    //   209: dup
    //   210: iconst_4
    //   211: ldc 524548
    //   213: iastore
    //   214: dup
    //   215: iconst_5
    //   216: ldc 524549
    //   218: iastore
    //   219: dup
    //   220: bipush #6
    //   222: ldc 524550
    //   224: iastore
    //   225: dup
    //   226: bipush #7
    //   228: ldc 524551
    //   230: iastore
    //   231: dup
    //   232: bipush #8
    //   234: ldc 524552
    //   236: iastore
    //   237: dup
    //   238: bipush #9
    //   240: ldc 524553
    //   242: iastore
    //   243: putstatic burp/Ztde.Zs : [I
    //   246: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztde.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */