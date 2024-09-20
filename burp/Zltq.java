package burp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zltq {
  private static final Pattern Zj;
  
  private static final Pattern Ze;
  
  private static final Pattern Zn;
  
  private static final Pattern ZA;
  
  private static final Pattern ZE;
  
  static Zl0z ZW(String paramString) {
    Zl0z zl0z = new Zl0z();
    String str = Zzz8.Zn();
    Zlz7 zlz7 = new Zlz7();
    try {
      BufferedReader bufferedReader = Ze(paramString);
      try {
        String str1;
        while ((str1 = bufferedReader.readLine()) != null) {
          Zecb zecb = zlz7.ZJ(str1, zl0z);
          if (str == null) {
            Zbqc.Zr(new Zbqc[3]);
            break;
          } 
        } 
        try {
          if (bufferedReader != null)
            bufferedReader.close(); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
      } catch (Throwable throwable) {
        if (bufferedReader != null)
          try {
            bufferedReader.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new UncheckedIOException(iOException);
    } 
    return zl0z;
  }
  
  private static BufferedReader Ze(String paramString) throws IOException {
    FileReader fileReader = new FileReader(paramString);
    return new BufferedReader(fileReader);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'vTfj74{<a}7<<e{SQvTfj74{Wv|?V7,+a\\t;#vTvTaa^*\\t6rn;Z:}i'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #21
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #52
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
    //   67: ldc '6&*Ewt;o6&Tn^/*[6!!Fy^m0&DwyZk!B)'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #21
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #116
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
    //   200: bipush #111
    //   202: goto -> 232
    //   205: bipush #75
    //   207: goto -> 232
    //   210: bipush #16
    //   212: goto -> 232
    //   215: bipush #27
    //   217: goto -> 232
    //   220: bipush #118
    //   222: goto -> 232
    //   225: bipush #74
    //   227: goto -> 232
    //   230: bipush #78
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
    //   289: iconst_0
    //   290: aaload
    //   291: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   294: putstatic burp/Zltq.Zj : Ljava/util/regex/Pattern;
    //   297: aload_0
    //   298: iconst_4
    //   299: aaload
    //   300: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   303: putstatic burp/Zltq.Ze : Ljava/util/regex/Pattern;
    //   306: aload_0
    //   307: iconst_3
    //   308: aaload
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic burp/Zltq.Zn : Ljava/util/regex/Pattern;
    //   315: aload_0
    //   316: iconst_2
    //   317: aaload
    //   318: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   321: putstatic burp/Zltq.ZA : Ljava/util/regex/Pattern;
    //   324: aload_0
    //   325: iconst_1
    //   326: aaload
    //   327: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   330: putstatic burp/Zltq.ZE : Ljava/util/regex/Pattern;
    //   333: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zltq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */