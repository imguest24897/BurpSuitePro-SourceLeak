package com.fasterxml.Zh;

import java.io.Serializable;

public final class Zp implements Comparable<Zp>, Serializable {
  private static final long serialVersionUID = 1L;
  
  private String Zr = null;
  
  private Class<?> Zv = null;
  
  private int Zk = 0;
  
  public Zp() {}
  
  public Zp(Class<?> paramClass) {}
  
  public void Zp(Class<?> paramClass) {
    this.Zv = paramClass;
    this.Zr = paramClass.getName();
    this.Zk = this.Zr.hashCode();
  }
  
  public int Z_(Zp paramZp) {
    return this.Zr.compareTo(paramZp.Zr);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zp zp = (Zp)paramObject;
    return (zp.Zv == this.Zv);
  }
  
  public int hashCode() {
    return this.Zk;
  }
  
  public String toString() {
    return this.Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */