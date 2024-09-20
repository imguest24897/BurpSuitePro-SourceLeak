package com.fasterxml.Zy;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class Zt implements Iterator<E> {
  E Zm;
  
  final Zd Zq;
  
  Zt(Zd paramZd, E paramE) {
    this.Zm = paramE;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zm != null);
  }
  
  public E Zf() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    E e = this.Zm;
    this.Zm = ZS();
    return e;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  abstract E ZS();
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */