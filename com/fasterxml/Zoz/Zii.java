package com.fasterxml.Zoz;

import java.io.Serializable;
import java.lang.reflect.Field;

final class Zii implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected Class<?> ZG;
  
  protected String Zr;
  
  public Zii(Field paramField) {
    this.ZG = paramField.getDeclaringClass();
    this.Zr = paramField.getName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */