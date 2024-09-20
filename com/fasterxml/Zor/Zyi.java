package com.fasterxml.Zor;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zgy;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zp;
import com.fasterxml.Zj.Zt;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zk.Z_;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zk.Zl;
import com.fasterxml.Zk.Zx;
import com.fasterxml.Zk.Zy;
import com.fasterxml.Zm.Zl;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zn.Z_0;
import com.fasterxml.Zn.Zd;
import com.fasterxml.Zn.Ze;
import com.fasterxml.Zn.Zl;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zv0;
import com.fasterxml.Zvj;
import com.fasterxml.Zys;
import com.fasterxml.Zz_;
import com.fasterxml.Zzx;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class Zyi extends Zyw {
  public static final Zyd<Object> ZY;
  
  protected static final Zyd<Object> Zs;
  
  protected final Zy7 Zf;
  
  protected final Class<?> Zg;
  
  protected final Zl ZQ;
  
  protected final Zy Zu;
  
  protected transient Zt Zj;
  
  protected Zyd<Object> Zo = Zs;
  
  protected Zyd<Object> ZM;
  
  protected Zyd<Object> ZR;
  
  protected Zyd<Object> ZD;
  
  protected final Ze Zd;
  
  protected DateFormat ZA;
  
  protected final boolean ZL;
  
  private static final String[] a;
  
  private static final String[] d;
  
  public Zyi() {
    this.ZR = (Zyd<Object>)Zzx.Zo;
    this.ZD = ZY;
    this.Zf = null;
    this.ZQ = null;
    this.Zu = new Zy();
    this.Zd = null;
    this.Zg = null;
    this.Zj = null;
    this.ZL = true;
  }
  
  protected Zyi(Zyi paramZyi, Zy7 paramZy7, Zl paramZl) {
    int i = Zyo.Zp();
    try {
      this.ZR = (Zyd<Object>)Zzx.Zo;
      this.ZD = ZY;
      this.ZQ = paramZl;
      this.Zf = paramZy7;
      this.Zu = paramZyi.Zu;
      this.Zo = paramZyi.Zo;
      this.ZM = paramZyi.ZM;
      this.ZR = paramZyi.ZR;
      this.ZD = paramZyi.ZD;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.ZL = (this.ZR == ZY);
      this.Zg = paramZy7.ZV();
      this.Zj = paramZy7.Zz();
      this.Zd = this.Zu.ZK();
      if (i == 0)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public final Zy7 ZH() {
    return this.Zf;
  }
  
  public final Zt Zv() {
    return this.Zf.ZK();
  }
  
  public final Zi ZL() {
    return this.Zf.Zg();
  }
  
  public Zk ZX(Zk paramZk, Class<?> paramClass) throws IllegalArgumentException {
    try {
      if (paramZk.ZP(paramClass))
        return paramZk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZH().Zg().Zx(paramZk, paramClass, true);
  }
  
  public final Class<?> Zx() {
    return this.Zg;
  }
  
  public final boolean ZP() {
    return this.Zf.Zd();
  }
  
  public final boolean Zm(Zy9 paramZy9) {
    return this.Zf.ZB(paramZy9);
  }
  
  public final boolean Zj(Zz paramZz) {
    return this.Zf.ZV(paramZz);
  }
  
  public final Zp Zw() {
    return this.Zf.Zr();
  }
  
  public final Zgy Zp(Class<?> paramClass) {
    return this.Zf.Zy(paramClass);
  }
  
  public final Zz_ ZD(Class<?> paramClass) {
    return this.Zf.Zi(paramClass);
  }
  
  public Locale Zn() {
    return this.Zf.ZL();
  }
  
  public TimeZone Z_() {
    return this.Zf.ZO();
  }
  
  public Object Zj(Object paramObject) {
    return this.Zj.ZT(paramObject);
  }
  
  public Zyi ZX(Object paramObject1, Object paramObject2) {
    this.Zj = this.Zj.ZQ(paramObject1, paramObject2);
    return this;
  }
  
  public final boolean ZW(Zy0 paramZy0) {
    return this.Zf.Zo(paramZy0);
  }
  
  public final Zx ZE() {
    return this.Zf.ZI();
  }
  
  public Zf ZI() {
    return null;
  }
  
  public Zl Zn(Zmd paramZmd) {
    return new Zl(paramZmd, false);
  }
  
  public abstract Zd ZU(Object paramObject, Zys<?> paramZys);
  
  public Zyd<Object> Za(Class<?> paramClass, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZZ(paramClass);
    if (zyd == null) {
      zyd = this.Zu.ZN(paramClass);
      if (zyd == null) {
        zyd = this.Zu.ZC(this.Zf.Zu(paramClass));
        if (zyd == null) {
          zyd = ZF(paramClass);
          if (zyd == null)
            return Zm(paramClass); 
        } 
      } 
    } 
    return (Zyd)ZR(zyd, paramZo);
  }
  
  public Zyd<Object> ZX(Zk paramZk, Zo paramZo) throws Zy_ {
    try {
      if (paramZk == null)
        Ze(b(-30913, 23436), new Object[0]); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.Zd.ZW(paramZk);
    if (zyd == null) {
      zyd = this.Zu.ZC(paramZk);
      if (zyd == null) {
        zyd = ZJ(paramZk);
        if (zyd == null)
          return Zm(paramZk.Zf()); 
      } 
    } 
    return (Zyd)ZR(zyd, paramZo);
  }
  
  public Zyd<Object> ZG(Class<?> paramClass) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZZ(paramClass);
    if (zyd == null) {
      zyd = this.Zu.ZN(paramClass);
      if (zyd == null) {
        zyd = this.Zu.ZC(this.Zf.Zu(paramClass));
        if (zyd == null) {
          zyd = ZF(paramClass);
          if (zyd == null)
            zyd = Zm(paramClass); 
        } 
      } 
    } 
    return zyd;
  }
  
  public Zyd<Object> Zf(Zk paramZk) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZW(paramZk);
    if (zyd == null) {
      zyd = this.Zu.ZC(paramZk);
      if (zyd == null) {
        zyd = ZJ(paramZk);
        if (zyd == null)
          zyd = Zm(paramZk.Zf()); 
      } 
    } 
    return zyd;
  }
  
  public Zyd<Object> ZW(Zk paramZk, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZW(paramZk);
    if (zyd == null) {
      zyd = this.Zu.ZC(paramZk);
      if (zyd == null) {
        zyd = ZJ(paramZk);
        if (zyd == null)
          return Zm(paramZk.Zf()); 
      } 
    } 
    return (Zyd)Zp(zyd, paramZo);
  }
  
  public Zyd<Object> Zb(Class<?> paramClass, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZZ(paramClass);
    if (zyd == null) {
      zyd = this.Zu.ZN(paramClass);
      if (zyd == null) {
        zyd = this.Zu.ZC(this.Zf.Zu(paramClass));
        if (zyd == null) {
          zyd = ZF(paramClass);
          if (zyd == null)
            return Zm(paramClass); 
        } 
      } 
    } 
    return (Zyd)Zp(zyd, paramZo);
  }
  
  public Zyd<Object> Zo(Zk paramZk, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZW(paramZk);
    if (zyd == null) {
      zyd = this.Zu.ZC(paramZk);
      if (zyd == null) {
        zyd = ZJ(paramZk);
        if (zyd == null)
          return Zm(paramZk.Zf()); 
      } 
    } 
    return (Zyd)ZR(zyd, paramZo);
  }
  
  public Zyd<Object> Zq(Class<?> paramClass, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.Zd.ZZ(paramClass);
    if (zyd == null) {
      zyd = this.Zu.ZN(paramClass);
      if (zyd == null) {
        zyd = this.Zu.ZC(this.Zf.Zu(paramClass));
        if (zyd == null) {
          zyd = ZF(paramClass);
          if (zyd == null)
            return Zm(paramClass); 
        } 
      } 
    } 
    return (Zyd)ZR(zyd, paramZo);
  }
  
  public Zyd<Object> Zx(Class<?> paramClass, boolean paramBoolean, Zo paramZo) throws Zy_ {
    Zl zl;
    Zyd<Object> zyd = this.Zd.ZW(paramClass);
    try {
      if (zyd != null)
        return zyd; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    zyd = this.Zu.ZV(paramClass);
    try {
      if (zyd != null)
        return zyd; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    zyd = Za(paramClass, paramZo);
    Za za = this.ZQ.Zg(this.Zf, this.Zf.Zu(paramClass));
    if (za != null) {
      za = za.ZS(paramZo);
      zl = new Zl(za, zyd);
    } 
    try {
      if (paramBoolean)
        this.Zu.ZM(paramClass, (Zyd)zl); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd<Object>)zl;
  }
  
  public Zyd<Object> ZH(Zk paramZk, boolean paramBoolean, Zo paramZo) throws Zy_ {
    Zl zl;
    Zyd<Object> zyd = this.Zd.ZZ(paramZk);
    try {
      if (zyd != null)
        return zyd; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    zyd = this.Zu.Zr(paramZk);
    try {
      if (zyd != null)
        return zyd; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    zyd = ZX(paramZk, paramZo);
    Za za = this.ZQ.Zg(this.Zf, paramZk);
    if (za != null) {
      za = za.ZS(paramZo);
      zl = new Zl(za, zyd);
    } 
    try {
      if (paramBoolean)
        this.Zu.ZC(paramZk, (Zyd)zl); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd<Object>)zl;
  }
  
  public Za ZL(Zk paramZk) throws Zy_ {
    return this.ZQ.Zg(this.Zf, paramZk);
  }
  
  public Zyd<Object> Zr(Zk paramZk, Zo paramZo) throws Zy_ {
    Zyd<?> zyd = this.ZQ.ZS(this, paramZk, this.ZM);
    return Zd(zyd, paramZo);
  }
  
  public Zyd<Object> ZB(Class<?> paramClass, Zo paramZo) throws Zy_ {
    return Zr(this.Zf.Zu(paramClass), paramZo);
  }
  
  public Zyd<Object> ZJ() {
    return this.ZR;
  }
  
  public Zyd<Object> ZB(Zk paramZk, Zo paramZo) throws Zy_ {
    return this.ZD;
  }
  
  public Zyd<Object> ZZ(Zo paramZo) throws Zy_ {
    return this.ZR;
  }
  
  public Zyd<Object> Zm(Class<?> paramClass) {
    try {
      if (paramClass == Object.class)
        return this.Zo; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Zyd<Object>)new Z_0(paramClass);
  }
  
  public abstract Zyd<Object> ZW(Ziv paramZiv, Object paramObject) throws Zy_;
  
  public abstract Object ZQ(Zp paramZp, Class<?> paramClass) throws Zy_;
  
  public abstract boolean Zz(Object paramObject) throws Zy_;
  
  public Zyd<?> Zp(Zyd<?> paramZyd, Zo paramZo) throws Zy_ {
    try {
      if (paramZyd != null && paramZyd instanceof Zi)
        paramZyd = ((Zi)paramZyd).Za(this, paramZo); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return paramZyd;
  }
  
  public Zyd<?> ZR(Zyd<?> paramZyd, Zo paramZo) throws Zy_ {
    try {
      if (paramZyd != null && paramZyd instanceof Zi)
        paramZyd = ((Zi)paramZyd).Za(this, paramZo); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return paramZyd;
  }
  
  public final void ZK(Object paramObject, Zf paramZf) throws IOException {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore_3
    //   4: aload_1
    //   5: ifnonnull -> 58
    //   8: aload_0
    //   9: getfield ZL : Z
    //   12: ifeq -> 37
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_2
    //   23: invokevirtual ZT : ()V
    //   26: iload_3
    //   27: ifeq -> 78
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: aload_0
    //   38: getfield ZR : Lcom/fasterxml/Zor/Zyd;
    //   41: aconst_null
    //   42: aload_2
    //   43: aload_0
    //   44: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   47: iload_3
    //   48: ifeq -> 78
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual getClass : ()Ljava/lang/Class;
    //   62: astore #4
    //   64: aload_0
    //   65: aload #4
    //   67: iconst_1
    //   68: aconst_null
    //   69: invokevirtual Zx : (Ljava/lang/Class;ZLcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   72: aload_1
    //   73: aload_2
    //   74: aload_0
    //   75: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   78: return
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/io/IOException
    //   8	30	33	java/io/IOException
    //   22	51	54	java/io/IOException
  }
  
  public final void ZH(Date paramDate, Zf paramZf) throws IOException {
    int i = Zyo.Zp();
    try {
      if (ZW(Zy0.WRITE_DATES_AS_TIMESTAMPS)) {
        try {
          paramZf.Zw(paramDate.getTime());
          if (i == 0) {
            paramZf.ZD(ZM().format(paramDate));
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZD(ZM().format(paramDate));
  }
  
  public void ZB(long paramLong, Zf paramZf) throws IOException {
    int i = Zyo.Zp();
    try {
      if (ZW(Zy0.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
        try {
          paramZf.ZY(String.valueOf(paramLong));
          if (i == 0) {
            paramZf.ZY(ZM().format(new Date(paramLong)));
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZY(ZM().format(new Date(paramLong)));
  }
  
  public void ZA(Date paramDate, Zf paramZf) throws IOException {
    int i = Zyo.Zp();
    try {
      if (ZW(Zy0.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
        try {
          paramZf.ZY(String.valueOf(paramDate.getTime()));
          if (i == 0) {
            paramZf.ZY(ZM().format(paramDate));
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZY(ZM().format(paramDate));
  }
  
  public final void ZT(Zf paramZf) throws IOException {
    int i = Zyo.Zp();
    try {
      if (this.ZL) {
        try {
          paramZf.ZT();
          if (i == 0) {
            this.ZR.serialize(null, paramZf, this);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZR.serialize(null, paramZf, this);
  }
  
  public void Ze(String paramString, Object... paramVarArgs) throws Zy_ {
    throw ZW(paramString, paramVarArgs);
  }
  
  public <T> T Zk(Zyv paramZyv, String paramString, Object... paramVarArgs) throws Zy_ {
    String str = b(-30916, -22092);
    if (paramZyv != null)
      str = Zx.Za(paramZyv.Zl()); 
    paramString = String.format(b(-30920, 7549), new Object[] { str, ZF(paramString, paramVarArgs) });
    throw Zvj.ZG(ZI(), paramString, paramZyv, null);
  }
  
  public <T> T ZH(Zyv paramZyv, Zp paramZp, String paramString, Object... paramVarArgs) throws Zy_ {
    paramString = ZF(paramString, paramVarArgs);
    String str1 = b(-30914, -3547);
    if (paramZp != null)
      str1 = Zu(paramZp.ZT()); 
    String str2 = b(-30916, -22092);
    if (paramZyv != null)
      str2 = Zx.Za(paramZyv.Zl()); 
    paramString = String.format(b(-30918, -11145), new Object[] { str1, str2, paramString });
    throw Zvj.ZG(ZI(), paramString, paramZyv, paramZp);
  }
  
  public <T> T Zm(Zk paramZk, String paramString) throws Zy_ {
    throw Zvj.Zx(ZI(), paramString, paramZk);
  }
  
  public <T> T ZJ(Class<?> paramClass, String paramString, Throwable paramThrowable) throws Zy_ {
    throw Zvj.Zx(ZI(), paramString, Zo(paramClass)).Zc(paramThrowable);
  }
  
  public void Zf(Throwable paramThrowable, String paramString, Object... paramVarArgs) throws Zy_ {
    paramString = ZF(paramString, paramVarArgs);
    throw Zy_.ZH(ZI(), paramString, paramThrowable);
  }
  
  public Zy_ ZU(Zk paramZk, String paramString1, String paramString2) {
    String str = String.format(b(-30917, 30187), new Object[] { paramString1, Zx.ZN(paramZk) });
    return (Zy_)Zv0.Zj(null, ZQ(str, paramString2), paramZk, paramString1);
  }
  
  @Deprecated
  public Zy_ ZW(String paramString, Object... paramVarArgs) {
    return Zy_.ZG(ZI(), ZF(paramString, paramVarArgs));
  }
  
  protected void Zb(Object paramObject, Zk paramZk) throws IOException {
    if (paramZk.Zm()) {
      Class clazz = Zx.ZP(paramZk.Zf());
      try {
        if (clazz.isAssignableFrom(paramObject.getClass()))
          return; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    Zm(paramZk, String.format(b(-30919, 30972), new Object[] { paramZk, Zx.ZZ(paramObject) }));
  }
  
  protected Zyd<Object> ZF(Class<?> paramClass) throws Zy_ {
    Zyd<Object> zyd;
    Zk zk = this.Zf.Zu(paramClass);
    try {
      zyd = Zv(zk);
    } catch (IllegalArgumentException illegalArgumentException) {
      Zm(zk, Zx.Zr(illegalArgumentException));
      zyd = null;
    } 
    try {
      if (zyd != null)
        this.Zu.ZR(paramClass, zk, zyd, this); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zyd;
  }
  
  protected Zyd<Object> ZJ(Zk paramZk) throws Zy_ {
    Zyd<Object> zyd;
    try {
      zyd = Zv(paramZk);
    } catch (IllegalArgumentException illegalArgumentException) {
      zyd = null;
      Zf(illegalArgumentException, Zx.Zr(illegalArgumentException), new Object[0]);
    } 
    try {
      if (zyd != null)
        this.Zu.ZJ(paramZk, zyd, this); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zyd;
  }
  
  protected Zyd<Object> Zv(Zk paramZk) throws Zy_ {
    return this.ZQ.Zl(this, paramZk);
  }
  
  protected Zyd<Object> Zd(Zyd<?> paramZyd, Zo paramZo) throws Zy_ {
    try {
      if (paramZyd instanceof Z_)
        ((Z_)paramZyd).resolve(this); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd)ZR(paramZyd, paramZo);
  }
  
  protected Zyd<Object> Ze(Zyd<?> paramZyd) throws Zy_ {
    try {
      if (paramZyd instanceof Z_)
        ((Z_)paramZyd).resolve(this); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd)paramZyd;
  }
  
  protected final DateFormat ZM() {
    try {
      if (this.ZA != null)
        return this.ZA; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    DateFormat dateFormat = this.Zf.Zb();
    this.ZA = dateFormat = (DateFormat)dateFormat.clone();
    return dateFormat;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '>p»FåÒs6[¦æÀ%­¤«¢eñ4Òdàª üTÖÛÀ®¤d[ï7÷Ùô;ÎÚ3]üLÿÖ\\tLwé!&¶ÓÏ¢G·Cl( ÌÆsm£n{44­LÛsäDhÀªPkß¼mfq[RÉ4´¸?ÌÜ²î!Ø¨f³ÕâÆ1=p8bÞ&:§¸\\bGâ02Oû;k¡í¥\\fÕod¯UÜ§¨ÒA:¸½¯3êa Ú$ÀÚ1eeåzä¶)Æ?@¨°8¼9tÙgDß.Ñpu}×ï'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #54
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #105
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc '¯MÂ à+ãôÍ±w\\nühòmÌè©ea7ò¢x°9®XYJR<Å(ã'<iZ#?íñel9d)-om6ZAjÏ#T¾_ÍÑ ¿8s»5¾ß³'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #49
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #49
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zor/Zyi.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zor/Zyi.d : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #43
    //   229: goto -> 244
    //   232: bipush #74
    //   234: goto -> 244
    //   237: bipush #34
    //   239: goto -> 244
    //   242: bipush #82
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new com/fasterxml/Zn/Zo
    //   303: dup
    //   304: sipush #-30915
    //   307: sipush #22892
    //   310: invokestatic b : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic com/fasterxml/Zor/Zyi.ZY : Lcom/fasterxml/Zor/Zyd;
    //   319: new com/fasterxml/Zn/Z_0
    //   322: dup
    //   323: invokespecial <init> : ()V
    //   326: putstatic com/fasterxml/Zor/Zyi.Zs : Lcom/fasterxml/Zor/Zyd;
    //   329: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF873F) & 0xFFFF;
    if (d[i] == null) {
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
      char c = 'ø';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */