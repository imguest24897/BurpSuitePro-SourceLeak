package com.fasterxml.Zoz;

import com.fasterxml.Zm.Zx;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

public abstract class Ziz extends Ziv implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final transient Zis Zl;
  
  protected final transient Zih Zv;
  
  private static int[] ZI;
  
  protected Ziz(Zis paramZis, Zih paramZih) {
    this.Zl = paramZis;
    this.Zv = paramZih;
  }
  
  public abstract Ziv ZE(Zih paramZih);
  
  public abstract Class<?> ZE();
  
  public abstract Member ZI();
  
  public String Zo() {
    return ZE().getName() + "#" + ZW();
  }
  
  public final <A extends Annotation> A ZU(Class<A> paramClass) {
    try {
      if (this.Zv == null)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zv.ZH(paramClass);
  }
  
  public final boolean ZT(Class<?> paramClass) {
    try {
      if (this.Zv == null)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zv.Ze(paramClass);
  }
  
  public boolean Zq(Class<? extends Annotation>[] paramArrayOfClass) {
    try {
      if (this.Zv == null)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zv.ZZ(paramArrayOfClass);
  }
  
  public Zih Zx() {
    return this.Zv;
  }
  
  public final void Zh(boolean paramBoolean) {
    Member member = ZI();
    try {
      if (member != null)
        Zx.ZR(member, paramBoolean); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public abstract void ZL(Object paramObject1, Object paramObject2) throws UnsupportedOperationException, IllegalArgumentException;
  
  public abstract Object ZA(Object paramObject) throws UnsupportedOperationException, IllegalArgumentException;
  
  public static void Zw(int[] paramArrayOfint) {
    ZI = paramArrayOfint;
  }
  
  public static int[] ZZ() {
    return ZI;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZZ() != null)
      Zw(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Ziz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */