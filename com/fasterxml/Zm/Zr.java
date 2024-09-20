package com.fasterxml.Zm;

import java.lang.reflect.Array;

public final class Zr {
  private Ze9 Zb = null;
  
  private Ze2 Zg = null;
  
  private Zei Zt = null;
  
  private Ze6 ZB = null;
  
  private Zer Zw = null;
  
  private Ze4 Zv = null;
  
  private Zey ZP = null;
  
  public Ze9 Zt() {
    if (this.Zb == null)
      this.Zb = new Ze9(); 
    return this.Zb;
  }
  
  public Ze2 Zq() {
    if (this.Zg == null)
      this.Zg = new Ze2(); 
    return this.Zg;
  }
  
  public Zei ZU() {
    if (this.Zt == null)
      this.Zt = new Zei(); 
    return this.Zt;
  }
  
  public Ze6 ZW() {
    if (this.ZB == null)
      this.ZB = new Ze6(); 
    return this.ZB;
  }
  
  public Zer Zy() {
    if (this.Zw == null)
      this.Zw = new Zer(); 
    return this.Zw;
  }
  
  public Ze4 Zs() {
    if (this.Zv == null)
      this.Zv = new Ze4(); 
    return this.Zv;
  }
  
  public Zey Z_() {
    if (this.ZP == null)
      this.ZP = new Zey(); 
    return this.ZP;
  }
  
  public static Object Zp(Object paramObject) {
    int i = Array.getLength(paramObject);
    Class<?> clazz = paramObject.getClass();
    return new Zd(clazz, i, paramObject);
  }
  
  public static <T> T[] Ze(T[] paramArrayOfT, T paramT) {
    int j = paramArrayOfT.length;
    byte b = 0;
    int i = Zx.Zo();
    while (b < j) {
      if (paramArrayOfT[b] == paramT) {
        if (b == 0)
          return paramArrayOfT; 
        Object[] arrayOfObject1 = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
        System.arraycopy(paramArrayOfT, 0, arrayOfObject1, 1, b);
        arrayOfObject1[0] = paramT;
        int k = j - ++b;
        if (k > 0)
          System.arraycopy(paramArrayOfT, b, arrayOfObject1, b, k); 
        return (T[])arrayOfObject1;
      } 
      b++;
      if (i == 0)
        break; 
    } 
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j + 1);
    if (j > 0)
      System.arraycopy(paramArrayOfT, 0, arrayOfObject, 1, j); 
    arrayOfObject[0] = paramT;
    return (T[])arrayOfObject;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */