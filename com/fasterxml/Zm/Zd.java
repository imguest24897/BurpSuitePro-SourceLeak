package com.fasterxml.Zm;

import java.lang.reflect.Array;

final class Zd {
  final Class ZY;
  
  final int Zu;
  
  final Object Zs;
  
  Zd(Class paramClass, int paramInt, Object paramObject) {}
  
  public boolean equals(Object paramObject) {
    int i = Zx.ZY();
    if (paramObject == this)
      return true; 
    if (!Zx.Zi(paramObject, this.ZY))
      return false; 
    if (Array.getLength(paramObject) != this.Zu)
      return false; 
    byte b = 0;
    while (b < this.Zu) {
      Object object1 = Array.get(this.Zs, b);
      Object object2 = Array.get(paramObject, b);
      if (object1 != object2 && object1 != null && !object1.equals(object2))
        return false; 
      b++;
      if (i != 0)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */