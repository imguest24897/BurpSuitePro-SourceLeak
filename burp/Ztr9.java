package burp;

import java.util.regex.Pattern;

public class Ztr9 {
  private static final Pattern Zx;
  
  private static final Pattern Zu;
  
  public static Zm0u ZG(String paramString) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: iconst_m1
    //   3: istore_3
    //   4: iconst_m1
    //   5: istore #4
    //   7: invokestatic Zo : ()[Lburp/Zbqc;
    //   10: iconst_m1
    //   11: istore #5
    //   13: iconst_m1
    //   14: istore #6
    //   16: iconst_m1
    //   17: istore #7
    //   19: astore_1
    //   20: getstatic burp/Ztr9.Zx : Ljava/util/regex/Pattern;
    //   23: aload_0
    //   24: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   27: astore #8
    //   29: getstatic burp/Ztr9.Zu : Ljava/util/regex/Pattern;
    //   32: aload_0
    //   33: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   36: invokevirtual matches : ()Z
    //   39: istore #9
    //   41: aload #8
    //   43: invokevirtual find : ()Z
    //   46: ifeq -> 288
    //   49: aload #8
    //   51: invokevirtual groupCount : ()I
    //   54: iconst_3
    //   55: if_icmpne -> 156
    //   58: iload #9
    //   60: ifeq -> 106
    //   63: aload #8
    //   65: iconst_1
    //   66: invokevirtual start : (I)I
    //   69: istore #4
    //   71: aload #8
    //   73: iconst_1
    //   74: invokevirtual end : (I)I
    //   77: istore #5
    //   79: aload #8
    //   81: iconst_2
    //   82: invokevirtual start : (I)I
    //   85: istore #6
    //   87: aload #8
    //   89: iconst_2
    //   90: invokevirtual end : (I)I
    //   93: istore #7
    //   95: aload_1
    //   96: ifnonnull -> 288
    //   99: iconst_1
    //   100: anewarray burp/Zbqc
    //   103: invokestatic Zr : ([Lburp/Zbqc;)V
    //   106: aload #8
    //   108: iconst_1
    //   109: invokevirtual start : (I)I
    //   112: istore_2
    //   113: aload #8
    //   115: iconst_1
    //   116: invokevirtual end : (I)I
    //   119: istore_3
    //   120: aload #8
    //   122: iconst_2
    //   123: invokevirtual start : (I)I
    //   126: istore #4
    //   128: aload #8
    //   130: iconst_2
    //   131: invokevirtual end : (I)I
    //   134: istore #5
    //   136: aload #8
    //   138: iconst_3
    //   139: invokevirtual start : (I)I
    //   142: istore #6
    //   144: aload #8
    //   146: iconst_3
    //   147: invokevirtual end : (I)I
    //   150: istore #7
    //   152: aload_1
    //   153: ifnonnull -> 288
    //   156: aload #8
    //   158: invokevirtual groupCount : ()I
    //   161: iconst_2
    //   162: if_icmpne -> 240
    //   165: iload #9
    //   167: ifeq -> 206
    //   170: aload #8
    //   172: iconst_1
    //   173: invokevirtual start : (I)I
    //   176: istore #4
    //   178: aload #8
    //   180: iconst_1
    //   181: invokevirtual end : (I)I
    //   184: istore #5
    //   186: aload #8
    //   188: iconst_2
    //   189: invokevirtual start : (I)I
    //   192: istore #6
    //   194: aload #8
    //   196: iconst_2
    //   197: invokevirtual end : (I)I
    //   200: istore #7
    //   202: aload_1
    //   203: ifnonnull -> 288
    //   206: aload #8
    //   208: iconst_1
    //   209: invokevirtual start : (I)I
    //   212: istore_2
    //   213: aload #8
    //   215: iconst_1
    //   216: invokevirtual end : (I)I
    //   219: istore_3
    //   220: aload #8
    //   222: iconst_2
    //   223: invokevirtual start : (I)I
    //   226: istore #4
    //   228: aload #8
    //   230: iconst_2
    //   231: invokevirtual end : (I)I
    //   234: istore #5
    //   236: aload_1
    //   237: ifnonnull -> 288
    //   240: aload #8
    //   242: invokevirtual groupCount : ()I
    //   245: iconst_1
    //   246: if_icmpne -> 288
    //   249: iload #9
    //   251: ifeq -> 274
    //   254: aload #8
    //   256: iconst_1
    //   257: invokevirtual start : (I)I
    //   260: istore #4
    //   262: aload #8
    //   264: iconst_1
    //   265: invokevirtual end : (I)I
    //   268: istore #5
    //   270: aload_1
    //   271: ifnonnull -> 288
    //   274: aload #8
    //   276: iconst_1
    //   277: invokevirtual start : (I)I
    //   280: istore_2
    //   281: aload #8
    //   283: iconst_1
    //   284: invokevirtual end : (I)I
    //   287: istore_3
    //   288: new burp/Zef
    //   291: dup
    //   292: iload_2
    //   293: iload_3
    //   294: iload #4
    //   296: iload #5
    //   298: iload #6
    //   300: iload #7
    //   302: invokespecial <init> : (IIIIII)V
    //   305: astore #10
    //   307: aload_0
    //   308: aload #10
    //   310: invokestatic Zw : (Ljava/lang/String;Lburp/Zef;)Lburp/Zm0u;
    //   313: areturn
  }
  
  private static Zm0u Zw(String paramString, Zef paramZef) {
    return new Zm0u((paramZef.ZgJ() == -1) ? null : paramString.substring(paramZef.ZgJ(), paramZef.ZgY()), (paramZef.ZgZ() == -1) ? null : paramString.substring(paramZef.ZgZ(), paramZef.Zgg()), (paramZef.ZgQ() == -1) ? null : paramString.substring(paramZef.ZgQ(), paramZef.Zg5()), paramZef);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '\\tKG}=dv!bZ\\bDv }VqMh'dwxhEloc0YLh;eGm|SqMh'dwy'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #7
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #63
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
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
    //   67: goto -> 214
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 187
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #106
    //   142: goto -> 171
    //   145: bipush #7
    //   147: goto -> 171
    //   150: bipush #83
    //   152: goto -> 171
    //   155: bipush #21
    //   157: goto -> 171
    //   160: bipush #108
    //   162: goto -> 171
    //   165: iconst_1
    //   166: goto -> 171
    //   169: bipush #11
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 93
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 89
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 39
    //   214: aload_0
    //   215: iconst_1
    //   216: aaload
    //   217: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   220: putstatic burp/Ztr9.Zx : Ljava/util/regex/Pattern;
    //   223: aload_0
    //   224: iconst_0
    //   225: aaload
    //   226: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   229: putstatic burp/Ztr9.Zu : Ljava/util/regex/Pattern;
    //   232: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztr9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */