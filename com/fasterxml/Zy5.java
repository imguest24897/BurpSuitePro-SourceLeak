package com.fasterxml;

abstract class Zy5<T> extends Zys<T> {
  protected final Class<?> Zm;
  
  protected Zy5(Class<?> paramClass) {
    this.Zm = paramClass;
  }
  
  public final Class<?> Zb() {
    return this.Zm;
  }
  
  public boolean Z_(Zys<?> paramZys) {
    return (paramZys.getClass() == getClass() && paramZys.Zb() == this.Zm);
  }
  
  public abstract T ZQ(Object paramObject);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */