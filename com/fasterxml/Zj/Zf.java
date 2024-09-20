package com.fasterxml.Zj;

import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zgk;
import com.fasterxml.Zgy;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo3.Zz;
import com.fasterxml.Zor.Ze;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zg;
import com.fasterxml.Zoz.Zi8;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zij;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Zu;
import com.fasterxml.Zp.Zk;
import com.fasterxml.Zp.Zp;
import com.fasterxml.Zp.Zq;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zve;
import com.fasterxml.Zyk;
import com.fasterxml.Zyn;
import com.fasterxml.Zz_;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class Zf<T extends Zf<T>> implements Zij, Serializable {
  private static final long serialVersionUID = 2L;
  
  protected static final Zz_ Zf = Zz_.Zt();
  
  protected static final Zgy Zk = Zgy.Zm();
  
  protected final long ZA;
  
  protected final Ze ZP;
  
  private static int ZV;
  
  protected Zf(Ze paramZe, long paramLong) {
    this.ZP = paramZe;
    this.ZA = paramLong;
  }
  
  protected Zf(Zf<T> paramZf, long paramLong) {
    this.ZP = paramZf.ZP;
    this.ZA = paramLong;
  }
  
  protected Zf(Zf<T> paramZf, Ze paramZe) {
    this.ZP = paramZe;
    this.ZA = paramZf.ZA;
  }
  
  protected Zf(Zf<T> paramZf) {
    this.ZP = paramZf.ZP;
    this.ZA = paramZf.ZA;
  }
  
  public static <F extends Enum<F> & Zu> int ZG(Class<F> paramClass) {
    int i = 0;
    for (Enum enum_ : (Enum[])paramClass.getEnumConstants()) {
      if (((Zu)enum_).Zg())
        i |= ((Zu)enum_).Zu(); 
    } 
    return i;
  }
  
  public final boolean ZB(Zy9 paramZy9) {
    return paramZy9.Zz(this.ZA);
  }
  
  public abstract boolean ZV(Zz paramZz);
  
  public abstract Zp Zr();
  
  public final boolean Ze() {
    return ZB(Zy9.USE_ANNOTATIONS);
  }
  
  public final boolean Zd() {
    return ZB(Zy9.CAN_OVERRIDE_ACCESS_MODIFIERS);
  }
  
  public final boolean ZY() {
    return ZB(Zy9.SORT_PROPERTIES_ALPHABETICALLY);
  }
  
  public abstract boolean Zs();
  
  public Zj ZT(String paramString) {
    return (Zj)new Zgk(paramString);
  }
  
  public Zg Zt() {
    return this.ZP.ZF();
  }
  
  public Zt ZK() {
    return (Zt)(ZB(Zy9.USE_ANNOTATIONS) ? this.ZP.Zl() : com.fasterxml.Zoz.Zf.Zs);
  }
  
  public final Ze Zl() {
    return this.ZP.ZE();
  }
  
  public final Zu ZA() {
    return this.ZP.Zu();
  }
  
  public final Zqn Zf() {
    return this.ZP.ZM();
  }
  
  public final Zk<?> Zg(Zk paramZk) {
    return this.ZP.Zs();
  }
  
  public abstract Zq Zo();
  
  public Zp ZD() {
    com.fasterxml.Zp.Zf zf;
    Zp zp = this.ZP.Zq();
    if (zp == Zz.ZJ && ZB(Zy9.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES))
      zf = new com.fasterxml.Zp.Zf(); 
    return (Zp)zf;
  }
  
  public final Zi Zg() {
    return this.ZP.Zd();
  }
  
  public final Zk Zu(Class<?> paramClass) {
    return Zg().ZY(paramClass);
  }
  
  public Zyv Zv(Class<?> paramClass) {
    return ZZ(Zu(paramClass));
  }
  
  public Zyv ZZ(Zk paramZk) {
    return Zt().Zd(this, paramZk, this);
  }
  
  public abstract Z_ ZM(Class<?> paramClass);
  
  public abstract Zz_ Zm();
  
  public abstract Zz_ Zi(Class<?> paramClass);
  
  public Zz_ ZN(Class<?> paramClass, Zz_ paramZz_) {
    Zz_ zz_ = ZM(paramClass).Zk();
    return (zz_ != null) ? zz_ : paramZz_;
  }
  
  public abstract Zz_ ZU(Class<?> paramClass1, Class<?> paramClass2);
  
  public Zz_ Zg(Class<?> paramClass1, Class<?> paramClass2, Zz_ paramZz_) {
    Zz_ zz_1 = ZM(paramClass1).Zk();
    Zz_ zz_2 = ZM(paramClass2).ZT();
    return Zz_.Zx(new Zz_[] { paramZz_, zz_1, zz_2 });
  }
  
  public abstract Zgy Zy(Class<?> paramClass);
  
  public abstract Zve Zm(Class<?> paramClass);
  
  public abstract Zve Za(Class<?> paramClass, Zia paramZia);
  
  public abstract Zyn Zn(Class<?> paramClass, Zia paramZia);
  
  public abstract Zi8<?> Zy();
  
  public abstract Zi8<?> Zr(Class<?> paramClass, Zia paramZia);
  
  public abstract Zyk ZF();
  
  public abstract Boolean Zv();
  
  public abstract Boolean ZT(Class<?> paramClass);
  
  public final DateFormat Zb() {
    return this.ZP.Za();
  }
  
  public final Locale ZL() {
    return this.ZP.Zp();
  }
  
  public final TimeZone ZO() {
    return this.ZP.ZU();
  }
  
  public boolean ZZ() {
    return this.ZP.ZL();
  }
  
  public abstract Class<?> ZV();
  
  public Zy Zn() {
    return this.ZP.ZR();
  }
  
  public abstract Zt Zz();
  
  public abstract Zr Zy(Zk paramZk);
  
  public abstract Zr Zt(Class<?> paramClass);
  
  public Zk<?> ZQ(Ziv paramZiv, Class<? extends Zk<?>> paramClass) {
    Zqn zqn = Zf();
    if (zqn != null) {
      Zk<?> zk = zqn.Zp(this, paramZiv, paramClass);
      if (zk != null)
        return zk; 
    } 
    return (Zk)Zx.ZR(paramClass, Zd());
  }
  
  public Zz ZS(Ziv paramZiv, Class<? extends Zz> paramClass) {
    Zqn zqn = Zf();
    if (zqn != null) {
      Zz zz = zqn.ZM(this, paramZiv, paramClass);
      if (zz != null)
        return zz; 
    } 
    return (Zz)Zx.ZR(paramClass, Zd());
  }
  
  public static void ZG(int paramInt) {
    ZV = paramInt;
  }
  
  public static int Zu() {
    return ZV;
  }
  
  public static int ZH() {
    int i = Zu();
    return (i == 0) ? 34 : 0;
  }
  
  static {
    ZG(90);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */