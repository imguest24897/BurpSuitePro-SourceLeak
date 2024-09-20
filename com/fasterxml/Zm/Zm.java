package com.fasterxml.Zm;

public final class Zm<T> {
  private final T Zw;
  
  private Zm<T> ZP;
  
  public Zm(T paramT, Zm<T> paramZm) {
    this.Zw = paramT;
    this.ZP = paramZm;
  }
  
  public void ZV(Zm<T> paramZm) {
    try {
      if (this.ZP != null)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZP = paramZm;
  }
  
  public Zm<T> ZG() {
    return this.ZP;
  }
  
  public T Zf() {
    return this.Zw;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */