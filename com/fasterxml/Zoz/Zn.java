package com.fasterxml.Zoz;

import com.fasterxml.Zm.Z_;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Zn implements Z_, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Class<?> Zc;
  
  private final Annotation Za;
  
  public Zn(Class<?> paramClass, Annotation paramAnnotation) {
    this.Zc = paramClass;
    this.Za = paramAnnotation;
  }
  
  public <A extends Annotation> A ZH(Class<A> paramClass) {
    return (A)((this.Zc == paramClass) ? this.Za : null);
  }
  
  public boolean Ze(Class<?> paramClass) {
    return (this.Zc == paramClass);
  }
  
  public boolean ZZ(Class<? extends Annotation>[] paramArrayOfClass) {
    Class<? extends Annotation>[] arrayOfClass = paramArrayOfClass;
    int j = arrayOfClass.length;
    int i = Ziv.ZM();
    byte b = 0;
    while (b < j) {
      Class<? extends Annotation> clazz = arrayOfClass[b];
      if (clazz == this.Zc)
        return true; 
      b++;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  public int ZJ() {
    return 1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */