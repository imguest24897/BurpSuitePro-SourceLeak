package burp;

public class Zl4m {
  public static final Zl4m ZX;
  
  public static final Zl4m Zf;
  
  public static final Zl4m Zh;
  
  public static final Zl4m Zu;
  
  public static final Zl4m Zw;
  
  public static final Zl4m ZU;
  
  public static final Zl4m ZY;
  
  public final Zzp1 ZS;
  
  public final Zltr ZA;
  
  private static final String a;
  
  public Zl4m(Zzp1 paramZzp1) {
    this(paramZzp1, null);
  }
  
  public Zl4m(Zzp1 paramZzp1, Zltr paramZltr) {
    this.ZS = paramZzp1;
    this.ZA = paramZltr;
  }
  
  public static boolean ZJ(Zl4m paramZl4m) {
    return (paramZl4m.ZS == Zzp1.UPDATE_ME);
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.ZS, this.ZA });
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: ldc '.R@"'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zl4m.a : Ljava/lang/String;
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
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #37
    //   87: goto -> 112
    //   90: bipush #104
    //   92: goto -> 112
    //   95: bipush #6
    //   97: goto -> 112
    //   100: bipush #53
    //   102: goto -> 112
    //   105: bipush #97
    //   107: goto -> 112
    //   110: bipush #121
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
    //   154: new burp/Zl4m
    //   157: dup
    //   158: getstatic burp/Zzp1.REPORT_BOTH : Lburp/Zzp1;
    //   161: invokespecial <init> : (Lburp/Zzp1;)V
    //   164: putstatic burp/Zl4m.ZX : Lburp/Zl4m;
    //   167: new burp/Zl4m
    //   170: dup
    //   171: getstatic burp/Zzp1.REPORT_OTHER : Lburp/Zzp1;
    //   174: invokespecial <init> : (Lburp/Zzp1;)V
    //   177: putstatic burp/Zl4m.Zf : Lburp/Zl4m;
    //   180: new burp/Zl4m
    //   183: dup
    //   184: getstatic burp/Zzp1.REPORT_ME : Lburp/Zzp1;
    //   187: invokespecial <init> : (Lburp/Zzp1;)V
    //   190: putstatic burp/Zl4m.Zh : Lburp/Zl4m;
    //   193: new burp/Zl4m
    //   196: dup
    //   197: getstatic burp/Zzp1.UPDATE_ME : Lburp/Zzp1;
    //   200: getstatic burp/Zltr.OUT_BAND_DATA_ADDED : Lburp/Zltr;
    //   203: invokespecial <init> : (Lburp/Zzp1;Lburp/Zltr;)V
    //   206: putstatic burp/Zl4m.Zu : Lburp/Zl4m;
    //   209: new burp/Zl4m
    //   212: dup
    //   213: getstatic burp/Zzp1.UPDATE_ME : Lburp/Zzp1;
    //   216: getstatic burp/Zltr.IN_BAND_DATA_ADDED : Lburp/Zltr;
    //   219: invokespecial <init> : (Lburp/Zzp1;Lburp/Zltr;)V
    //   222: putstatic burp/Zl4m.Zw : Lburp/Zl4m;
    //   225: new burp/Zl4m
    //   228: dup
    //   229: getstatic burp/Zzp1.UPDATE_ME : Lburp/Zzp1;
    //   232: getstatic burp/Zltr.IN_BAND_AND_OUT_BAND_DATA_ADDED : Lburp/Zltr;
    //   235: invokespecial <init> : (Lburp/Zzp1;Lburp/Zltr;)V
    //   238: putstatic burp/Zl4m.ZU : Lburp/Zl4m;
    //   241: new burp/Zl4m
    //   244: dup
    //   245: getstatic burp/Zzp1.UPDATE_ME : Lburp/Zzp1;
    //   248: getstatic burp/Zltr.INFILTRATOR_ADDED : Lburp/Zltr;
    //   251: invokespecial <init> : (Lburp/Zzp1;Lburp/Zltr;)V
    //   254: putstatic burp/Zl4m.ZY : Lburp/Zl4m;
    //   257: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */