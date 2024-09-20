package com.fasterxml;

import com.fasterxml.Zb.Zk;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.math.BigDecimal;

public abstract class Zs4<T> extends Zzg<T> implements Zi {
  protected final Zk Za;
  
  protected final String Zc;
  
  protected final boolean ZJ;
  
  protected Zs4(Class<?> paramClass, Zk paramZk, String paramString) {
    super(paramClass, false);
    this.Za = paramZk;
    this.Zc = paramString;
    this.ZJ = (paramZk == Zk.INT || paramZk == Zk.LONG || paramZk == Zk.BIG_INTEGER);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    try {
      if (zgy != null)
        try {
          switch (Zgj.Zz[zgy.ZI().ordinal()]) {
            case 1:
              try {
                if (Zz() == BigDecimal.class)
                  return Zse.Zg(); 
              } catch (Zy_ zy_) {
                throw a(null);
              } 
              return Zs5.ZN;
          } 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this;
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */