package burp;

import java.util.Set;
import java.util.regex.Pattern;

public class Zevm implements Zxrz {
  private static final Set<Zgho> Zp;
  
  private static final char[] Zh;
  
  private static final Pattern ZN;
  
  private static final Pattern Zw;
  
  private static final Pattern Zf;
  
  private static final Pattern Zv;
  
  private static final Pattern ZA;
  
  private static final Pattern Zq;
  
  public boolean Zy(Zzih paramZzih) {
    // Byte code:
    //   0: invokestatic Zx : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Z_ : ()C
    //   8: istore_3
    //   9: iload_3
    //   10: bipush #46
    //   12: if_icmpeq -> 48
    //   15: iload_3
    //   16: invokestatic isDigit : (C)Z
    //   19: ifne -> 48
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   28: athrow
    //   29: aload_0
    //   30: aload_1
    //   31: iload_3
    //   32: invokestatic valueOf : (C)Ljava/lang/Character;
    //   35: invokevirtual Zc : (Lburp/Zzih;Ljava/lang/Character;)Z
    //   38: ifeq -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   47: athrow
    //   48: iconst_1
    //   49: goto -> 57
    //   52: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   55: athrow
    //   56: iconst_0
    //   57: invokestatic Zwu : ()[Lburp/Zbqc;
    //   60: ifnonnull -> 77
    //   63: iconst_4
    //   64: anewarray java/lang/String
    //   67: invokestatic ZJ : ([Ljava/lang/String;)V
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   76: athrow
    //   77: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	22	25	java/lang/NumberFormatException
    //   15	41	44	java/lang/NumberFormatException
    //   29	52	52	java/lang/NumberFormatException
    //   57	70	73	java/lang/NumberFormatException
  }
  
  private boolean Zc(Zzih paramZzih, Character paramCharacter) {
    try {
      if (paramCharacter.charValue() == '+' || paramCharacter.charValue() == '-') {
        Zsvc zsvc = Zu(paramZzih);
        try {
          if (zsvc != null) {
            try {
              if (!Zp.contains(zsvc.ZE))
                return true; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
          } else {
            return true;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private Zsvc Zu(Zzih paramZzih) {
    Zsvc zsvc = paramZzih.Zc();
    byte b = 1;
    String[] arrayOfString = Zs2z.Zx();
    while (zsvc != null) {
      try {
        if (zsvc.ZE == Zgho.LINE_TERMINATOR || zsvc.ZE == Zgho.COMMENT) {
          zsvc = paramZzih.ZW(b++);
          if (arrayOfString != null)
            break; 
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return zsvc;
  }
  
  public boolean Zy(Zzih paramZzih, int paramInt) {
    char c = paramZzih.ZO(paramInt);
    try {
      if (!Character.isDigit(c))
        try {
          if (!ZH(c)) {
            try {
              if (c == '+' || c == '-') {
                char c1 = paramZzih.ZO(paramInt - 1);
                try {
                  if (c1 != 'e') {
                    try {
                      if (c1 == 'E')
                        return true; 
                    } catch (NumberFormatException numberFormatException) {
                      throw a(null);
                    } 
                  } else {
                    return true;
                  } 
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                } 
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return false;
          } 
          return true;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return true;
  }
  
  public Object Zi(Zzih paramZzih, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokevirtual Zs : (Lburp/Zzih;I)Ljava/lang/String;
    //   6: astore_3
    //   7: aload_0
    //   8: aload_3
    //   9: invokevirtual Zg : (Ljava/lang/String;)Z
    //   12: ifeq -> 24
    //   15: new java/math/BigDecimal
    //   18: dup
    //   19: aload_3
    //   20: invokespecial <init> : (Ljava/lang/String;)V
    //   23: areturn
    //   24: aload_0
    //   25: aload_3
    //   26: invokevirtual Zl : (Ljava/lang/String;)Z
    //   29: ifeq -> 41
    //   32: new java/math/BigDecimal
    //   35: dup
    //   36: aload_3
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: areturn
    //   41: aload_0
    //   42: aload_3
    //   43: invokevirtual ZZ : (Ljava/lang/String;)Z
    //   46: ifeq -> 58
    //   49: new java/math/BigDecimal
    //   52: dup
    //   53: aload_3
    //   54: invokespecial <init> : (Ljava/lang/String;)V
    //   57: areturn
    //   58: aload_0
    //   59: aload_3
    //   60: invokevirtual ZJ : (Ljava/lang/String;)Z
    //   63: ifeq -> 75
    //   66: new java/math/BigInteger
    //   69: dup
    //   70: aload_3
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: areturn
    //   75: aload_0
    //   76: aload_3
    //   77: invokevirtual Zo : (Ljava/lang/String;)Z
    //   80: ifeq -> 185
    //   83: iconst_0
    //   84: istore #4
    //   86: iconst_0
    //   87: istore #5
    //   89: aload_3
    //   90: iconst_0
    //   91: invokevirtual charAt : (I)C
    //   94: istore #6
    //   96: iload #6
    //   98: bipush #43
    //   100: if_icmpeq -> 117
    //   103: iload #6
    //   105: bipush #45
    //   107: if_icmpne -> 145
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   116: athrow
    //   117: iinc #5, 1
    //   120: iload #6
    //   122: bipush #45
    //   124: if_icmpne -> 142
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   133: athrow
    //   134: iconst_1
    //   135: goto -> 143
    //   138: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   141: athrow
    //   142: iconst_0
    //   143: istore #4
    //   145: iinc #5, 2
    //   148: new java/math/BigInteger
    //   151: dup
    //   152: iload #4
    //   154: ifeq -> 166
    //   157: ldc '-'
    //   159: goto -> 168
    //   162: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   165: athrow
    //   166: ldc ''
    //   168: aload_3
    //   169: iload #5
    //   171: invokevirtual substring : (I)Ljava/lang/String;
    //   174: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   179: bipush #16
    //   181: invokespecial <init> : (Ljava/lang/String;I)V
    //   184: areturn
    //   185: aload_0
    //   186: aload_3
    //   187: invokevirtual ZL : (Ljava/lang/String;)Z
    //   190: ifeq -> 292
    //   193: iconst_0
    //   194: istore #4
    //   196: iconst_1
    //   197: istore #5
    //   199: aload_3
    //   200: iconst_0
    //   201: invokevirtual charAt : (I)C
    //   204: istore #6
    //   206: iload #6
    //   208: bipush #43
    //   210: if_icmpeq -> 227
    //   213: iload #6
    //   215: bipush #45
    //   217: if_icmpne -> 255
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   226: athrow
    //   227: iinc #5, 1
    //   230: iload #6
    //   232: bipush #45
    //   234: if_icmpne -> 252
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   243: athrow
    //   244: iconst_1
    //   245: goto -> 253
    //   248: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   251: athrow
    //   252: iconst_0
    //   253: istore #4
    //   255: new java/math/BigInteger
    //   258: dup
    //   259: iload #4
    //   261: ifeq -> 273
    //   264: ldc '-'
    //   266: goto -> 275
    //   269: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   272: athrow
    //   273: ldc ''
    //   275: aload_3
    //   276: iload #5
    //   278: invokevirtual substring : (I)Ljava/lang/String;
    //   281: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   286: bipush #8
    //   288: invokespecial <init> : (Ljava/lang/String;I)V
    //   291: areturn
    //   292: goto -> 303
    //   295: astore_3
    //   296: aload_3
    //   297: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   300: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   303: aconst_null
    //   304: areturn
    // Exception table:
    //   from	to	target	type
    //   0	23	295	java/lang/NumberFormatException
    //   24	40	295	java/lang/NumberFormatException
    //   41	57	295	java/lang/NumberFormatException
    //   58	74	295	java/lang/NumberFormatException
    //   75	184	295	java/lang/NumberFormatException
    //   96	110	113	java/lang/NumberFormatException
    //   103	127	130	java/lang/NumberFormatException
    //   117	138	138	java/lang/NumberFormatException
    //   145	162	162	java/lang/NumberFormatException
    //   185	291	295	java/lang/NumberFormatException
    //   206	220	223	java/lang/NumberFormatException
    //   213	237	240	java/lang/NumberFormatException
    //   227	248	248	java/lang/NumberFormatException
    //   255	269	269	java/lang/NumberFormatException
  }
  
  private String Zs(Zzih paramZzih, int paramInt) {
    String str = paramZzih.Zn.substring(paramZzih.ZD, paramInt);
    if (str.startsWith("+"))
      str = str.substring(1); 
    return str;
  }
  
  private boolean Zg(String paramString) {
    return ZN.matcher(paramString).matches();
  }
  
  private boolean Zl(String paramString) {
    return Zw.matcher(paramString).matches();
  }
  
  private boolean ZZ(String paramString) {
    return Zf.matcher(paramString).matches();
  }
  
  private boolean ZJ(String paramString) {
    return Zv.matcher(paramString).matches();
  }
  
  private boolean Zo(String paramString) {
    return ZA.matcher(paramString).matches();
  }
  
  private boolean ZL(String paramString) {
    return Zq.matcher(paramString).matches();
  }
  
  private boolean ZH(char paramChar) {
    char[] arrayOfChar = Zh;
    int i = arrayOfChar.length;
    String[] arrayOfString = Zs2z.Zx();
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      try {
        if (paramChar == c)
          return true; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '.Acp|JZ2~(Btg\\rkL7eqpy)Dhb^.Acp|JZ2~(Btg\\rkL7eqp;.Acp|JZ2~(Btg\\rkL7eqpy)Dhb^Btg*A\Btg:)Ggg\\rkL7e2.Acp|JZ2~(Btg\\rkL7eqpnOU+$\\nnOUs3ak\Uhb^'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #36
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #36
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'j'A4I*r`SPY3}&ChW7\\fj'A4IY=A '
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #25
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #96
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #81
    //   202: goto -> 232
    //   205: bipush #78
    //   207: goto -> 232
    //   210: bipush #106
    //   212: goto -> 232
    //   215: bipush #124
    //   217: goto -> 232
    //   220: bipush #107
    //   222: goto -> 232
    //   225: bipush #25
    //   227: goto -> 232
    //   230: bipush #98
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: new java/util/HashSet
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: putstatic burp/Zevm.Zp : Ljava/util/Set;
    //   298: bipush #17
    //   300: newarray char
    //   302: dup
    //   303: iconst_0
    //   304: bipush #46
    //   306: castore
    //   307: dup
    //   308: iconst_1
    //   309: bipush #101
    //   311: castore
    //   312: dup
    //   313: iconst_2
    //   314: bipush #69
    //   316: castore
    //   317: dup
    //   318: iconst_3
    //   319: bipush #120
    //   321: castore
    //   322: dup
    //   323: iconst_4
    //   324: bipush #88
    //   326: castore
    //   327: dup
    //   328: iconst_5
    //   329: bipush #97
    //   331: castore
    //   332: dup
    //   333: bipush #6
    //   335: bipush #65
    //   337: castore
    //   338: dup
    //   339: bipush #7
    //   341: bipush #98
    //   343: castore
    //   344: dup
    //   345: bipush #8
    //   347: bipush #66
    //   349: castore
    //   350: dup
    //   351: bipush #9
    //   353: bipush #99
    //   355: castore
    //   356: dup
    //   357: bipush #10
    //   359: bipush #67
    //   361: castore
    //   362: dup
    //   363: bipush #11
    //   365: bipush #100
    //   367: castore
    //   368: dup
    //   369: bipush #12
    //   371: bipush #68
    //   373: castore
    //   374: dup
    //   375: bipush #13
    //   377: bipush #101
    //   379: castore
    //   380: dup
    //   381: bipush #14
    //   383: bipush #69
    //   385: castore
    //   386: dup
    //   387: bipush #15
    //   389: bipush #102
    //   391: castore
    //   392: dup
    //   393: bipush #16
    //   395: bipush #70
    //   397: castore
    //   398: putstatic burp/Zevm.Zh : [C
    //   401: aload_0
    //   402: iconst_2
    //   403: aaload
    //   404: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   407: putstatic burp/Zevm.ZN : Ljava/util/regex/Pattern;
    //   410: aload_0
    //   411: iconst_0
    //   412: aaload
    //   413: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   416: putstatic burp/Zevm.Zw : Ljava/util/regex/Pattern;
    //   419: aload_0
    //   420: iconst_3
    //   421: aaload
    //   422: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   425: putstatic burp/Zevm.Zf : Ljava/util/regex/Pattern;
    //   428: aload_0
    //   429: iconst_1
    //   430: aaload
    //   431: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   434: putstatic burp/Zevm.Zv : Ljava/util/regex/Pattern;
    //   437: aload_0
    //   438: iconst_4
    //   439: aaload
    //   440: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   443: putstatic burp/Zevm.ZA : Ljava/util/regex/Pattern;
    //   446: aload_0
    //   447: iconst_5
    //   448: aaload
    //   449: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   452: putstatic burp/Zevm.Zq : Ljava/util/regex/Pattern;
    //   455: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   458: getstatic burp/Zgho.IDENTIFIER : Lburp/Zgho;
    //   461: invokeinterface add : (Ljava/lang/Object;)Z
    //   466: pop
    //   467: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   470: getstatic burp/Zgho.COMMENT : Lburp/Zgho;
    //   473: invokeinterface add : (Ljava/lang/Object;)Z
    //   478: pop
    //   479: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   482: getstatic burp/Zgho.LITERAL_NUMBER : Lburp/Zgho;
    //   485: invokeinterface add : (Ljava/lang/Object;)Z
    //   490: pop
    //   491: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   494: getstatic burp/Zgho.LITERAL_REGEX : Lburp/Zgho;
    //   497: invokeinterface add : (Ljava/lang/Object;)Z
    //   502: pop
    //   503: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   506: getstatic burp/Zgho.LITERAL_STRING : Lburp/Zgho;
    //   509: invokeinterface add : (Ljava/lang/Object;)Z
    //   514: pop
    //   515: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   518: getstatic burp/Zgho.DOT : Lburp/Zgho;
    //   521: invokeinterface add : (Ljava/lang/Object;)Z
    //   526: pop
    //   527: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   530: getstatic burp/Zgho.BACKSLASH : Lburp/Zgho;
    //   533: invokeinterface add : (Ljava/lang/Object;)Z
    //   538: pop
    //   539: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   542: getstatic burp/Zgho.CLOSING_BRACE : Lburp/Zgho;
    //   545: invokeinterface add : (Ljava/lang/Object;)Z
    //   550: pop
    //   551: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   554: getstatic burp/Zgho.CLOSING_PARENTHESIS : Lburp/Zgho;
    //   557: invokeinterface add : (Ljava/lang/Object;)Z
    //   562: pop
    //   563: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   566: getstatic burp/Zgho.CLOSING_SQUARE_BRACKET : Lburp/Zgho;
    //   569: invokeinterface add : (Ljava/lang/Object;)Z
    //   574: pop
    //   575: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   578: getstatic burp/Zgho.PLUS_PLUS : Lburp/Zgho;
    //   581: invokeinterface add : (Ljava/lang/Object;)Z
    //   586: pop
    //   587: getstatic burp/Zevm.Zp : Ljava/util/Set;
    //   590: getstatic burp/Zgho.MINUS_MINUS : Lburp/Zgho;
    //   593: invokeinterface add : (Ljava/lang/Object;)Z
    //   598: pop
    //   599: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */