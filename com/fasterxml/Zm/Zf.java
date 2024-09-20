package com.fasterxml.Zm;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Zf<T> implements Iterator<T>, Iterable<T> {
  private final T[] Zd;
  
  private int Zw;
  
  public Zf(T[] paramArrayOfT) {
    this.Zd = paramArrayOfT;
    this.Zw = 0;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zw < this.Zd.length);
  }
  
  public T next() {
    try {
      if (this.Zw >= this.Zd.length)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return this.Zd[this.Zw++];
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  public Iterator<T> iterator() {
    return this;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */