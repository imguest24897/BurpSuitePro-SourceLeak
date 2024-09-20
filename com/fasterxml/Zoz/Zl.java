package com.fasterxml.Zoz;

import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zt;
import java.lang.annotation.Annotation;

class Zl {
  protected static final Zih[] Zb = new Zih[0];
  
  protected static final Annotation[] ZE = new Annotation[0];
  
  protected final Zt ZV;
  
  protected Zl(Zt paramZt) {
    this.ZV = paramZt;
  }
  
  protected final Zie Z_(Annotation[] paramArrayOfAnnotation) {
    Zie zie = Zie.Z_();
    byte b = 0;
    int j = paramArrayOfAnnotation.length;
    int i = Ziv.Zv();
    while (b < j) {
      Annotation annotation = paramArrayOfAnnotation[b];
      zie = zie.Zf(annotation);
      if (this.ZV.Zl(annotation))
        zie = Zs(zie, annotation); 
      b++;
      if (i != 0)
        break; 
    } 
    return zie;
  }
  
  protected final Zie Zc(Zie paramZie, Annotation[] paramArrayOfAnnotation) {
    byte b = 0;
    int j = paramArrayOfAnnotation.length;
    int i = Ziv.Zv();
    while (b < j) {
      Annotation annotation = paramArrayOfAnnotation[b];
      paramZie = paramZie.Zf(annotation);
      if (this.ZV.Zl(annotation))
        paramZie = Zs(paramZie, annotation); 
      b++;
      if (i != 0)
        break; 
    } 
    return paramZie;
  }
  
  protected final Zie Zs(Zie paramZie, Annotation paramAnnotation) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface annotationType : ()Ljava/lang/Class;
    //   6: invokestatic ZC : (Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;
    //   9: astore #4
    //   11: invokestatic ZM : ()I
    //   14: iconst_0
    //   15: istore #5
    //   17: istore_3
    //   18: aload #4
    //   20: arraylength
    //   21: istore #6
    //   23: iload #5
    //   25: iload #6
    //   27: if_icmpge -> 103
    //   30: aload #4
    //   32: iload #5
    //   34: aaload
    //   35: astore #7
    //   37: aload #7
    //   39: invokestatic Zu : (Ljava/lang/annotation/Annotation;)Z
    //   42: ifeq -> 49
    //   45: iload_3
    //   46: ifne -> 96
    //   49: aload_0
    //   50: getfield ZV : Lcom/fasterxml/Zor/Zt;
    //   53: aload #7
    //   55: invokevirtual Zl : (Ljava/lang/annotation/Annotation;)Z
    //   58: ifeq -> 89
    //   61: aload_1
    //   62: aload #7
    //   64: invokevirtual Zu : (Ljava/lang/annotation/Annotation;)Z
    //   67: ifne -> 96
    //   70: aload_1
    //   71: aload #7
    //   73: invokevirtual Zf : (Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   76: astore_1
    //   77: aload_0
    //   78: aload_1
    //   79: aload #7
    //   81: invokevirtual Zs : (Lcom/fasterxml/Zoz/Zie;Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   84: astore_1
    //   85: iload_3
    //   86: ifne -> 96
    //   89: aload_1
    //   90: aload #7
    //   92: invokevirtual Zf : (Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   95: astore_1
    //   96: iinc #5, 1
    //   99: iload_3
    //   100: ifne -> 23
    //   103: aload_1
    //   104: areturn
  }
  
  protected final Zie Zx(Zie paramZie, Annotation[] paramArrayOfAnnotation) {
    byte b = 0;
    int i = Ziv.Zv();
    int j = paramArrayOfAnnotation.length;
    while (b < j) {
      Annotation annotation = paramArrayOfAnnotation[b];
      if (!paramZie.Zu(annotation)) {
        paramZie = paramZie.Zf(annotation);
        if (this.ZV.Zl(annotation))
          paramZie = ZU(paramZie, annotation); 
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return paramZie;
  }
  
  protected final Zie ZU(Zie paramZie, Annotation paramAnnotation) {
    Annotation[] arrayOfAnnotation = Zx.ZC(paramAnnotation.annotationType());
    byte b = 0;
    int i = Ziv.Zv();
    int j = arrayOfAnnotation.length;
    while (b < j) {
      Annotation annotation = arrayOfAnnotation[b];
      if ((!Zu(annotation) || i != 0) && !paramZie.Zu(annotation)) {
        paramZie = paramZie.Zf(annotation);
        if (this.ZV.Zl(annotation))
          paramZie = Zs(paramZie, annotation); 
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return paramZie;
  }
  
  protected static final boolean Zu(Annotation paramAnnotation) {
    return (paramAnnotation instanceof java.lang.annotation.Target || paramAnnotation instanceof java.lang.annotation.Retention);
  }
  
  static Zih Zs() {
    return new Zih();
  }
  
  static Zih[] Zm(int paramInt) {
    int i = Ziv.Zv();
    if (paramInt == 0)
      return Zb; 
    Zih[] arrayOfZih = new Zih[paramInt];
    byte b = 0;
    while (b < paramInt) {
      arrayOfZih[b] = Zs();
      b++;
      if (i != 0)
        break; 
    } 
    return arrayOfZih;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */