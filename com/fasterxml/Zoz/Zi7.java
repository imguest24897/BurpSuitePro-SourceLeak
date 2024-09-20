package com.fasterxml.Zoz;

import java.io.Serializable;
import java.lang.reflect.Method;

final class Zi7 implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected Class<?> ZM;
  
  protected String ZD;
  
  protected Class<?>[] ZP;
  
  public Zi7(Method paramMethod) {
    this.ZM = paramMethod.getDeclaringClass();
    this.ZD = paramMethod.getName();
    this.ZP = paramMethod.getParameterTypes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zi7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */