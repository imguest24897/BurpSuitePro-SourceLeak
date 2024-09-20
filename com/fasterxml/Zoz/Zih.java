package com.fasterxml.Zoz;

import com.fasterxml.Zm.Z_;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public final class Zih implements Z_ {
  protected HashMap<Class<?>, Annotation> Zr;
  
  private static final String a;
  
  public Zih() {}
  
  public static Zih ZM(Class<?> paramClass, Annotation paramAnnotation) {
    HashMap<Object, Object> hashMap = new HashMap<>(4);
    hashMap.put(paramClass, paramAnnotation);
    return new Zih((HashMap)hashMap);
  }
  
  Zih(HashMap<Class<?>, Annotation> paramHashMap) {
    this.Zr = paramHashMap;
  }
  
  public <A extends Annotation> A ZH(Class<A> paramClass) {
    return (A)((this.Zr == null) ? null : this.Zr.get(paramClass));
  }
  
  public boolean Ze(Class<?> paramClass) {
    return (this.Zr == null) ? false : this.Zr.containsKey(paramClass);
  }
  
  public boolean ZZ(Class<? extends Annotation>[] paramArrayOfClass) {
    int i = Ziv.ZM();
    if (this.Zr != null) {
      byte b = 0;
      int j = paramArrayOfClass.length;
      while (b < j) {
        if (this.Zr.containsKey(paramArrayOfClass[b]))
          return true; 
        b++;
        if (i == 0)
          break; 
      } 
    } 
    return false;
  }
  
  public static Zih ZX(Zih paramZih1, Zih paramZih2) {
    int i = Ziv.Zv();
    if (paramZih1 == null || paramZih1.Zr == null || paramZih1.Zr.isEmpty())
      return paramZih2; 
    if (paramZih2 == null || paramZih2.Zr == null || paramZih2.Zr.isEmpty())
      return paramZih1; 
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (Annotation annotation : paramZih2.Zr.values()) {
      hashMap.put(annotation.annotationType(), annotation);
      if (i != 0)
        break; 
    } 
    for (Annotation annotation : paramZih1.Zr.values()) {
      hashMap.put(annotation.annotationType(), annotation);
      if (i != 0)
        break; 
    } 
    return new Zih((HashMap)hashMap);
  }
  
  public int ZJ() {
    return (this.Zr == null) ? 0 : this.Zr.size();
  }
  
  public boolean ZL(Annotation paramAnnotation) {
    return Zh(paramAnnotation);
  }
  
  public String toString() {
    return (this.Zr == null) ? a : this.Zr.toString();
  }
  
  protected final boolean Zh(Annotation paramAnnotation) {
    if (this.Zr == null)
      this.Zr = new HashMap<>(); 
    Annotation annotation = this.Zr.put(paramAnnotation.annotationType(), paramAnnotation);
    return (annotation == null || !annotation.equals(paramAnnotation));
  }
  
  static {
    // Byte code:
    //   0: bipush #105
    //   2: ldc 'TAa@N'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zoz/Zih.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #102
    //   82: goto -> 112
    //   85: bipush #70
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #100
    //   97: goto -> 112
    //   100: bipush #69
    //   102: goto -> 112
    //   105: bipush #122
    //   107: goto -> 112
    //   110: bipush #113
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */