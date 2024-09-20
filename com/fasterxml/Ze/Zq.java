package com.fasterxml.Ze;

import com.fasterxml.Zga;
import com.fasterxml.Zy8;
import com.fasterxml.Zys;

public class Zq extends Zy8 {
  private static final long serialVersionUID = 1L;
  
  public Zq(Class<?> paramClass) {
    super(paramClass);
  }
  
  public Object ZQ(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public Zys<Object> ZA(Class<?> paramClass) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramClass == this.Zm) ? (Zys<Object>)this : (Zys<Object>)new Zq(paramClass);
  }
  
  public Zys<Object> Zq(Object paramObject) {
    return (Zys<Object>)this;
  }
  
  public Zga ZF(Object paramObject) {
    try {
      if (paramObject == null)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return new Zga(getClass(), this.Zm, paramObject);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */