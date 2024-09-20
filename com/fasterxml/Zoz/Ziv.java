package com.fasterxml.Zoz;

import com.fasterxml.Zor.Zk;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

public abstract class Ziv {
  private static int ZU;
  
  public abstract <A extends Annotation> A ZU(Class<A> paramClass);
  
  public abstract boolean ZT(Class<?> paramClass);
  
  public abstract boolean Zq(Class<? extends Annotation>[] paramArrayOfClass);
  
  public abstract AnnotatedElement Z_();
  
  protected abstract int ZO();
  
  public boolean ZX() {
    return Modifier.isStatic(ZO());
  }
  
  public abstract String ZW();
  
  public abstract Zk Zf();
  
  public abstract Class<?> ZN();
  
  public abstract boolean equals(Object paramObject);
  
  public abstract int hashCode();
  
  public abstract String toString();
  
  public static void ZM(int paramInt) {
    ZU = paramInt;
  }
  
  public static int ZM() {
    return ZU;
  }
  
  public static int Zv() {
    int i = ZM();
    return (i == 0) ? 19 : 0;
  }
  
  static {
    if (Zv() != 0)
      ZM(111); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Ziv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */