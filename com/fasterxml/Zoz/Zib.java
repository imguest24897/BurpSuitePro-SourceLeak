package com.fasterxml.Zoz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class Zib {
  static final Class<?>[] Zf;
  
  final String Ze;
  
  final Class<?>[] Zh;
  
  private static final String a;
  
  public Zib(Method paramMethod) {
    this(paramMethod.getName(), paramMethod.getParameterTypes());
  }
  
  public Zib(Constructor<?> paramConstructor) {
    this("", paramConstructor.getParameterTypes());
  }
  
  public Zib(String paramString, Class<?>[] paramArrayOfClass) {
    this.Ze = paramString;
    this.Zh = (paramArrayOfClass == null) ? Zf : paramArrayOfClass;
  }
  
  public String ZD() {
    return this.Ze;
  }
  
  public int ZV() {
    return this.Zh.length;
  }
  
  public String toString() {
    return this.Ze + "(" + this.Zh.length + a;
  }
  
  public int hashCode() {
    return this.Ze.hashCode() + this.Zh.length;
  }
  
  public boolean equals(Object paramObject) {
    int i = Ziv.Zv();
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zib zib = (Zib)paramObject;
    if (!this.Ze.equals(zib.Ze))
      return false; 
    Class<?>[] arrayOfClass = zib.Zh;
    int j = this.Zh.length;
    if (arrayOfClass.length != j)
      return false; 
    byte b = 0;
    while (b < j) {
      Class<?> clazz1 = arrayOfClass[b];
      Class<?> clazz2 = this.Zh[b];
      if (clazz1 != clazz2 || i != 0)
        return false; 
      b++;
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #100
    //   2: ldc '}L\\b4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zoz/Zib.a : Ljava/lang/String;
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
    //   80: bipush #80
    //   82: goto -> 112
    //   85: bipush #120
    //   87: goto -> 112
    //   90: bipush #90
    //   92: goto -> 112
    //   95: bipush #6
    //   97: goto -> 112
    //   100: bipush #31
    //   102: goto -> 112
    //   105: bipush #121
    //   107: goto -> 112
    //   110: bipush #66
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
    //   154: iconst_0
    //   155: anewarray java/lang/Class
    //   158: putstatic com/fasterxml/Zoz/Zib.Zf : [Ljava/lang/Class;
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */