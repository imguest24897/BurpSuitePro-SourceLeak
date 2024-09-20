package com.fasterxml.Zoz;

import com.fasterxml.Zm.Z_;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Zir implements Z_, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Class<?> Zv;
  
  private final Class<?> ZN;
  
  private final Annotation Zm;
  
  private final Annotation Zx;
  
  public Zir(Class<?> paramClass1, Annotation paramAnnotation1, Class<?> paramClass2, Annotation paramAnnotation2) {
    this.Zv = paramClass1;
    this.Zm = paramAnnotation1;
    this.ZN = paramClass2;
    this.Zx = paramAnnotation2;
  }
  
  public <A extends Annotation> A ZH(Class<A> paramClass) {
    return (A)((this.Zv == paramClass) ? this.Zm : ((this.ZN == paramClass) ? this.Zx : null));
  }
  
  public boolean Ze(Class<?> paramClass) {
    return (this.Zv == paramClass || this.ZN == paramClass);
  }
  
  public boolean ZZ(Class<? extends Annotation>[] paramArrayOfClass) {
    Class<? extends Annotation>[] arrayOfClass = paramArrayOfClass;
    int j = arrayOfClass.length;
    int i = Ziv.ZM();
    byte b = 0;
    while (b < j) {
      Class<? extends Annotation> clazz = arrayOfClass[b];
      if (clazz == this.Zv || clazz == this.ZN)
        return true; 
      b++;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  public int ZJ() {
    return 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */