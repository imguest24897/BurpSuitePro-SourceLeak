package com.fasterxml.Zc;

import java.io.IOException;
import java.io.Serializable;

public class Zh implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected byte[] Ze;
  
  protected CharSequence Zt;
  
  protected String Zu;
  
  public String toString() {
    try {
      if (this.Ze != null)
        try {
          return new String(this.Ze, this.Zu);
        } catch (IOException iOException) {
          throw new RuntimeException(iOException);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.Zt.toString();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */