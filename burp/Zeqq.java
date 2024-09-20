package burp;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Zeqq {
  private final boolean ZH;
  
  private final boolean ZZ;
  
  private final boolean Zl;
  
  public Zeqq(Ztwd paramZtwd) {
    this.ZZ = paramZtwd.ZbK();
    this.ZH = paramZtwd.Zbz();
    this.Zl = !paramZtwd.Zb1();
  }
  
  public boolean Zn(Zto7 paramZto7, String paramString) {
    // Byte code:
    //   0: invokestatic Z_ : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZZ : Z
    //   8: ifeq -> 55
    //   11: aload_2
    //   12: aload_0
    //   13: getfield ZH : Z
    //   16: ifeq -> 27
    //   19: iconst_0
    //   20: goto -> 28
    //   23: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   26: athrow
    //   27: iconst_2
    //   28: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   31: astore #5
    //   33: goto -> 48
    //   36: astore #6
    //   38: aload #6
    //   40: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   43: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   46: iconst_1
    //   47: ireturn
    //   48: aconst_null
    //   49: astore #4
    //   51: iload_3
    //   52: ifeq -> 92
    //   55: aload_0
    //   56: getfield ZH : Z
    //   59: ifeq -> 80
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   68: athrow
    //   69: aload_2
    //   70: invokestatic Zy : (Ljava/lang/String;)[B
    //   73: goto -> 87
    //   76: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   79: athrow
    //   80: aload_2
    //   81: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   84: invokestatic Zy : (Ljava/lang/String;)[B
    //   87: astore #4
    //   89: aconst_null
    //   90: astore #5
    //   92: aload_1
    //   93: invokeinterface ZoO : ()Lburp/Zstu;
    //   98: astore #6
    //   100: aload #6
    //   102: ifnull -> 130
    //   105: aload_0
    //   106: aload #4
    //   108: aload #5
    //   110: aload #6
    //   112: invokevirtual ZX : ([BLjava/util/regex/Pattern;Lburp/Zstu;)Z
    //   115: ifeq -> 130
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   124: athrow
    //   125: aload_0
    //   126: getfield Zl : Z
    //   129: ireturn
    //   130: aload_1
    //   131: invokeinterface Zos : ()Lburp/Zstu;
    //   136: astore #7
    //   138: aload #7
    //   140: ifnull -> 168
    //   143: aload_0
    //   144: aload #4
    //   146: aload #5
    //   148: aload #7
    //   150: invokevirtual ZX : ([BLjava/util/regex/Pattern;Lburp/Zstu;)Z
    //   153: ifeq -> 168
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   162: athrow
    //   163: aload_0
    //   164: getfield Zl : Z
    //   167: ireturn
    //   168: aload_1
    //   169: invokeinterface ZIx : ()Ljava/lang/String;
    //   174: astore #8
    //   176: aload #8
    //   178: ifnull -> 222
    //   181: aload #8
    //   183: invokevirtual isEmpty : ()Z
    //   186: ifne -> 222
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   195: athrow
    //   196: aload_0
    //   197: aload_2
    //   198: aload #4
    //   200: aload #5
    //   202: aload #8
    //   204: invokevirtual ZX : (Ljava/lang/String;[BLjava/util/regex/Pattern;Ljava/lang/String;)Z
    //   207: ifeq -> 222
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   216: athrow
    //   217: aload_0
    //   218: getfield Zl : Z
    //   221: ireturn
    //   222: aload_0
    //   223: getfield Zl : Z
    //   226: ifeq -> 231
    //   229: iconst_0
    //   230: ireturn
    //   231: goto -> 244
    //   234: astore #6
    //   236: aload #6
    //   238: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   241: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   244: iconst_1
    //   245: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	23	23	java/util/regex/PatternSyntaxException
    //   11	33	36	java/util/regex/PatternSyntaxException
    //   51	62	65	java/util/regex/PatternSyntaxException
    //   55	76	76	java/util/regex/PatternSyntaxException
    //   92	129	234	java/lang/Exception
    //   100	118	121	java/util/regex/PatternSyntaxException
    //   130	167	234	java/lang/Exception
    //   138	156	159	java/util/regex/PatternSyntaxException
    //   168	221	234	java/lang/Exception
    //   176	189	192	java/util/regex/PatternSyntaxException
    //   181	210	213	java/util/regex/PatternSyntaxException
    //   222	230	234	java/lang/Exception
  }
  
  private boolean ZX(byte[] paramArrayOfbyte, Pattern paramPattern, Zstu paramZstu) {
    try {
      if (paramArrayOfbyte != null) {
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return (-1 != Zlt_.Zd(paramZstu, paramArrayOfbyte, this.ZH, 0, paramZstu.Zpu()));
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramPattern != null)
        return paramPattern.matcher(paramZstu.Zis()).find(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZX(String paramString1, byte[] paramArrayOfbyte, Pattern paramPattern, String paramString2) {
    try {
      if (paramArrayOfbyte != null) {
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return (-1 != (this.ZH ? paramString2.indexOf(paramString1) : Zsw8.Zf(paramString2, paramString1, 0, paramString2.length())));
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramPattern != null)
        return paramPattern.matcher(paramString2).find(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeqq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */