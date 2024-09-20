package com.fasterxml.Zm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class Zh implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zh ZT = new Zh(1, 0, new Object[4]);
  
  private final int Za;
  
  private final int Zi;
  
  private final Object[] Ze;
  
  private Zh(int paramInt1, int paramInt2, Object[] paramArrayOfObject) {
    this.Za = paramInt1;
    this.Zi = paramInt2;
    this.Ze = paramArrayOfObject;
  }
  
  public static <T> Zh ZW(Map<String, T> paramMap) {
    int i = Zx.ZY();
    if (paramMap.isEmpty())
      return ZT; 
    int j = Zw(paramMap.size());
    int k = j - 1;
    int m = (j + (j >> 1)) * 2;
    Object[] arrayOfObject = new Object[m];
    byte b = 0;
    for (Map.Entry<String, T> entry : paramMap.entrySet()) {
      String str = (String)entry.getKey();
      if (str != null || i != 0) {
        int n = str.hashCode() & k;
        int i1 = n + n;
        if (arrayOfObject[i1] != null) {
          i1 = j + (n >> 1) << 1;
          if (arrayOfObject[i1] != null) {
            i1 = (j + (j >> 1) << 1) + b;
            b += 2;
            if (i1 >= arrayOfObject.length)
              arrayOfObject = Arrays.copyOf(arrayOfObject, arrayOfObject.length + 4); 
          } 
        } 
        arrayOfObject[i1] = str;
        arrayOfObject[i1 + 1] = entry.getValue();
        if (i != 0)
          break; 
      } 
    } 
    return new Zh(k, b, arrayOfObject);
  }
  
  private static final int Zw(int paramInt) {
    int i = Zx.ZY();
    if (paramInt <= 5)
      return 8; 
    if (paramInt <= 12)
      return 16; 
    int j = paramInt + (paramInt >> 2);
    int k = 32;
    while (k < j) {
      k += k;
      if (i != 0)
        break; 
    } 
    return k;
  }
  
  public Object ZJ(String paramString) {
    int i = paramString.hashCode() & this.Za;
    int j = i << 1;
    Object object = this.Ze[j];
    return (object == paramString || paramString.equals(object)) ? this.Ze[j + 1] : ZN(paramString, i, object);
  }
  
  private final Object ZN(String paramString, int paramInt, Object paramObject) {
    int i = Zx.ZY();
    if (paramObject == null)
      return null; 
    int j = this.Za + 1;
    int k = j + (paramInt >> 1) << 1;
    paramObject = this.Ze[k];
    if (paramString.equals(paramObject))
      return this.Ze[k + 1]; 
    if (paramObject != null) {
      int m = j + (j >> 1) << 1;
      int n = m + this.Zi;
      while (m < n) {
        paramObject = this.Ze[m];
        if (paramObject == paramString || paramString.equals(paramObject))
          return this.Ze[m + 1]; 
        m += 2;
        if (i != 0)
          break; 
      } 
    } 
    return null;
  }
  
  public Object Zn(String paramString) {
    byte b = 0;
    int j = this.Ze.length;
    int i = Zx.Zo();
    while (b < j) {
      Object object = this.Ze[b];
      if (object != null) {
        String str = (String)object;
        if (str.equalsIgnoreCase(paramString))
          return this.Ze[b + 1]; 
      } 
      b += 2;
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  public List<String> ZR() {
    int j = this.Ze.length;
    ArrayList<String> arrayList = new ArrayList(j >> 2);
    int i = Zx.ZY();
    byte b = 0;
    while (b < j) {
      Object object = this.Ze[b];
      if (object != null)
        arrayList.add((String)object); 
      b += 2;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */