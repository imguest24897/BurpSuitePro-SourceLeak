package com.fasterxml.Zk;

import com.fasterxml.Zor.Zk;
import com.fasterxml.Zz0;

public abstract class Za<T> extends Zz0<T> {
  private static int ZK;
  
  protected Za(Class<T> paramClass) {
    super(paramClass);
  }
  
  protected Za(Zk paramZk) {
    super(paramZk);
  }
  
  protected Za(Class<?> paramClass, boolean paramBoolean) {
    super(paramClass, paramBoolean);
  }
  
  protected Za(Za<?> paramZa) {
    super(paramZa.Zg, false);
  }
  
  public Za<?> Zy(com.fasterxml.Zp.Za paramZa) {
    return (paramZa == null) ? this : ZS(paramZa);
  }
  
  public abstract Zk Zq();
  
  public abstract boolean Zh(T paramT);
  
  protected abstract Za<?> ZS(com.fasterxml.Zp.Za paramZa);
  
  public static void Zd(int paramInt) {
    ZK = paramInt;
  }
  
  public static int Zi() {
    return ZK;
  }
  
  public static int ZH() {
    int i = Zi();
    return (i == 0) ? 11 : 0;
  }
  
  static {
    if (Zi() == 0)
      Zd(85); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */