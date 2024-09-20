package com.fasterxml.Zj;

import com.fasterxml.Zb.Zy;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zg;
import com.fasterxml.Zoz.Zu;
import com.fasterxml.Zp.Zk;
import com.fasterxml.Zp.Zp;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class Ze implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final TimeZone ZG;
  
  protected final Zi Ze;
  
  protected final Zg ZK;
  
  protected final Zt ZH;
  
  protected final com.fasterxml.Zor.Ze ZP;
  
  protected final Zu Zw;
  
  protected final Zk<?> Zz;
  
  protected final Zp Zm;
  
  protected final DateFormat ZX;
  
  protected final Zqn ZT;
  
  protected final Locale Zu;
  
  protected final TimeZone Zq;
  
  protected final Zy ZL;
  
  protected final Zo ZC;
  
  public Ze(Zg paramZg, Zt paramZt, com.fasterxml.Zor.Ze paramZe, Zi paramZi, Zk<?> paramZk, DateFormat paramDateFormat, Zqn paramZqn, Locale paramLocale, TimeZone paramTimeZone, Zy paramZy, Zp paramZp, Zu paramZu, Zo paramZo) {
    this.ZK = paramZg;
    this.ZH = paramZt;
    this.ZP = paramZe;
    this.Ze = paramZi;
    this.Zz = paramZk;
    this.ZX = paramDateFormat;
    this.ZT = paramZqn;
    this.Zu = paramLocale;
    this.Zq = paramTimeZone;
    this.ZL = paramZy;
    this.Zm = paramZp;
    this.Zw = paramZu;
    this.ZC = paramZo;
  }
  
  public Ze Zm(Zg paramZg) {
    return (this.ZK == paramZg) ? this : new Ze(paramZg, this.ZH, this.ZP, this.Ze, this.Zz, this.ZX, this.ZT, this.Zu, this.Zq, this.ZL, this.Zm, this.Zw, this.ZC);
  }
  
  public Ze ZT(com.fasterxml.Zor.Ze paramZe) {
    return (this.ZP == paramZe) ? this : new Ze(this.ZK, this.ZH, paramZe, this.Ze, this.Zz, this.ZX, this.ZT, this.Zu, this.Zq, this.ZL, this.Zm, this.Zw, this.ZC);
  }
  
  public Zg ZF() {
    return this.ZK;
  }
  
  public Zt Zl() {
    return this.ZH;
  }
  
  public com.fasterxml.Zor.Ze ZE() {
    return this.ZP;
  }
  
  public Zu Zu() {
    return this.Zw;
  }
  
  public Zi Zd() {
    return this.Ze;
  }
  
  public Zk<?> Zs() {
    return this.Zz;
  }
  
  public Zp Zq() {
    return this.Zm;
  }
  
  public DateFormat Za() {
    return this.ZX;
  }
  
  public Zqn ZM() {
    return this.ZT;
  }
  
  public Locale Zp() {
    return this.Zu;
  }
  
  public TimeZone ZU() {
    TimeZone timeZone = this.Zq;
    return (timeZone == null) ? ZG : timeZone;
  }
  
  public boolean ZL() {
    return (this.Zq != null);
  }
  
  public Zy ZR() {
    return this.ZL;
  }
  
  static {
    // Byte code:
    //   0: bipush #99
    //   2: ldc 'iq'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #38
    //   82: goto -> 112
    //   85: bipush #94
    //   87: goto -> 112
    //   90: bipush #81
    //   92: goto -> 112
    //   95: bipush #96
    //   97: goto -> 112
    //   100: bipush #49
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #23
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
    //   158: putstatic com/fasterxml/Zj/Ze.ZG : Ljava/util/TimeZone;
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */