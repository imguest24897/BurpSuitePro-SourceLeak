package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zzjt extends Zzjg {
  private static final Pattern ZH;
  
  private static final Pattern ZN;
  
  private static final Pattern ZA;
  
  private static final Pattern Zv;
  
  private final boolean Zq;
  
  private final boolean ZR;
  
  private final int Zh;
  
  public Zzjt(String paramString) {
    String str1 = Zw(paramString);
    String str2 = ZY(str1, Zv);
    Matcher matcher1 = ZA.matcher(str2);
    this.ZR = matcher1.find();
    Matcher matcher2 = Zm6r.ZS.matcher(str2);
    this.Zq = matcher2.find();
    String str3 = ZG(matcher2, matcher1);
    this.Zh = ZH(str3);
  }
  
  private String Zw(String paramString) {
    String str1 = ZN.matcher(paramString).replaceAll("");
    String str2 = ZH.matcher(str1).replaceAll("\n");
    return Zq(str2);
  }
  
  private String Zn(Matcher paramMatcher) {
    String str = paramMatcher.replaceAll("");
    return ZY(ZA.matcher(str).replaceAll(""), Zv);
  }
  
  private String Zv(Matcher paramMatcher) {
    String str = paramMatcher.replaceAll("");
    return ZK(Zm6r.ZS.matcher(str).replaceAll(""));
  }
  
  private String ZG(Matcher paramMatcher1, Matcher paramMatcher2) {
    return ZC(paramMatcher1, paramMatcher2) ? Zn(paramMatcher1) : Zv(paramMatcher2);
  }
  
  boolean ZC(Matcher paramMatcher1, Matcher paramMatcher2) {
    return (this.Zq && this.ZR && paramMatcher1.start() < paramMatcher2.start());
  }
  
  public boolean Zg() {
    return this.Zq;
  }
  
  public boolean Zx() {
    return this.ZR;
  }
  
  public int ZT() {
    return this.Zh;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'SvmL-<\\n0tj8\\bH r6'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #14
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #104
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc '<`E++zO@,<`E+'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #11
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #91
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #72
    //   202: goto -> 232
    //   205: bipush #103
    //   207: goto -> 232
    //   210: bipush #52
    //   212: goto -> 232
    //   215: bipush #94
    //   217: goto -> 232
    //   220: bipush #122
    //   222: goto -> 232
    //   225: bipush #79
    //   227: goto -> 232
    //   230: bipush #9
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: aload_0
    //   289: iconst_2
    //   290: aaload
    //   291: bipush #32
    //   293: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   296: putstatic burp/Zzjt.ZH : Ljava/util/regex/Pattern;
    //   299: aload_0
    //   300: iconst_0
    //   301: aaload
    //   302: bipush #32
    //   304: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   307: putstatic burp/Zzjt.ZN : Ljava/util/regex/Pattern;
    //   310: aload_0
    //   311: iconst_3
    //   312: aaload
    //   313: bipush #32
    //   315: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   318: putstatic burp/Zzjt.ZA : Ljava/util/regex/Pattern;
    //   321: aload_0
    //   322: iconst_1
    //   323: aaload
    //   324: bipush #8
    //   326: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   329: putstatic burp/Zzjt.Zv : Ljava/util/regex/Pattern;
    //   332: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */