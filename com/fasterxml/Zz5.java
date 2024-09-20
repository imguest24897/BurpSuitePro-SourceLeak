package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

public abstract class Zz5<T extends Collection<?>> extends Zz0<T> implements Zi {
  protected final Boolean Z_ = null;
  
  protected Zz5(Class<?> paramClass) {
    super(paramClass, false);
  }
  
  protected Zz5(Zz5<?> paramZz5, Boolean paramBoolean) {
    super(paramZz5);
  }
  
  public abstract Zyd<?> Zm(Zo paramZo, Boolean paramBoolean);
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<?> zyd = null;
    Boolean bool = null;
    if (paramZo != null) {
      Zt zt = paramZyi.Zv();
      Ziz ziz = paramZo.ZQ();
      if (ziz != null) {
        Object object = zt.ZS((Ziv)ziz);
        if (object != null)
          zyd = paramZyi.ZW((Ziv)ziz, object); 
      } 
    } 
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    if (zgy != null)
      bool = zgy.Zq(Zye.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED); 
    zyd = Za(paramZyi, paramZo, zyd);
    if (zyd == null)
      zyd = paramZyi.Zq(String.class, paramZo); 
    try {
      if (Zv(zyd)) {
        try {
          if (Objects.equals(bool, this.Z_))
            return this; 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
        return Zm(paramZo, bool);
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd<?>)new Zz1(paramZyi.Zo(String.class), true, null, zyd);
  }
  
  public boolean Zu(Zyi paramZyi, T paramT) {
    return (paramT == null || paramT.isEmpty());
  }
  
  public abstract void ZB(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException;
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */