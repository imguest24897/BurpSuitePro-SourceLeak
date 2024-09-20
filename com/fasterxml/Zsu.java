package com.fasterxml;

import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.time.format.DateTimeFormatter;

abstract class Zsu<T> extends Zsw<T> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected final Boolean Zt = null;
  
  protected final Boolean ZL = null;
  
  protected final DateTimeFormatter ZE;
  
  protected final Zqi ZQ;
  
  protected Zsu(Class<T> paramClass) {
    this(paramClass, null);
  }
  
  protected Zsu(Class<T> paramClass, DateTimeFormatter paramDateTimeFormatter) {
    super(paramClass);
    this.ZQ = null;
    this.ZE = paramDateTimeFormatter;
  }
  
  protected Zsu(Zsu<?> paramZsu, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    this(paramZsu, paramBoolean, null, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zsu(Zsu<?> paramZsu, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZsu.Zz());
    this.ZE = paramDateTimeFormatter;
    this.ZQ = paramZqi;
  }
  
  protected abstract Zsu<?> ZI(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi);
  
  protected Zsu<?> ZF(Boolean paramBoolean1, Boolean paramBoolean2) {
    return this;
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_0
    //   4: invokevirtual Zz : ()Ljava/lang/Class;
    //   7: invokevirtual Z_ : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;Ljava/lang/Class;)Lcom/fasterxml/Zgy;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull -> 203
    //   15: aconst_null
    //   16: astore #4
    //   18: aload_3
    //   19: invokevirtual ZI : ()Lcom/fasterxml/Zqi;
    //   22: astore #5
    //   24: aload #5
    //   26: getstatic com/fasterxml/Zqi.ARRAY : Lcom/fasterxml/Zqi;
    //   29: if_acmpeq -> 47
    //   32: aload #5
    //   34: invokevirtual Zp : ()Z
    //   37: ifeq -> 55
    //   40: goto -> 47
    //   43: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   46: athrow
    //   47: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   50: astore #4
    //   52: goto -> 76
    //   55: aload #5
    //   57: getstatic com/fasterxml/Zqi.STRING : Lcom/fasterxml/Zqi;
    //   60: if_acmpne -> 73
    //   63: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   66: goto -> 74
    //   69: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   72: athrow
    //   73: aconst_null
    //   74: astore #4
    //   76: aload_0
    //   77: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   80: astore #6
    //   82: aload_3
    //   83: invokevirtual ZR : ()Z
    //   86: ifeq -> 97
    //   89: aload_0
    //   90: aload_1
    //   91: aload_3
    //   92: invokevirtual Zs : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zgy;)Ljava/time/format/DateTimeFormatter;
    //   95: astore #6
    //   97: aload_0
    //   98: astore #7
    //   100: aload #5
    //   102: aload_0
    //   103: getfield ZQ : Lcom/fasterxml/Zqi;
    //   106: if_acmpne -> 141
    //   109: aload #4
    //   111: aload_0
    //   112: getfield Zt : Ljava/lang/Boolean;
    //   115: if_acmpne -> 141
    //   118: goto -> 125
    //   121: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   124: athrow
    //   125: aload #6
    //   127: aload_0
    //   128: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   131: if_acmpeq -> 154
    //   134: goto -> 141
    //   137: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   140: athrow
    //   141: aload #7
    //   143: aload #4
    //   145: aload #6
    //   147: aload #5
    //   149: invokevirtual ZI : (Ljava/lang/Boolean;Ljava/time/format/DateTimeFormatter;Lcom/fasterxml/Zqi;)Lcom/fasterxml/Zsu;
    //   152: astore #7
    //   154: aload_3
    //   155: getstatic com/fasterxml/Zye.WRITE_DATES_WITH_ZONE_ID : Lcom/fasterxml/Zye;
    //   158: invokevirtual Zq : (Lcom/fasterxml/Zye;)Ljava/lang/Boolean;
    //   161: astore #8
    //   163: aload_3
    //   164: getstatic com/fasterxml/Zye.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS : Lcom/fasterxml/Zye;
    //   167: invokevirtual Zq : (Lcom/fasterxml/Zye;)Ljava/lang/Boolean;
    //   170: astore #9
    //   172: aload #8
    //   174: ifnonnull -> 189
    //   177: aload #9
    //   179: ifnull -> 200
    //   182: goto -> 189
    //   185: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   188: athrow
    //   189: aload #7
    //   191: aload #8
    //   193: aload #9
    //   195: invokevirtual ZF : (Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/fasterxml/Zsu;
    //   198: astore #7
    //   200: aload #7
    //   202: areturn
    //   203: aload_0
    //   204: areturn
    // Exception table:
    //   from	to	target	type
    //   24	40	43	com/fasterxml/Zor/Zy_
    //   55	69	69	com/fasterxml/Zor/Zy_
    //   100	118	121	com/fasterxml/Zor/Zy_
    //   109	134	137	com/fasterxml/Zor/Zy_
    //   172	182	185	com/fasterxml/Zor/Zy_
  }
  
  protected Zy0 ZK() {
    return Zy0.WRITE_DATES_AS_TIMESTAMPS;
  }
  
  protected boolean Za(Zyi paramZyi) {
    if (this.Zt != null)
      return this.Zt.booleanValue(); 
    if (this.ZQ != null) {
      if (this.ZQ == Zqi.STRING)
        return false; 
      if (this.ZQ == Zqi.NUMBER_INT)
        return true; 
    } 
    return (this.ZE == null && paramZyi != null && paramZyi.ZW(ZK()));
  }
  
  protected boolean Zf(Zyi paramZyi) {
    return (this.Zt != null) ? this.Zt.booleanValue() : false;
  }
  
  protected boolean Zl(Zyi paramZyi) {
    if (this.ZL != null)
      return this.ZL.booleanValue(); 
    if (this.ZQ != null) {
      if (this.ZQ == Zqi.NUMBER_INT)
        return false; 
      if (this.ZQ == Zqi.NUMBER_FLOAT)
        return true; 
    } 
    return (paramZyi != null && paramZyi.ZW(Zy0.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS));
  }
  
  protected DateTimeFormatter Zs(Zyi paramZyi, Zgy paramZgy) {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: aload_2
    //   4: invokevirtual Zu : ()Ljava/lang/String;
    //   7: astore #5
    //   9: astore_3
    //   10: aload_2
    //   11: invokevirtual ZA : ()Z
    //   14: ifeq -> 24
    //   17: aload_2
    //   18: invokevirtual Zk : ()Ljava/util/Locale;
    //   21: goto -> 28
    //   24: aload_1
    //   25: invokevirtual Zn : ()Ljava/util/Locale;
    //   28: astore #6
    //   30: aload #6
    //   32: ifnonnull -> 46
    //   35: aload #5
    //   37: invokestatic ofPattern : (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
    //   40: astore #4
    //   42: aload_3
    //   43: ifnull -> 55
    //   46: aload #5
    //   48: aload #6
    //   50: invokestatic ofPattern : (Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;
    //   53: astore #4
    //   55: aload_2
    //   56: invokevirtual ZT : ()Z
    //   59: ifeq -> 76
    //   62: aload #4
    //   64: aload_2
    //   65: invokevirtual ZB : ()Ljava/util/TimeZone;
    //   68: invokevirtual toZoneId : ()Ljava/time/ZoneId;
    //   71: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   74: astore #4
    //   76: aload #4
    //   78: areturn
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */