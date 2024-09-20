package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zqz<T extends Temporal> extends Zq2<T> {
  private static final long serialVersionUID = 1L;
  
  private static final boolean ZW;
  
  private static final boolean Zc;
  
  protected static final Pattern Zh;
  
  public static final Zqz<Instant> Zo;
  
  public static final Zqz<OffsetDateTime> ZP;
  
  public static final Zqz<ZonedDateTime> ZE;
  
  protected final Function<Zy0, T> ZY;
  
  protected final Function<Zgm, T> ZL;
  
  protected final Function<TemporalAccessor, T> ZV;
  
  protected final BiFunction<T, ZoneId, T> Zv;
  
  protected final boolean ZR;
  
  protected final Boolean Ze;
  
  protected final Boolean Zu;
  
  protected final boolean ZS;
  
  protected final boolean Zn;
  
  private static final String[] h;
  
  private static final String[] i;
  
  protected Zqz(Class<T> paramClass, DateTimeFormatter paramDateTimeFormatter, Function<TemporalAccessor, T> paramFunction, Function<Zy0, T> paramFunction1, Function<Zgm, T> paramFunction2, BiFunction<T, ZoneId, T> paramBiFunction, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    super(paramClass, paramDateTimeFormatter);
    this.ZV = paramFunction;
    this.ZY = paramFunction1;
    this.ZL = paramFunction2;
    this.Zv = (paramBiFunction == null) ? Zqz::lambda$new$7 : paramBiFunction;
    this.ZR = paramBoolean1;
    this.Ze = null;
    this.Zu = null;
    this.ZS = paramBoolean2;
    this.Zn = paramBoolean3;
  }
  
  protected Zqz(Zqz<T> paramZqz, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZqz.ZX(), paramDateTimeFormatter);
    this.ZV = paramZqz.ZV;
    this.ZY = paramZqz.ZY;
    String str = Zq8.Zw();
    try {
      this.ZL = paramZqz.ZL;
      this.Zv = paramZqz.Zv;
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      this.ZR = (this.Za == DateTimeFormatter.ISO_INSTANT);
      this.Ze = paramZqz.Ze;
      this.Zu = paramZqz.Zu;
      this.ZS = paramZqz.ZS;
      this.Zn = paramZqz.Zn;
      if (Zbqc.Zwu() == null)
        Zq8.ZZ("SnOCu"); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  protected Zqz(Zqz<T> paramZqz, DateTimeFormatter paramDateTimeFormatter, Boolean paramBoolean) {
    super(paramZqz.ZX(), paramDateTimeFormatter, paramBoolean);
    String str = Zq8.Zw();
    try {
      this.ZV = paramZqz.ZV;
      this.ZY = paramZqz.ZY;
      this.ZL = paramZqz.ZL;
      this.Zv = paramZqz.Zv;
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      this.ZR = (this.Za == DateTimeFormatter.ISO_INSTANT);
      this.Ze = paramZqz.Ze;
      this.Zu = paramZqz.Zu;
      this.ZS = paramZqz.ZS;
      this.Zn = paramZqz.Zn;
      if (str != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  protected Zqz(Zqz<T> paramZqz, Boolean paramBoolean1, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi, Boolean paramBoolean2, Boolean paramBoolean3) {
    super(paramZqz, paramBoolean1, paramDateTimeFormatter, paramZqi);
    this.ZV = paramZqz.ZV;
    this.ZY = paramZqz.ZY;
    this.ZL = paramZqz.ZL;
    this.Zv = paramZqz.Zv;
    this.ZR = paramZqz.ZR;
    this.Ze = paramBoolean2;
    this.Zu = paramBoolean3;
    this.ZS = paramZqz.ZS;
    this.Zn = paramZqz.Zn;
  }
  
  protected Zqz(Zqz<T> paramZqz, Zz<Zy_> paramZz) {
    super(paramZqz.ZX(), paramZqz.Za);
    this.ZV = paramZqz.ZV;
    this.ZY = paramZqz.ZY;
    this.ZL = paramZqz.ZL;
    this.Zv = paramZqz.Zv;
    this.ZR = paramZqz.ZR;
    this.Ze = paramZqz.Ze;
    this.Zu = paramZqz.Zu;
    this.ZS = paramZz.ZR(Zy_.NORMALIZE_DESERIALIZED_ZONE_ID);
    this.Zn = paramZz.ZR(Zy_.ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS);
  }
  
  protected Zqz<T> ZU(DateTimeFormatter paramDateTimeFormatter) {
    try {
      if (paramDateTimeFormatter == this.Za)
        return this; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zqz(this, paramDateTimeFormatter);
  }
  
  protected Zqz<T> Zv(Boolean paramBoolean) {
    return new Zqz(this, this.Za, paramBoolean);
  }
  
  public Zqz<T> ZG(Zz<Zy_> paramZz) {
    try {
      if (this.ZS == paramZz.ZR(Zy_.NORMALIZE_DESERIALIZED_ZONE_ID))
        try {
          if (this.Zn == paramZz.ZR(Zy_.ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS))
            return this; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zqz(this, paramZz);
  }
  
  protected Zq2<?> ZI(Zyg paramZyg, Zo paramZo, Zgy paramZgy) {
    Zqz<?> zqz = (Zqz)super.ZI(paramZyg, paramZo, paramZgy);
    Boolean bool1 = paramZgy.Zq(Zye.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
    Boolean bool2 = paramZgy.Zq(Zye.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
    try {
      if (Objects.equals(bool1, zqz.Ze))
        try {
          return Objects.equals(bool2, zqz.Zu) ? zqz : new Zqz((Zqz)zqz, Boolean.valueOf(zqz.Zb), zqz.Za, zqz.Zw, bool1, bool2);
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zqz((Zqz)zqz, Boolean.valueOf(zqz.Zb), zqz.Za, zqz.Zw, bool1, bool2);
  }
  
  public T ZO(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 8:
          return Zz(paramZyg, paramZg.ZT());
        case 7:
          return ZI(paramZyg, paramZg.ZE());
        case 6:
          return Zw(paramZg, paramZyg, paramZg.ZR());
        case 1:
          return Zw(paramZg, paramZyg, paramZyg.Zc(paramZg, (Zyo)this, ZX()));
        case 12:
          return (T)paramZg.ZO();
        case 3:
          return (T)ZF(paramZg, paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (T)Zx(paramZyg, paramZg, new Zl[] { Zl.VALUE_STRING, Zl.VALUE_NUMBER_INT, Zl.VALUE_NUMBER_FLOAT });
  }
  
  protected boolean Zu(Zyg paramZyg) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (this.Ze != null) ? this.Ze.booleanValue() : paramZyg.Zg(Zyp.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
  }
  
  protected boolean ZV(Zyg paramZyg) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (this.Zu != null) ? this.Zu.booleanValue() : paramZyg.Zg(Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
  }
  
  protected int ZR(String paramString) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: aload_1
    //   10: invokevirtual length : ()I
    //   13: istore #5
    //   15: iload #4
    //   17: iload #5
    //   19: if_icmpge -> 92
    //   22: aload_1
    //   23: iload #4
    //   25: invokevirtual charAt : (I)C
    //   28: istore #6
    //   30: iload #6
    //   32: bipush #48
    //   34: if_icmplt -> 51
    //   37: iload #6
    //   39: bipush #57
    //   41: if_icmple -> 85
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: iload #6
    //   53: bipush #46
    //   55: if_icmpne -> 79
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: iinc #3, 1
    //   68: aload_2
    //   69: ifnull -> 85
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: iconst_m1
    //   80: ireturn
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iinc #4, 1
    //   88: aload_2
    //   89: ifnull -> 15
    //   92: iload_3
    //   93: ireturn
    // Exception table:
    //   from	to	target	type
    //   30	44	47	java/lang/NumberFormatException
    //   37	58	61	java/lang/NumberFormatException
    //   51	72	75	java/lang/NumberFormatException
    //   65	81	81	java/lang/NumberFormatException
  }
  
  protected T Zw(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual trim : ()Ljava/lang/String;
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual length : ()I
    //   11: ifne -> 30
    //   14: aload_0
    //   15: aload_1
    //   16: aload_2
    //   17: aload #4
    //   19: invokevirtual ZN : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/lang/Object;
    //   22: checkcast java/time/temporal/Temporal
    //   25: areturn
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_0
    //   31: getfield Zn : Z
    //   34: ifne -> 88
    //   37: aload_0
    //   38: getfield Za : Ljava/time/format/DateTimeFormatter;
    //   41: getstatic java/time/format/DateTimeFormatter.ISO_INSTANT : Ljava/time/format/DateTimeFormatter;
    //   44: if_acmpeq -> 88
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_0
    //   55: getfield Za : Ljava/time/format/DateTimeFormatter;
    //   58: getstatic java/time/format/DateTimeFormatter.ISO_OFFSET_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   61: if_acmpeq -> 88
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: getfield Za : Ljava/time/format/DateTimeFormatter;
    //   75: getstatic java/time/format/DateTimeFormatter.ISO_ZONED_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   78: if_acmpne -> 156
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: aload_0
    //   89: aload #4
    //   91: invokevirtual ZR : (Ljava/lang/String;)I
    //   94: istore #5
    //   96: iload #5
    //   98: iflt -> 148
    //   101: iload #5
    //   103: ifne -> 121
    //   106: aload_0
    //   107: aload_2
    //   108: aload #4
    //   110: invokestatic ZO : (Ljava/lang/String;)J
    //   113: invokevirtual ZI : (Lcom/fasterxml/Zor/Zyg;J)Ljava/time/temporal/Temporal;
    //   116: areturn
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: iload #5
    //   123: iconst_1
    //   124: if_icmpne -> 143
    //   127: aload_0
    //   128: aload_2
    //   129: aload #4
    //   131: iconst_0
    //   132: invokestatic Zu : (Ljava/lang/String;Z)Ljava/math/BigDecimal;
    //   135: invokevirtual Zz : (Lcom/fasterxml/Zor/Zyg;Ljava/math/BigDecimal;)Ljava/time/temporal/Temporal;
    //   138: areturn
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: goto -> 148
    //   146: astore #6
    //   148: aload_0
    //   149: aload #4
    //   151: invokespecial ZO : (Ljava/lang/String;)Ljava/lang/String;
    //   154: astore #4
    //   156: aload_0
    //   157: getfield Za : Ljava/time/format/DateTimeFormatter;
    //   160: getstatic java/time/format/DateTimeFormatter.ISO_OFFSET_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   163: if_acmpeq -> 183
    //   166: aload_0
    //   167: getfield Za : Ljava/time/format/DateTimeFormatter;
    //   170: getstatic java/time/format/DateTimeFormatter.ISO_ZONED_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   173: if_acmpne -> 191
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_0
    //   184: aload #4
    //   186: invokespecial Z_ : (Ljava/lang/String;)Ljava/lang/String;
    //   189: astore #4
    //   191: aload_0
    //   192: getfield Za : Ljava/time/format/DateTimeFormatter;
    //   195: aload #4
    //   197: invokevirtual parse : (Ljava/lang/CharSequence;)Ljava/time/temporal/TemporalAccessor;
    //   200: astore #6
    //   202: aload_0
    //   203: getfield ZV : Ljava/util/function/Function;
    //   206: aload #6
    //   208: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   213: checkcast java/time/temporal/Temporal
    //   216: astore #5
    //   218: aload_0
    //   219: aload_2
    //   220: invokevirtual Zu : (Lcom/fasterxml/Zor/Zyg;)Z
    //   223: ifeq -> 246
    //   226: aload_0
    //   227: getfield Zv : Ljava/util/function/BiFunction;
    //   230: aload #5
    //   232: aload_0
    //   233: aload_2
    //   234: invokespecial ZM : (Lcom/fasterxml/Zor/Zyg;)Ljava/time/ZoneId;
    //   237: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   242: checkcast java/time/temporal/Temporal
    //   245: areturn
    //   246: goto -> 265
    //   249: astore #6
    //   251: aload_0
    //   252: aload_2
    //   253: aload #6
    //   255: aload #4
    //   257: invokevirtual Z_ : (Lcom/fasterxml/Zor/Zyg;Ljava/time/DateTimeException;Ljava/lang/String;)Ljava/lang/Object;
    //   260: checkcast java/time/temporal/Temporal
    //   263: astore #5
    //   265: aload #5
    //   267: areturn
    // Exception table:
    //   from	to	target	type
    //   6	26	26	java/lang/NumberFormatException
    //   30	47	50	java/lang/NumberFormatException
    //   37	64	67	java/lang/NumberFormatException
    //   54	81	84	java/lang/NumberFormatException
    //   101	116	146	java/lang/NumberFormatException
    //   101	117	117	java/time/DateTimeException
    //   121	138	146	java/lang/NumberFormatException
    //   121	139	139	java/time/DateTimeException
    //   156	176	179	java/lang/NumberFormatException
    //   191	245	249	java/time/DateTimeException
  }
  
  protected T ZI(Zyg paramZyg, long paramLong) {
    try {
      if (ZV(paramZyg))
        return this.ZL.apply(new Zgm(paramLong, 0, ZM(paramZyg))); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.ZY.apply(new Zy0(paramLong, ZM(paramZyg)));
  }
  
  protected T Zz(Zyg paramZyg, BigDecimal paramBigDecimal) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> apply : (Lcom/fasterxml/Zqz;Lcom/fasterxml/Zor/Zyg;)Ljava/util/function/BiFunction;
    //   8: invokestatic ZX : (Ljava/math/BigDecimal;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    //   11: checkcast com/fasterxml/Zgm
    //   14: astore_3
    //   15: aload_0
    //   16: getfield ZL : Ljava/util/function/Function;
    //   19: aload_3
    //   20: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast java/time/temporal/Temporal
    //   28: areturn
  }
  
  private ZoneId ZM(Zyg paramZyg) {
    try {
      if (this.ZC == Instant.class)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    ZoneId zoneId = paramZyg.Z_().toZoneId();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.ZS ? zoneId.normalized() : zoneId;
  }
  
  private String ZO(String paramString) {
    try {
      if (this.ZR)
        return ZI(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramString;
  }
  
  private static String ZI(String paramString) {
    int i = paramString.lastIndexOf('+');
    try {
      if (i < 0)
        return paramString; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int j = i + 1;
    int k = paramString.length() - j;
    try {
      switch (k) {
        case 2:
          try {
          
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return paramString.regionMatches(j, d(-7748, -27708), 0, k) ? (paramString.substring(0, i) + 'Z') : paramString;
        case 4:
          try {
          
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return paramString.regionMatches(j, d(-7747, -23143), 0, k) ? (paramString.substring(0, i) + 'Z') : paramString;
        case 5:
          try {
          
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return paramString.regionMatches(j, d(-7745, 8013), 0, k) ? (paramString.substring(0, i) + 'Z') : paramString;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramString;
  }
  
  private String Z_(String paramString) {
    Matcher matcher = Zh.matcher(paramString);
    if (matcher.find()) {
      StringBuilder stringBuilder = new StringBuilder(matcher.group(0));
      stringBuilder.insert(3, ":");
      return matcher.replaceFirst(stringBuilder.toString());
    } 
    return paramString;
  }
  
  private Zgm lambda$_fromDecimal$8(Zyg paramZyg, Long paramLong, Integer paramInteger) {
    return new Zgm(paramLong.longValue(), paramInteger.intValue(), ZM(paramZyg));
  }
  
  private static Temporal lambda$new$7(Temporal paramTemporal, ZoneId paramZoneId) {
    return paramTemporal;
  }
  
  private static ZonedDateTime lambda$static$6(Zgm paramZgm) {
    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(paramZgm.Zw, paramZgm.ZH), paramZgm.Zx);
  }
  
  private static ZonedDateTime lambda$static$5(Zy0 paramZy0) {
    return ZonedDateTime.ofInstant(Instant.ofEpochMilli(paramZy0.ZZ), paramZy0.Zg);
  }
  
  private static OffsetDateTime lambda$static$4(OffsetDateTime paramOffsetDateTime, ZoneId paramZoneId) {
    try {
      if (!paramOffsetDateTime.isEqual(OffsetDateTime.MIN)) {
        try {
          if (paramOffsetDateTime.isEqual(OffsetDateTime.MAX));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return paramOffsetDateTime.withOffsetSameInstant(paramZoneId.getRules().getOffset(paramOffsetDateTime.toLocalDateTime()));
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static OffsetDateTime lambda$static$3(Zgm paramZgm) {
    return OffsetDateTime.ofInstant(Instant.ofEpochSecond(paramZgm.Zw, paramZgm.ZH), paramZgm.Zx);
  }
  
  private static OffsetDateTime lambda$static$2(Zy0 paramZy0) {
    return OffsetDateTime.ofInstant(Instant.ofEpochMilli(paramZy0.ZZ), paramZy0.Zg);
  }
  
  private static Instant lambda$static$1(Zgm paramZgm) {
    return Instant.ofEpochSecond(paramZgm.Zw, paramZgm.ZH);
  }
  
  private static Instant lambda$static$0(Zy0 paramZy0) {
    return Instant.ofEpochMilli(paramZy0.ZZ);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'èÁ±x0î`Ô¥¶A,|5ò÷z`'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #16
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc '­âkw'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_4
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #13
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic com/fasterxml/Zqz.h : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic com/fasterxml/Zqz.i : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #29
    //   210: goto -> 240
    //   213: bipush #70
    //   215: goto -> 240
    //   218: bipush #33
    //   220: goto -> 240
    //   223: bipush #85
    //   225: goto -> 240
    //   228: bipush #91
    //   230: goto -> 240
    //   233: bipush #77
    //   235: goto -> 240
    //   238: bipush #109
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: sipush #-7746
    //   299: getstatic com/fasterxml/Zy_.NORMALIZE_DESERIALIZED_ZONE_ID : Lcom/fasterxml/Zy_;
    //   302: invokevirtual ZP : ()Z
    //   305: putstatic com/fasterxml/Zqz.ZW : Z
    //   308: sipush #-24961
    //   311: getstatic com/fasterxml/Zy_.ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS : Lcom/fasterxml/Zy_;
    //   314: invokevirtual ZP : ()Z
    //   317: putstatic com/fasterxml/Zqz.Zc : Z
    //   320: invokestatic d : (II)Ljava/lang/String;
    //   323: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   326: putstatic com/fasterxml/Zqz.Zh : Ljava/util/regex/Pattern;
    //   329: new com/fasterxml/Zqz
    //   332: dup
    //   333: ldc java/time/Instant
    //   335: getstatic java/time/format/DateTimeFormatter.ISO_INSTANT : Ljava/time/format/DateTimeFormatter;
    //   338: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   343: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   348: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   353: aconst_null
    //   354: iconst_1
    //   355: getstatic com/fasterxml/Zqz.ZW : Z
    //   358: getstatic com/fasterxml/Zqz.Zc : Z
    //   361: invokespecial <init> : (Ljava/lang/Class;Ljava/time/format/DateTimeFormatter;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;ZZZ)V
    //   364: putstatic com/fasterxml/Zqz.Zo : Lcom/fasterxml/Zqz;
    //   367: new com/fasterxml/Zqz
    //   370: dup
    //   371: ldc java/time/OffsetDateTime
    //   373: getstatic java/time/format/DateTimeFormatter.ISO_OFFSET_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   376: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   381: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   386: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   391: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   396: iconst_1
    //   397: getstatic com/fasterxml/Zqz.ZW : Z
    //   400: getstatic com/fasterxml/Zqz.Zc : Z
    //   403: invokespecial <init> : (Ljava/lang/Class;Ljava/time/format/DateTimeFormatter;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;ZZZ)V
    //   406: putstatic com/fasterxml/Zqz.ZP : Lcom/fasterxml/Zqz;
    //   409: new com/fasterxml/Zqz
    //   412: dup
    //   413: ldc java/time/ZonedDateTime
    //   415: getstatic java/time/format/DateTimeFormatter.ISO_ZONED_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   418: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   423: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   428: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   433: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   438: iconst_0
    //   439: getstatic com/fasterxml/Zqz.ZW : Z
    //   442: getstatic com/fasterxml/Zqz.Zc : Z
    //   445: invokespecial <init> : (Ljava/lang/Class;Ljava/time/format/DateTimeFormatter;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;ZZZ)V
    //   448: putstatic com/fasterxml/Zqz.ZE : Lcom/fasterxml/Zqz;
    //   451: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE1BF) & 0xFFFF;
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
      byte b1 = 85;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */