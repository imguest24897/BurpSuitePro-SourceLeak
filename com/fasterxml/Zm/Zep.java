package com.fasterxml.Zm;

import java.io.Serializable;

final class Zep extends Zev implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Class<?>[] ZM;
  
  public Zep(Class<?>[] paramArrayOfClass) {
    this.ZM = paramArrayOfClass;
  }
  
  public boolean Zo(Class<?> paramClass) {
    byte b = 0;
    int i = Zx.Zo();
    int j = this.ZM.length;
    while (b < j) {
      Class<?> clazz = this.ZM[b];
      if (paramClass == clazz || clazz.isAssignableFrom(paramClass))
        return true; 
      b++;
      if (i == 0)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */