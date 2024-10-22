package com.fasterxml;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public abstract class Zq2<T> extends Zq4<T> implements Zi {
  protected final DateTimeFormatter Za;
  
  protected final Zqi Zw;
  
  private static final String g;
  
  protected Zq2(Class<T> paramClass, DateTimeFormatter paramDateTimeFormatter) {
    super(paramClass);
    this.Za = paramDateTimeFormatter;
    this.Zw = null;
  }
  
  public Zq2(Class<T> paramClass, DateTimeFormatter paramDateTimeFormatter, Boolean paramBoolean) {
    super(paramClass, paramBoolean);
    this.Za = paramDateTimeFormatter;
    this.Zw = null;
  }
  
  protected Zq2(Zq2<T> paramZq2, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZq2);
    this.Za = paramDateTimeFormatter;
    this.Zw = paramZq2.Zw;
  }
  
  protected Zq2(Zq2<T> paramZq2, Boolean paramBoolean) {
    super(paramZq2, paramBoolean);
    this.Za = paramZq2.Za;
    this.Zw = paramZq2.Zw;
  }
  
  protected Zq2(Zq2<T> paramZq2, Zqi paramZqi) {
    super(paramZq2);
    this.Za = paramZq2.Za;
    this.Zw = paramZqi;
  }
  
  protected Zq2(Zq2<T> paramZq2, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZq2, paramBoolean);
    this.Za = paramDateTimeFormatter;
    this.Zw = paramZqi;
  }
  
  protected abstract Zq2<T> ZD(DateTimeFormatter paramDateTimeFormatter);
  
  protected abstract Zq2<T> Zu(Boolean paramBoolean);
  
  protected Zq2<T> Zs(Zqi paramZqi) {
    return this;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zgy zgy = Zx(paramZyg, paramZo, ZX());
    try {
    
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (zgy == null) ? (Zyo<?>)this : (Zyo<?>)ZI(paramZyg, paramZo, zgy);
  }
  
  protected Zq2<?> ZI(Zyg paramZyg, Zo paramZo, Zgy paramZgy) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: aload_0
    //   4: astore #5
    //   6: astore #4
    //   8: aload_3
    //   9: invokevirtual ZQ : ()Z
    //   12: ifeq -> 35
    //   15: aload_3
    //   16: invokevirtual Zy : ()Ljava/lang/Boolean;
    //   19: astore #6
    //   21: aload #6
    //   23: ifnull -> 35
    //   26: aload #5
    //   28: aload #6
    //   30: invokevirtual Zu : (Ljava/lang/Boolean;)Lcom/fasterxml/Zq2;
    //   33: astore #5
    //   35: aload_3
    //   36: invokevirtual ZR : ()Z
    //   39: ifeq -> 174
    //   42: aload_3
    //   43: invokevirtual Zu : ()Ljava/lang/String;
    //   46: astore #6
    //   48: aload_3
    //   49: invokevirtual ZA : ()Z
    //   52: ifeq -> 62
    //   55: aload_3
    //   56: invokevirtual Zk : ()Ljava/util/Locale;
    //   59: goto -> 66
    //   62: aload_1
    //   63: invokevirtual Zn : ()Ljava/util/Locale;
    //   66: astore #7
    //   68: new java/time/format/DateTimeFormatterBuilder
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: astore #8
    //   77: aload_0
    //   78: aload_1
    //   79: aload_3
    //   80: invokespecial ZB : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zgy;)Z
    //   83: ifeq -> 92
    //   86: aload #8
    //   88: invokevirtual parseCaseInsensitive : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   91: pop
    //   92: aload #8
    //   94: aload #6
    //   96: invokevirtual appendPattern : (Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;
    //   99: pop
    //   100: aload #7
    //   102: ifnonnull -> 117
    //   105: aload #8
    //   107: invokevirtual toFormatter : ()Ljava/time/format/DateTimeFormatter;
    //   110: astore #9
    //   112: aload #4
    //   114: ifnull -> 126
    //   117: aload #8
    //   119: aload #7
    //   121: invokevirtual toFormatter : (Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;
    //   124: astore #9
    //   126: aload #5
    //   128: invokevirtual ZK : ()Z
    //   131: ifne -> 144
    //   134: aload #9
    //   136: getstatic java/time/format/ResolverStyle.STRICT : Ljava/time/format/ResolverStyle;
    //   139: invokevirtual withResolverStyle : (Ljava/time/format/ResolverStyle;)Ljava/time/format/DateTimeFormatter;
    //   142: astore #9
    //   144: aload_3
    //   145: invokevirtual ZT : ()Z
    //   148: ifeq -> 165
    //   151: aload #9
    //   153: aload_3
    //   154: invokevirtual ZB : ()Ljava/util/TimeZone;
    //   157: invokevirtual toZoneId : ()Ljava/time/ZoneId;
    //   160: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   163: astore #9
    //   165: aload #5
    //   167: aload #9
    //   169: invokevirtual ZD : (Ljava/time/format/DateTimeFormatter;)Lcom/fasterxml/Zq2;
    //   172: astore #5
    //   174: aload_3
    //   175: invokevirtual ZI : ()Lcom/fasterxml/Zqi;
    //   178: astore #6
    //   180: aload #6
    //   182: ifnull -> 203
    //   185: aload #6
    //   187: aload_0
    //   188: getfield Zw : Lcom/fasterxml/Zqi;
    //   191: if_acmpeq -> 203
    //   194: aload #5
    //   196: aload #6
    //   198: invokevirtual Zs : (Lcom/fasterxml/Zqi;)Lcom/fasterxml/Zq2;
    //   201: astore #5
    //   203: aload #5
    //   205: areturn
  }
  
  private boolean ZB(Zyg paramZyg, Zgy paramZgy) {
    Boolean bool = paramZgy.Zq(Zye.ACCEPT_CASE_INSENSITIVE_VALUES);
    if (bool == null)
      bool = Boolean.valueOf(paramZyg.Zm(Zy9.ACCEPT_CASE_INSENSITIVE_VALUES)); 
    return bool.booleanValue();
  }
  
  protected void Zc(Zg paramZg, Zyg paramZyg) throws IOException {
    paramZyg.ZF(ZX(), g, new Object[] { paramZg.Zb(), ZX().getName() });
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
  
  static {
    // Byte code:
    //   0: bipush #69
    //   2: ldc 'a`q(vrri\\rN;$b!Wg!gdve&nNs$uhM] vdb(\\nzuog3hhnruog]fbn(Nro&gvu&g]zlc%\\r v!.{Npmg{]$rwgl:'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zq2.g : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #86
    //   82: goto -> 112
    //   85: bipush #68
    //   87: goto -> 112
    //   90: bipush #67
    //   92: goto -> 112
    //   95: bipush #77
    //   97: goto -> 112
    //   100: bipush #50
    //   102: goto -> 112
    //   105: bipush #56
    //   107: goto -> 112
    //   110: bipush #43
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */