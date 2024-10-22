package com.fasterxml;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.Duration;
import java.util.Objects;

public class Zqm extends Zq4<Duration> implements Zi {
  private static final long serialVersionUID = 1L;
  
  public static final Zqm Zj;
  
  protected final Zqk Zy = null;
  
  protected final Boolean ZO = null;
  
  private static final String g;
  
  public Zqm() {
    super(Duration.class);
  }
  
  protected Zqm(Zqm paramZqm, Boolean paramBoolean1, Zqk paramZqk, Boolean paramBoolean2) {
    super(paramZqm, paramBoolean1);
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zgy zgy = Zx(paramZyg, paramZo, ZX());
    Zqm zqm = this;
    boolean bool = this.Zb;
    Zqk zqk = this.Zy;
    Boolean bool1 = this.ZO;
    try {
      if (zgy != null) {
        if (zgy.ZQ())
          bool = zgy.Zy().booleanValue(); 
        if (zgy.ZR()) {
          String str = zgy.Zu();
          zqk = Zqk.Zn(str);
          try {
            if (zqk == null)
              paramZyg.Zm(Zq(paramZyg), String.format(g, new Object[] { str, Zqk.ZX() })); 
          } catch (Zy_ zy_) {
            throw a(null);
          } 
        } 
        bool1 = zgy.Zq(Zye.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (bool == this.Zb)
        try {
          if (Objects.equals(zqk, this.Zy))
            try {
              return (Zyo<?>)(Objects.equals(bool1, this.ZO) ? zqm : new Zqm(this, Boolean.valueOf(bool), zqk, bool1));
            } catch (Zy_ zy_) {
              throw a(null);
            }  
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyo<?>)new Zqm(this, Boolean.valueOf(bool), zqk, bool1);
  }
  
  public Duration Zf(Zg paramZg, Zyg paramZyg) throws IOException {
    BigDecimal bigDecimal;
    switch (paramZg.Zy()) {
      case 8:
        bigDecimal = paramZg.ZT();
        return Zg4.<Duration>ZX(bigDecimal, Duration::ofSeconds);
      case 7:
        return Zj(paramZyg, paramZg.ZE());
      case 6:
        return ZD(paramZg, paramZyg, paramZg.ZR());
      case 1:
        return ZD(paramZg, paramZyg, paramZyg.Zc(paramZg, (Zyo)this, ZX()));
      case 12:
        return (Duration)paramZg.ZO();
      case 3:
        return (Duration)ZF(paramZg, paramZyg);
    } 
    return (Duration)Zx(paramZyg, paramZg, new Zl[] { Zl.VALUE_STRING, Zl.VALUE_NUMBER_INT, Zl.VALUE_NUMBER_FLOAT });
  }
  
  protected Duration ZD(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    String str = paramString.trim();
    try {
      if (str.length() == 0)
        return ZN(paramZg, paramZyg, str); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      if (paramZyg.ZA(Zq.UNTYPED_SCALARS))
        try {
          if (ZV(str))
            return Zj(paramZyg, Zyt.ZO(str)); 
        } catch (DateTimeException dateTimeException) {
          throw a(null);
        }  
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      return Duration.parse(str);
    } catch (DateTimeException dateTimeException) {
      return (Duration)Z_(paramZyg, dateTimeException, str);
    } 
  }
  
  protected Duration Zj(Zyg paramZyg, long paramLong) {
    try {
      if (this.Zy != null)
        return this.Zy.ZQ(paramLong); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      if (ZF(paramZyg))
        return Duration.ofSeconds(paramLong); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return Duration.ofMillis(paramLong);
  }
  
  protected boolean ZF(Zyg paramZyg) {
    try {
    
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return (this.ZO != null) ? this.ZO.booleanValue() : paramZyg.Zg(Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
  }
  
  static {
    // Byte code:
    //   0: bipush #77
    //   2: ldc 'A/4DUAw:5C\\r g+6X\\rLTj!>KplyJR#.DDTj!>QYE{>5R@D#!>TCJF#uB>'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zqm.g : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #78
    //   82: goto -> 111
    //   85: iconst_3
    //   86: goto -> 111
    //   89: bipush #29
    //   91: goto -> 111
    //   94: bipush #124
    //   96: goto -> 111
    //   99: bipush #46
    //   101: goto -> 111
    //   104: bipush #104
    //   106: goto -> 111
    //   109: bipush #109
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: new com/fasterxml/Zqm
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: putstatic com/fasterxml/Zqm.Zj : Lcom/fasterxml/Zqm;
    //   163: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */