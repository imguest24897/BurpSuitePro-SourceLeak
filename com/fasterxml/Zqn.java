package com.fasterxml;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Zqn extends Zq2<LocalDateTime> {
  private static final long serialVersionUID = 1L;
  
  private static final DateTimeFormatter ZL;
  
  public static final Zqn Zg;
  
  protected final Boolean ZW = null;
  
  private static final String[] h;
  
  private static final String[] i;
  
  protected Zqn() {
    this(ZL);
  }
  
  public Zqn(DateTimeFormatter paramDateTimeFormatter) {
    super(LocalDateTime.class, paramDateTimeFormatter);
  }
  
  protected Zqn(Zqn paramZqn, Boolean paramBoolean) {
    super(paramZqn, paramBoolean);
  }
  
  protected Zqn(Zqn paramZqn, Boolean paramBoolean1, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi, Boolean paramBoolean2) {
    super(paramZqn, paramBoolean1, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zqn ZX(DateTimeFormatter paramDateTimeFormatter) {
    return new Zqn(this, Boolean.valueOf(this.Zb), paramDateTimeFormatter, this.Zw, this.ZW);
  }
  
  protected Zqn ZJ(Boolean paramBoolean) {
    return new Zqn(this, paramBoolean);
  }
  
  protected Zq2<?> ZI(Zyg paramZyg, Zo paramZo, Zgy paramZgy) {
    Zqn zqn = (Zqn)super.ZI(paramZyg, paramZo, paramZgy);
    Boolean bool = paramZgy.Zq(Zye.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
    try {
      if (!Objects.equals(bool, zqn.ZW))
        return new Zqn(zqn, Boolean.valueOf(zqn.Zb), zqn.Za, zqn.Zw, bool); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return zqn;
  }
  
  public LocalDateTime Zq(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: bipush #6
    //   7: invokevirtual Ze : (I)Z
    //   10: ifeq -> 28
    //   13: aload_0
    //   14: aload_1
    //   15: aload_2
    //   16: aload_1
    //   17: invokevirtual ZR : ()Ljava/lang/String;
    //   20: invokevirtual ZF : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/time/LocalDateTime;
    //   23: areturn
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_1
    //   29: invokevirtual Zp : ()Z
    //   32: ifeq -> 56
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: aload_2
    //   39: aload_1
    //   40: aload_0
    //   41: aload_0
    //   42: invokevirtual ZX : ()Ljava/lang/Class;
    //   45: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Class;)Ljava/lang/String;
    //   48: invokevirtual ZF : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/time/LocalDateTime;
    //   51: areturn
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_1
    //   57: invokevirtual Zs : ()Z
    //   60: ifeq -> 394
    //   63: aload_1
    //   64: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   67: astore #4
    //   69: aload #4
    //   71: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   74: if_acmpne -> 83
    //   77: aconst_null
    //   78: areturn
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload #4
    //   85: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   88: if_acmpeq -> 106
    //   91: aload #4
    //   93: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   96: if_acmpne -> 157
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload_2
    //   107: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   110: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   113: ifeq -> 157
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: aload_1
    //   125: aload_2
    //   126: invokevirtual Zq : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/time/LocalDateTime;
    //   129: astore #5
    //   131: aload_1
    //   132: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   135: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   138: if_acmpeq -> 154
    //   141: aload_0
    //   142: aload_1
    //   143: aload_2
    //   144: invokevirtual ZH : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload #5
    //   156: areturn
    //   157: aload #4
    //   159: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   162: if_acmpne -> 367
    //   165: aload_1
    //   166: invokevirtual Ze : ()I
    //   169: istore #6
    //   171: aload_1
    //   172: iconst_m1
    //   173: invokevirtual Zq : (I)I
    //   176: istore #7
    //   178: aload_1
    //   179: iconst_m1
    //   180: invokevirtual Zq : (I)I
    //   183: istore #8
    //   185: aload_1
    //   186: iconst_m1
    //   187: invokevirtual Zq : (I)I
    //   190: istore #9
    //   192: aload_1
    //   193: iconst_m1
    //   194: invokevirtual Zq : (I)I
    //   197: istore #10
    //   199: aload_1
    //   200: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   203: astore #4
    //   205: aload #4
    //   207: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   210: if_acmpne -> 232
    //   213: iload #6
    //   215: iload #7
    //   217: iload #8
    //   219: iload #9
    //   221: iload #10
    //   223: invokestatic of : (IIIII)Ljava/time/LocalDateTime;
    //   226: astore #5
    //   228: aload_3
    //   229: ifnull -> 364
    //   232: aload_1
    //   233: invokevirtual Ze : ()I
    //   236: istore #11
    //   238: aload_1
    //   239: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   242: astore #4
    //   244: aload #4
    //   246: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   249: if_acmpne -> 273
    //   252: iload #6
    //   254: iload #7
    //   256: iload #8
    //   258: iload #9
    //   260: iload #10
    //   262: iload #11
    //   264: invokestatic of : (IIIIII)Ljava/time/LocalDateTime;
    //   267: astore #5
    //   269: aload_3
    //   270: ifnull -> 364
    //   273: aload_1
    //   274: invokevirtual Ze : ()I
    //   277: istore #12
    //   279: iload #12
    //   281: sipush #1000
    //   284: if_icmpge -> 309
    //   287: aload_0
    //   288: aload_2
    //   289: invokevirtual ZZ : (Lcom/fasterxml/Zor/Zyg;)Z
    //   292: ifne -> 309
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   301: athrow
    //   302: iload #12
    //   304: ldc 1000000
    //   306: imul
    //   307: istore #12
    //   309: aload_1
    //   310: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   313: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   316: if_acmpeq -> 345
    //   319: aload_2
    //   320: aload_1
    //   321: aload_0
    //   322: invokevirtual ZX : ()Ljava/lang/Class;
    //   325: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   328: sipush #2003
    //   331: sipush #16904
    //   334: invokestatic d : (II)Ljava/lang/String;
    //   337: invokevirtual Zq : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Class;Lcom/fasterxml/Zb/Zl;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   340: athrow
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: iload #6
    //   347: iload #7
    //   349: iload #8
    //   351: iload #9
    //   353: iload #10
    //   355: iload #11
    //   357: iload #12
    //   359: invokestatic of : (IIIIIII)Ljava/time/LocalDateTime;
    //   362: astore #5
    //   364: aload #5
    //   366: areturn
    //   367: aload_2
    //   368: aload_0
    //   369: invokevirtual ZX : ()Ljava/lang/Class;
    //   372: sipush #2002
    //   375: sipush #8066
    //   378: invokestatic d : (II)Ljava/lang/String;
    //   381: iconst_1
    //   382: anewarray java/lang/Object
    //   385: dup
    //   386: iconst_0
    //   387: aload #4
    //   389: aastore
    //   390: invokevirtual ZF : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   393: pop
    //   394: aload_1
    //   395: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   398: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   401: ifeq -> 416
    //   404: aload_1
    //   405: invokevirtual ZO : ()Ljava/lang/Object;
    //   408: checkcast java/time/LocalDateTime
    //   411: areturn
    //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   415: athrow
    //   416: aload_1
    //   417: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   420: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   423: ifeq -> 439
    //   426: aload_0
    //   427: aload_1
    //   428: aload_2
    //   429: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   438: athrow
    //   439: aload_0
    //   440: aload_2
    //   441: aload_1
    //   442: sipush #2001
    //   445: sipush #-22746
    //   448: invokestatic d : (II)Ljava/lang/String;
    //   451: iconst_0
    //   452: anewarray java/lang/Object
    //   455: invokevirtual ZE : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zb/Zg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   458: checkcast java/time/LocalDateTime
    //   461: areturn
    // Exception table:
    //   from	to	target	type
    //   4	24	24	java/io/IOException
    //   28	52	52	java/io/IOException
    //   69	79	79	java/io/IOException
    //   83	99	102	java/io/IOException
    //   91	116	119	java/io/IOException
    //   131	147	150	java/io/IOException
    //   279	295	298	java/io/IOException
    //   309	341	341	java/io/IOException
    //   394	412	412	java/io/IOException
    //   416	432	435	java/io/IOException
  }
  
  protected boolean ZZ(Zyg paramZyg) {
    try {
    
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return (this.ZW != null) ? this.ZW.booleanValue() : paramZyg.Zg(Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
  }
  
  protected LocalDateTime ZF(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    String str = paramString.trim();
    try {
      if (str.length() == 0)
        return ZN(paramZg, paramZyg, str); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      try {
        if (this.Za == ZL)
          try {
            if (str.length() > 10)
              try {
                if (str.charAt(10) == 'T')
                  try {
                    if (str.endsWith("Z")) {
                      if (ZK())
                        return LocalDateTime.parse(str.substring(0, str.length() - 1), this.Za); 
                      Zk zk = Zq(paramZyg);
                      return (LocalDateTime)paramZyg.ZN(zk.Zf(), str, d(2000, -20555), new Object[0]);
                    } 
                  } catch (DateTimeException dateTimeException) {
                    throw a(null);
                  }  
              } catch (DateTimeException dateTimeException) {
                throw a(null);
              }  
          } catch (DateTimeException dateTimeException) {
            throw a(null);
          }  
      } catch (DateTimeException dateTimeException) {
        throw a(null);
      } 
      return LocalDateTime.parse(str, this.Za);
    } catch (DateTimeException dateTimeException) {
      return (LocalDateTime)Z_(paramZyg, dateTimeException, str);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'l¶X÷cªCÝÄ<Kí ÁÜ²b¨£'jÌ­i{P\\n]ª]$×k&ö»ëGaÔE-ÒòÏ¦¶¼»i»D>üV¤GF[· -|zÈACað\\fZÛÇñ+ãÉ/×æÉ~í6Y-o×Ê«é,T£í1+1à'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #25
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #21
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
    //   67: ldc 'ÝzÕÖaè»±\\rëX¯ {¬>´ø=¥iÝ}Ä2FÃJ+ø¡Më)g%+u«RË,ºo]H;­ðû:ÐuÎ<§Õ e·ó\\tÆiGÚÁ;bÅ=J'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #21
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #38
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic com/fasterxml/Zqn.h : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zqn.i : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #83
    //   214: goto -> 243
    //   217: iconst_3
    //   218: goto -> 243
    //   221: bipush #123
    //   223: goto -> 243
    //   226: bipush #9
    //   228: goto -> 243
    //   231: bipush #75
    //   233: goto -> 243
    //   236: bipush #76
    //   238: goto -> 243
    //   241: bipush #72
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: getstatic java/time/format/DateTimeFormatter.ISO_LOCAL_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   303: putstatic com/fasterxml/Zqn.ZL : Ljava/time/format/DateTimeFormatter;
    //   306: new com/fasterxml/Zqn
    //   309: dup
    //   310: invokespecial <init> : ()V
    //   313: putstatic com/fasterxml/Zqn.Zg : Lcom/fasterxml/Zqn;
    //   316: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7D1) & 0xFFFF;
    if (i[i] == null) {
      char[] arrayOfChar = h[i].toCharArray();
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
      char c = '';
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
      i[i] = (new String(arrayOfChar)).intern();
    } 
    return i[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */