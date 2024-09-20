package com.fasterxml.Zm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public final class Ze7 {
  public final Constructor<?> Zr;
  
  private transient Annotation[] Zs;
  
  private transient Annotation[][] Zb;
  
  private int ZO = -1;
  
  public Ze7(Constructor<?> paramConstructor) {
    this.Zr = paramConstructor;
  }
  
  public Constructor<?> ZM() {
    return this.Zr;
  }
  
  public int Zk() {
    int i = this.ZO;
    if (i < 0) {
      i = this.Zr.getParameterCount();
      this.ZO = i;
    } 
    return i;
  }
  
  public Class<?> ZX() {
    return this.Zr.getDeclaringClass();
  }
  
  public Annotation[] ZN() {
    Annotation[] arrayOfAnnotation = this.Zs;
    if (arrayOfAnnotation == null) {
      arrayOfAnnotation = this.Zr.getDeclaredAnnotations();
      this.Zs = arrayOfAnnotation;
    } 
    return arrayOfAnnotation;
  }
  
  public Annotation[][] ZD() {
    Annotation[][] arrayOfAnnotation = this.Zb;
    if (arrayOfAnnotation == null) {
      arrayOfAnnotation = this.Zr.getParameterAnnotations();
      this.Zb = arrayOfAnnotation;
    } 
    return arrayOfAnnotation;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Ze7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */