package com.fasterxml;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Zqp extends Zq2<OffsetTime> {
  private static final long serialVersionUID = 1L;
  
  public static final Zqp Zf;
  
  protected final Boolean Zq = null;
  
  private static final String[] h;
  
  private static final String[] i;
  
  protected Zqp() {
    this(DateTimeFormatter.ISO_OFFSET_TIME);
  }
  
  protected Zqp(DateTimeFormatter paramDateTimeFormatter) {
    super(OffsetTime.class, paramDateTimeFormatter);
  }
  
  protected Zqp(Zqp paramZqp, Boolean paramBoolean) {
    super(paramZqp, paramBoolean);
  }
  
  protected Zqp(Zqp paramZqp, Boolean paramBoolean1, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi, Boolean paramBoolean2) {
    super(paramZqp, paramBoolean1, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zqp Zd(DateTimeFormatter paramDateTimeFormatter) {
    return new Zqp(this, Boolean.valueOf(this.Zb), paramDateTimeFormatter, this.Zw, this.Zq);
  }
  
  protected Zqp Zn(Boolean paramBoolean) {
    return new Zqp(this, paramBoolean);
  }
  
  protected Zq2<?> ZI(Zyg paramZyg, Zo paramZo, Zgy paramZgy) {
    Zqp zqp = (Zqp)super.ZI(paramZyg, paramZo, paramZgy);
    Boolean bool = paramZgy.Zq(Zye.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
    try {
      if (!Objects.equals(bool, zqp.Zq))
        return new Zqp(zqp, Boolean.valueOf(zqp.Zb), zqp.Za, zqp.Zw, bool); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return zqp;
  }
  
  public OffsetTime ZE(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   4: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   7: ifeq -> 25
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: aload_1
    //   14: invokevirtual ZR : ()Ljava/lang/String;
    //   17: invokevirtual ZR : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/time/OffsetTime;
    //   20: areturn
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_1
    //   26: invokevirtual Zp : ()Z
    //   29: ifeq -> 53
    //   32: aload_0
    //   33: aload_1
    //   34: aload_2
    //   35: aload_2
    //   36: aload_1
    //   37: aload_0
    //   38: aload_0
    //   39: invokevirtual ZX : ()Ljava/lang/Class;
    //   42: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Class;)Ljava/lang/String;
    //   45: invokevirtual ZR : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/time/OffsetTime;
    //   48: areturn
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_1
    //   54: invokevirtual Zs : ()Z
    //   57: ifne -> 134
    //   60: aload_1
    //   61: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   64: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   67: ifeq -> 89
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload_1
    //   78: invokevirtual ZO : ()Ljava/lang/Object;
    //   81: checkcast java/time/OffsetTime
    //   84: areturn
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload_1
    //   90: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   93: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   96: ifeq -> 112
    //   99: aload_0
    //   100: aload_1
    //   101: aload_2
    //   102: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload_2
    //   113: aload_1
    //   114: aload_0
    //   115: invokevirtual ZX : ()Ljava/lang/Class;
    //   118: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   121: sipush #19391
    //   124: sipush #-20744
    //   127: invokestatic d : (II)Ljava/lang/String;
    //   130: invokevirtual Zq : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Class;Lcom/fasterxml/Zb/Zl;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   133: athrow
    //   134: aload_1
    //   135: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   138: astore_3
    //   139: aload_3
    //   140: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   143: if_acmpeq -> 264
    //   146: aload_3
    //   147: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   150: if_acmpne -> 166
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: aconst_null
    //   161: areturn
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload_3
    //   167: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   170: if_acmpeq -> 187
    //   173: aload_3
    //   174: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   177: if_acmpne -> 238
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_2
    //   188: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   191: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   194: ifeq -> 238
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: aload_0
    //   205: aload_1
    //   206: aload_2
    //   207: invokevirtual ZE : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/time/OffsetTime;
    //   210: astore #4
    //   212: aload_1
    //   213: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   216: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   219: if_acmpeq -> 235
    //   222: aload_0
    //   223: aload_1
    //   224: aload_2
    //   225: invokevirtual ZH : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   234: athrow
    //   235: aload #4
    //   237: areturn
    //   238: aload_2
    //   239: aload_0
    //   240: invokevirtual ZX : ()Ljava/lang/Class;
    //   243: sipush #19384
    //   246: sipush #-19781
    //   249: invokestatic d : (II)Ljava/lang/String;
    //   252: iconst_1
    //   253: anewarray java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload_3
    //   259: aastore
    //   260: invokevirtual ZF : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   263: pop
    //   264: aload_1
    //   265: invokevirtual Ze : ()I
    //   268: istore #4
    //   270: aload_1
    //   271: iconst_m1
    //   272: invokevirtual Zq : (I)I
    //   275: istore #5
    //   277: iload #5
    //   279: iconst_m1
    //   280: if_icmpne -> 339
    //   283: aload_1
    //   284: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zl;
    //   287: astore_3
    //   288: aload_3
    //   289: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   292: if_acmpne -> 301
    //   295: aconst_null
    //   296: areturn
    //   297: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   300: athrow
    //   301: aload_3
    //   302: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   305: if_acmpeq -> 333
    //   308: aload_0
    //   309: aload_2
    //   310: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   313: sipush #19390
    //   316: sipush #20602
    //   319: invokestatic d : (II)Ljava/lang/String;
    //   322: invokevirtual Zc : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zb/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   325: pop
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   332: athrow
    //   333: aload_1
    //   334: invokevirtual Ze : ()I
    //   337: istore #5
    //   339: iconst_0
    //   340: istore #6
    //   342: iconst_0
    //   343: istore #7
    //   345: aload_1
    //   346: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   349: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   352: if_acmpne -> 412
    //   355: aload_1
    //   356: invokevirtual Ze : ()I
    //   359: istore #7
    //   361: aload_1
    //   362: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   365: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   368: if_acmpne -> 412
    //   371: aload_1
    //   372: invokevirtual Ze : ()I
    //   375: istore #6
    //   377: iload #6
    //   379: sipush #1000
    //   382: if_icmpge -> 407
    //   385: aload_0
    //   386: aload_2
    //   387: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyg;)Z
    //   390: ifne -> 407
    //   393: goto -> 400
    //   396: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   399: athrow
    //   400: iload #6
    //   402: ldc 1000000
    //   404: imul
    //   405: istore #6
    //   407: aload_1
    //   408: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   411: pop
    //   412: aload_1
    //   413: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zl;
    //   416: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   419: if_acmpne -> 480
    //   422: iload #4
    //   424: iload #5
    //   426: iload #7
    //   428: iload #6
    //   430: aload_1
    //   431: invokevirtual ZR : ()Ljava/lang/String;
    //   434: invokestatic of : (Ljava/lang/String;)Ljava/time/ZoneOffset;
    //   437: invokestatic of : (IIIILjava/time/ZoneOffset;)Ljava/time/OffsetTime;
    //   440: astore #8
    //   442: aload_1
    //   443: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   446: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   449: if_acmpeq -> 477
    //   452: aload_0
    //   453: aload_2
    //   454: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   457: sipush #19389
    //   460: sipush #29991
    //   463: invokestatic d : (II)Ljava/lang/String;
    //   466: invokevirtual Zc : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zb/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   469: pop
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   476: athrow
    //   477: aload #8
    //   479: areturn
    //   480: aload_2
    //   481: aload_1
    //   482: aload_0
    //   483: invokevirtual ZX : ()Ljava/lang/Class;
    //   486: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   489: sipush #19388
    //   492: sipush #22818
    //   495: invokestatic d : (II)Ljava/lang/String;
    //   498: invokevirtual Zq : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Class;Lcom/fasterxml/Zb/Zl;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   501: athrow
    // Exception table:
    //   from	to	target	type
    //   0	21	21	java/io/IOException
    //   25	49	49	java/io/IOException
    //   53	70	73	java/io/IOException
    //   60	85	85	java/io/IOException
    //   89	105	108	java/io/IOException
    //   139	153	156	java/io/IOException
    //   146	162	162	java/io/IOException
    //   166	180	183	java/io/IOException
    //   173	197	200	java/io/IOException
    //   212	228	231	java/io/IOException
    //   288	297	297	java/io/IOException
    //   301	326	329	java/io/IOException
    //   377	393	396	java/io/IOException
    //   442	470	473	java/io/IOException
  }
  
  protected boolean Zg(Zyg paramZyg) {
    try {
    
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return (this.Zq != null) ? this.Zq.booleanValue() : paramZyg.Zg(Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
  }
  
  protected OffsetTime ZR(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    String str = paramString.trim();
    try {
      if (str.length() == 0)
        return ZN(paramZg, paramZyg, str); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      return OffsetTime.parse(str, this.Za);
    } catch (DateTimeException dateTimeException) {
      return (OffsetTime)Z_(paramZyg, dateTimeException, str);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '{ØØ1Ì`l¥!CÝQ¢a¡^¥U;<ø1PìTòE`³pI[X²4Ý\\b¨Ö_^°Ön1»ããJyã'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #49
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #8
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
    //   67: ldc '@tÈhès>ênÌÜë\\r\\rx=4O`ì=©c<CY!íÛ;ü¢u#÷ólËbsi1r9åÛu°'#éáËWý;VvÏBå Gíá` ù7Ä°'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #25
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #112
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
    //   128: putstatic com/fasterxml/Zqp.h : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zqp.i : [Ljava/lang/String;
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
    //   212: bipush #78
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #29
    //   224: goto -> 244
    //   227: bipush #71
    //   229: goto -> 244
    //   232: bipush #75
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #67
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: new com/fasterxml/Zqp
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic com/fasterxml/Zqp.Zf : Lcom/fasterxml/Zqp;
    //   310: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4BBC) & 0xFFFF;
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
      byte b1 = 63;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      i[i] = (new String(arrayOfChar)).intern();
    } 
    return i[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */