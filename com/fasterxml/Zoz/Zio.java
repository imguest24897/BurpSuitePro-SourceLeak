package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zr;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Zio {
  private static final Z_ ZP = Zie.Zy();
  
  private static final Class<?> Zd = Object.class;
  
  private static final Class<?> Zr = Enum.class;
  
  private static final Class<?> Z_ = List.class;
  
  private static final Class<?> Zm = Map.class;
  
  private final Zf<?> Za;
  
  private final Zt ZT;
  
  private final Zij Zs;
  
  private final Zr Zl;
  
  private final Zk Zi;
  
  private final Class<?> ZL;
  
  private final Class<?> ZK;
  
  private final boolean ZB;
  
  Zio(Zf<?> paramZf, Zk paramZk, Zij paramZij) {
    this.Za = paramZf;
    this.Zi = paramZk;
    this.ZL = paramZk.Zf();
    this.Zs = paramZij;
    this.Zl = paramZk.ZR();
    this.ZT = paramZf.Ze() ? paramZf.ZK() : null;
    this.ZK = (paramZij == null) ? null : paramZij.ZL(this.ZL);
    this.ZB = (this.ZT != null && (!Zx.ZK(this.ZL) || !this.Zi.ZH()));
  }
  
  Zio(Zf<?> paramZf, Class<?> paramClass, Zij paramZij) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Za : Lcom/fasterxml/Zj/Zf;
    //   9: invokestatic ZM : ()I
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield Zi : Lcom/fasterxml/Zor/Zk;
    //   17: istore #4
    //   19: aload_0
    //   20: aload_2
    //   21: putfield ZL : Ljava/lang/Class;
    //   24: aload_0
    //   25: aload_3
    //   26: putfield Zs : Lcom/fasterxml/Zoz/Zij;
    //   29: aload_0
    //   30: invokestatic ZN : ()Lcom/fasterxml/Zh/Zr;
    //   33: putfield Zl : Lcom/fasterxml/Zh/Zr;
    //   36: aload_1
    //   37: ifnonnull -> 55
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield ZT : Lcom/fasterxml/Zor/Zt;
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield ZK : Ljava/lang/Class;
    //   50: iload #4
    //   52: ifne -> 96
    //   55: aload_0
    //   56: aload_1
    //   57: invokevirtual Ze : ()Z
    //   60: ifeq -> 70
    //   63: aload_1
    //   64: invokevirtual ZK : ()Lcom/fasterxml/Zor/Zt;
    //   67: goto -> 71
    //   70: aconst_null
    //   71: putfield ZT : Lcom/fasterxml/Zor/Zt;
    //   74: aload_0
    //   75: aload_3
    //   76: ifnonnull -> 83
    //   79: aconst_null
    //   80: goto -> 93
    //   83: aload_3
    //   84: aload_0
    //   85: getfield ZL : Ljava/lang/Class;
    //   88: invokeinterface ZL : (Ljava/lang/Class;)Ljava/lang/Class;
    //   93: putfield ZK : Ljava/lang/Class;
    //   96: aload_0
    //   97: aload_0
    //   98: getfield ZT : Lcom/fasterxml/Zor/Zt;
    //   101: ifnull -> 108
    //   104: iconst_1
    //   105: goto -> 109
    //   108: iconst_0
    //   109: putfield ZB : Z
    //   112: return
  }
  
  public static Zia ZB(Zf<?> paramZf, Zk paramZk, Zij paramZij) {
    return (paramZk.ZC() && ZM(paramZf, paramZk.Zf())) ? Zx(paramZf, paramZk.Zf()) : (new Zio(paramZf, paramZk, paramZij)).Zg();
  }
  
  public static Zia ZX(Zf<?> paramZf, Class<?> paramClass) {
    return Zk(paramZf, paramClass, (Zij)paramZf);
  }
  
  public static Zia Zk(Zf<?> paramZf, Class<?> paramClass, Zij paramZij) {
    return (paramClass.isArray() && ZM(paramZf, paramClass)) ? Zx(paramZf, paramClass) : (new Zio(paramZf, paramClass, paramZij)).Zv();
  }
  
  private static boolean ZM(Zf<?> paramZf, Class<?> paramClass) {
    return (paramZf == null || paramZf.ZL(paramClass) == null);
  }
  
  static Zia ZV(Class<?> paramClass) {
    return new Zia(paramClass);
  }
  
  static Zia Zx(Zf<?> paramZf, Class<?> paramClass) {
    return new Zia(paramClass);
  }
  
  Zia Zg() {
    ArrayList<Zk> arrayList = new ArrayList(8);
    int i = Ziv.ZM();
    if (!this.Zi.ZP(Object.class)) {
      if (this.Zi.ZU()) {
        ZP(this.Zi, arrayList, false);
        if (i == 0) {
          Zb(this.Zi, arrayList, false);
          return new Zia(this.Zi, this.ZL, arrayList, this.ZK, Zx(arrayList), this.Zl, this.ZT, this.Zs, this.Za.Zg(), this.ZB);
        } 
        return new Zia(this.Zi, this.ZL, arrayList, this.ZK, Zx(arrayList), this.Zl, this.ZT, this.Zs, this.Za.Zg(), this.ZB);
      } 
    } else {
      return new Zia(this.Zi, this.ZL, arrayList, this.ZK, Zx(arrayList), this.Zl, this.ZT, this.Zs, this.Za.Zg(), this.ZB);
    } 
    Zb(this.Zi, arrayList, false);
    return new Zia(this.Zi, this.ZL, arrayList, this.ZK, Zx(arrayList), this.Zl, this.ZT, this.Zs, this.Za.Zg(), this.ZB);
  }
  
  Zia Zv() {
    List<?> list = Collections.emptyList();
    return new Zia(null, this.ZL, (List)list, this.ZK, Zx((List)list), this.Zl, this.ZT, this.Zs, this.Za.Zg(), this.ZB);
  }
  
  private static void Zb(Zk paramZk, List<Zk> paramList, boolean paramBoolean) {
    Class<?> clazz = paramZk.Zf();
    int i = Ziv.Zv();
    if (clazz == Zd || clazz == Zr)
      return; 
    if (paramBoolean) {
      if (ZY(paramList, clazz))
        return; 
      paramList.add(paramZk);
    } 
    for (Zk zk1 : paramZk.ZN()) {
      ZP(zk1, paramList, true);
      if (i != 0)
        break; 
    } 
    Zk zk = paramZk.Zw();
    if (zk != null)
      Zb(zk, paramList, true); 
  }
  
  private static void ZP(Zk paramZk, List<Zk> paramList, boolean paramBoolean) {
    Class<?> clazz = paramZk.Zf();
    int i = Ziv.Zv();
    if (paramBoolean) {
      if (ZY(paramList, clazz))
        return; 
      paramList.add(paramZk);
      if (clazz == Z_ || clazz == Zm)
        return; 
    } 
    for (Zk zk : paramZk.ZN()) {
      ZP(zk, paramList, true);
      if (i != 0)
        break; 
    } 
  }
  
  private static boolean ZY(List<Zk> paramList, Class<?> paramClass) {
    byte b = 0;
    int j = paramList.size();
    int i = Ziv.ZM();
    while (b < j) {
      if (((Zk)paramList.get(b)).Zf() == paramClass)
        return true; 
      b++;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  private Z_ Zx(List<Zk> paramList) {
    int i = Ziv.ZM();
    if (this.ZT == null)
      return ZP; 
    boolean bool = (this.Zs != null && (!(this.Zs instanceof Ziw) || ((Ziw)this.Zs).ZY())) ? true : false;
    if (!bool && !this.ZB)
      return ZP; 
    Zie zie = Zie.Z_();
    if (this.ZK != null)
      zie = Zt(zie, this.ZL, this.ZK); 
    if (this.ZB)
      zie = ZT(zie, Zx.ZC(this.ZL)); 
    for (Zk zk : paramList) {
      if (bool) {
        Class<?> clazz = zk.Zf();
        zie = Zt(zie, clazz, this.Zs.ZL(clazz));
      } 
      if (this.ZB)
        zie = ZT(zie, Zx.ZC(zk.Zf())); 
      if (i == 0)
        break; 
    } 
    if (bool)
      zie = Zt(zie, Object.class, this.Zs.ZL(Object.class)); 
    return zie.Zs();
  }
  
  private Zie Zt(Zie paramZie, Class<?> paramClass1, Class<?> paramClass2) {
    int i = Ziv.Zv();
    if (paramClass2 != null) {
      paramZie = ZT(paramZie, Zx.ZC(paramClass2));
      for (Class clazz : Zx.ZO(paramClass2, paramClass1, false)) {
        paramZie = ZT(paramZie, Zx.ZC(clazz));
        if (i != 0)
          break; 
      } 
    } 
    return paramZie;
  }
  
  private Zie ZT(Zie paramZie, Annotation[] paramArrayOfAnnotation) {
    int i = Ziv.Zv();
    if (paramArrayOfAnnotation != null) {
      Annotation[] arrayOfAnnotation = paramArrayOfAnnotation;
      int j = arrayOfAnnotation.length;
      byte b = 0;
      while (b < j) {
        Annotation annotation = arrayOfAnnotation[b];
        if (!paramZie.Zu(annotation)) {
          paramZie = paramZie.Zf(annotation);
          if (this.ZT.Zl(annotation))
            paramZie = Zd(paramZie, annotation); 
        } 
        b++;
        if (i != 0)
          break; 
      } 
    } 
    return paramZie;
  }
  
  private Zie Zd(Zie paramZie, Annotation paramAnnotation) {
    Annotation[] arrayOfAnnotation = Zx.ZC(paramAnnotation.annotationType());
    int j = arrayOfAnnotation.length;
    int i = Ziv.ZM();
    byte b = 0;
    while (b < j) {
      Annotation annotation = arrayOfAnnotation[b];
      if (!(annotation instanceof java.lang.annotation.Target) && (!(annotation instanceof java.lang.annotation.Retention) || i == 0) && !paramZie.Zu(annotation)) {
        paramZie = paramZie.Zf(annotation);
        if (this.ZT.Zl(annotation))
          paramZie = Zd(paramZie, annotation); 
      } 
      b++;
      if (i == 0)
        break; 
    } 
    return paramZie;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */