package com.fasterxml.Zm;

final class Zeu<T> {
  final T Zk;
  
  final int ZK;
  
  Zeu<T> Zj;
  
  public Zeu(T paramT, int paramInt) {
    this.Zk = paramT;
    this.ZK = paramInt;
  }
  
  public T ZA() {
    return this.Zk;
  }
  
  public int Zf(T paramT, int paramInt) {
    System.arraycopy(this.Zk, 0, paramT, paramInt, this.ZK);
    paramInt += this.ZK;
    return paramInt;
  }
  
  public Zeu<T> ZW() {
    return this.Zj;
  }
  
  public void ZI(Zeu<T> paramZeu) {
    try {
      if (this.Zj != null)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zj = paramZeu;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zeu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */