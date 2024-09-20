package com.fasterxml.Zj;

import burp.Zbqc;
import com.fasterxml.Zgy;
import com.fasterxml.Zm.Zek;
import com.fasterxml.Zor.Ze;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zoz.Zi8;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziw;
import com.fasterxml.Zp.Zq;
import com.fasterxml.Zqh;
import com.fasterxml.Zve;
import com.fasterxml.Zyk;
import com.fasterxml.Zyn;
import com.fasterxml.Zz_;
import java.io.Serializable;

public abstract class Zh<CFG extends Zu, T extends Zh<CFG, T>> extends Zf<T> implements Serializable {
  protected static final Z_ Zt = Z_.ZR();
  
  private static final long Zn = Zy9.ZA();
  
  private static final long ZQ = Zy9.AUTO_DETECT_FIELDS.Zo() | Zy9.AUTO_DETECT_GETTERS.Zo() | Zy9.AUTO_DETECT_IS_GETTERS.Zo() | Zy9.AUTO_DETECT_SETTERS.Zo() | Zy9.AUTO_DETECT_CREATORS.Zo();
  
  protected final Ziw Zl;
  
  protected final Zq ZG;
  
  protected final Zr Zw;
  
  protected final Class<?> ZB;
  
  protected final Zt Zs;
  
  protected final Zek Zq;
  
  protected final Zn ZH;
  
  protected final Zp ZM;
  
  protected Zh(Ze paramZe, Zq paramZq, Ziw paramZiw, Zek paramZek, Zn paramZn, Zp paramZp) {
    super(paramZe, Zn);
    this.Zl = paramZiw;
    this.ZG = paramZq;
    this.Zq = paramZek;
    this.Zw = null;
    this.ZB = null;
    this.Zs = Zt.Zl();
    this.ZH = paramZn;
    this.ZM = paramZp;
  }
  
  protected Zh(Zh<CFG, T> paramZh, Ze paramZe) {
    super(paramZh, paramZe);
    String str = Zx.ZL();
    this.Zl = paramZh.Zl;
    this.ZG = paramZh.ZG;
    this.Zq = paramZh.Zq;
    this.Zw = paramZh.Zw;
    this.ZB = paramZh.ZB;
    this.Zs = paramZh.Zs;
    this.ZH = paramZh.ZH;
    this.ZM = paramZh.ZM;
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  protected Zh(Zh<CFG, T> paramZh, long paramLong) {
    super(paramZh, paramLong);
    this.Zl = paramZh.Zl;
    this.ZG = paramZh.ZG;
    this.Zq = paramZh.Zq;
    this.Zw = paramZh.Zw;
    this.ZB = paramZh.ZB;
    this.Zs = paramZh.Zs;
    this.ZH = paramZh.ZH;
    this.ZM = paramZh.ZM;
  }
  
  protected Zh(Zh<CFG, T> paramZh, Class<?> paramClass) {
    super(paramZh);
    this.Zl = paramZh.Zl;
    this.ZG = paramZh.ZG;
    String str = Zx.ZL();
    this.Zq = paramZh.Zq;
    this.Zw = paramZh.Zw;
    this.ZB = paramClass;
    this.Zs = paramZh.Zs;
    this.ZH = paramZh.ZH;
    this.ZM = paramZh.ZM;
    if (Zbqc.Zwu() == null)
      Zx.ZU("JMdKtb"); 
  }
  
  protected abstract T ZN(Ze paramZe);
  
  protected abstract T Zf(long paramLong);
  
  public final T ZW(Zy9... paramVarArgs) {
    long l = this.ZA;
    for (Zy9 zy9 : paramVarArgs)
      l |= zy9.Zo(); 
    return (T)((l == this.ZA) ? this : (Object)Zf(l));
  }
  
  public final T ZI(Zy9... paramVarArgs) {
    long l = this.ZA;
    for (Zy9 zy9 : paramVarArgs)
      l &= zy9.Zo() ^ 0xFFFFFFFFFFFFFFFFL; 
    return (T)((l == this.ZA) ? this : (Object)Zf(l));
  }
  
  public final T Zt(Ze paramZe) {
    return ZN(this.ZP.ZT(paramZe));
  }
  
  public final Zp Zr() {
    return this.ZM;
  }
  
  public final Zq Zo() {
    return this.ZG;
  }
  
  public final Zr ZT() {
    return this.Zw;
  }
  
  public final Class<?> ZV() {
    return this.ZB;
  }
  
  public final Zt Zz() {
    return this.Zs;
  }
  
  public final Z_ ZM(Class<?> paramClass) {
    Z_ z_ = this.ZH.ZP(paramClass);
    return (z_ == null) ? Zt : z_;
  }
  
  public final Zz_ Zm() {
    return this.ZH.Zd();
  }
  
  public final Zz_ Zi(Class<?> paramClass) {
    Zz_ zz_1 = ZM(paramClass).Zk();
    Zz_ zz_2 = Zm();
    return (zz_2 == null) ? zz_1 : zz_2.ZI(zz_1);
  }
  
  public final Zz_ ZU(Class<?> paramClass1, Class<?> paramClass2) {
    Zz_ zz_1 = ZM(paramClass2).ZT();
    Zz_ zz_2 = Zi(paramClass1);
    return (zz_2 == null) ? zz_1 : zz_2.ZI(zz_1);
  }
  
  public final Zgy Zy(Class<?> paramClass) {
    return this.ZH.ZD(paramClass);
  }
  
  public final Zve Zm(Class<?> paramClass) {
    Z_ z_ = this.ZH.ZP(paramClass);
    if (z_ != null) {
      Zve zve = z_.Zc();
      if (zve != null)
        return zve; 
    } 
    return null;
  }
  
  public final Zve Za(Class<?> paramClass, Zia paramZia) {
    Zt zt = ZK();
    Zve zve1 = (zt == null) ? null : zt.ZH(this, (Ziv)paramZia);
    Zve zve2 = Zm(paramClass);
    return Zve.Zg(zve1, zve2);
  }
  
  public final Zyn Zn(Class<?> paramClass, Zia paramZia) {
    Zt zt = ZK();
    return (zt == null) ? null : zt.Z_(this, (Ziv)paramZia);
  }
  
  public final Zi8<?> Zy() {
    Zi8<?> zi8 = this.ZH.Zs();
    if ((this.ZA & ZQ) != ZQ) {
      if (!ZB(Zy9.AUTO_DETECT_FIELDS))
        zi8 = zi8.ZF(Zqh.NONE); 
      if (!ZB(Zy9.AUTO_DETECT_GETTERS))
        zi8 = zi8.Zw(Zqh.NONE); 
      if (!ZB(Zy9.AUTO_DETECT_IS_GETTERS))
        zi8 = zi8.Zi(Zqh.NONE); 
      if (!ZB(Zy9.AUTO_DETECT_SETTERS))
        zi8 = zi8.Zn(Zqh.NONE); 
      if (!ZB(Zy9.AUTO_DETECT_CREATORS))
        zi8 = zi8.Zx(Zqh.NONE); 
    } 
    return zi8;
  }
  
  public final Zi8<?> Zr(Class<?> paramClass, Zia paramZia) {
    // Byte code:
    //   0: invokestatic ZL : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: invokestatic ZK : (Ljava/lang/Class;)Z
    //   8: ifeq -> 20
    //   11: invokestatic Ze : ()Lcom/fasterxml/Zoz/Zw;
    //   14: astore #4
    //   16: aload_3
    //   17: ifnull -> 55
    //   20: aload_0
    //   21: invokevirtual Zy : ()Lcom/fasterxml/Zoz/Zi8;
    //   24: astore #4
    //   26: aload_1
    //   27: invokestatic Zr : (Ljava/lang/Class;)Z
    //   30: ifeq -> 55
    //   33: aload_0
    //   34: getstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_CREATORS : Lcom/fasterxml/Zor/Zy9;
    //   37: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   40: ifeq -> 55
    //   43: aload #4
    //   45: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   48: invokeinterface Zx : (Lcom/fasterxml/Zqh;)Lcom/fasterxml/Zoz/Zi8;
    //   53: astore #4
    //   55: aload_0
    //   56: invokevirtual ZK : ()Lcom/fasterxml/Zor/Zt;
    //   59: astore #5
    //   61: aload #5
    //   63: ifnull -> 76
    //   66: aload #5
    //   68: aload_2
    //   69: aload #4
    //   71: invokevirtual Zc : (Lcom/fasterxml/Zoz/Zia;Lcom/fasterxml/Zoz/Zi8;)Lcom/fasterxml/Zoz/Zi8;
    //   74: astore #4
    //   76: aload_0
    //   77: getfield ZH : Lcom/fasterxml/Zj/Zn;
    //   80: aload_1
    //   81: invokevirtual ZP : (Ljava/lang/Class;)Lcom/fasterxml/Zj/Z_;
    //   84: astore #6
    //   86: aload #6
    //   88: ifnull -> 105
    //   91: aload #4
    //   93: aload #6
    //   95: invokevirtual ZX : ()Lcom/fasterxml/Zgr;
    //   98: invokeinterface Zp : (Lcom/fasterxml/Zgr;)Lcom/fasterxml/Zoz/Zi8;
    //   103: astore #4
    //   105: aload #4
    //   107: areturn
  }
  
  public final Zyk ZF() {
    return this.ZH.Zm();
  }
  
  public Boolean Zv() {
    return this.ZH.ZK();
  }
  
  public Boolean ZT(Class<?> paramClass) {
    Z_ z_ = this.ZH.ZP(paramClass);
    if (z_ != null) {
      Boolean bool = z_.ZW();
      if (bool != null)
        return bool; 
    } 
    return this.ZH.ZK();
  }
  
  public Zr Zy(Zk paramZk) {
    return (this.Zw != null) ? this.Zw : this.Zq.ZH(paramZk, this);
  }
  
  public Zr Zt(Class<?> paramClass) {
    return (this.Zw != null) ? this.Zw : this.Zq.Zl(paramClass, this);
  }
  
  public final Class<?> ZL(Class<?> paramClass) {
    return this.Zl.ZL(paramClass);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */