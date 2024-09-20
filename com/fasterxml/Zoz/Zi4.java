package com.fasterxml.Zoz;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Zi4<T extends Ziz> implements Iterator<T> {
  private Zi3<T> Zr;
  
  public Zi4(Zi3<T> paramZi3) {
    this.Zr = paramZi3;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zr != null);
  }
  
  public T Zx() {
    try {
      if (this.Zr == null)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Ziz ziz = (Ziz)this.Zr.Zm;
    this.Zr = this.Zr.ZM;
    return (T)ziz;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zi4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */