package com.fasterxml.Zm;

import java.io.Serializable;

public class Zev implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zev Z_ = new Zev();
  
  public boolean Zo(Class<?> paramClass) {
    return false;
  }
  
  public static Zev ZP(Class<?>[] paramArrayOfClass) {
    if (paramArrayOfClass == null)
      return Z_; 
    switch (paramArrayOfClass.length) {
      case 0:
        return Z_;
      case 1:
        return new Zeo(paramArrayOfClass[0]);
    } 
    return new Zep(paramArrayOfClass);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */