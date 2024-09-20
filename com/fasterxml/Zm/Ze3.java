package com.fasterxml.Zm;

import com.fasterxml.Zyt;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class Ze3 extends DateFormat {
  protected static final Pattern ZI;
  
  protected static final Pattern ZR;
  
  protected static final String[] Z_;
  
  protected static final TimeZone Zp;
  
  protected static final Locale Zx;
  
  protected static final DateFormat ZM;
  
  public static final Ze3 ZW;
  
  protected static final Calendar ZA;
  
  protected transient TimeZone ZO;
  
  protected final Locale ZK;
  
  protected Boolean Za;
  
  private transient Calendar Zb;
  
  private transient DateFormat ZC;
  
  private boolean Zw = true;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze3() {
    this.ZK = Zx;
  }
  
  protected Ze3(TimeZone paramTimeZone, Locale paramLocale, Boolean paramBoolean, boolean paramBoolean1) {
    this.ZO = paramTimeZone;
    this.ZK = paramLocale;
    this.Za = paramBoolean;
    this.Zw = paramBoolean1;
  }
  
  public Ze3 ZS(TimeZone paramTimeZone) {
    if (paramTimeZone == null)
      paramTimeZone = Zp; 
    try {
      if (paramTimeZone != this.ZO)
        try {
          return !paramTimeZone.equals(this.ZO) ? new Ze3(paramTimeZone, this.ZK, this.Za, this.Zw) : this;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this;
  }
  
  public Ze3 Zo(Locale paramLocale) {
    try {
      if (paramLocale.equals(this.ZK))
        return this; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Ze3(this.ZO, paramLocale, this.Za, this.Zw);
  }
  
  public Ze3 Za(Boolean paramBoolean) {
    try {
      if (Zp(paramBoolean, this.Za))
        return this; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Ze3(this.ZO, this.ZK, paramBoolean, this.Zw);
  }
  
  public Ze3 ZK() {
    return new Ze3(this.ZO, this.ZK, this.Za, this.Zw);
  }
  
  public TimeZone getTimeZone() {
    return this.ZO;
  }
  
  public void setTimeZone(TimeZone paramTimeZone) {
    try {
      if (!paramTimeZone.equals(this.ZO)) {
        Zk();
        this.ZO = paramTimeZone;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void setLenient(boolean paramBoolean) {
    Boolean bool = Boolean.valueOf(paramBoolean);
    try {
      if (!Zp(bool, this.Za)) {
        this.Za = bool;
        Zk();
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public boolean isLenient() {
    try {
      if (this.Za != null) {
        try {
          if (this.Za.booleanValue());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public Date parse(String paramString) throws ParseException {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: aload_1
    //   4: invokevirtual trim : ()Ljava/lang/String;
    //   7: astore_1
    //   8: new java/text/ParsePosition
    //   11: dup
    //   12: iconst_0
    //   13: invokespecial <init> : (I)V
    //   16: astore_3
    //   17: istore_2
    //   18: aload_0
    //   19: aload_1
    //   20: aload_3
    //   21: invokevirtual ZT : (Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    //   24: astore #4
    //   26: aload #4
    //   28: ifnull -> 38
    //   31: aload #4
    //   33: areturn
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: new java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore #5
    //   47: getstatic com/fasterxml/Zm/Ze3.Z_ : [Ljava/lang/String;
    //   50: astore #6
    //   52: aload #6
    //   54: arraylength
    //   55: istore #7
    //   57: iconst_0
    //   58: istore #8
    //   60: iload #8
    //   62: iload #7
    //   64: if_icmpge -> 138
    //   67: aload #6
    //   69: iload #8
    //   71: aaload
    //   72: astore #9
    //   74: aload #5
    //   76: invokevirtual length : ()I
    //   79: ifle -> 108
    //   82: aload #5
    //   84: sipush #-13178
    //   87: sipush #19296
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: iload_2
    //   98: ifne -> 123
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload #5
    //   110: bipush #34
    //   112: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload #5
    //   125: aload #9
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: iinc #8, 1
    //   134: iload_2
    //   135: ifne -> 60
    //   138: aload #5
    //   140: bipush #34
    //   142: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: new java/text/ParseException
    //   149: dup
    //   150: sipush #-13159
    //   153: sipush #27211
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: iconst_2
    //   160: anewarray java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_1
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: aload #5
    //   171: invokevirtual toString : ()Ljava/lang/String;
    //   174: aastore
    //   175: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   178: aload_3
    //   179: invokevirtual getErrorIndex : ()I
    //   182: invokespecial <init> : (Ljava/lang/String;I)V
    //   185: athrow
    // Exception table:
    //   from	to	target	type
    //   26	34	34	java/text/ParseException
    //   74	101	104	java/text/ParseException
    //   82	116	119	java/text/ParseException
  }
  
  public Date parse(String paramString, ParsePosition paramParsePosition) {
    try {
      return ZT(paramString, paramParsePosition);
    } catch (ParseException parseException) {
      return null;
    } 
  }
  
  protected Date ZT(String paramString, ParsePosition paramParsePosition) throws ParseException {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual Zv : (Ljava/lang/String;)Z
    //   9: ifeq -> 23
    //   12: aload_0
    //   13: aload_1
    //   14: aload_2
    //   15: invokevirtual ZP : (Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    //   18: areturn
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_1
    //   24: invokevirtual length : ()I
    //   27: istore #4
    //   29: iinc #4, -1
    //   32: iload #4
    //   34: iflt -> 114
    //   37: aload_1
    //   38: iload #4
    //   40: invokevirtual charAt : (I)C
    //   43: istore #5
    //   45: iload #5
    //   47: bipush #48
    //   49: if_icmplt -> 66
    //   52: iload #5
    //   54: bipush #57
    //   56: if_icmple -> 103
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: iload #4
    //   68: ifgt -> 114
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iload #5
    //   80: bipush #45
    //   82: if_icmpeq -> 103
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: iload_3
    //   93: ifne -> 114
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: iload_3
    //   104: ifne -> 29
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: iload #4
    //   116: ifge -> 162
    //   119: aload_1
    //   120: iconst_0
    //   121: invokevirtual charAt : (I)C
    //   124: bipush #45
    //   126: if_icmpeq -> 151
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   135: athrow
    //   136: aload_1
    //   137: iconst_0
    //   138: invokestatic ZG : (Ljava/lang/String;Z)Z
    //   141: ifeq -> 162
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: aload_1
    //   153: aload_2
    //   154: invokespecial ZL : (Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    //   157: areturn
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: aload_0
    //   163: aload_1
    //   164: aload_2
    //   165: invokevirtual Zf : (Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    //   168: areturn
    // Exception table:
    //   from	to	target	type
    //   4	19	19	java/text/ParseException
    //   45	59	62	java/text/ParseException
    //   52	71	74	java/text/ParseException
    //   66	85	88	java/text/ParseException
    //   78	96	99	java/text/ParseException
    //   92	107	110	java/text/ParseException
    //   114	129	132	java/text/ParseException
    //   119	144	147	java/text/ParseException
    //   136	158	158	java/text/ParseException
  }
  
  public StringBuffer format(Date paramDate, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition) {
    TimeZone timeZone = this.ZO;
    if (timeZone == null)
      timeZone = Zp; 
    ZC(timeZone, this.ZK, paramDate, paramStringBuffer);
    return paramStringBuffer;
  }
  
  protected void ZC(TimeZone paramTimeZone, Locale paramLocale, Date paramDate, StringBuffer paramStringBuffer) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual ZX : (Ljava/util/TimeZone;)Ljava/util/Calendar;
    //   5: astore #6
    //   7: aload #6
    //   9: aload_3
    //   10: invokevirtual setTime : (Ljava/util/Date;)V
    //   13: invokestatic ZY : ()I
    //   16: aload #6
    //   18: iconst_1
    //   19: invokevirtual get : (I)I
    //   22: istore #7
    //   24: istore #5
    //   26: aload #6
    //   28: iconst_0
    //   29: invokevirtual get : (I)I
    //   32: ifne -> 69
    //   35: aload_0
    //   36: aload #4
    //   38: iload #7
    //   40: invokevirtual Zd : (Ljava/lang/StringBuffer;I)V
    //   43: iload #5
    //   45: ifeq -> 99
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: iconst_2
    //   56: anewarray burp/Zbqc
    //   59: invokestatic Zr : ([Lburp/Zbqc;)V
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: iload #7
    //   71: sipush #9999
    //   74: if_icmple -> 92
    //   77: aload #4
    //   79: bipush #43
    //   81: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   84: pop
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload #4
    //   94: iload #7
    //   96: invokestatic Zv : (Ljava/lang/StringBuffer;I)V
    //   99: aload #4
    //   101: bipush #45
    //   103: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   106: pop
    //   107: aload #4
    //   109: aload #6
    //   111: iconst_2
    //   112: invokevirtual get : (I)I
    //   115: iconst_1
    //   116: iadd
    //   117: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   120: aload #4
    //   122: bipush #45
    //   124: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   127: pop
    //   128: aload #4
    //   130: aload #6
    //   132: iconst_5
    //   133: invokevirtual get : (I)I
    //   136: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   139: aload #4
    //   141: bipush #84
    //   143: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   146: pop
    //   147: aload #4
    //   149: aload #6
    //   151: bipush #11
    //   153: invokevirtual get : (I)I
    //   156: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   159: aload #4
    //   161: bipush #58
    //   163: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   166: pop
    //   167: aload #4
    //   169: aload #6
    //   171: bipush #12
    //   173: invokevirtual get : (I)I
    //   176: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   179: aload #4
    //   181: bipush #58
    //   183: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   186: pop
    //   187: aload #4
    //   189: aload #6
    //   191: bipush #13
    //   193: invokevirtual get : (I)I
    //   196: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   199: aload #4
    //   201: bipush #46
    //   203: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   206: pop
    //   207: aload #4
    //   209: aload #6
    //   211: bipush #14
    //   213: invokevirtual get : (I)I
    //   216: invokestatic ZM : (Ljava/lang/StringBuffer;I)V
    //   219: aload_1
    //   220: aload #6
    //   222: invokevirtual getTimeInMillis : ()J
    //   225: invokevirtual getOffset : (J)I
    //   228: istore #8
    //   230: iload #8
    //   232: ifeq -> 324
    //   235: iload #8
    //   237: ldc 60000
    //   239: idiv
    //   240: bipush #60
    //   242: idiv
    //   243: invokestatic abs : (I)I
    //   246: istore #9
    //   248: iload #8
    //   250: ldc 60000
    //   252: idiv
    //   253: bipush #60
    //   255: irem
    //   256: invokestatic abs : (I)I
    //   259: istore #10
    //   261: aload #4
    //   263: iload #8
    //   265: ifge -> 277
    //   268: bipush #45
    //   270: goto -> 279
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: bipush #43
    //   279: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   282: pop
    //   283: aload #4
    //   285: iload #9
    //   287: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   290: aload_0
    //   291: getfield Zw : Z
    //   294: ifeq -> 312
    //   297: aload #4
    //   299: bipush #58
    //   301: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   304: pop
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   311: athrow
    //   312: aload #4
    //   314: iload #10
    //   316: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   319: iload #5
    //   321: ifeq -> 387
    //   324: aload_0
    //   325: getfield Zw : Z
    //   328: ifeq -> 365
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   337: athrow
    //   338: aload #4
    //   340: sipush #-13155
    //   343: sipush #-17103
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   352: pop
    //   353: iload #5
    //   355: ifeq -> 387
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   364: athrow
    //   365: aload #4
    //   367: sipush #-13164
    //   370: sipush #16301
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   379: pop
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   386: athrow
    //   387: return
    // Exception table:
    //   from	to	target	type
    //   26	48	51	java/lang/NumberFormatException
    //   35	62	65	java/lang/NumberFormatException
    //   69	85	88	java/lang/NumberFormatException
    //   261	273	273	java/lang/NumberFormatException
    //   279	305	308	java/lang/NumberFormatException
    //   312	331	334	java/lang/NumberFormatException
    //   324	358	361	java/lang/NumberFormatException
    //   338	380	383	java/lang/NumberFormatException
  }
  
  protected void Zd(StringBuffer paramStringBuffer, int paramInt) {
    try {
      if (paramInt == 1) {
        paramStringBuffer.append(a(-13153, 11147));
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int i = paramInt - 1;
    paramStringBuffer.append('-');
    Zv(paramStringBuffer, i);
  }
  
  private static void Zn(StringBuffer paramStringBuffer, int paramInt) {
    // Byte code:
    //   0: invokestatic ZY : ()I
    //   3: iload_1
    //   4: bipush #10
    //   6: idiv
    //   7: istore_3
    //   8: istore_2
    //   9: iload_3
    //   10: ifne -> 31
    //   13: aload_0
    //   14: bipush #48
    //   16: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   19: pop
    //   20: iload_2
    //   21: ifeq -> 48
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: bipush #48
    //   34: iload_3
    //   35: iadd
    //   36: i2c
    //   37: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   40: pop
    //   41: iload_1
    //   42: bipush #10
    //   44: iload_3
    //   45: imul
    //   46: isub
    //   47: istore_1
    //   48: aload_0
    //   49: bipush #48
    //   51: iload_1
    //   52: iadd
    //   53: i2c
    //   54: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   57: pop
    //   58: return
    // Exception table:
    //   from	to	target	type
    //   9	24	27	java/lang/NumberFormatException
  }
  
  private static void ZM(StringBuffer paramStringBuffer, int paramInt) {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: iload_1
    //   4: bipush #100
    //   6: idiv
    //   7: istore_3
    //   8: istore_2
    //   9: iload_3
    //   10: ifne -> 31
    //   13: aload_0
    //   14: bipush #48
    //   16: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   19: pop
    //   20: iload_2
    //   21: ifne -> 48
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: bipush #48
    //   34: iload_3
    //   35: iadd
    //   36: i2c
    //   37: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   40: pop
    //   41: iload_1
    //   42: iload_3
    //   43: bipush #100
    //   45: imul
    //   46: isub
    //   47: istore_1
    //   48: aload_0
    //   49: iload_1
    //   50: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   53: return
    // Exception table:
    //   from	to	target	type
    //   9	24	27	java/lang/NumberFormatException
  }
  
  private static void Zv(StringBuffer paramStringBuffer, int paramInt) {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: iload_1
    //   4: bipush #100
    //   6: idiv
    //   7: istore_3
    //   8: istore_2
    //   9: iload_3
    //   10: ifne -> 36
    //   13: aload_0
    //   14: bipush #48
    //   16: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   19: bipush #48
    //   21: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   24: pop
    //   25: iload_2
    //   26: ifne -> 85
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: iload_3
    //   37: bipush #99
    //   39: if_icmple -> 66
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: iload_3
    //   51: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   54: pop
    //   55: iload_2
    //   56: ifne -> 78
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_0
    //   67: iload_3
    //   68: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iload_1
    //   79: bipush #100
    //   81: iload_3
    //   82: imul
    //   83: isub
    //   84: istore_1
    //   85: aload_0
    //   86: iload_1
    //   87: invokestatic Zn : (Ljava/lang/StringBuffer;I)V
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   9	29	32	java/lang/NumberFormatException
    //   13	42	45	java/lang/NumberFormatException
    //   36	59	62	java/lang/NumberFormatException
    //   49	71	74	java/lang/NumberFormatException
  }
  
  public String toString() {
    return String.format(a(-13156, 18399), new Object[] { getClass().getName(), this.ZO, this.ZK, this.Za });
  }
  
  public String ZI() {
    StringBuilder stringBuilder = new StringBuilder(100);
    try {
      stringBuilder.append(a(-13184, -6509)).append(a(-13160, -18522)).append(a(-13172, 24440)).append(a(-13181, -26511)).append(a(-13179, 8180));
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    stringBuilder.append(Boolean.FALSE.equals(this.Za) ? a(-13157, 2501) : a(-13163, -4845)).append(a(-13154, -7191));
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (paramObject == this);
  }
  
  public int hashCode() {
    return System.identityHashCode(this);
  }
  
  protected boolean Zv(String paramString) {
    try {
      if (paramString.length() >= 7)
        try {
          if (Character.isDigit(paramString.charAt(0)))
            try {
              if (Character.isDigit(paramString.charAt(3)))
                try {
                  if (paramString.charAt(4) == '-')
                    try {
                      if (Character.isDigit(paramString.charAt(5)))
                        return true; 
                    } catch (NumberFormatException numberFormatException) {
                      throw a(null);
                    }  
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                }  
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private Date ZL(String paramString, ParsePosition paramParsePosition) throws ParseException {
    long l;
    try {
      l = Zyt.ZO(paramString);
    } catch (NumberFormatException numberFormatException) {
      throw new ParseException(String.format(a(-13170, 27714), new Object[] { paramString }), paramParsePosition.getErrorIndex());
    } 
    return new Date(l);
  }
  
  protected Date ZP(String paramString, ParsePosition paramParsePosition) throws ParseException {
    try {
      return Zq(paramString, paramParsePosition);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new ParseException(String.format(a(-13175, 11691), new Object[] { paramString, illegalArgumentException.getMessage() }), paramParsePosition.getErrorIndex());
    } 
  }
  
  protected Date Zq(String paramString, ParsePosition paramParsePosition) throws IllegalArgumentException, ParseException {
    // Byte code:
    //   0: invokestatic ZY : ()I
    //   3: aload_1
    //   4: invokevirtual length : ()I
    //   7: istore #4
    //   9: istore_3
    //   10: getstatic com/fasterxml/Zm/Ze3.Zp : Ljava/util/TimeZone;
    //   13: astore #5
    //   15: aload_0
    //   16: getfield ZO : Ljava/util/TimeZone;
    //   19: ifnull -> 48
    //   22: bipush #90
    //   24: aload_1
    //   25: iload #4
    //   27: iconst_1
    //   28: isub
    //   29: invokevirtual charAt : (I)C
    //   32: if_icmpeq -> 48
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: getfield ZO : Ljava/util/TimeZone;
    //   46: astore #5
    //   48: aload_0
    //   49: aload #5
    //   51: invokevirtual ZX : (Ljava/util/TimeZone;)Ljava/util/Calendar;
    //   54: astore #6
    //   56: aload #6
    //   58: invokevirtual clear : ()V
    //   61: iload #4
    //   63: bipush #10
    //   65: if_icmpgt -> 152
    //   68: getstatic com/fasterxml/Zm/Ze3.ZI : Ljava/util/regex/Pattern;
    //   71: aload_1
    //   72: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   75: astore #8
    //   77: aload #8
    //   79: invokevirtual matches : ()Z
    //   82: ifeq -> 137
    //   85: aload_1
    //   86: iconst_0
    //   87: invokestatic ZR : (Ljava/lang/String;I)I
    //   90: istore #9
    //   92: aload_1
    //   93: iconst_5
    //   94: invokestatic Z_ : (Ljava/lang/String;I)I
    //   97: iconst_1
    //   98: isub
    //   99: istore #10
    //   101: aload_1
    //   102: bipush #8
    //   104: invokestatic Z_ : (Ljava/lang/String;I)I
    //   107: istore #11
    //   109: aload #6
    //   111: iload #9
    //   113: iload #10
    //   115: iload #11
    //   117: iconst_0
    //   118: iconst_0
    //   119: iconst_0
    //   120: invokevirtual set : (IIIIII)V
    //   123: aload #6
    //   125: bipush #14
    //   127: iconst_0
    //   128: invokevirtual set : (II)V
    //   131: aload #6
    //   133: invokevirtual getTime : ()Ljava/util/Date;
    //   136: areturn
    //   137: sipush #-13174
    //   140: sipush #-11601
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: astore #7
    //   148: iload_3
    //   149: ifeq -> 610
    //   152: getstatic com/fasterxml/Zm/Ze3.ZR : Ljava/util/regex/Pattern;
    //   155: aload_1
    //   156: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   159: astore #8
    //   161: aload #8
    //   163: invokevirtual matches : ()Z
    //   166: ifeq -> 599
    //   169: aload #8
    //   171: iconst_2
    //   172: invokevirtual start : (I)I
    //   175: istore #9
    //   177: aload #8
    //   179: iconst_2
    //   180: invokevirtual end : (I)I
    //   183: istore #10
    //   185: iload #10
    //   187: iload #9
    //   189: isub
    //   190: istore #11
    //   192: iload #11
    //   194: iconst_1
    //   195: if_icmple -> 282
    //   198: aload_1
    //   199: iload #9
    //   201: iconst_1
    //   202: iadd
    //   203: invokestatic Z_ : (Ljava/lang/String;I)I
    //   206: sipush #3600
    //   209: imul
    //   210: istore #12
    //   212: iload #11
    //   214: iconst_5
    //   215: if_icmplt -> 234
    //   218: iload #12
    //   220: aload_1
    //   221: iload #10
    //   223: iconst_2
    //   224: isub
    //   225: invokestatic Z_ : (Ljava/lang/String;I)I
    //   228: bipush #60
    //   230: imul
    //   231: iadd
    //   232: istore #12
    //   234: aload_1
    //   235: iload #9
    //   237: invokevirtual charAt : (I)C
    //   240: bipush #45
    //   242: if_icmpne -> 257
    //   245: iload #12
    //   247: sipush #-1000
    //   250: imul
    //   251: istore #12
    //   253: iload_3
    //   254: ifeq -> 265
    //   257: iload #12
    //   259: sipush #1000
    //   262: imul
    //   263: istore #12
    //   265: aload #6
    //   267: bipush #15
    //   269: iload #12
    //   271: invokevirtual set : (II)V
    //   274: aload #6
    //   276: bipush #16
    //   278: iconst_0
    //   279: invokevirtual set : (II)V
    //   282: aload_1
    //   283: iconst_0
    //   284: invokestatic ZR : (Ljava/lang/String;I)I
    //   287: istore #12
    //   289: aload_1
    //   290: iconst_5
    //   291: invokestatic Z_ : (Ljava/lang/String;I)I
    //   294: iconst_1
    //   295: isub
    //   296: istore #13
    //   298: aload_1
    //   299: bipush #8
    //   301: invokestatic Z_ : (Ljava/lang/String;I)I
    //   304: istore #14
    //   306: aload_1
    //   307: bipush #11
    //   309: invokestatic Z_ : (Ljava/lang/String;I)I
    //   312: istore #15
    //   314: aload_1
    //   315: bipush #14
    //   317: invokestatic Z_ : (Ljava/lang/String;I)I
    //   320: istore #16
    //   322: iload #4
    //   324: bipush #16
    //   326: if_icmple -> 359
    //   329: aload_1
    //   330: bipush #16
    //   332: invokevirtual charAt : (I)C
    //   335: bipush #58
    //   337: if_icmpne -> 359
    //   340: goto -> 347
    //   343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   346: athrow
    //   347: aload_1
    //   348: bipush #17
    //   350: invokestatic Z_ : (Ljava/lang/String;I)I
    //   353: istore #17
    //   355: iload_3
    //   356: ifeq -> 362
    //   359: iconst_0
    //   360: istore #17
    //   362: aload #6
    //   364: iload #12
    //   366: iload #13
    //   368: iload #14
    //   370: iload #15
    //   372: iload #16
    //   374: iload #17
    //   376: invokevirtual set : (IIIIII)V
    //   379: aload #8
    //   381: iconst_1
    //   382: invokevirtual start : (I)I
    //   385: iconst_1
    //   386: iadd
    //   387: istore #9
    //   389: aload #8
    //   391: iconst_1
    //   392: invokevirtual end : (I)I
    //   395: istore #10
    //   397: iconst_0
    //   398: istore #18
    //   400: iload #9
    //   402: iload #10
    //   404: if_icmplt -> 426
    //   407: aload #6
    //   409: bipush #14
    //   411: iconst_0
    //   412: invokevirtual set : (II)V
    //   415: iload_3
    //   416: ifeq -> 593
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   425: athrow
    //   426: iconst_0
    //   427: istore #18
    //   429: iload #10
    //   431: iload #9
    //   433: isub
    //   434: istore #19
    //   436: iload #19
    //   438: tableswitch default -> 468, 0 -> 584, 1 -> 564, 2 -> 545, 3 -> 529
    //   468: iload #19
    //   470: bipush #9
    //   472: if_icmple -> 529
    //   475: goto -> 482
    //   478: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   481: athrow
    //   482: new java/text/ParseException
    //   485: dup
    //   486: sipush #-13183
    //   489: sipush #10782
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: iconst_2
    //   496: anewarray java/lang/Object
    //   499: dup
    //   500: iconst_0
    //   501: aload_1
    //   502: aastore
    //   503: dup
    //   504: iconst_1
    //   505: aload #8
    //   507: iconst_1
    //   508: invokevirtual group : (I)Ljava/lang/String;
    //   511: iconst_1
    //   512: invokevirtual substring : (I)Ljava/lang/String;
    //   515: aastore
    //   516: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   519: iload #9
    //   521: invokespecial <init> : (Ljava/lang/String;I)V
    //   524: athrow
    //   525: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   528: athrow
    //   529: iload #18
    //   531: aload_1
    //   532: iload #9
    //   534: iconst_2
    //   535: iadd
    //   536: invokevirtual charAt : (I)C
    //   539: bipush #48
    //   541: isub
    //   542: iadd
    //   543: istore #18
    //   545: iload #18
    //   547: bipush #10
    //   549: aload_1
    //   550: iload #9
    //   552: iconst_1
    //   553: iadd
    //   554: invokevirtual charAt : (I)C
    //   557: bipush #48
    //   559: isub
    //   560: imul
    //   561: iadd
    //   562: istore #18
    //   564: iload #18
    //   566: bipush #100
    //   568: aload_1
    //   569: iload #9
    //   571: invokevirtual charAt : (I)C
    //   574: bipush #48
    //   576: isub
    //   577: imul
    //   578: iadd
    //   579: istore #18
    //   581: goto -> 584
    //   584: aload #6
    //   586: bipush #14
    //   588: iload #18
    //   590: invokevirtual set : (II)V
    //   593: aload #6
    //   595: invokevirtual getTime : ()Ljava/util/Date;
    //   598: areturn
    //   599: sipush #-13182
    //   602: sipush #-22353
    //   605: invokestatic a : (II)Ljava/lang/String;
    //   608: astore #7
    //   610: new java/text/ParseException
    //   613: dup
    //   614: sipush #-13158
    //   617: sipush #-15668
    //   620: invokestatic a : (II)Ljava/lang/String;
    //   623: iconst_3
    //   624: anewarray java/lang/Object
    //   627: dup
    //   628: iconst_0
    //   629: aload_1
    //   630: aastore
    //   631: dup
    //   632: iconst_1
    //   633: aload #7
    //   635: aastore
    //   636: dup
    //   637: iconst_2
    //   638: aload_0
    //   639: getfield Za : Ljava/lang/Boolean;
    //   642: aastore
    //   643: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   646: iconst_0
    //   647: invokespecial <init> : (Ljava/lang/String;I)V
    //   650: athrow
    // Exception table:
    //   from	to	target	type
    //   15	35	38	java/lang/IllegalArgumentException
    //   322	340	343	java/lang/IllegalArgumentException
    //   400	419	422	java/lang/IllegalArgumentException
    //   436	475	478	java/lang/IllegalArgumentException
    //   468	525	525	java/lang/IllegalArgumentException
  }
  
  private static int ZR(String paramString, int paramInt) {
    return 1000 * (paramString.charAt(paramInt) - 48) + 100 * (paramString.charAt(paramInt + 1) - 48) + 10 * (paramString.charAt(paramInt + 2) - 48) + paramString.charAt(paramInt + 3) - 48;
  }
  
  private static int Z_(String paramString, int paramInt) {
    return 10 * (paramString.charAt(paramInt) - 48) + paramString.charAt(paramInt + 1) - 48;
  }
  
  protected Date Zf(String paramString, ParsePosition paramParsePosition) {
    try {
      if (this.ZC == null)
        this.ZC = Zh(ZM, a(-13177, -32010), this.ZO, this.ZK, this.Za); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.ZC.parse(paramString, paramParsePosition);
  }
  
  private static final DateFormat Zh(DateFormat paramDateFormat, String paramString, TimeZone paramTimeZone, Locale paramLocale, Boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZY : ()I
    //   3: istore #5
    //   5: aload_3
    //   6: getstatic com/fasterxml/Zm/Ze3.Zx : Ljava/util/Locale;
    //   9: invokevirtual equals : (Ljava/lang/Object;)Z
    //   12: ifne -> 49
    //   15: new java/text/SimpleDateFormat
    //   18: dup
    //   19: aload_1
    //   20: aload_3
    //   21: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   24: astore_0
    //   25: aload_0
    //   26: aload_2
    //   27: ifnonnull -> 40
    //   30: getstatic com/fasterxml/Zm/Ze3.Zp : Ljava/util/TimeZone;
    //   33: goto -> 41
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_2
    //   41: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   44: iload #5
    //   46: ifeq -> 73
    //   49: aload_0
    //   50: invokevirtual clone : ()Ljava/lang/Object;
    //   53: checkcast java/text/DateFormat
    //   56: astore_0
    //   57: aload_2
    //   58: ifnull -> 73
    //   61: aload_0
    //   62: aload_2
    //   63: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload #4
    //   75: ifnull -> 94
    //   78: aload_0
    //   79: aload #4
    //   81: invokevirtual booleanValue : ()Z
    //   84: invokevirtual setLenient : (Z)V
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: areturn
    // Exception table:
    //   from	to	target	type
    //   25	36	36	java/lang/NumberFormatException
    //   57	66	69	java/lang/NumberFormatException
    //   73	87	90	java/lang/NumberFormatException
  }
  
  protected void Zk() {
    this.ZC = null;
  }
  
  protected Calendar ZX(TimeZone paramTimeZone) {
    Calendar calendar = this.Zb;
    if (calendar == null)
      this.Zb = calendar = (Calendar)ZA.clone(); 
    try {
      if (!calendar.getTimeZone().equals(paramTimeZone))
        calendar.setTimeZone(paramTimeZone); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    calendar.setLenient(isLenient());
    return calendar;
  }
  
  protected static <T> boolean Zp(T paramT1, T paramT2) {
    try {
      if (paramT1 == paramT2)
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramT1 != null)
        try {
          if (paramT1.equals(paramT2));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ãl?ÌAJ#ÆVÒ¯©y  6£0øP,ß£D²Ê¯Ïèª!oY¡âÍ©ì}àÀ©!r!ZB!ö »ãµ*"RçU×¸)ª±_SæSð`{ÿãêóotñ}äºehÞþ¢ÊÛkÉùz [?yA\\bÕv§Tð{ÊïÃêIi;7BÛ¶í$â+Ú}ü³#ë&ÀPH¬=Vj`÷¥®(¶´ÇO®üCÅ8u+ÃÝ§è\\nÌúîáAý_¹§\\nò¢Ñå âsZ"ÏEví¿|\`ooØÌP­ 8Èí *#kx¥¼O££C­rìß4-<)?6w£.0\\n\\f-ø~>Á=ÂQ=RB÷Ü®=ád,?Ëc(ÒKmÈK{Ç©w\\b8ÐÈû¦¹ßEc xåïBª\\r;ü¾ÓÃ´£¡'4_%ä´Ó\\nî~yþ9Ì¤%á8ýp¹Bf¬¯À-0\\f¿IïÝÄÎÀÑG¯¢±"-¨ü6FFü4·(Á§Ø®ê6ëÔ»Ë&¢Ð§$\\fRÍ´= cË?j\(^ß¯cÎ%«ÉLBNg÷rS÷M¢QÚ ÞÚIãV|Ü±Ï¹HCÅnôzðÝ+FéFüù÷Z\\nrF Tå7(¶£â·ðVpJõS6.uC¿uVHG¸å0qÄBaÅ\\f/8ºáÕ!æ\\b|²\ròzbP\\nÝ.ê\\f*úóWÁ¬Ý(/UC«Õî tû÷ÖM\¸¶4B?_x¬[ÝeþjýWÁÛô¥Äænß ÷uxô¡Ù)°ý<ß29¸vÞ¼PJ»}õÌ@H ftgÇ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #114
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '[;f¬èi¶&îè'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #44
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic com/fasterxml/Zm/Ze3.a : [Ljava/lang/String;
    //   130: bipush #26
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zm/Ze3.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #101
    //   214: goto -> 244
    //   217: bipush #52
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #98
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #116
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: sipush #-13171
    //   303: sipush #4043
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic com/fasterxml/Zm/Ze3.ZI : Ljava/util/regex/Pattern;
    //   315: aconst_null
    //   316: astore #7
    //   318: sipush #-13169
    //   321: sipush #-10998
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   330: astore #7
    //   332: goto -> 347
    //   335: astore #8
    //   337: new java/lang/RuntimeException
    //   340: dup
    //   341: aload #8
    //   343: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   346: athrow
    //   347: aload #7
    //   349: putstatic com/fasterxml/Zm/Ze3.ZR : Ljava/util/regex/Pattern;
    //   352: iconst_4
    //   353: anewarray java/lang/String
    //   356: dup
    //   357: iconst_0
    //   358: sipush #-13160
    //   361: sipush #-18522
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: aastore
    //   368: dup
    //   369: iconst_1
    //   370: sipush #-13180
    //   373: sipush #-19237
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: aastore
    //   380: dup
    //   381: iconst_2
    //   382: sipush #-13181
    //   385: sipush #-26511
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: aastore
    //   392: dup
    //   393: iconst_3
    //   394: sipush #-13173
    //   397: sipush #5653
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: aastore
    //   404: putstatic com/fasterxml/Zm/Ze3.Z_ : [Ljava/lang/String;
    //   407: sipush #-13176
    //   410: sipush #-29475
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
    //   419: putstatic com/fasterxml/Zm/Ze3.Zp : Ljava/util/TimeZone;
    //   422: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   425: putstatic com/fasterxml/Zm/Ze3.Zx : Ljava/util/Locale;
    //   428: new java/text/SimpleDateFormat
    //   431: dup
    //   432: sipush #-13181
    //   435: sipush #-26511
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: getstatic com/fasterxml/Zm/Ze3.Zx : Ljava/util/Locale;
    //   444: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   447: putstatic com/fasterxml/Zm/Ze3.ZM : Ljava/text/DateFormat;
    //   450: getstatic com/fasterxml/Zm/Ze3.ZM : Ljava/text/DateFormat;
    //   453: getstatic com/fasterxml/Zm/Ze3.Zp : Ljava/util/TimeZone;
    //   456: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   459: new com/fasterxml/Zm/Ze3
    //   462: dup
    //   463: invokespecial <init> : ()V
    //   466: putstatic com/fasterxml/Zm/Ze3.ZW : Lcom/fasterxml/Zm/Ze3;
    //   469: new java/util/GregorianCalendar
    //   472: dup
    //   473: getstatic com/fasterxml/Zm/Ze3.Zp : Ljava/util/TimeZone;
    //   476: getstatic com/fasterxml/Zm/Ze3.Zx : Ljava/util/Locale;
    //   479: invokespecial <init> : (Ljava/util/TimeZone;Ljava/util/Locale;)V
    //   482: putstatic com/fasterxml/Zm/Ze3.ZA : Ljava/util/Calendar;
    //   485: return
    // Exception table:
    //   from	to	target	type
    //   318	332	335	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCC8C) & 0xFFFF;
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
      char c = '³';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Ze3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */