package burp;

import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public abstract class Zgaj implements Zgd8<Zku8> {
  protected final Zku8 Zl;
  
  protected final String ZL;
  
  protected final Matcher Zj;
  
  protected final Zkl6 Zh;
  
  private static String ZV;
  
  private static final String b;
  
  Zgaj(Zku8 paramZku8, Zkl6 paramZkl6) throws Ztr8 {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zl : Lburp/Zku8;
    //   9: invokestatic ZG : ()Ljava/lang/String;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield Zh : Lburp/Zkl6;
    //   17: astore_3
    //   18: aload_1
    //   19: invokeinterface ZIG : ()Ljava/lang/String;
    //   24: invokevirtual isEmpty : ()Z
    //   27: ifeq -> 51
    //   30: aload_0
    //   31: aconst_null
    //   32: putfield Zj : Ljava/util/regex/Matcher;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield ZL : Ljava/lang/String;
    //   40: aload_3
    //   41: ifnull -> 160
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   50: athrow
    //   51: aload_1
    //   52: invokeinterface ZIr : ()Z
    //   57: ifeq -> 90
    //   60: aload_1
    //   61: invokeinterface ZIG : ()Ljava/lang/String;
    //   66: bipush #18
    //   68: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   71: astore #4
    //   73: aload_0
    //   74: aload_1
    //   75: invokeinterface ZIX : ()Ljava/lang/String;
    //   80: invokestatic quoteReplacement : (Ljava/lang/String;)Ljava/lang/String;
    //   83: putfield ZL : Ljava/lang/String;
    //   86: aload_3
    //   87: ifnull -> 113
    //   90: aload_1
    //   91: invokeinterface ZIG : ()Ljava/lang/String;
    //   96: bipush #34
    //   98: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   101: astore #4
    //   103: aload_0
    //   104: aload_1
    //   105: invokeinterface ZIX : ()Ljava/lang/String;
    //   110: putfield ZL : Ljava/lang/String;
    //   113: aload_0
    //   114: aload #4
    //   116: ldc ''
    //   118: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   121: putfield Zj : Ljava/util/regex/Matcher;
    //   124: goto -> 160
    //   127: astore #4
    //   129: aload #4
    //   131: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   134: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   137: new burp/Ztr8
    //   140: dup
    //   141: aload_1
    //   142: invokeinterface ZIG : ()Ljava/lang/String;
    //   147: getstatic burp/Zgaj.b : Ljava/lang/String;
    //   150: swap
    //   151: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: athrow
    //   160: return
    // Exception table:
    //   from	to	target	type
    //   18	44	47	java/util/regex/PatternSyntaxException
    //   51	124	127	java/util/regex/PatternSyntaxException
  }
  
  public abstract Zlbg ZZ(Zlbg paramZlbg);
  
  public abstract Zlbg Zw(Zlbg paramZlbg);
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zgaj zgaj = (Zgaj)paramObject;
            try {
              if (this.Zl.ZIp() != zgaj.ZU())
                return false; 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            try {
              if (this.Zl.ZIu() != zgaj.ZJ())
                return false; 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            try {
              if (this.Zj == null) {
                try {
                  if (zgaj.Zj != null)
                    return false; 
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                } 
              } else {
                try {
                  if (!this.Zj.toString().equals(zgaj.Zj.toString()))
                    return false; 
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                } 
              } 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            try {
              if (this.Zl.ZIX() == null) {
                try {
                  if (zgaj.Zt() != null)
                    return false; 
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                } 
              } else {
                try {
                  if (!this.Zl.ZIX().equals(zgaj.Zt()))
                    return false; 
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                } 
              } 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            try {
              if (this.Zl.ZIr() != zgaj.ZD())
                return false; 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            return this.Zl.ZIt().equals(zgaj.ZY());
          } 
          return false;
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    null = this.Zl.ZIp() ? 1 : 0;
    null = 31 * null + (this.Zl.ZIu()).projectPersistedId;
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    null = 31 * null + ((this.Zl.ZIX() == null) ? 0 : this.Zl.ZIX().hashCode());
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    null = 31 * null + ((this.Zj == null) ? 0 : this.Zj.hashCode());
    null = 31 * null + this.Zl.ZIt().hashCode();
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return 31 * null + (this.Zl.ZIr() ? 1 : 0);
  }
  
  public boolean ZU() {
    return this.Zl.ZIp();
  }
  
  public void Zw(boolean paramBoolean) {
    this.Zl.ZXg(paramBoolean);
  }
  
  void Zz(Zl25 paramZl25) {
    this.Zl.Zk(paramZl25);
  }
  
  public Zl25 ZJ() {
    return this.Zl.ZIu();
  }
  
  public String Zu() {
    return this.Zl.ZIG();
  }
  
  public String Zt() {
    return this.Zl.ZIX();
  }
  
  public String ZY() {
    return this.Zl.ZIt();
  }
  
  public boolean ZD() {
    return this.Zl.ZIr();
  }
  
  public Zku8 ZM() {
    return this.Zl;
  }
  
  public void ZW(Zzqw paramZzqw) {
    paramZzqw.Zx(Zrkt.Zo(this));
  }
  
  public static void ZH(String paramString) {
    ZV = paramString;
  }
  
  public static String ZG() {
    return ZV;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'mMCDjc'
    //   8: invokestatic ZH : (Ljava/lang/String;)V
    //   11: bipush #60
    //   13: ldc '%NZB\\n*LR\KtL'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zgaj.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #80
    //   94: goto -> 124
    //   97: bipush #28
    //   99: goto -> 124
    //   102: bipush #88
    //   104: goto -> 124
    //   107: bipush #7
    //   109: goto -> 124
    //   112: bipush #18
    //   114: goto -> 124
    //   117: bipush #95
    //   119: goto -> 124
    //   122: bipush #114
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgaj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */