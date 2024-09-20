package com.fasterxml.Zoz;

import com.fasterxml.Zm.Z_;
import java.lang.annotation.Annotation;

class Zqw extends Zie {
  private Class<?> Zs;
  
  private Annotation ZT;
  
  public Zqw(Object paramObject, Class<?> paramClass, Annotation paramAnnotation) {
    super(paramObject);
    this.Zs = paramClass;
    this.ZT = paramAnnotation;
  }
  
  public Z_ Zs() {
    return new Zn(this.Zs, this.ZT);
  }
  
  public Zih Zk() {
    return Zih.ZM(this.Zs, this.ZT);
  }
  
  public boolean Zu(Annotation paramAnnotation) {
    return (paramAnnotation.annotationType() == this.Zs);
  }
  
  public Zie Zf(Annotation paramAnnotation) {
    Class<? extends Annotation> clazz = paramAnnotation.annotationType();
    if (this.Zs == clazz) {
      this.ZT = paramAnnotation;
      return this;
    } 
    return new Zqb(this.ZZ, this.Zs, this.ZT, clazz, paramAnnotation);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zqw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */