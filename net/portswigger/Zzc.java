package net.portswigger;

import burp.Zbqc;
import java.util.Optional;
import java.util.function.BiFunction;

public class Zzc {
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZL(String paramString) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull -> 22
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 28
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_0
    //   23: areturn
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: iconst_0
    //   29: istore_2
    //   30: new java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore_3
    //   38: iconst_0
    //   39: istore #4
    //   41: iload #4
    //   43: aload_0
    //   44: invokevirtual length : ()I
    //   47: if_icmpge -> 184
    //   50: aload_0
    //   51: iload #4
    //   53: invokevirtual charAt : (I)C
    //   56: istore #5
    //   58: iload #5
    //   60: bipush #43
    //   62: if_icmpne -> 75
    //   65: bipush #32
    //   67: istore #5
    //   69: iconst_1
    //   70: istore_2
    //   71: aload_1
    //   72: ifnull -> 170
    //   75: iload #5
    //   77: bipush #37
    //   79: if_icmpne -> 170
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload_0
    //   90: iload #4
    //   92: iconst_1
    //   93: iadd
    //   94: invokevirtual charAt : (I)C
    //   97: bipush #117
    //   99: if_icmpne -> 132
    //   102: aload_0
    //   103: iload #4
    //   105: iconst_2
    //   106: iadd
    //   107: iload #4
    //   109: bipush #6
    //   111: iadd
    //   112: invokevirtual substring : (II)Ljava/lang/String;
    //   115: bipush #16
    //   117: invokestatic parseInt : (Ljava/lang/String;I)I
    //   120: i2c
    //   121: istore #5
    //   123: iconst_1
    //   124: istore_2
    //   125: iinc #4, 5
    //   128: aload_1
    //   129: ifnull -> 157
    //   132: aload_0
    //   133: iload #4
    //   135: iconst_1
    //   136: iadd
    //   137: iload #4
    //   139: iconst_3
    //   140: iadd
    //   141: invokevirtual substring : (II)Ljava/lang/String;
    //   144: bipush #16
    //   146: invokestatic parseInt : (Ljava/lang/String;I)I
    //   149: i2c
    //   150: istore #5
    //   152: iconst_1
    //   153: istore_2
    //   154: iinc #4, 2
    //   157: goto -> 170
    //   160: astore #6
    //   162: aload #6
    //   164: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   167: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   170: aload_3
    //   171: iload #5
    //   173: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: iinc #4, 1
    //   180: aload_1
    //   181: ifnull -> 41
    //   184: iload_2
    //   185: ifeq -> 197
    //   188: aload_3
    //   189: invokevirtual toString : ()Ljava/lang/String;
    //   192: areturn
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: aload_0
    //   198: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/Exception
    //   8	24	24	java/lang/Exception
    //   71	82	85	java/lang/Exception
    //   89	157	160	java/lang/Exception
    //   184	193	193	java/lang/Exception
  }
  
  public static String Zd(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = false;
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      switch (c) {
        case '#':
        case '%':
        case '&':
        case '+':
        case ':':
        case ';':
        case '=':
        case '?':
        case '@':
          stringBuilder.append(String.format(a(-25682, 1836), new Object[] { Integer.valueOf(0xFF & c) }));
          bool = true;
        case ' ':
          stringBuilder.append('+');
          bool = true;
        default:
          stringBuilder.append(c);
          break;
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return bool ? stringBuilder.toString() : paramString;
  }
  
  public static String Zh(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < paramString.length()) {
      stringBuilder.append(String.format(a(-25677, -24324), new Object[] { Integer.valueOf(0xFF & paramString.charAt(b)) }));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String ZI(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < paramString.length()) {
      stringBuilder.append(String.format(a(-25670, 12909), new Object[] { Integer.valueOf(Character.MAX_VALUE & paramString.charAt(b)) }));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String ZW(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty()) {
            boolean bool = false;
            StringBuilder stringBuilder = new StringBuilder();
            byte b = 0;
            while (b < paramString.length()) {
              char c = paramString.charAt(b);
              try {
                c = (char)Integer.parseInt(paramString.substring(b, b + 2), 16);
                bool = true;
                b += 2;
              } catch (Exception exception) {
                Zah.Zl(exception, Zk_.IGNORED);
                b++;
              } 
              stringBuilder.append(c);
              if (arrayOfString != null)
                break; 
            } 
            try {
              if (bool)
                return stringBuilder.toString(); 
            } catch (Exception exception) {
              throw a(null);
            } 
            return paramString;
          } 
          return paramString;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return paramString;
  }
  
  public static String Zx(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < paramString.length()) {
      stringBuilder.append(String.format(a(-25679, 19944), new Object[] { Integer.valueOf(0xFF & paramString.charAt(b)) }));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String ZB(String paramString) {
    return Zi(paramString, false);
  }
  
  public static String Zi(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: ifnull -> 22
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 28
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_0
    //   23: areturn
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore_3
    //   36: iconst_0
    //   37: istore #4
    //   39: iconst_0
    //   40: istore #5
    //   42: iconst_0
    //   43: istore #6
    //   45: iload #6
    //   47: aload_0
    //   48: invokevirtual length : ()I
    //   51: if_icmpge -> 375
    //   54: aload_0
    //   55: iload #6
    //   57: invokevirtual charAt : (I)C
    //   60: istore #7
    //   62: iload #5
    //   64: ifeq -> 127
    //   67: aload_0
    //   68: iload #6
    //   70: invokestatic ZO : (Ljava/lang/String;I)Z
    //   73: ifeq -> 109
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: iload #6
    //   85: sipush #-25698
    //   88: sipush #6781
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: invokevirtual length : ()I
    //   97: iconst_1
    //   98: isub
    //   99: iadd
    //   100: istore #6
    //   102: iconst_0
    //   103: istore #5
    //   105: aload_2
    //   106: ifnull -> 368
    //   109: aload_3
    //   110: iload #7
    //   112: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_2
    //   117: ifnull -> 368
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: iload_1
    //   128: ifeq -> 183
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: iload #6
    //   141: invokestatic ZW : (Ljava/lang/String;I)Z
    //   144: ifeq -> 183
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: iload #6
    //   156: sipush #-25695
    //   159: sipush #24127
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: invokevirtual length : ()I
    //   168: iconst_1
    //   169: isub
    //   170: iadd
    //   171: istore #6
    //   173: iconst_1
    //   174: istore #5
    //   176: iconst_1
    //   177: istore #4
    //   179: aload_2
    //   180: ifnull -> 368
    //   183: iload #7
    //   185: bipush #38
    //   187: if_icmpne -> 354
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: aload_0
    //   198: bipush #59
    //   200: iload #6
    //   202: iconst_1
    //   203: iadd
    //   204: invokevirtual indexOf : (II)I
    //   207: istore #8
    //   209: iload #8
    //   211: iconst_m1
    //   212: if_icmpeq -> 343
    //   215: aload_0
    //   216: iload #6
    //   218: iconst_1
    //   219: iadd
    //   220: iload #8
    //   222: invokevirtual substring : (II)Ljava/lang/String;
    //   225: astore #9
    //   227: aload #9
    //   229: ldc '#'
    //   231: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   234: ifeq -> 306
    //   237: aload #9
    //   239: iconst_1
    //   240: iconst_2
    //   241: invokevirtual substring : (II)Ljava/lang/String;
    //   244: ldc 'x'
    //   246: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   249: ifeq -> 270
    //   252: aload #9
    //   254: iconst_2
    //   255: invokevirtual substring : (I)Ljava/lang/String;
    //   258: bipush #16
    //   260: invokestatic parseInt : (Ljava/lang/String;I)I
    //   263: i2c
    //   264: istore #7
    //   266: aload_2
    //   267: ifnull -> 282
    //   270: aload #9
    //   272: iconst_1
    //   273: invokevirtual substring : (I)Ljava/lang/String;
    //   276: invokestatic parseInt : (Ljava/lang/String;)I
    //   279: i2c
    //   280: istore #7
    //   282: iconst_1
    //   283: istore #4
    //   285: iload #8
    //   287: istore #6
    //   289: goto -> 343
    //   292: astore #10
    //   294: aload #10
    //   296: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   299: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   302: aload_2
    //   303: ifnull -> 343
    //   306: getstatic net/portswigger/Zrzt.Z_ : Ljava/util/Map;
    //   309: aload #9
    //   311: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   314: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   319: checkcast java/lang/Character
    //   322: astore #10
    //   324: aload #10
    //   326: ifnull -> 343
    //   329: aload #10
    //   331: invokevirtual charValue : ()C
    //   334: istore #7
    //   336: iconst_1
    //   337: istore #4
    //   339: iload #8
    //   341: istore #6
    //   343: aload_3
    //   344: iload #7
    //   346: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   349: pop
    //   350: aload_2
    //   351: ifnull -> 368
    //   354: aload_3
    //   355: iload #7
    //   357: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   367: athrow
    //   368: iinc #6, 1
    //   371: aload_2
    //   372: ifnull -> 45
    //   375: iload #4
    //   377: ifeq -> 389
    //   380: aload_3
    //   381: invokevirtual toString : ()Ljava/lang/String;
    //   384: areturn
    //   385: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   388: athrow
    //   389: aload_0
    //   390: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/Exception
    //   8	24	24	java/lang/Exception
    //   62	76	79	java/lang/Exception
    //   105	120	123	java/lang/Exception
    //   109	131	134	java/lang/Exception
    //   127	147	150	java/lang/Exception
    //   179	190	193	java/lang/Exception
    //   237	289	292	java/lang/Exception
    //   343	361	364	java/lang/Exception
    //   375	385	385	java/lang/Exception
  }
  
  public static boolean ZW(String paramString, int paramInt) {
    String[] arrayOfString = Ztu.ZR();
    if (Zbqc.Zwu() == null)
      Ztu.ZN(new String[1]); 
    return (paramString.length() - paramInt >= a(-25675, -18769).length() + a(-25704, 28800).length() && paramString.startsWith(a(-25695, 24127), paramInt));
  }
  
  public static boolean ZO(String paramString, int paramInt) {
    return (paramString.length() - paramInt >= a(-25698, 6781).length() && paramString.startsWith(a(-25698, 6781), paramInt));
  }
  
  public static String ZV(String paramString) {
    return ZZ(paramString, false);
  }
  
  public static String ZZ(String paramString, boolean paramBoolean) {
    return (paramString == null || paramString.isEmpty()) ? paramString : ZF(paramString, paramBoolean, new int[] { 0, paramString.length() });
  }
  
  public static String ZF(String paramString, boolean paramBoolean, int[] paramArrayOfint) {
    return Zq(paramString, paramBoolean, paramArrayOfint, Zzc::Zm);
  }
  
  public static String ZY(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      switch (c) {
        case '"':
          stringBuilder.append(a(-25696, -8486));
        case '\'':
          stringBuilder.append(a(-25674, -11303));
        case '<':
          stringBuilder.append(a(-25685, 12772));
        case '>':
          stringBuilder.append(a(-25691, -24597));
        case '&':
          stringBuilder.append(a(-25681, -19949));
        default:
          stringBuilder.append(a(-25688, 28486));
          stringBuilder.append(0xFF & c);
          stringBuilder.append(';');
          break;
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String Zb(String paramString) {
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramString.length(); b++) {
      stringBuilder.append(a(-25701, 5056));
      stringBuilder.append(0xFF & paramString.charAt(b));
      stringBuilder.append(';');
    } 
    return stringBuilder.toString();
  }
  
  public static String Zo(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < paramString.length()) {
      stringBuilder.append(String.format(a(-25692, -15952), new Object[] { Integer.valueOf(0xFF & paramString.charAt(b)) }));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String Zn(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      switch (c) {
        case '"':
          stringBuilder.append(a(-25687, 3072));
        case '\'':
          stringBuilder.append(a(-25680, 85));
        case '<':
          stringBuilder.append(a(-25684, 7245));
        case '>':
          stringBuilder.append(a(-25671, -25656));
        case '&':
          stringBuilder.append(a(-25673, -13113));
        default:
        
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String Zq(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? paramString : Zkb.ZG(Zvy.ZZ(Zkb.Zy(paramString)));
  }
  
  public static String Zt(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? paramString : Zkb.ZG(Zvy.Zt(Zkb.Zy(paramString)));
  }
  
  public static String ZO(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? paramString : Zkb.ZG(Zv4.Zw(Zkb.Zy(paramString)));
  }
  
  public static String Zu(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? paramString : Zkb.ZG(Zv4.ZK(Zkb.Zy(paramString)));
  }
  
  public static String ZF(String paramString) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull -> 15
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 17
    //   15: aload_0
    //   16: areturn
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: sipush #-25683
    //   24: sipush #9147
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: astore_2
    //   34: iconst_0
    //   35: istore_3
    //   36: iconst_0
    //   37: istore #4
    //   39: iload #4
    //   41: aload_0
    //   42: invokevirtual length : ()I
    //   45: if_icmpge -> 90
    //   48: aload_0
    //   49: iload #4
    //   51: invokevirtual charAt : (I)C
    //   54: istore #5
    //   56: iload_3
    //   57: ifeq -> 71
    //   60: aload_2
    //   61: bipush #44
    //   63: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_1
    //   68: ifnull -> 73
    //   71: iconst_1
    //   72: istore_3
    //   73: aload_2
    //   74: ldc 65535
    //   76: iload #5
    //   78: iand
    //   79: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: iinc #4, 1
    //   86: aload_1
    //   87: ifnull -> 39
    //   90: aload_2
    //   91: bipush #41
    //   93: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_2
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: areturn
  }
  
  public static String Zw(String paramString) {
    String[] arrayOfString = Ztu.ZR();
    if (paramString == null)
      return null; 
    if (paramString.isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      ZW(c, stringBuilder);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static void ZW(char paramChar, StringBuilder paramStringBuilder) {
    String[] arrayOfString = Ztu.ZR();
    switch (paramChar) {
      case '\\':
        paramStringBuilder.append(a(-25678, -17019));
        if (arrayOfString != null);
        return;
      case '\t':
        paramStringBuilder.append(a(-25686, 17232));
        if (arrayOfString != null);
        return;
      case '\r':
        paramStringBuilder.append(a(-25702, 28742));
        if (arrayOfString != null);
        return;
      case '\n':
        paramStringBuilder.append(a(-25676, 27301));
        if (arrayOfString != null);
        return;
      case '\f':
        paramStringBuilder.append(a(-25669, -4077));
        if (arrayOfString != null);
        return;
      case '\b':
        paramStringBuilder.append(a(-25690, -17752));
        if (arrayOfString != null);
        return;
      case '"':
        paramStringBuilder.append(a(-25672, 5149));
        if (arrayOfString != null)
          break; 
        return;
    } 
    if (paramChar < ' ' || paramChar > '') {
      paramStringBuilder.append(String.format(a(-25668, 12248), new Object[] { Integer.valueOf(paramChar) }));
      if (arrayOfString != null) {
        paramStringBuilder.append(paramChar);
        return;
      } 
      return;
    } 
    paramStringBuilder.append(paramChar);
  }
  
  public static String ZS(String paramString) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull -> 15
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 17
    //   15: aload_0
    //   16: areturn
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore_2
    //   25: iconst_0
    //   26: istore_3
    //   27: iconst_0
    //   28: istore #4
    //   30: iload #4
    //   32: aload_0
    //   33: invokevirtual length : ()I
    //   36: if_icmpge -> 103
    //   39: aload_0
    //   40: iload #4
    //   42: invokevirtual charAt : (I)C
    //   45: istore #5
    //   47: iload_3
    //   48: ifeq -> 62
    //   51: aload_2
    //   52: bipush #43
    //   54: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_1
    //   59: ifnull -> 64
    //   62: iconst_1
    //   63: istore_3
    //   64: aload_2
    //   65: sipush #-25703
    //   68: sipush #-13544
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_2
    //   79: sipush #255
    //   82: iload #5
    //   84: iand
    //   85: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_2
    //   90: ldc ')'
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: iinc #4, 1
    //   99: aload_1
    //   100: ifnull -> 30
    //   103: aload_2
    //   104: invokevirtual toString : ()Ljava/lang/String;
    //   107: areturn
  }
  
  public static String ZX(String paramString) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull -> 15
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 17
    //   15: aload_0
    //   16: areturn
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore_2
    //   25: iconst_0
    //   26: istore_3
    //   27: iconst_0
    //   28: istore #4
    //   30: iload #4
    //   32: aload_0
    //   33: invokevirtual length : ()I
    //   36: if_icmpge -> 110
    //   39: aload_0
    //   40: iload #4
    //   42: invokevirtual charAt : (I)C
    //   45: istore #5
    //   47: iload_3
    //   48: ifeq -> 69
    //   51: aload_2
    //   52: sipush #-25694
    //   55: sipush #32062
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_1
    //   66: ifnull -> 71
    //   69: iconst_1
    //   70: istore_3
    //   71: aload_2
    //   72: sipush #-25693
    //   75: sipush #31787
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload_2
    //   86: sipush #255
    //   89: iload #5
    //   91: iand
    //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_2
    //   97: ldc ')'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: iinc #4, 1
    //   106: aload_1
    //   107: ifnull -> 30
    //   110: aload_2
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: areturn
  }
  
  public static String ZA(String paramString) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull -> 15
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 17
    //   15: aload_0
    //   16: areturn
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: sipush #-25667
    //   24: sipush #12229
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: astore_2
    //   34: iconst_0
    //   35: istore_3
    //   36: iconst_0
    //   37: istore #4
    //   39: iload #4
    //   41: aload_0
    //   42: invokevirtual length : ()I
    //   45: if_icmpge -> 112
    //   48: aload_0
    //   49: iload #4
    //   51: invokevirtual charAt : (I)C
    //   54: istore #5
    //   56: iload_3
    //   57: ifeq -> 71
    //   60: aload_2
    //   61: bipush #44
    //   63: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_1
    //   68: ifnull -> 73
    //   71: iconst_1
    //   72: istore_3
    //   73: aload_2
    //   74: sipush #-25665
    //   77: sipush #-14716
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_2
    //   88: sipush #255
    //   91: iload #5
    //   93: iand
    //   94: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_2
    //   99: bipush #41
    //   101: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: iinc #4, 1
    //   108: aload_1
    //   109: ifnull -> 39
    //   112: aload_2
    //   113: bipush #41
    //   115: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload_2
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: areturn
  }
  
  private static String Zq(String paramString, boolean paramBoolean, int[] paramArrayOfint, BiFunction<Character, Boolean, Optional<String>> paramBiFunction) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: ifnull -> 16
    //   9: aload_0
    //   10: invokevirtual isEmpty : ()Z
    //   13: ifeq -> 18
    //   16: aload_0
    //   17: areturn
    //   18: new java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore #5
    //   27: iconst_0
    //   28: istore #6
    //   30: iconst_2
    //   31: newarray int
    //   33: astore #7
    //   35: aload #7
    //   37: iconst_0
    //   38: aload_2
    //   39: iconst_0
    //   40: iaload
    //   41: iastore
    //   42: aload #7
    //   44: iconst_1
    //   45: aload_2
    //   46: iconst_1
    //   47: iaload
    //   48: iastore
    //   49: iconst_0
    //   50: istore #8
    //   52: iload #8
    //   54: aload_0
    //   55: invokevirtual length : ()I
    //   58: if_icmpge -> 145
    //   61: aload_2
    //   62: aload #7
    //   64: aload #5
    //   66: iload #8
    //   68: invokestatic Zf : ([I[ILjava/lang/StringBuilder;I)V
    //   71: aload_0
    //   72: iload #8
    //   74: invokevirtual charAt : (I)C
    //   77: istore #9
    //   79: aload_3
    //   80: iload #9
    //   82: invokestatic valueOf : (C)Ljava/lang/Character;
    //   85: iload_1
    //   86: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   89: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   94: checkcast java/util/Optional
    //   97: astore #10
    //   99: aload #10
    //   101: invokevirtual isPresent : ()Z
    //   104: ifeq -> 129
    //   107: aload #5
    //   109: aload #10
    //   111: invokevirtual get : ()Ljava/lang/Object;
    //   114: checkcast java/lang/String
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: iconst_1
    //   122: istore #6
    //   124: aload #4
    //   126: ifnull -> 137
    //   129: aload #5
    //   131: iload #9
    //   133: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: iinc #8, 1
    //   140: aload #4
    //   142: ifnull -> 52
    //   145: aload_2
    //   146: aload #7
    //   148: aload #5
    //   150: aload_0
    //   151: invokevirtual length : ()I
    //   154: invokestatic Zf : ([I[ILjava/lang/StringBuilder;I)V
    //   157: aload_2
    //   158: iconst_0
    //   159: aload #7
    //   161: iconst_0
    //   162: iaload
    //   163: iastore
    //   164: aload_2
    //   165: iconst_1
    //   166: aload #7
    //   168: iconst_1
    //   169: iaload
    //   170: iastore
    //   171: iload #6
    //   173: ifeq -> 182
    //   176: aload #5
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: areturn
    //   182: aload_0
    //   183: areturn
  }
  
  private static Optional<String> Zm(char paramChar, boolean paramBoolean) {
    switch (paramChar) {
      case '"':
        return Optional.of(a(-25687, 3072));
      case '\'':
        return Optional.of(a(-25680, 85));
      case '<':
        return Optional.of(a(-25684, 7245));
      case '>':
        return Optional.of(a(-25671, -25656));
      case '&':
        return Optional.of(a(-25673, -13113));
      case '\000':
      case '\n':
      case '\r':
        if (paramBoolean)
          return Zw(paramChar); 
        break;
    } 
    return Optional.empty();
  }
  
  private static Optional<String> Zw(char paramChar) {
    switch (paramChar) {
      case '\000':
      
      case '\r':
      
      case '\n':
      
    } 
    Zuh.Zv(false, Zqf.Zk, paramChar);
    return Optional.empty();
  }
  
  private static void Zf(int[] paramArrayOfint1, int[] paramArrayOfint2, StringBuilder paramStringBuilder, int paramInt) {
    if (paramInt == paramArrayOfint1[0])
      paramArrayOfint2[0] = paramStringBuilder.length(); 
    if (paramInt == paramArrayOfint1[1])
      paramArrayOfint2[1] = paramStringBuilder.length(); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #38
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ý5 {'6\\fn&¨«ìOìh^aÆ"ÙÙÊ~ÿ®Þ½\\n¹*aO\IB«sRâ#¡Ì­!ôøZôî6DØR5ª:s7\\t¼½ãzâO`vT~s¥¢o\\tm\\r*bºb#ßaÎ\ýyÖ¤AIó|qÃ:°7ð&SÖ­`ôx¥\\t?.h\\tíì#­+F£D\\n\\bÓù"+\\fSãF.¿bîÓz?ÊæÄ-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #99
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ôz`THÆkÃ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #29
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/Zzc.a : [Ljava/lang/String;
    //   131: bipush #38
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zzc.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #35
    //   214: goto -> 243
    //   217: bipush #14
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #68
    //   228: goto -> 243
    //   231: bipush #27
    //   233: goto -> 243
    //   236: bipush #32
    //   238: goto -> 243
    //   241: bipush #106
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9BBA) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'ç';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */