package com.fasterxml.Zoz;

import java.io.Serializable;
import java.lang.reflect.Constructor;

final class Zi_ implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected Class<?> Ze;
  
  protected Class<?>[] ZG;
  
  public Zi_(Constructor<?> paramConstructor) {
    this.Ze = paramConstructor.getDeclaringClass();
    this.ZG = paramConstructor.getParameterTypes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zi_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */